package com.example.getitems.dummy;

import com.example.getitems.ItemLocationEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class ItemViewModel {

    /**
     * An array of sample (dummy) items.
     */
    public static final List<ItemModel> ITEMS = new ArrayList<ItemModel>();

    /**
     * A map of sample (dummy) items, by ID.
     */
    public static final Map<String, ItemModel> ITEM_MAP = new HashMap<String, ItemModel>();

    private static final int COUNT = 3;

    static {
        // Add some sample items.
        addItem(new ItemModel("Gold Sword", "Really Sharp", 1, 1, 1,"sword2",ItemLocationEnum.PrimaryHand));
        addItem(new ItemModel("Bunny Hat", "I Live for speed", 0, 0, 3,"hat1",ItemLocationEnum.Head));
        addItem(new ItemModel("Strong Shield", "Good and Strong", 0, 0, 2,"shield4a",ItemLocationEnum.OffHand));
        addItem(new ItemModel("Strong Shield Bad", "Good and Strong", 0, 0, 2,"shield4",ItemLocationEnum.OffHand));
    }

    private static void addItem(ItemModel item) {
        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    /*
    private static ItemModel createDummyItem(int position) {
        return new ItemModel(String.valueOf(position), "Item " + position, makeDetails(position));
    }
    */

    private static String makeDetails(int position) {
        StringBuilder builder = new StringBuilder();
        builder.append("Details about Item: ").append(position);
        for (int i = 0; i < position; i++) {
            builder.append("\nMore details information here.");
        }
        return builder.toString();
    }

    /**
     * An item Model representing a piece of content.
     */
    public static class ItemModel {
        public String id = UUID.randomUUID().toString();
        public int Range;
        public int Damage;
        public int Value;
        public String Name;
        public String Description;
        public String Guid;
        public String ImageURI;
        public ItemLocationEnum Location;

        public ItemModel(
                        String name,
                        String description,
                        int range,
                        int damage,
                        int value,
                        String imageURI,
                        ItemLocationEnum location
        ) {
            this.Guid = this.id;

            this.Range = range;
            this.Damage = damage;
            this.Value = value;
            this.Name = name;
            this.Description = description;
            this.ImageURI = imageURI;
            this.Location = location;
        }

        @Override
        public String toString() {
            return Name;
        }
    }
}