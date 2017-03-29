package pers.zcy.decorator;

public class Cloth extends Component {
	
	protected Component component = null;

	public Cloth(pers.zcy.decorator.Component component) {
		super();
		this.component = component;
	}

	@Override
	public void show() {
		if(component != null){
			component.show();
		}
	}

}
