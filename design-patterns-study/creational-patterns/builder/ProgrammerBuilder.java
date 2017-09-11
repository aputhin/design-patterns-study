public class Programmer {
    private final List<Technology> technologies;
    private final String kind;

    public static class Builder {
        private List<Technology> technologies = new ArrayList<Technology>();
        private String kind;

        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        public Builder addTechnology(Technology tech) {
            this.technologies.add(tech);
            return this;
        }

        public Programmer build() {
            return new Programmer(this);
        }
    }

    private Programmer(Builder builder) {
        this.technologies = builder.technologies;
        this.kind = builder.kind;
    }
}

public static class ProgrammerBuilder {
    public static Programmer buildBackEnder() {
        Programmer backend = new Programmer.Builder()
            .kind(ProgrammerTypes.BACKEND)
            .addTechnology(ProgrammingLanguages.JAVA)
            .addTechnology(Databases.ORACLE)
            .build();
        return backend;
    }

    public static Programmer buildFrontEnder() {
        Programmer frontend = new Programmer.Builder()
            .kind(ProgrammerTypes.FRONTEND)
            .addTechnology(ProgrammingLanguages.JAVASCRIPT)
            .addTechnology(Frameworks.REACT)
            .build();
        return frontend;
    }
}
