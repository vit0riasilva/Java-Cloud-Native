public class PetMachine {
    private boolean clean = true;
    private int agua = 30;
    private int xampu = 10;
    private Pet pet;


    public void darBanho() {
        if(this.pet == null) {
            System.out.println("Coloque o pet na máquina para iniciar o banho!");
            return;
        }

        this.agua -= 10;
        this.xampu -= 2;

        pet.setClean(true);
        System.out.println("O pet " + pet.getName() + " está limpo");
    }

    public void adicionarAgua() {
        if (agua == 30) {
            System.out.println("A capacidade de água da máquina está no máximo");
            return;
        }
        agua += 2;
        System.out.println("+ 2l de água adicionados");
        System.out.println("Total de água: " + agua);
    }

    public void adicionarXampu() {
        if (xampu == 10) {
            System.out.println("A capacidade de xampu da máquina está no máximo");
            return;
        }

        xampu += 2;
        System.out.println("+ 2l de xampu adicionados");
        System.out.println("Total de xampu: " + xampu);
    }


    public void setPet(Pet pet) {
        if (!this.clean) {
            System.out.println("A máquina está suja, para colocar o pet é necessário limpa-la");
            return;
        } 
        
        if(temPet()) {
            System.out.println("O pet " + this.pet.getName() + " está na máquina nesse momento");
            return;
        }

        this.pet = pet;
        System.out.println("O pet " + pet.getName() + " foi colocado na máquina!");
    }

    public void retirarPet() {
        if (this.pet == null) {
            System.out.println("A maquina está vazia!");
            return;
        }
        
        this.clean = this.pet.isClean();

        
        System.out.println("O pet " + this.pet.getName() + " foi retirado da máquina");
        this.pet = null;
    }

    public void lavarMaquina() {
        this.agua -= 3;
        this.xampu -= 1;
        this.clean = true;
        System.out.println("A máquina foi limpa");
    }

    public int getAgua() {
        return agua;
    }

    public int getXampu() {
        return xampu;
    }

    public boolean temPet() {
        return pet != null;
    } 


}
