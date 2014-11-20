package practica_patrones;

import java.util.List;

public class Layer {

    int capa;
    List<Visualobject> visualobjects;
    Layer sublayer;

    public Layer(int capa, List<Visualobject> visualobjects, Layer sublayer) {
        this.capa = capa;
        this.visualobjects = visualobjects;
        this.sublayer = sublayer;
    }

    public int getCapa() {
        return capa;
    }

    public void setCapa(int capa) {
        this.capa = capa;
    }

    public List<Visualobject> getVisualobjects() {
        return visualobjects;
    }

    public void setVisualobjects(List<Visualobject> visualobjects) {
        this.visualobjects = visualobjects;
    }

    public Layer getSublayer() {
        return sublayer;
    }

    public void setSublayer(Layer sublayer) {
        this.sublayer = sublayer;
    }

}
