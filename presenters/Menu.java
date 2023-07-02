package presenters;

public class Menu {
    private View presenter;

    public Menu(View presenter){
        this.presenter = presenter;
    }

    public void play(){

        presenter.setToys();
        presenter.showToysInStore();
        presenter.startGame();
        presenter.getPrizes();

    }
}
