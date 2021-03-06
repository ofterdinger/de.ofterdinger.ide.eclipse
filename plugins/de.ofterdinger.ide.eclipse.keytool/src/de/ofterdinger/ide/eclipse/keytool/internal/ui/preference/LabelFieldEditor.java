package de.ofterdinger.ide.eclipse.keytool.internal.ui.preference;

import org.eclipse.jface.preference.FieldEditor;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Label;

class LabelFieldEditor extends FieldEditor {
  private Label label;

  public LabelFieldEditor(String value, Composite parent) {
    super("label", value, parent);
  }

  @Override
  public int getNumberOfControls() {
    return 1;
  }

  @Override
  protected void adjustForNumColumns(int numColumns) {
    ((GridData) this.label.getLayoutData()).horizontalSpan = numColumns;
  }

  @Override
  protected void doFillIntoGrid(Composite parent, int numColumns) {
    this.label = this.getLabelControl(parent);
    GridData gridData = new GridData();
    gridData.horizontalSpan = numColumns;
    gridData.horizontalAlignment = 4;
    gridData.grabExcessHorizontalSpace = false;
    gridData.verticalAlignment = 2;
    gridData.grabExcessVerticalSpace = false;
    this.label.setLayoutData(gridData);
  }

  @Override
  protected void doLoad() {
    // nothing to do yet
  }

  @Override
  protected void doLoadDefault() {
    // nothing to do yet
  }

  @Override
  protected void doStore() {
    // nothing to do yet
  }
}
