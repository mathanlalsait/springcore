public class MySpringBeanWithDependency 
{
	private IWriter writermem;

	public void setWritermem(IWriter writer) {
		this.writermem = writer;
	}
	public IWriter getWritermem() {
		return writermem;
	}

}
