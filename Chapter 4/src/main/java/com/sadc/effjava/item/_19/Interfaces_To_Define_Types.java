/**
 * Created by p590032 on 8/28/2014.
 */
public class Interfaces_To_Define_Types {

    public static void main(String[] args) {
        //don't use the constant interface!
        //consider a util class instead
    }

    class ConstantSuccess{
       private ConstantSuccess(){}
        // Avogadro's number (1/mol)
       public static final double AVOGADROS_NUMBER = 6.02214199e23;
        // Boltzmann constant (J/K)
        public static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
        // Mass of the electron (kg)
        public static final double ELECTRON_MASS = 9.10938188e-31;
    }

    interface ConstantFailure{
        // Avogadro's number (1/mol)
        static final double AVOGADROS_NUMBER = 6.02214199e23;
        // Boltzmann constant (J/K)
        static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
        // Mass of the electron (kg)
        static final double ELECTRON_MASS = 9.10938188e-31;
    }
}
