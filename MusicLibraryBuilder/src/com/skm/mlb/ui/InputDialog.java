/**
 * 
 */
package com.skm.mlb.ui;

import java.awt.GraphicsConfiguration;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;

/**
 * @author intel
 *
 */
public class InputDialog extends JFrame implements ActionListener {

	/**
	 * Serial ID auto generated
	 */
	private static final long serialVersionUID = -2349656299483309846L;

	/**
	 * @throws HeadlessException
	 */
	public InputDialog() throws HeadlessException {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 */
	public InputDialog(GraphicsConfiguration arg0) {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @throws HeadlessException
	 */
	public InputDialog(String arg0) throws HeadlessException {
		super(arg0);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param arg0
	 * @param arg1
	 */
	public InputDialog(String arg0, GraphicsConfiguration arg1) {
		super(arg0, arg1);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see java.awt.event.ActionListener#actionPerformed(java.awt.event.ActionEvent)
	 */
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub

	}

}
