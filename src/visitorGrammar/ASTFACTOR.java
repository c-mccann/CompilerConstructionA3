/* Generated By:JJTree: Do not edit this line. ASTFACTOR.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package visitorGrammar;

public
class ASTFACTOR extends SimpleNode {
  public ASTFACTOR(int id) {
    super(id);
  }

  public ASTFACTOR(visitorGrammar p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(visitorGrammarVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=ee6990eb74d4e4df7a6b9e9515de0f87 (do not edit this line) */