package naivecontainer.exceptions;


@SuppressWarnings("serial")
public class UnbindedTypeException extends NaiveContainerConfigurationException {

	private final Class<?> _type;
	public Class<?> getUnbindedType(){ return _type;}

	public UnbindedTypeException(Class<?> type) {
		super("unbinded type");
		_type = type;
	}
}
