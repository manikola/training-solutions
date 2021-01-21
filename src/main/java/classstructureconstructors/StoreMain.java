package classstructureconstructors;

public class StoreMain {
    public static void main(String[] args) {
        Store pcStore = new Store("pc");
        pcStore.store(22);
        System.out.println(pcStore.getProduct() + pcStore.getStock());

        Store printerStore = new Store("printer");
        printerStore.store(33);
        System.out.println(printerStore.getProduct() + printerStore.getStock());

        pcStore.store(100);
        printerStore.store(50);
        pcStore.dispatch( 4);
        printerStore.dispatch(2);

        System.out.println(pcStore.getProduct() + ":" + pcStore.getStock());
        System.out.println(printerStore.getProduct() + ":" + printerStore.getStock());
    }
}
