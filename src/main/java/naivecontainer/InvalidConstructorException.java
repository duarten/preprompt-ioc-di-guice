package naivecontainer;

@SuppressWarnings("serial")
public class InvalidConstructorException extends NaiveContainerDesignException {

	private final Class<?> _klass;
	
	public Class<?> getInvalidClass(){ return _klass;}

	public InvalidConstructorException(Class<?> klass) {
		_klass = klass;
	}
	
	@Override	
	public String getMessage() {
		return String.format("Class %s has %d constructors (exactly one is allowed)",_klass.getName(),_klass.getConstructors().length);
	}
}
