package visitorGrammar;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

/**
 * Created by carlmccann2 on 29/04/15.
 */
public class Visitor implements visitorGrammarVisitor {

    public String OPCODE, SRC1, SRC2;
    public int DEST = 0;

    ArrayList<String> instructions = new ArrayList();
    HashMap<String,String> registers = new HashMap<String, String>();

    public void addInstruction(String opcode, String dest, String src1, String src2){
        instructions.add(opcode + " " + "t" + dest + " " + src1 + " " + src2);
    }
    public void addInstruction(String opcode, String dest, String src1){
        if(dest.matches("[a-z]+")){                             // handles assignment
            instructions.add(opcode + " " + dest + " " + "t" +src1);
        }
        else{
            instructions.add(opcode + " " + "t" + dest + " " + src1);
        }
    }


    @Override
    public Object visit(SimpleNode node, Object data) {
        return null;
    }

    @Override
    public Object visit(ASTS node, Object data) {

        data = node.childrenAccept(this,data);

        for (String instruction : instructions) {
            System.out.println(instruction);
        }
        return data;
    }

    @Override
    public Object visit(ASTDECL node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("DECL");
        return data;
    }

    @Override
    public Object visit(ASTX node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("X");
        return data;
    }

    @Override
    public Object visit(ASTVARS node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("VARS");
        return data;
    }

    @Override
    public Object visit(ASTVARS2 node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("VARS2");
        return data;
    }

    @Override
    public Object visit(ASTLINES2 node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("LINES2");
        return data;
    }

    @Override
    public Object visit(ASTASSN node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("ASSN");
        OPCODE = "load";

        addInstruction(OPCODE, node.value.toString(), Integer.toString(DEST));
        DEST++;
        return data;
    }

    @Override
    public Object visit(ASTY node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("Y");
        return data;
    }

    @Override
    public Object visit(ASTZ node, Object data) {
        data = node.childrenAccept(this, data);
        if(node.value != null){
            if( node.value.toString().matches("[+]")){
                OPCODE = "add";
                if(DEST - 2 > -1){                  // Stops array out of bounds
                    String[] temp = instructions.get(DEST-2).toString().split("\\s");
                    String[] temp2 = instructions.get(DEST-1).toString().split("\\s");

                    addInstruction(OPCODE,Integer.toString(DEST),temp[1],temp2[1]);
                    DEST++;
                }
            }
            else{
                OPCODE = "subtract";
                if(DEST - 2 > -1){                  // Stops array out of bounds
                    String[] temp = instructions.get(DEST-2).toString().split("\\s");
                    String[] temp2 = instructions.get(DEST-1).toString().split("\\s");

                    addInstruction(OPCODE,Integer.toString(DEST),temp[1],temp2[1]);
                    DEST++;
                }

            }
        }
        //System.out.println("Z");
        return data;
    }

    @Override
    public Object visit(ASTTERM2 node, Object data) {
        data = node.childrenAccept(this, data);
        if(node.value !=null){
            OPCODE = "multiply";
            if(DEST - 2 > -1){                  // Stops array out of bounds
                String[] temp = instructions.get(DEST-2).toString().split("\\s");
                String[] temp2 = instructions.get(DEST-1).toString().split("\\s");

                addInstruction(OPCODE,Integer.toString(DEST),temp[1],temp2[1]);
                DEST++;
            }

        }
        //System.out.println("TERM2");
        return data;
    }

    @Override
    public Object visit(ASTFACTOR node, Object data) {

        data = node.childrenAccept(this, data);
        if(node.value != null){
            if(node.value.toString().matches("[a-z]+")){
                OPCODE = "load";
                addInstruction(OPCODE, Integer.toString(DEST), node.value.toString());

                DEST++;

            }
            if(node.value.toString().matches("\\d+")){
                OPCODE = "loadconstant";
                addInstruction(OPCODE, Integer.toString(DEST), node.value.toString());
                DEST++;
            }
        };

        //System.out.println("FACTOR");
        return data;
    }

    @Override
    public Object visit(ASTIFSTMT node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("IFSTMT");
        return data;
    }

    @Override
    public Object visit(ASTTEST node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("TEST");
        return data;
    }

    @Override
    public Object visit(ASTQ node, Object data) {
        data = node.childrenAccept(this, data);
        //System.out.println("Q");
        return data;
    }
}