package tp6;

public class Nodo {
	private Object nodeInfo;
	private Nodo nextNode;


	public Nodo(Object nodeInfo){
		this(nodeInfo,null);
	}

	public Nodo(Object nodeInfo, Nodo nextNode){
		this.nodeInfo=nodeInfo;
		this.nextNode=nextNode;
	}
	
	public void setNodeInfo(Object nodeInfo){
		this.nodeInfo=nodeInfo;
	}
	
	public void setNextNode(Nodo nextNode){
		this.nextNode=nextNode;
	}
	
	
	public Object getNodeInfo(){
		return this.nodeInfo;
	}
	
	public Nodo getNextNode(){
		return this.nextNode;
	}

	
	
}