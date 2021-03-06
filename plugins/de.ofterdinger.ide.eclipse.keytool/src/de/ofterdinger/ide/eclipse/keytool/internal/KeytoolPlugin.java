package de.ofterdinger.ide.eclipse.keytool.internal;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

public class KeytoolPlugin extends AbstractUIPlugin {
  public static final String PLUGIN_ID = "de.ofterdinger.e4.keytool";

  private static KeytoolPlugin plugin;

  @Override
  public void start(BundleContext context) throws Exception {
    super.start(context);
    setPlugin(this);
  }

  @Override
  public void stop(BundleContext context) throws Exception {
    setPlugin(null);
    super.stop(context);
  }

  public static synchronized KeytoolPlugin getDefault() {
    return plugin;
  }

  public static boolean openConfirm(String title, String message, Shell shell) {
    return MessageDialog.openConfirm(shell, title, message);
  }

  public static void showError(String txt, Shell shell) {
    MessageDialog.openError(shell, "Error", txt);
  }

  public static void showErrorAsync(final String message, Shell shell) {
    shell.getDisplay().syncExec(() -> MessageDialog.openError(shell, "Keytool error", message));
  }

  public static void showMessage(final String title, final String message, Shell shell) {
    shell.getDisplay().syncExec(() -> MessageDialog.openError(shell, title, message));
  }

  private static synchronized void setPlugin(KeytoolPlugin keytoolPlugin) {
    plugin = keytoolPlugin;
  }
}
