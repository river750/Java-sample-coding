// 図書館の管理システム

package main.java.me.river750.library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // 本を追加
        Book book1 = new Book("Java入門", "山田太郎", "978-4-123456-78-9");
        Book book2 = new Book("デザインパターン", "鈴木花子", "978-4-987654-32-1");
        Book book3 = new Book("Python機械学習入門", "高橋誠", "978-4-8156-1234-5");
        Book book4 = new Book("データベース設計の基礎", "佐藤雅子", "978-4-7741-9876-5");
        Book book5 = new Book("クラウドコンピューティング概論", "鈴木一郎", "978-4-8443-5555-0");
        Book book6 = new Book("ビッグデータ分析手法", "伊藤美咲", "978-4-2748-6666-3");
        Book book7 = new Book("IoTシステム構築ガイド", "小林隆", "978-4-7973-7777-6");
        Book book8 = new Book("ブロックチェーン技術と応用", "木村太郎", "978-4-2975-9999-2");
        Book book9 = new Book("宇宙の神秘：最新天文学入門", "星野光子", "978-4-0623-1234-5");
        Book book10 = new Book("江戸時代の料理と食文化", "佐藤郷土", "978-4-1098-5678-9");
        Book book11 = new Book("日本の昆虫図鑑", "田中昆太", "978-4-5837-3456-7");
        Book book12 = new Book("現代美術の巨匠たち", "高橋芸術", "978-4-7741-9012-3");
        Book book13 = new Book("心理カウンセリング入門", "中村静香", "978-4-8222-7890-1");
        Book book14 = new Book("俳句で巡る日本の四季", "山本俳朗", "978-4-2345-6789-0");
        Book book15 = new Book("わかりやすい量子力学", "木村理恵", "978-4-9012-3456-7");
        Book book16 = new Book("日本の伝統工芸：技と美", "小林匠子", "978-4-5678-9012-3");
        Book book17 = new Book("世界の名作レシピ集", "渡辺シェフ", "978-4-9876-5432-1");
        Book book18 = new Book("江戸川乱歩傑作選", "江戸川乱歩", "978-4-3210-9876-5");

        library.addBook(book1);
        library.addBook(book2);
        library.addBook(book3);
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);
        library.addBook(book7);
        library.addBook(book8);
        library.addBook(book9);
        library.addBook(book10);
        library.addBook(book11);
        library.addBook(book12);
        library.addBook(book13);
        library.addBook(book14);
        library.addBook(book15);
        library.addBook(book16);
        library.addBook(book17);
        library.addBook(book18);

        // メンバーを追加
        Member member1 = new Member("田中太郎", 1);
        Member member2 = new Member("鈴木一郎", 2);
        Member member3 = new Member("山田花子", 3);
        Member member4 = new Member("佐藤健二", 4);
        Member member5 = new Member("加藤美咲", 5);
        Member member6 = new Member("伊藤雄太", 6);
        Member member7 = new Member("渡辺明美", 7);

        library.registerMember(member1);
        library.registerMember(member2);
        library.registerMember(member3);
        library.registerMember(member4);
        library.registerMember(member5);
        library.registerMember(member6);
        library.registerMember(member7);

        // 本の貸し出し
        library.lendBook(member1, book1);
        library.lendBook(member1, book5);
        library.lendBook(member1, book6);
        library.lendBook(member2, book2);
        library.lendBook(member5, book10);
        library.lendBook(member5, book11);
        library.lendBook(member5, book12);
        library.lendBook(member7, book7);
        library.lendBook(member7, book18);

        // 本の返却
        library.returnBook(member1, book1);
        library.returnBook(member2, book2);
        library.returnBook(member5, book11);
        library.returnBook(member5, book12);

        // 図書館の情報を表示
        library.displayBooks();
        library.displayMembers();

        // 検索例
        library.searchByAuthor("山本");
        library.searchByTitle("Java");
        library.searchByISBN("978-4-0623-1234-5");
    }
}