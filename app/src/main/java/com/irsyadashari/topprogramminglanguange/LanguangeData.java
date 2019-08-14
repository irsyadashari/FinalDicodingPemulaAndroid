package com.irsyadashari.topprogramminglanguange;

import java.util.ArrayList;

public class LanguangeData {
    public static String[][] data = new String[][]{
            {"Javascript",
                    "Brendan Eich",
                    "JavaScript adalah bahasa pemrograman tingkat tinggi dan dinamis.[4] JavaScript populer di internet dan dapat bekerja di sebagian besar penjelajah web populer seperti Google Chrome, Internet Explorer (IE), Mozilla Firefox, Netscape dan Opera. Kode JavaScript dapat disisipkan dalam halaman web menggunakan tag SCRIPT.[5] JavaScript merupakan salah satu teknologi inti World Wide Web selain HTML dan CSS. JavaScript membantu membuat halaman web interaktif dan merupakan bagian aplikasi web yang esensial.",
                    "https://upload.wikimedia.org/wikipedia/commons/6/6a/JavaScript-logo.png"},
            {"Go",
                    "Robert Griesemer, Rob Pike, & Ken Thompson",
                    "Golang adalah bahasa pemrograman yang dihimpun dan diketik dalam bahasa C, dengan fitur pengumpulan sampah, penulisan terstruktur, keamanan memori, dan pemrograman yang konkuren serta berururtan",
                    "https://res.cloudinary.com/teepublic/image/private/s--BQRaqVBF--/t_Preview/b_rgb:0195c3,c_limit,f_jpg,h_630,q_90,w_630/v1539363145/production/designs/3308007_0.jpg"},
            {"Python",
                    "Guido van Rossum",
                    "Python adalah bahasa pemrograman interpretatif multiguna dengan filosofi perancangan yang berfokus pada tingkat keterbacaan kode. Python diklaim sebagai bahasa yang menggabungkan kapabilitas, kemampuan, dengan sintaksis kode yang sangat jelas,dan dilengkapi dengan fungsionalitas pustaka standar yang besar serta komprehensif. Python juga didukung oleh komunitas yang besar.",
                    "https://www.techtrep.com/assets/uploads/2018/08/python-logo-450w.png"},
            {"Java",
                    "James Gosling",
                    "adalah satu set perangkat lunak komputer dan spesifikasi yang dikembangkan oleh Sun Microsystems, yang kemudian diakuisisi oleh Oracle Corporation, yang menyediakan sistem untuk mengembangkan aplikasi perangkat lunak dan menerapkan hal itu dalam sebuah cross-platform lingkungan komputasi. digunakan di berbagai macam platform komputasi dari perangkat embedded dan ponsel ke server perusahaan dan superkomputer. Sementara mereka yang kurang umum dari standalone aplikasi Java, Java applet yang berjalan di aman, sandboxed lingkungan untuk memberikan banyak fitur dari aplikasi asli dan dapat tertanam ke dalam HTML halaman.",
                    "https://icon2.kisspng.com/20180810/cxt/kisspng-oracle-certified-professional-java-se-programmer-c-grails-development-groovy-development-grails-d-5b6dde2478a285.7026776415339269484941.jpg"},
            {"Ruby",
                    "Yukihiro Matsumoto",
                    "Ruby adalah bahasa pemrograman dinamis berbasis skrip yang berorientasi objek. Tujuan dari ruby adalah menggabungkan kelebihan dari semua bahasa-bahasa pemrograman skrip yang ada di dunia. Ruby ditulis dengan bahasa pemrograman C dengan kemampuan dasar seperti Perl dan Python",
                    "https://fuzati.com/wp-content/uploads/2016/12/Ruby-Logo.png"},
            {"PHP",
                    "Rasmus Lerdorf",
                    "adalah bahasa skrip yang dapat ditanamkan atau disisipkan ke dalam HTML. PHP banyak dipakai untuk memprogram situs web dinamis. PHP dapat digunakan untuk membangun sebuah CMS.",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/PHP-logo.svg/1280px-PHP-logo.svg.png"},
            {"Swift",
                    "Chris Lattner, Apple",
                    "Swift adalah bahasa pemrograman objek fungsional untuk pengembangan iOS dan OS X yang dibuat oleh Apple. Didesain untuk berdampingan dengan Objective-C dan menghindari program dari kode yang salah. Swift diperkenalkan oleh Apple pada acara tahunan WWDC 2014",
                    "https://kayama.dp.ua/users-data/posts/1/1/54/apple_swift_logo-54c2084898e45.png"},
            {"Kotlin",
                    "JetBrains",
                    "Kotlin adalah sebuah bahasa pemrograman dengan pengetikan statis yang berjalan pada Mesin Virtual Java ataupun menggunakan kompiler LLVM yang dapat pula dikompilasikan kedalam bentuk kode sumber JavaScript. Pengembang utamanya berasal dari tim programer dari JetBrains yang bermarkas di Rusia. ",
                    "https://upload.wikimedia.org/wikipedia/commons/thumb/7/74/Kotlin-logo.svg/220px-Kotlin-logo.svg.png"},
            {"C sharp",
                    "Microsoft",
                    "C# merupakan sebuah bahasa pemrograman yang berorientasi objek yang dikembangkan oleh Microsoft sebagai bagian dari inisiatif kerangka .NET Framework.",
                    "https://pluralsight.imgix.net/paths/path-icons/csharp-e7b8fcd4ce.png"},
            {"C",
                    "Dennis Ritchie & Bell Laboratories",
                    "Bahasa pemrograman C merupakan salah satu bahasa pemrograman komputer. Dibuat pada tahun 1972 oleh Dennis Ritchie untuk Sistem Operasi Unix di Bell Telephone Laboratories.Meskipun C dibuat untuk memprogram sistem dan jaringan komputer namun bahasa ini juga sering digunakan dalam mengembangkan software aplikasi. C juga banyak dipakai oleh berbagai jenis platform sistem operasi dan arsitektur komputer, bahkan terdapat beberepa compiler yang sangat populer telah tersedia. C secara luar biasa memengaruhi bahasa populer lainnya, terutama C++ yang merupakan extensi dari C.",
                    "https://cdn.iconscout.com/icon/free/png-256/c-programming-569564.png"},
            };

    public static ArrayList<Languange> getListData(){
        ArrayList<Languange> list = new ArrayList<>();
        for (String[] aData : data) {
            Languange languange = new Languange();
            languange.setName(aData[0]);
            languange.setDeveloper(aData[1]);
            languange.setDescription(aData[2]);
            languange.setPhoto(aData[3]);
            list.add(languange);
        }
        return list;
    }
}
