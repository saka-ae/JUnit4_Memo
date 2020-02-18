package chap12.sample12_4_2.server;

import java.rmi.Remote;
import java.rmi.RemoteException;

import chap12.sample12_3.protocol.WorkRequest;

public interface WorkListener extends Remote {

	void workCompleted(WorkRequest request, Object result) throws RemoteException;

}
