package tutogef.editpolicies;

import org.eclipse.gef.commands.Command;
import org.eclipse.gef.editpolicies.ComponentEditPolicy;
import org.eclipse.gef.requests.GroupRequest;

import tutogef.commands.DeleteCommand;
import tutogef.commands.DeleteConnectionCommand;
import tutogef.model.Connection;

public class ConnectionEditPolicy extends ComponentEditPolicy {
	
	@Override
	protected Command createDeleteCommand(GroupRequest deleteRequest) {
		// ��ȡ��Ҫɾ�������Ӷ���
		Connection comm = (Connection)getHost().getModel();
		// �½�һ��ɾ������
        DeleteConnectionCommand cmd=new DeleteConnectionCommand();
        // ���� ����� һЩ���� :��source �� target �� connection
        cmd.setTarget(comm.getTarget());
        cmd.setSource(comm.getSource());
        cmd.setConnection(comm);
        // ������� 
        return cmd;
	}
}
