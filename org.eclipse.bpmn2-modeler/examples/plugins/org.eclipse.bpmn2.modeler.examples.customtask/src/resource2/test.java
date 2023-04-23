package resource2;

import org.eclipse.emf.common.util.EList;

import projetTemplate.Componenets;
import projetTemplate.MLAlgorithmSolutionPattern;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        BdQueries bdquery = new BdQueries();
        //bdquery.GetdAlgorithmsByCategory("test");
        EList<MLAlgorithmSolutionPattern>  list = BdQueries.GetdAlgorithmsByCategory(Componenets.MODEL_CONSTRUCTION.toString()).getMlalgorithmsolutionpattern();

        int i=0;
	}

}