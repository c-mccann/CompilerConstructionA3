/* Generated By:JJTree: Do not edit this line. ASTY.java Version 6.0 */
/* JavaCCOptions:MULTI=true,NODE_USES_PARSER=false,VISITOR=true,TRACK_TOKENS=false,NODE_PREFIX=AST,NODE_EXTENDS=,NODE_FACTORY=,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package visitorGrammar;

public
class ASTY extends SimpleNode {
  public ASTY(int id) {
    super(id);
  }

  public ASTY(visitorGrammar p, int id) {
    super(p, id);
  }


  /** Accept the visitor. **/
  public Object jjtAccept(visitorGrammarVisitor visitor, Object data) {

    return
    visitor.visit(this, data);
  }
}
/* JavaCC - OriginalChecksum=6469cb6625a7b3c148b858925ace6970 (do not edit this line) */
