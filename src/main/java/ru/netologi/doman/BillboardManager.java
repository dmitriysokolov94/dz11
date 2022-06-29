package  ru.netologi.doman;

public class BillboardManager {
    private BillboardItem[] items = new BillboardItem[0];
    private int resultLength = 10;

    public BillboardManager() {

    }

    public BillboardManager(int resultLength) {
        this.resultLength = resultLength;
    }

    public void addNewFilms(BillboardItem item) {
        int length = items.length + 1;
        BillboardItem[] tmp = new BillboardItem[length];
        System.arraycopy(items, 0, tmp, 0, items.length);
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public BillboardItem[] findAll() {
        return items;
    }

    public BillboardItem[] findLast() {
        if (items.length > resultLength) {
            resultLength = resultLength;

        } else {
            resultLength = items.length;
        }
        BillboardItem[] result = new BillboardItem[resultLength];
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }
}
