/* Generated By:JJTree: Do not edit this line. ASTZ.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package visitorGrammar;

public
class ASTZ extends SimpleNode {
  public ASTZ(int id) {
    super(id);
  }

  public ASTZ(visitorGrammar p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(visitorGrammarVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6174730476b027599b1f33d19f9f9933 (do not edit this line) */
