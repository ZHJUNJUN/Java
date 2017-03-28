package tutogef.part;

import org.eclipse.draw2d.BendpointConnectionRouter;
import org.eclipse.draw2d.IFigure;
import org.eclipse.draw2d.PolygonDecoration;
import org.eclipse.draw2d.PolylineConnection;
import org.eclipse.gef.EditPolicy;
import org.eclipse.gef.editparts.AbstractConnectionEditPart;
import org.eclipse.gef.editpolicies.ConnectionEndpointEditPolicy;

import tutogef.editpolicies.ConnectionEditPolicy;

public class ConnectionPart extends AbstractConnectionEditPart {

	@Override
	protected IFigure createFigure() {
		PolylineConnection plc = new PolylineConnection();
		plc.setTargetDecoration(new PolygonDecoration());
		plc.setConnectionRouter(new BendpointConnectionRouter());
		return plc;
	}

	// ע���¼�
	@Override
	protected void createEditPolicies() {
		// ��������Ҫ�Լ�д��
		installEditPolicy(EditPolicy.COMPONENT_ROLE, new ConnectionEditPolicy());
		installEditPolicy(EditPolicy.CONNECTION_ENDPOINTS_ROLE, new ConnectionEndpointEditPolicy());
	}

	@Override
	protected void refreshVisuals() {
	}
}
