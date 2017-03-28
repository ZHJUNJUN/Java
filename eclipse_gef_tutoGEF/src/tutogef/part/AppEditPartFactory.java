package tutogef.part;

import org.eclipse.gef.EditPart;
import org.eclipse.gef.EditPartFactory;
import org.eclipse.gef.editparts.AbstractGraphicalEditPart;

import tutogef.model.Connection;
import tutogef.model.Employe;
import tutogef.model.Entreprise;
import tutogef.model.Service;
/**
 * ģ�ͺͿ�������ϵ����
 * @author Administrator
 *
 */
public class AppEditPartFactory implements EditPartFactory {

	// @Override
	public EditPart createEditPart(EditPart context, Object model) {
		AbstractGraphicalEditPart part = null;
		if (model instanceof Entreprise) {
			part = new EntreprisePart();
		} else if (model instanceof Service) {
			part = new ServicePart();
		} else if (model instanceof Employe) {
			part = new EmployePart();
		} else if(model instanceof Connection){
			part = new ConnectionPart();
		}

		part.setModel(model);
		return part;
	}
}
