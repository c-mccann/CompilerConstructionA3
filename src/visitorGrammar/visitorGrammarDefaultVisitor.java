/* Generated By:JavaCC: Do not edit this line. visitorGrammarDefaultVisitor.java Version 6.0_1 */
package visitorGrammar;

public class visitorGrammarDefaultVisitor implements visitorGrammarVisitor{
  public Object defaultVisit(SimpleNode node, Object data){
    node.childrenAccept(this, data);
    return data;
  }
  public Object visit(SimpleNode node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTS node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTDECL node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTX node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVARS node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTVARS2 node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTLINES2 node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTASSN node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTY node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTZ node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTERM2 node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTFACTOR node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTIFSTMT node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTTEST node, Object data){
    return defaultVisit(node, data);
  }
  public Object visit(ASTQ node, Object data){
    return defaultVisit(node, data);
  }
}
/* JavaCC - OriginalChecksum=b8c978d7adf2ce97029269223f0c526e (do not edit this line) */
