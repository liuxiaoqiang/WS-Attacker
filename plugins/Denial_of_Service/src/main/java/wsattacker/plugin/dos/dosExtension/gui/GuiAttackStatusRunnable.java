/**
 * WS-Attacker - A Modular Web Services Penetration Testing Framework Copyright
 * (C) 2012 Andreas Falkenberg
 *
 * This program is free software; you can redistribute it and/or modify it under
 * the terms of the GNU General Public License as published by the Free Software
 * Foundation; either version 2 of the License, or (at your option) any later
 * version.
 *
 * This program is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU General Public License for more
 * details.
 *
 * You should have received a copy of the GNU General Public License along with
 * this program; if not, write to the Free Software Foundation, Inc., 51
 * Franklin Street, Fifth Floor, Boston, MA 02110-1301, USA.
 */
package wsattacker.plugin.dos.dosExtension.gui;

import wsattacker.plugin.dos.dosExtension.gui.DosStatusJFrameNew;
import wsattacker.plugin.dos.dosExtension.mvc.controller.AbortController;
import wsattacker.plugin.dos.dosExtension.mvc.controller.FinalizeController;
import wsattacker.plugin.dos.dosExtension.mvc.controller.ReportController;
import wsattacker.plugin.dos.dosExtension.mvc.controller.StartController;
import wsattacker.plugin.dos.dosExtension.mvc.model.AttackModel;

/**
 * opens the DosAttackJFrame once run() is executed!
 * is called via invokeLater(passed via runnable) = threadSave!
 * @author Andreas Falkenberg
 */
public class GuiAttackStatusRunnable implements Runnable
{
    private AttackModel model;

    public GuiAttackStatusRunnable(AttackModel model){
	this.model = model;
    }
	
    @Override
    public void run() {
	DosStatusJFrameNew inst = new DosStatusJFrameNew(model);
	inst.setLocationRelativeTo(null);
	inst.setVisible(true);
    }	
}