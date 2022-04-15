package spring.model2.control;

/*
 ��Ʈ�ѷ� ������ 
 - �𵨰� �� ���� : objectscope ���
 - �׺���̼� : forward / sedredirect �̿�
 - �� ������ ������ �κи� �𵨸��� �� 
 */

public class ModelAndView {
	
	//field 
	private String viewName;
	private String modelName;
	private Object modelObject;
	
	
	//constructor
	public ModelAndView() {
	}
	public ModelAndView(String viewName) {
		this.viewName = viewName;
	}
	public ModelAndView(String viewName, String modelName, Object modelObject) {
		this.viewName = viewName;
		this.modelName = modelName;
		this.modelObject = modelObject;
	}
	
	//Method
	public String getViewName() {
		return viewName;
	}
	public void setViewName(String viewName) {
		this.viewName = viewName;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	public Object getModelObject() {
		return modelObject;
	}
	public void setModelObject(Object modelObject) {
		this.modelObject = modelObject;
	}
	
} // end of class
