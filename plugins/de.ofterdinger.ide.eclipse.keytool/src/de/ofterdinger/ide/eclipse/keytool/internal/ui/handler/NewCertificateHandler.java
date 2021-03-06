package de.ofterdinger.ide.eclipse.keytool.internal.ui.handler;

import de.ofterdinger.ide.eclipse.keytool.internal.ui.wizard.NewCertificateWizard;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;

public class NewCertificateHandler extends AbstractKeytoolHandler {

  @Override
  public void execute(IWorkbenchWindow window) throws ExecutionException {
    NewCertificateWizard wizard = new NewCertificateWizard();
    WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
    dialog.create();
    dialog.open();
  }
}
