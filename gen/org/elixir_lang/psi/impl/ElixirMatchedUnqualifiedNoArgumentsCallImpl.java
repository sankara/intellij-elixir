// This is a generated file. Not intended for manual editing.
package org.elixir_lang.psi.impl;

import com.ericsson.otp.erlang.OtpErlangObject;
import com.intellij.lang.ASTNode;
import com.intellij.navigation.ItemPresentation;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import org.elixir_lang.psi.ElixirDoBlock;
import org.elixir_lang.psi.ElixirIdentifier;
import org.elixir_lang.psi.ElixirMatchedUnqualifiedNoArgumentsCall;
import org.elixir_lang.psi.ElixirVisitor;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class ElixirMatchedUnqualifiedNoArgumentsCallImpl extends ElixirMatchedExpressionImpl implements ElixirMatchedUnqualifiedNoArgumentsCall {

  public ElixirMatchedUnqualifiedNoArgumentsCallImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof ElixirVisitor) ((ElixirVisitor)visitor).visitMatchedUnqualifiedNoArgumentsCall(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public ElixirIdentifier getIdentifier() {
    return findNotNullChildByClass(ElixirIdentifier.class);
  }

  @Nullable
  public String functionName() {
    return ElixirPsiImplUtil.functionName(this);
  }

  @NotNull
  public PsiElement functionNameElement() {
    return ElixirPsiImplUtil.functionNameElement(this);
  }

  @Nullable
  public ElixirDoBlock getDoBlock() {
    return ElixirPsiImplUtil.getDoBlock(this);
  }

  public PsiElement getNameIdentifier() {
    return ElixirPsiImplUtil.getNameIdentifier(this);
  }

  @NotNull
  public ItemPresentation getPresentation() {
    return ElixirPsiImplUtil.getPresentation(this);
  }

  public boolean isCalling(String resolvedModuleName, String resolvedFunctionName) {
    return ElixirPsiImplUtil.isCalling(this, resolvedModuleName, resolvedFunctionName);
  }

  public boolean isCalling(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity) {
    return ElixirPsiImplUtil.isCalling(this, resolvedModuleName, resolvedFunctionName, resolvedFinalArity);
  }

  public boolean isCallingMacro(String resolvedModuleName, String resolvedFunctionName, int resolvedFinalArity) {
    return ElixirPsiImplUtil.isCallingMacro(this, resolvedModuleName, resolvedFunctionName, resolvedFinalArity);
  }

  @Nullable
  public String moduleName() {
    return ElixirPsiImplUtil.moduleName(this);
  }

  @Nullable
  public PsiElement[] primaryArguments() {
    return ElixirPsiImplUtil.primaryArguments(this);
  }

  @Nullable
  public Integer primaryArity() {
    return ElixirPsiImplUtil.primaryArity(this);
  }

  @NotNull
  public OtpErlangObject quote() {
    return ElixirPsiImplUtil.quote(this);
  }

  @NotNull
  public int resolvedFinalArity() {
    return ElixirPsiImplUtil.resolvedFinalArity(this);
  }

  @NotNull
  public String resolvedFunctionName() {
    return ElixirPsiImplUtil.resolvedFunctionName(this);
  }

  @NotNull
  public String resolvedModuleName() {
    return ElixirPsiImplUtil.resolvedModuleName(this);
  }

  @Nullable
  public Integer resolvedPrimaryArity() {
    return ElixirPsiImplUtil.resolvedPrimaryArity(this);
  }

  @Nullable
  public Integer resolvedSecondaryArity() {
    return ElixirPsiImplUtil.resolvedSecondaryArity(this);
  }

  @Nullable
  public PsiElement[] secondaryArguments() {
    return ElixirPsiImplUtil.secondaryArguments(this);
  }

  @Nullable
  public Integer secondaryArity() {
    return ElixirPsiImplUtil.secondaryArity(this);
  }

}
