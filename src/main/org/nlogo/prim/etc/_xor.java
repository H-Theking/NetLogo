// (C) Uri Wilensky. https://github.com/NetLogo/NetLogo

package org.nlogo.prim.etc;

import org.nlogo.api.LogoException;
import org.nlogo.api.Syntax;
import org.nlogo.nvm.Reporter;

public final strictfp class _xor
    extends Reporter
    implements org.nlogo.nvm.Pure {
  @Override
  public Object report(final org.nlogo.nvm.Context context) throws LogoException {
    boolean b1 = argEvalBooleanValue(context, 0);
    boolean b2 = argEvalBooleanValue(context, 1);
    return b1 != b2 ? Boolean.TRUE : Boolean.FALSE;
  }

  @Override
  public Syntax syntax() {
    int left = Syntax.BooleanType();
    int[] right = {Syntax.BooleanType()};
    int ret = Syntax.BooleanType();
    return Syntax.reporterSyntax(left, right, ret,
        org.nlogo.api.Syntax.NormalPrecedence() - 6);
  }
}
