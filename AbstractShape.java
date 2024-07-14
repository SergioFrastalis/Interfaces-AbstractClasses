package gr.aueb.cf.ch16.homework.p2;

public abstract class AbstractShape implements IShape {
    protected long id;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}

