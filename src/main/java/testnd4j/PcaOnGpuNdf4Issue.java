package testnd4j;

import org.nd4j.linalg.api.ndarray.INDArray;
import org.nd4j.linalg.dimensionalityreduction.PCA;
import org.nd4j.linalg.factory.Nd4j;

public class PcaOnGpuNdf4Issue {
    public static void main(String[] args) {
        INDArray data = Nd4j.rand(1000,31000);
        PCA.pca_factor(data, 50, false);
    }
}
