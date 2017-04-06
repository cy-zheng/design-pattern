package decorator;

public class Cloth extends Component {
	
	protected Component component = null;

	public Cloth(decorator.Component component) {
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
