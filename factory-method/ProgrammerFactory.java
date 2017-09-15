interface Programmer {
    Stack getStack();
}

class FrontendProgrammer implements Programmer {
    private Stack stack;

    public FrontendProgrammer() {
        this.stack = new Stack();
    }

    @Override
    public Stack getStack() {
        return stack;
    }
}

class BackendProgrammer implements Programmer {
    private Stack stack;

    public BackendProgrammer() {
        this.stack = new Stack();
    }

    @Override
    public Stack getStack() {
        return stack;
    }
}

public class ProgrammerFactory {
    private static ProgrammerFactory factoryInstance;
    private int createdCount;

    private ProgrammerFactory() {
        this.createdCount = 0;
    }

    public static ProgrammerFactory getInstance() {
        if (factoryInstance == null) {
            factoryInstance = new ProgrammerFactory();
        }
        return factoryInstance;
    }

    public static Programmer build(String kind) {
        if (kind.equals(ProgrammerTypes.FRONTEND)) {
            this.createdCount += 1;
            return new FrontendProgrammer();
        }
        if (kind.equals(ProgrammerTypes.BACKEND)) {
            this.createdCount += 1;
            return new BackendProgrammer();
        }
        return null;
    }
}