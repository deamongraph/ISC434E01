package practica_patrones;
// visual object contiene

import java.util.ArrayList;
import java.util.List;

public class Visualobject {

    private String imagepath;
    private List<Visualobject> visualobjects;

    public Visualobject(String imagepath, List<Visualobject> visualobjects) {
        this.imagepath = imagepath;
        this.visualobjects = visualobjects;
    }

    public Visualobject(String imagepath) {
        this.imagepath = imagepath;
    }

    @Override
    public String toString() {
        return "Visualobject{" + "imagepath=" + imagepath + ", visualobjects=" + getVisualobjects() + '}';
    }

    public String getImagepath() {
        return imagepath;
    }

    public void setImagepath(String imagepath) {
        this.imagepath = imagepath;
    }

    public List<String> getVisualobjects() {
        List<String> vs = new ArrayList<>();
        for (Visualobject object : visualobjects) {
            vs.add(object.getImagepath());

        }
        return vs;
    }

    public void setVisualobjects(List<Visualobject> visualobjects) {
        this.visualobjects = visualobjects;
    }

}
