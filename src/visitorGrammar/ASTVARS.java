/* Generated By:JJTree: Do not edit this line. ASTVARS.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package visitorGrammar;

public
class ASTVARS extends SimpleNode {
  public ASTVARS(int id) {
    super(id);
  }

  public ASTVARS(visitorGrammar p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(visitorGrammarVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=3415caee8047b80f3f0f16517d082ee6 (do not edit this line) */