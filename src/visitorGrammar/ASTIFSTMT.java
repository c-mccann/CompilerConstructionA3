/* Generated By:JJTree: Do not edit this line. ASTIFSTMT.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package visitorGrammar;

public
class ASTIFSTMT extends SimpleNode {
  public ASTIFSTMT(int id) {
    super(id);
  }

  public ASTIFSTMT(visitorGrammar p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(visitorGrammarVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=663d4b74b066cc54b5bd1761b26f0249 (do not edit this line) */