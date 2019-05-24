package day09;

@FunctionalInterface
public interface Command {
	void exec();
	default public void process() {
		System.out.println("process()");
	}
}

class DeleteCommand implements Command {
	@Override
	public void exec() {
		System.out.println("DeleteCommand 수행 ");
	}
}

class CreateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("CreateCommand 수행 ");
	}
}

class UpdateCommand implements Command {
	@Override
	public void exec() {
		System.out.println("UpdateCommand 수행 ");
	}
}

class ListCommand implements Command {
	@Override
	public void exec() {
		System.out.println("ListCommand 수행 ");
	}
}

