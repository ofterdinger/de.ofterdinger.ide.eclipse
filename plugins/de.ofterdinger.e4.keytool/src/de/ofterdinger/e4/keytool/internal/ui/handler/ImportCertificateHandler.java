package de.ofterdinger.e4.keytool.internal.ui.handler;

import org.eclipse.core.commands.ExecutionException;
import org.eclipse.jface.wizard.WizardDialog;
import org.eclipse.ui.IWorkbenchWindow;

import de.ofterdinger.e4.keytool.internal.ui.wizard.ImportCertificateWizard;

public class ImportCertificateHandler extends AbstractKeytoolHandler {
	@Override
	public void execute(IWorkbenchWindow window) throws ExecutionException {
		ImportCertificateWizard wizard = new ImportCertificateWizard();
		WizardDialog dialog = new WizardDialog(window.getShell(), wizard);
		dialog.create();
		dialog.open();
	}
}