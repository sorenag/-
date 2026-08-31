package com.example.data.repository

import com.example.R
import com.example.data.models.Dynasty
import com.example.data.models.King
import com.example.data.models.Quote
import com.example.data.models.ShahnamehCharacter
import com.example.data.models.SuperIranianHero
import com.example.data.models.TimelineEvent

class ShahanRepository {

    fun getDynasties(): List<Dynasty> = listOf(
        Dynasty(
            id = "elamite",
            namePersian = "ایلامیان",
            nameEnglish = "Elamite Empire",
            period = "۲۷۰۰ - ۵۳۹ پیش از میلاد",
            founder = "پادشاهان آنشان و شوش",
            capital = "شوش و دوراونتاش",
            description = "نخستین تمدن سازمان‌یافته در فلات ایران با خط، زیگورات‌های عظیم و صنایع فلزکاری درخشان.",
            colorHex = 0xFF8D6E63,
            flagSymbol = "🏛️",
            flagNamePersian = "درفش کهن ایلامی",
            era = "باستان",
            flagImageResId = R.drawable.flag_elamite_banner_1786268671355
        ),
        Dynasty(
            id = "medes",
            namePersian = "دودمان مادها",
            nameEnglish = "Median Empire",
            period = "۶۷۸ - ۵۵۰ پیش از میلاد",
            founder = "دیاکو (دیااوکو)",
            capital = "هگمتانه (همدان)",
            description = "نخستین دولت متحد آریایی در ایران که آشوریان متجاوز را شکست داد و راه را برای امپراتوری هخامنشی هموار کرد.",
            colorHex = 0xFF795548,
            flagSymbol = "🦁",
            flagNamePersian = "درفش شیر ماد",
            era = "باستان",
            flagImageResId = R.drawable.flag_medes_banner_1786268686670
        ),
        Dynasty(
            id = "achaemenid",
            namePersian = "شاهنشاهی هخامنشی",
            nameEnglish = "Achaemenid Empire",
            period = "۵۵۰ - ۳۳۰ پیش از میلاد",
            founder = "کوروش بزرگ",
            capital = "پاسارگاد و تخت جمشید",
            description = "بزرگ‌ترین امپراتوری جهان باستان بر پایه حقوق بشر، دادگری، جاده شاهی و منشور کوروش بزرگ.",
            colorHex = 0xFFD4AF37,
            flagSymbol = "🦅",
            flagNamePersian = "درفش شهباز هخامنشی",
            era = "باستان",
            flagImageResId = R.drawable.flag_achaemenid_1786190418109
        ),
        Dynasty(
            id = "parthian",
            namePersian = "امپراتوری اشکانیان",
            nameEnglish = "Parthian Empire",
            period = "۲۴۷ پیش از میلاد - ۲۲۴ میلادی",
            founder = "ارشک یکم",
            capital = "صددروازه و تیسفون",
            description = "امپراتوری مقتدر ایرانی، گشاینده جاده ابریشم و شکست‌دهنده روم در نبرد حران توسط سورنا.",
            colorHex = 0xFF1E3A8A,
            flagSymbol = "🐉",
            flagNamePersian = "درفش اژدها و خورشید",
            era = "باستان",
            flagImageResId = R.drawable.img_derafsh_kaviani_1786113253506
        ),
        Dynasty(
            id = "sasanian",
            namePersian = "شاهنشاهی ساسانیان",
            nameEnglish = "Sasanian Empire",
            period = "۲۲۴ - ۶۵۱ میلادی",
            founder = "اردشیر بابکان",
            capital = "تیسفون (طاق کسری)",
            description = "دوران شکوه فرهنگ، هنر، موسیقی، معماری، دانشگاه گندی‌شاپور و درفش کاویانی پیش از اسلام.",
            colorHex = 0xFF991B1B,
            flagSymbol = "☀️",
            flagNamePersian = "درفش کاویانی",
            era = "باستان",
            flagImageResId = R.drawable.img_derafsh_kaviani_flag_epic_1787818537491
        ),
        Dynasty(
            id = "tahirid",
            namePersian = "دولت طاهریان",
            nameEnglish = "Tahirid Dynasty",
            period = "۸۲۱ - ۸۷۳ میلادی",
            founder = "طاهر ذوالیمینین",
            capital = "مرو و نیشابور",
            description = "نخستین حکومت مستقل ایرانی پس از اسلام که نیشابور را مرکز علم و ادب ساخت.",
            colorHex = 0xFF3F51B5,
            flagSymbol = "📜",
            flagNamePersian = "درفش سبز طاهری",
            era = "اسلامی اولیه",
            flagImageResId = R.drawable.flag_tahirid_banner_1786268702098
        ),
        Dynasty(
            id = "saffarid",
            namePersian = "دودمان صفاریان",
            nameEnglish = "Saffarid Dynasty",
            period = "۸۶۱ - ۱۰۰۳ میلادی",
            founder = "یعقوب لیث صفاری",
            capital = "زرنج (سیستان)",
            description = "قیام عیاران سیستان به رهبری یعقوب لیث که رسمیت دادن به زبان فارسی در دیوان و دربارهای ایران را احیا نمود.",
            colorHex = 0xFFC2185B,
            flagSymbol = "⚔️",
            flagNamePersian = "درفش سرخ عیاران صفاری",
            era = "اسلامی اولیه",
            flagImageResId = R.drawable.img_yaqub_saffar_hero_1786115911526
        ),
        Dynasty(
            id = "samanid",
            namePersian = "امپراتوری سامانیان",
            nameEnglish = "Samanid Empire",
            period = "۸۱۹ - ۹۹۹ میلادی",
            founder = "امیر اسماعیل سامانی",
            capital = "بخارا و سمرقند",
            description = "عصر طلایی و رنسانس زبان و ادبیات پارسی، پرورش فردوسی، رودکی، ابن‌سینا و ابوریحان بیرونی.",
            colorHex = 0xFF0D9488,
            flagSymbol = "🌙",
            flagNamePersian = "درفش سپید سامانیان بخارا",
            era = "اسلامی اولیه",
            flagImageResId = R.drawable.flag_samanid_banner_1786268716343
        ),
        Dynasty(
            id = "buyid",
            namePersian = "آل بویه (دیلمیان)",
            nameEnglish = "Buyid Dynasty",
            period = "۹۳۴ - ۱۰۶۲ میلادی",
            founder = "عمادالدوله و عضدالدوله",
            capital = "شیراز، ری و بغداد",
            description = "فرمانروایان دیلمی ایرانی که بغداد را فتح کردند و عنوان «شیر شاهنشاه» را بر سکه‌ها بازگرداندند.",
            colorHex = 0xFF4A148C,
            flagSymbol = "🏰",
            flagNamePersian = "درفش دیلمیان آل بویه",
            era = "اسلامی اولیه",
            flagImageResId = R.drawable.img_buyid_hero_1786185142045
        ),
        Dynasty(
            id = "ghaznavid",
            namePersian = "امپراتوری غزنویان",
            nameEnglish = "Ghaznavid Empire",
            period = "۹۷۷ - ۱۱۸۶ میلادی",
            founder = "سلطان محمود غزنوی",
            capital = "غزنین و لاهور",
            description = "امپراتوری مقتدر با سپاهیان پیل‌سوار که شاهنامه فردوسی در عصر آنان سروده شد.",
            colorHex = 0xFF00695C,
            flagSymbol = "🌙",
            flagNamePersian = "پرچم سبز و هلال غزنوی",
            era = "قرون وسطی",
            flagImageResId = R.drawable.flag_ghaznavid_banner_1786268733381
        ),
        Dynasty(
            id = "seljuk",
            namePersian = "امپراتوری سلجوقیان",
            nameEnglish = "Seljuk Empire",
            period = "۱۰۳۷ - ۱۱۹۴ میلادی",
            founder = "طغرل بیک و آلپ ارسلان",
            capital = "اصفهان، مرو، ری",
            description = "امپراتوری پهناور با دیوان‌سالاری قوی ایرانی به وزارت خواجه نظام‌الملک طوسی و تقویم جلالی خیام.",
            colorHex = 0xFFB45309,
            flagSymbol = "🦅",
            flagNamePersian = "درفش عقاب دو سر سلجوقی",
            era = "قرون وسطی",
            flagImageResId = R.drawable.img_alp_arslan_hero_1786115923758
        ),
        Dynasty(
            id = "khwarazmian",
            namePersian = "خوارزمشاهیان",
            nameEnglish = "Khwarazmian Empire",
            period = "۱۰۷۷ - ۱۲۳۱ میلادی",
            founder = "علاءالدین تکش و جلال‌الدین",
            capital = "گرگانج و سمرقند",
            description = "امپراتوری پهناور ایرانی و نبردهای حماسی جلال‌الدین خوارزمشاه در برابر هجوم مغولان.",
            colorHex = 0xFF2E7D32,
            flagSymbol = "🚩",
            flagNamePersian = "درفش سیاه و سبز خوارزم",
            era = "قرون وسطی",
            flagImageResId = R.drawable.img_jalal_din_hero_1786115936225
        ),
        Dynasty(
            id = "ilkhanate",
            namePersian = "ایلخانان مغول",
            nameEnglish = "Ilkhanate",
            period = "۱۲۵۶ - ۱۳۳۵ میلادی",
            founder = "هولاکوخان و غازان خان",
            capital = "مراغه، تبریز، سلطانیه",
            description = "دوران ایرانی شدن ایلخانان، وزارت خواجه نصیرالدین طوسی، رصدخانه مراغه و گنبد سلطانیه.",
            colorHex = 0xFFAD1457,
            flagSymbol = "⛩️",
            flagNamePersian = "پرچم زرد ایلخانی با مربع سرخ",
            era = "قرون وسطی",
            flagImageResId = R.drawable.flag_ilkhanate_banner_1786268750623
        ),
        Dynasty(
            id = "timurid",
            namePersian = "تیموریان",
            nameEnglish = "Timurid Empire",
            period = "۱۳۷۰ - ۱۵۰۷ میلادی",
            founder = "تیمور لنگ و شاهرخ میرزا",
            capital = "سمرقند و هرات",
            description = "رنسانس تیموری با حمایت شاهرخ و گوهرشاد از هنر مینیاتور، خطاطی، معماری هرات و سمرقند.",
            colorHex = 0xFF283593,
            flagSymbol = "⚪",
            flagNamePersian = "درفش سه گردونه تیموری",
            era = "قرون وسطی",
            flagImageResId = R.drawable.flag_timurid_banner_1786268765258
        ),
        Dynasty(
            id = "safavid",
            namePersian = "دودمان صفوی",
            nameEnglish = "Safavid Dynasty",
            period = "۱۵۰۱ - ۱۷۳۶ میلادی",
            founder = "شاه اسماعیل و شاه عباس بزرگ",
            capital = "اصفهان",
            description = "یکپارچگی تمامیت ارضی ایران، رسمیت مذهب تشیع و شکوفایی شاهکارهای اصفهان در زمان شاه عباس بزرگ.",
            colorHex = 0xFF0284C7,
            flagSymbol = "🦁",
            flagNamePersian = "پرچم شیر و خورشید صفوی",
            era = "عصر جدید اولیه",
            flagImageResId = R.drawable.flag_safavid_1786190395335
        ),
        Dynasty(
            id = "afsharid",
            namePersian = "افشاریان",
            nameEnglish = "Afsharid Empire",
            period = "۱۷۳۶ - ۱۷۹۶ میلادی",
            founder = "نادرشاه افشار",
            capital = "مشهد",
            description = "امپراتوری نظامی مقتدر نادرشاه افشار، آزادسازی تمامیت ارضی ایران و یکپارچگی قلمرو ملی.",
            colorHex = 0xFF7C3AED,
            flagSymbol = "🗡️",
            flagNamePersian = "پرچم شیر و خورشید نادرشاه",
            era = "عصر جدید اولیه",
            flagImageResId = R.drawable.flag_afsharid_1786190458811
        ),
        Dynasty(
            id = "zand",
            namePersian = "زندیه",
            nameEnglish = "Zand Dynasty",
            period = "۱۷۵۱ - ۱۷۹۴ میلادی",
            founder = "کریم‌خان زند",
            capital = "شیراز",
            description = "فرمانروایی دادگرانه و مردمی کریم‌خان زند (وکیل‌الرعایا)، رونق شیراز، امنیت و آرامش پس از سال‌ها جنگ.",
            colorHex = 0xFF16A34A,
            flagSymbol = "🚩",
            flagNamePersian = "پرچم سه‌گوش شیر و خورشید زند",
            era = "عصر جدید اولیه",
            flagImageResId = R.drawable.flag_zand_banner_1786268781337
        ),
        Dynasty(
            id = "qajar",
            namePersian = "قاجاریه",
            nameEnglish = "Qajar Dynasty",
            period = "۱۷۸۹ - ۱۹۲۵ میلادی",
            founder = "آغامحمدخان قاجار",
            capital = "تهران",
            description = "انتقال پایتخت به تهران، جنبش مشروطه، راه‌اندازی دارالفنون و ورود فناوری‌های مدرن مانند عکاسی و چاپ.",
            colorHex = 0xFFDC2626,
            flagSymbol = "🦁",
            flagNamePersian = "پرچم شیر و خورشید قاجار",
            era = "عصر مدرن اولیه",
            flagImageResId = R.drawable.flag_qajar_1786190445648
        ),
        Dynasty(
            id = "pahlavi",
            namePersian = "دودمان پهلوی",
            nameEnglish = "Pahlavi Dynasty",
            period = "۱۹۲۵ - ۱۹۷۹ میلادی",
            founder = "رضاشاه پهلوی و محمدرضاشاه",
            capital = "تهران",
            description = "نوسازی زیرساخت‌های کشور، احداث راه‌آهن سراسری، تاسیس دانشگاه تهران، صنعت نفت و توسعه مدرن.",
            colorHex = 0xFF0284C7,
            flagSymbol = "👑",
            flagNamePersian = "پرچم سه رنگ شیر و خورشید پهلوی",
            era = "عصر مدرن",
            flagImageResId = R.drawable.flag_lion_sun_epic_1787818503692
        ),
        Dynasty(
            id = "islamic_republic",
            namePersian = "جمهوری اسلامی ایران",
            nameEnglish = "Islamic Republic of Iran",
            period = "۱۹۷۹ میلادی - تاکنون",
            founder = "سید روح‌الله خمینی",
            capital = "تهران",
            description = "نظام پس از انقلاب سال ۱۳۵۷ ایران، استقلال ملی و توسعه صنایع دفاعی، علمی و زیرساخت‌ها.",
            colorHex = 0xFF16A34A,
            flagSymbol = "🚩",
            flagNamePersian = "پرچم رسمی جمهوری اسلامی ایران",
            era = "معاصر",
            flagImageResId = R.drawable.flag_iri_official_1786191004137
        )
    )

    fun getKings(): List<King> = listOf(
        // === مادها (MEDES) ===
        King(
            id = "deioces",
            namePersian = "دیاکو (دیااوکو)",
            nameEnglish = "Deioces",
            titlePersian = "نخستین پادشاه ماد، بنیان‌گذار هگمتانه",
            dynastyId = "medes",
            dynastyNamePersian = "دودمان مادها",
            reignPeriod = "۷۲۸ - ۶۷۵ پیش از میلاد",
            capital = "هگمتانه (همدان)",
            summary = "بنیان‌گذار نخستین دولت متحد آریایی در ایران و احداث‌کننده شهر هفت‌باروی هگمتانه.",
            biography = "دیاکو فردی دادگر و مورد اعتماد قبایل ماد بود. مردم به دلیل دادرسی‌های عادلانه او، وی را به عنوان نخستین پادشاه ماد برگزیدند. او دژ هگمتانه با دیوارهای هفت‌رنگ را بنیان نهاد.",
            achievements = listOf(
                "اتحاد قبایل پراکنده ماد و تاسیس نخستین حکومت پادشاهی ایران",
                "احداث شهر افسانه‌ای هگمتانه (همدان امروزی)",
                "استقرار نظام قضایی مستقل و داوری عادلانه بین مردم"
            ),
            famousQuote = "دادگری پایه و ستون استوار فرمانروایی است.",
            imageResId = null
        ),
        King(
            id = "phraortes",
            namePersian = "فرورتیش",
            nameEnglish = "Phraortes",
            titlePersian = "دومین پادشاه ماد",
            dynastyId = "medes",
            dynastyNamePersian = "دودمان مادها",
            reignPeriod = "۶۷۵ - ۶۵۳ پیش از میلاد",
            capital = "هگمتانه",
            summary = "گسترش‌دهنده قلمرو مادها و متحدکننده قبایل پارس با مادها.",
            biography = "فرورتیش فرزند دیاکو، قلمرو مادها را گسترش داد و قبایل پارس را مطیع دولت ماد ساخت. او در نبرد سنگین با امپراتوری متجاوز آشور جان خویش را فدا کرد.",
            achievements = listOf(
                "متحد ساختن اقوام پارس با پادشاهی ماد",
                "ایجاد ارتش منظم برای مقابله با تهدیدات آشوریان"
            ),
            famousQuote = "پارس و ماد برادرانی هم‌پیمان در برابر بیگانگانند.",
            imageResId = null
        ),
        King(
            id = "cyaxares",
            namePersian = "هوخشتره (کی‌اخسرو)",
            nameEnglish = "Cyaxares",
            titlePersian = "مقتدرترین پادشاه ماد، نابودکننده امپراتوری آشور",
            dynastyId = "medes",
            dynastyNamePersian = "دودمان مادها",
            reignPeriod = "۶۲۵ - ۵۸۵ پیش از میلاد",
            capital = "هگمتانه",
            summary = "فرمانده قدرتمند ماد که ارتش نوین ایران را سازمان داد و امپراتوری خونخوار آشور را نابود کرد.",
            biography = "هوخشتره نوابغ نظامی تاریخ باستان بود. او ارتش ماد را به دسته‌های تخصصی کمانداران، نیزه‌داران و سواران تقسیم نمود و با متحد شدن با بابل، شهر نینوا پایتخت آشوریان را فتح و ستمگری آشوریان را برای همیشه پایان داد.",
            achievements = listOf(
                "تاسیس ارتش کلاسیک منظم و نوین در فلات ایران",
                "فتح نینوا و نابودی کامل امپراتوری متجاوز آشور",
                "گسترش مرزهای ایران تا رود هالیس در لیدی"
            ),
            famousQuote = "پایان ستمگری آشوریان، آغاز نوینی برای آزادی ملت‌های خاورمیانه است.",
            imageResId = null
        ),
        King(
            id = "astyages",
            namePersian = "ایشتوویگو (آستیاگ)",
            nameEnglish = "Astyages",
            titlePersian = "آخرین پادشاه ماد",
            dynastyId = "medes",
            dynastyNamePersian = "دودمان مادها",
            reignPeriod = "۵۸۵ - ۵۵۰ پیش از میلاد",
            capital = "هگمتانه",
            summary = "آخرین پادشاه ماد و پدربزرگ مادری کوروش بزرگ هخامنشی.",
            biography = "ایشتوویگو فرزند هوخشتره و آخرین فرمانروای سلسله ماد بود. پس از شورش پارسیان به رهبری نوه‌اش کوروش بزرگ، حکومت مادها به هخامنشیان منتقل گردید و ماد و پارس در یک امپراتوری متحد شدند.",
            achievements = listOf(
                "تداوم ۳۵ سال آرامش نسبی در قلمرو مادها",
                "انتقال مسالمت‌آمیز قدرت به امپراتوری هخامنشی"
            ),
            famousQuote = "تقدیر تاریخ، پیوند ناگسستنی ماد و پارس را رقم زده است.",
            imageResId = null
        ),

        // === هخامنشیان (ACHAEMENID) ===
        King(
            id = "teispess",
            namePersian = "چیش‌پیش (چیش‌پیش هخامنشی)",
            nameEnglish = "Teispes",
            titlePersian = "پادشاه انشان و پارس",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۶۷۵ - ۶۴۰ پیش از میلاد",
            capital = "انشان (فارس)",
            summary = "فرزند هخامنش و فرمانروای خطه پارس و انشان.",
            biography = "چیش‌پیش فرزند هخامنش بود که قلمرو انشان را تصرف کرد و عنوان پادشاه انشان و پارس را یافت. او قلمرو خود را میان دو فرزندش آریارمنه و کوروش یکم تقسیم کرد.",
            achievements = listOf(
                "تثبیت اقتدار خاندان هخامنشی در فارس و انشان",
                "گسترش قلمرو پارسیان در جنوب غربی ایران"
            ),
            famousQuote = "خاندان هخامنش پاسداران زمین‌های پارس خواهند بود.",
            imageResId = null
        ),
        King(
            id = "cyrus_i",
            namePersian = "کوروش یکم",
            nameEnglish = "Cyrus I of Anshan",
            titlePersian = "پادشاه انشان",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۶۰۰ - ۵۵۹ پیش از میلاد",
            capital = "انشان",
            summary = "پدربزرگ کوروش بزرگ و پادشاه پارسی انشان.",
            biography = "کوروش یکم فرزند چیش‌پیش و نیازمند تثبیت روابط با امپراتوری‌های همجوار بود. وی پدر کمبوجیه یکم و پدربزرگ کوروش بزرگ است.",
            achievements = listOf(
                "حفظ یکپارچگی انشان و تحکیم دودمان هخامنشی"
            ),
            famousQuote = "مهر و دوستی میان شاهان، ضامن آرامش مردم است.",
            imageResId = null
        ),
        King(
            id = "cyrus_great",
            namePersian = "کوروش بزرگ (کوروش دوم)",
            nameEnglish = "Cyrus the Great",
            titlePersian = "شاهنشاه بزرگ، شاه چهار گوشه جهان",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۵۵۹ - ۵۳۰ پیش از میلاد",
            capital = "پاسارگاد و انشان",
            summary = "بنیان‌گذار شاهنشاهی هخامنشی، نویسنده استوانه کوروش (نخستین منشور حقوق بشر جهان).",
            biography = "کوروش بزرگ با متحد ساختن مادها و پارس‌ها، قدرتمندترین امپراتوری تاریخ باستان را بنیان نهاد. او پس از فتح بابل، همه بردگان را آزاد ساخت و آزادی ادیان را اعلام نمود.",
            achievements = listOf(
                "بنیان‌گذاری امپراتوری هخامنشی و ساخت پاسارگاد",
                "نگارش منشور حقوق بشر کوروش پس از فتح بابل",
                "ایجاد نخستین نظام مدیریت فدرال و احترام به فرهنگ ملت‌ها"
            ),
            famousQuote = "فرمان دادم که همه مردم در پرستش خدای خود آزاد باشند و کسی آنان را آزار ندهد.",
            imageResId = R.drawable.img_cyrus_great_epic_1787818480555
        ),
        King(
            id = "cambyses_ii",
            namePersian = "کمبوجیه دوم",
            nameEnglish = "Cambyses II",
            titlePersian = "شاهنشاه ایران و فرعون مصر",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۵۳۰ - ۵۲۲ پیش از میلاد",
            capital = "پاسارگاد و بابل",
            summary = "فرزند کوروش بزرگ و فاتح امپراتوری مصر.",
            biography = "کمبوجیه دوم فرزند ارشد کوروش بزرگ بود. او در سال ۵۲۵ پیش از میلاد در نبرد پلوسیوم امپراتوری مصر را فتح کرد و خود را فرعون مصر نامید و قلمرو هخامنشیان را تا شمال آفریقا گسترش داد.",
            achievements = listOf(
                "فتح کامل سرزمین مصر و الحاق آن به امپراتوری هخامنشی",
                "حفظ امنیت راه‌های تجاری دریایی خلیج فارس و نیل"
            ),
            famousQuote = "قلمرو کوروش باید تا دوردست‌ترین کرانه‌های نیل گسترده شود.",
            imageResId = null
        ),
        King(
            id = "darius_great",
            namePersian = "داریوش بزرگ (داریوش یکم)",
            nameEnglish = "Darius the Great",
            titlePersian = "شاهنشاه بزرگ، معمار امپراتوری هخامنشی",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۵۲۲ - ۴۸۶ پیش از میلاد",
            capital = "تخت جمشید (پارسه) و شوش",
            summary = "معمار تخت جمشید، سازنده جاده شاهی، نخستین سکه طلای داریک و حفر کانال سوئز باستان.",
            biography = "داریوش بزرگ امپراتوری هخامنشی را منظم ساخت. او کشور را به ساتراپی‌های متعدد تقسیم کرد، جاده شاهی ۳۰۰۰ کیلومتری را احداث نمود، کانال نیل به دریای سرخ (سوئز) را کند و ساخت تخت جمشید را آغاز کرد.",
            achievements = listOf(
                "آغاز ساخت مجموعه مجلل تخت جمشید (پارسه)",
                "احداث جاده شاهی و چاپارخانه‌های سریع پست سراسری",
                "حفر کانال سوئز باستان و ضرب سکه طلای داریک"
            ),
            famousQuote = "اهورامزدا این کشور را از دشمن، از خشکسالی و از دروغ بپاید.",
            imageResId = R.drawable.img_darius_great_king_1786185165829
        ),
        King(
            id = "xerxes_i",
            namePersian = "خشایارشا یکم (خشایارشاه)",
            nameEnglish = "Xerxes I",
            titlePersian = "شاهنشاه بزرگ، سازنده کاخ‌های تخت جمشید",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۴۸۶ - ۴۶۵ پیش از میلاد",
            capital = "تخت جمشید و شوش",
            summary = "فرزند داریوش بزرگ و آتوسا، فرمانده لشکریان ایران در نبرد ترموپیل و تکمیل‌کننده دروازه ملل.",
            biography = "خشایارشا یکم یکی از قدرتمندترین شاهنشاهان هخامنشی بود. او شورش‌های بابل و مصر را سرکوب کرد، بزرگ‌ترین لشکرکشی باستان را به یونان انجام داد و کاخ صدستون و دروازه همه ملل را در تخت جمشید بنیان نهاد.",
            achievements = listOf(
                "احداث دروازه همه ملل و کاخ صدستون در تخت جمشید",
                "لشکرکشی بزرگ به یونان و عبور از کانال هلسبونت",
                "سرکوب شورش‌های داخلی بابل و مصر و تثبیت اقتدار مرکزی"
            ),
            famousQuote = "منم خشایارشا، شاه بزرگ، شاه شاهان، شاه کشورهایی که دارای ملل بسیار است.",
            imageResId = null
        ),
        King(
            id = "artaxerxes_i",
            namePersian = "اردشیر یکم (اردشیر درازدست)",
            nameEnglish = "Artaxerxes I",
            titlePersian = "شاهنشاه دادگر هخامنشی",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۴۶۵ - ۴۲۴ پیش از میلاد",
            capital = "تخت جمشید و شوش",
            summary = "فرزند خشایارشا، پادشاهی با آرامش و تکمیل‌کننده تالار آ think کاخ صدستون.",
            biography = "اردشیر یکم به دلیل طولانی بودن دست راستش به درازدست معروف شد. او صلح کالیاس را با آتن امضا نمود و ساخت تالار صدستون تخت جمشید را به پایان رساند.",
            achievements = listOf(
                "تکمیل ساخت کاخ صدستون در تخت جمشید",
                "انعقاد پیمان صلح کالیاس با یونانیان"
            ),
            famousQuote = "صلح و آرامش، ثمره دادگری شهریار است.",
            imageResId = null
        ),
        King(
            id = "darius_ii",
            namePersian = "داریوش دوم",
            nameEnglish = "Darius II",
            titlePersian = "شاهنشاه هخامنشی",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۴۲۳ - ۴۰۴ پیش از میلاد",
            capital = "شوش و بابل",
            summary = "حاکم دوره جنگ‌های پلوپونزی در یونان و دخالت‌های دیپلماتیک ایران.",
            biography = "داریوش دوم با بهره‌گیری از دیپلماسی و منابع مالی ایران، در جنگ میان اسپارت و آتن دخالت نمود و نفوذ ایران را در آسیای کوچک تثبیت کرد.",
            achievements = listOf(
                "اعمال نفوذ سیاسی بر جنگ‌های یونان و تقویت موقعیت ایران در مدیترانه"
            ),
            famousQuote = "تدبیر و هوشمندی برتر از شمشیر جنگ‌آوران است.",
            imageResId = null
        ),
        King(
            id = "artaxerxes_ii",
            namePersian = "اردشیر دوم (اردشیر منمون)",
            nameEnglish = "Artaxerxes II",
            titlePersian = "شاهنشاه با ۴۶ سال بلندترین دوره سلطنت هخامنشی",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۴۰۴ - ۳۵۸ پیش از میلاد",
            capital = "شوش، بابل و هگمتانه",
            summary = "دارای بلندترین دوره سلطنت هخامنشیان و فاتح شورش کوروش کوچک در نبرد کوناکسا.",
            biography = "اردشیر دوم ۴۶ سال بر امپراتوری هخامنشی حکومت کرد. او شورش برادرش کوروش کوچک را سرکوب نمود و صلح آنتالکیداس را بر یونانیان تحمیل نمود.",
            achievements = listOf(
                "انعقاد صلح آنتالکیداس (صلح شاهی) و برتری کامل بر تمام یونان",
                "بنای کاخ‌های باشکوه در شوش و هگمتانه"
            ),
            famousQuote = "صلح شاهی، اراده مطلق شاهنشاه ایران بر خاورمیانه و یونان است.",
            imageResId = null
        ),
        King(
            id = "artaxerxes_iii",
            namePersian = "اردشیر سوم",
            nameEnglish = "Artaxerxes III",
            titlePersian = "شاهنشاه مقتدر هخامنشی",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۳۵۸ - ۳۳۸ پیش از میلاد",
            capital = "تخت جمشید و شوش",
            summary = "پادشاه قاطع که شورش‌های سراسری را سرکوب کرد و مصر را مجدداً فتح نمود.",
            biography = "اردشیر سوم با اقتدار کامل تمامیت ارضی امپراتوری هخامنشی را بازسازی کرد و مصر سرکش را پس از سال‌ها دوباره فتح نمود.",
            achievements = listOf(
                "فتح مجدد کامل سرزمین مصر و سرکوب تمام شورش‌های منطقه‌ای",
                "بازسازی یکپارچگی قدرت امپراتوری هخامنشی"
            ),
            famousQuote = "یکپارچگی ایران‌زمین با اقتدار بازمی‌گردد.",
            imageResId = null
        ),
        King(
            id = "darius_iii",
            namePersian = "داریوش سوم",
            nameEnglish = "Darius III",
            titlePersian = "آخرین شاهنشاه امپراتوری هخامنشی",
            dynastyId = "achaemenid",
            dynastyNamePersian = "شاهنشاهی هخامنشی",
            reignPeriod = "۳۳۶ - ۳۳۰ پیش از میلاد",
            capital = "تخت جمشید و هگمتانه",
            summary = "آخرین پادشاه هخامنشی که در نبردهای ایسوس و گوگمل با اسکندر مقدونی جنگید.",
            biography = "داریوش سوم آخرین شاهنشاه هخامنشی بود. او شجاعانه در برابر تهاجم اسکندر مقدونی ایستاد اما پس از نبرد گوگمل، امپراتوری هخامنشی فروپاشید.",
            achievements = listOf(
                "ایستادگی در نبردهای حماسی ایسوس و گوگمل در برابر مقدونیان"
            ),
            famousQuote = "میهن‌پرستی و شرف ایران هرگز نابود نخواهد شد.",
            imageResId = null
        ),

        // === اشکانیان (PARTHIAN) ===
        King(
            id = "arsaces_i",
            namePersian = "ارشک یکم (اشک یکم)",
            nameEnglish = "Arsaces I",
            titlePersian = "بنیان‌گذار شاهنشاهی اشکانی (پارتیان)",
            dynastyId = "parthian",
            dynastyNamePersian = "امپراتوری اشکانیان",
            reignPeriod = "۲۴۷ - ۲۱۱ پیش از میلاد",
            capital = "نسا (عشق‌آباد) و صددروازه",
            summary = "رهبر قبایل پرنی و بنیان‌گذار سلسله ۴۷۵ ساله اشکانیان در ایران.",
            biography = "ارشک یکم قیام پارتیان را علیه سلوکیان یونانی‌تبار رهبری کرد و استقلال ایران را از بیگانگان بازپس گرفت. به پاس خدماتش، تمام شاهان بعدی اشکانی نام «اشک» را بر خود نهادند.",
            achievements = listOf(
                "راندن سلوکیان بیگانه و بنیان‌گذاری سلسله اشکانی",
                "تاسیس شهر نسا به عنوان نخستین پایتخت اشکانیان"
            ),
            famousQuote = "ایران بار دیگر به دست فرزندان خویش اداره خواهد شد.",
            imageResId = null
        ),
        King(
            id = "mithridates_i",
            namePersian = "مهرداد یکم (مهرداد بزرگ اشکانی)",
            nameEnglish = "Mithridates I of Parthia",
            titlePersian = "بنیان‌گذار واقعی امپراتوری اشکانی",
            dynastyId = "parthian",
            dynastyNamePersian = "امپراتوری اشکانیان",
            reignPeriod = "۱۷۱ - ۱۳۸ پیش از میلاد",
            capital = "صددروازه و بابل",
            summary = "پادشاهی که قلمرو کوچک پارتیان را به یک امپراتوری جهانی تبدیل ساخت.",
            biography = "مهرداد یکم با فتح ماد، بین‌النهرین، بابل و خوزستان، دولت سلوکی را شکست داد و قلمرو اشکانی را از هند تا فرات گسترش داد.",
            achievements = listOf(
                "فتح بین‌النهرین و بابل و شکست کامل سلوکیان",
                "مبدل ساختن اشکانیان به قدرت اول خاورمیانه"
            ),
            famousQuote = "مرزهای ایران بر پایه اقتدار و فرهنگ پارتی استوار است.",
            imageResId = null
        ),
        King(
            id = "mithridates_ii",
            namePersian = "مهرداد دوم (مهرداد بزرگ)",
            nameEnglish = "Mithridates II of Parthia",
            titlePersian = "شاه بزرگ اشکانی، احیاگر عنوان شاهنشاه",
            dynastyId = "parthian",
            dynastyNamePersian = "امپراتوری اشکانیان",
            reignPeriod = "۱۲۴ - ۹۱ پیش از میلاد",
            capital = "صددروازه (دامغان) و تیسفون",
            summary = "مقتدرترین شاه اشکانی که مرزهای ایران را تا چین و فرات گسترش داد و جاده ابریشم را گشود.",
            biography = "مهرداد دوم ایران را از بحران حمله سکاها نجات داد. او نخستین شاه اشکانی بود که عنوان «شاهنشاه» را مجدداً بر سکه‌ها ضرب نمود و روابط دیپلماتیک رسمی با امپراتوری چین و روم برقرار کرد.",
            achievements = listOf(
                "گشایش رسمی مسیر تجاری جاده ابریشم بین شرق و غرب",
                "ضرب عنوان شاهنشاه بر روی سکه‌های نقره‌ای اشکانی",
                "شکست سکاها و تثبیت مرزهای شرقی و غربی ایران"
            ),
            famousQuote = "ایران پل پیوند میان تمدن‌های شرق و غرب است.",
            imageResId = R.drawable.img_darius_great_king_1786185165829
        ),
        King(
            id = "orodes_ii",
            namePersian = "ارد دوم (اشک سیزدهم)",
            nameEnglish = "Orodes II",
            titlePersian = "شاهنشاه پیروز در نبرد تاریخی حران",
            dynastyId = "parthian",
            dynastyNamePersian = "امپراتوری اشکانیان",
            reignPeriod = "۵۷ - ۳۷ پیش از میلاد",
            capital = "تیسفون",
            summary = "شاه اشکانی که با فرماندهی سردار بزرگش سورنا، امپراتوری روم و کراسوس را در نبرد حران درهم شکست.",
            biography = "ارد دوم پادشاه مقتدر اشکانی بود. در زمان او کراسوس ثروتمندترین مرد روم با هفت لژیون سنگین به ایران تاخت، اما سورنا سردار جوان ایرانی با تاکتیک تیراندازی پارتی رومیان را کلاً نابود ساخت.",
            achievements = listOf(
                "پیروزی تاریخی در نبرد حران (کاره) به فرماندهی سورنا",
                "به هلاکت رساندن کراسوس و نابودی ۲۰ هزار سپاهی روم"
            ),
            famousQuote = "غرور روم در برابر تاکتیک سواران ایرانی در هم شکست.",
            imageResId = null
        ),
        King(
            id = "vologases_i",
            namePersian = "بلاش یکم (اشک بیست و دوم)",
            nameEnglish = "Vologases I",
            titlePersian = "احیاگر اوستا و فرهنگ ملی ایران",
            dynastyId = "parthian",
            dynastyNamePersian = "امپراتوری اشکانیان",
            reignPeriod = "۵۱ - ۷۸ میلادی",
            capital = "تیسفون و ولگش‌آباد",
            summary = "پادشاهی که دستور گردآوری اوستا و استفاده رسمی از زبان پهلوی اشکانی را صادر نمود.",
            biography = "بلاش یکم پادشاهی فرهنگ‌دوست بود. او خط و زبان پهلوی را جایگزین خط یونانی بر روی سکه‌ها ساخت و دستور داد متون پراکنده اوستا و اوستای زرتشتی گردآوری شود.",
            achievements = listOf(
                "گردآوری نخستین مجموعه پراکنده اوستا",
                "رسمی ساختن خط و زبان پهلوی بر سکه‌ها و اسناد"
            ),
            famousQuote = "فرهنگ و آیین ایرانی جاودانه است.",
            imageResId = null
        ),
        King(
            id = "artabanus_iv",
            namePersian = "اردوان چهارم (اردوان پنجم)",
            nameEnglish = "Artabanus IV",
            titlePersian = "آخرین شاهنشاه امپراتوری اشکانی",
            dynastyId = "parthian",
            dynastyNamePersian = "امپراتوری اشکانیان",
            reignPeriod = "۲۰۸ - ۲۲۴ میلادی",
            capital = "تیسفون",
            summary = "آخرین پادشاه اشکانی که در نبرد هرمزگان با اردشیر بابکان جنگید.",
            biography = "اردوان چهارم آخرین پادشاه سلسله اشکانی بود. او رومیان را در نبرد نصیبین شکست داد، اما در نبرد هرمزگان در برابر اردشیر بابکان شکست خورد و حکومت اشکانیان پایان یافت.",
            achievements = listOf(
                "پیروزی بر امپراتوری روم در نبرد نصیبین و دریافت غرامت سنگین"
            ),
            famousQuote = "دوران اشکانیان دفتری پر از حماسه در تاریخ ایران است.",
            imageResId = null
        ),

        // === ساسانیان (SASANIAN) ===
        King(
            id = "ardashir_i",
            namePersian = "اردشیر بابکان (اردشیر یکم)",
            nameEnglish = "Ardashir I",
            titlePersian = "شاهنشاه بنیان‌گذار امپراتوری ساسانی",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۲۲۴ - ۲۴۰ میلادی",
            capital = "اردشیرخوره (فیروزآباد) و تیسفون",
            summary = "بنیان‌گذار شاهنشاهی ساسانی و احیاگر درفش کاویانی و یکپارچگی ایران.",
            biography = "اردشیر بابکان نوه ساسان بود. او با شکست اردوان چهارم در نبرد هرمزگان، شاهنشاهی ۴۰۰ ساله ساسانی را بنیان نهاد و آیین زرتشت را دین رسمی ساخت.",
            achievements = listOf(
                "بنیان‌گذاری امپراتوری متمرکز ساسانی",
                "ساخت شهر فیروزآباد و کاخ اردشیر بابکان",
                "رسمی ساختن درفش کاویانی به عنوان نماد امپراتوری"
            ),
            famousQuote = "دین و پادشاهی دو برادرند که هیچ‌یک بدون دیگری استوار نماند.",
            imageResId = null
        ),
        King(
            id = "shapur_i",
            namePersian = "شاپور یکم ساسانی",
            nameEnglish = "Shapur I",
            titlePersian = "شاهنشاه ایران و انیران",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۲۴۰ - ۲۷۰ میلادی",
            capital = "تیسفون و بیشاپور",
            summary = "فاتح بزرگ که سه امپراتور روم (گوردیان، فیلیپ عرب و والریان) را شکست داد.",
            biography = "شاپور یکم فرزند اردشیر بابکان بود. صحنه زانو زدن والریان امپراتور روم در برابر شاپور در سنگ‌نگاره‌های نقش رستم و بیشاپور ابدی شده است. او شهر بیشاپور و پل‌بند شوشتر را ساخت.",
            achievements = listOf(
                "اسارت والریان امپراتور روم و شکست امپراتوری روم",
                "احداث پل‌بند شوشتر و شهر تاریخی بیشاپور",
                "حمایت از علوم، ترجمه متون یونانی و هندی به پهلوی"
            ),
            famousQuote = "قدرت ما در دادگری و استواری در برابر متجاوزان نهفته است.",
            imageResId = R.drawable.img_shapur_i_king_1786185178189
        ),
        King(
            id = "shapur_ii",
            namePersian = "شاپور دوم (شاپور ذوالاکتاف)",
            nameEnglish = "Shapur II",
            titlePersian = "شاهنشاه با ۷۰ سال سلطنت (از ولادت تا مرگ)",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۳۰۹ - ۳۷۹ میلادی",
            capital = "تیسفون",
            summary = "پادشاهی که تاج سلطنت پیش از ولادت بر شکم مادرش نهاده شد و ۷۰ سال حکومت کرد.",
            biography = "شاپور دوم قدرتمندترین پادشاه ساسانی سده چهارم بود. او اعراب متجاوز را سرکوب نمود، امپراتور روم یولیانوس را شکست داد و شهر نیشابور و ایوان‌های بزرگ ساسانی را بنا نهاد.",
            achievements = listOf(
                "شکست و کشته شدن یولیانوس امپراتور روم در نبرد با ایران",
                "تثبیت ۷۰ ساله تمامیت ارضی ساسانیان",
                "بنای شهر تاریخی نیشابور"
            ),
            famousQuote = "تاج شاهنشاهی ایران امانت اهورامزداست.",
            imageResId = null
        ),
        King(
            id = "bahram_v",
            namePersian = "بهرام پنجم (بهرام گور)",
            nameEnglish = "Bahram V (Bahram Gur)",
            titlePersian = "شاه محبوب و افسانه‌ای، قهرمان داستان‌های پهلوانی",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۴۲۰ - ۴۳۸ میلادی",
            capital = "تیسفون",
            summary = "پادشاه دلاور، تیرانداز ماهر و قهرمان منظومه هفت‌پیکر نظامی گنجوی.",
            biography = "بهرام گور فرزند یزدگرد یکم بود. داستان‌های دلاوری، شکار گورخر، عدالت‌خواهی و بخشش او در ادبیات پارسی نظیر شاهنامه فردوسی و هفت‌پیکر نظامی شهرت جهانی دارد.",
            achievements = listOf(
                "شکست هپتالیان مهاجم در مرزهای شرقی خراسان",
                "رونق موسیقی، هنر و شادمانی در سراسر ایران"
            ),
            famousQuote = "زندگی بی شادمانی و دادگری ارزشی ندارد.",
            imageResId = null
        ),
        King(
            id = "khosrow_anushirvan",
            namePersian = "خسرو یکم (انوشیروان دادگر)",
            nameEnglish = "Khosrow I Anushiruwan",
            titlePersian = "انوشیروان (دارای روان جاویدان)",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۵۳۱ - ۵۷۹ میلادی",
            capital = "تیسفون (طاق کسری)",
            summary = "نماد عدالت در تاریخ ایران، بنیان‌گذار دانشگاه گندی‌شاپور و طاق کسری.",
            biography = "خسرو انوشیروان به عنوان دادگرترین شاه ساسانی مشهور است. اصلاحات مالیاتی عادلانه، ساخت طاق کسری (ایوان مدائن)، تأسیس دانشگاه بین‌المللی گندی‌شاپور و ورود بازی شطرنج به ایران در زمان او رخ داد.",
            achievements = listOf(
                "تأسیس دانشگاه گندی‌شاپور (مرکز طب و فلسفه جهان باستان)",
                "ساخت طاق کسری (ایوان مدائن) باشکوه‌ترین طاق آجری جهان",
                "انجام اصلاحات جامع مالیاتی و نظامی بر پایه مساوات"
            ),
            famousQuote = "هیچ شهریار یا کشوری بدون دادگری و رضایت مردم پایدار نخواهد ماند.",
            imageResId = R.drawable.img_khosrow_anushirvan_king_1786185188761
        ),
        King(
            id = "khosrow_parviz",
            namePersian = "خسرو دوم (خسrow پرویز)",
            nameEnglish = "Khosrow II (Khosrow Parviz)",
            titlePersian = "شاهنشاه شکوه و جلال ساسانی",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۵۹۰ - ۶۲۸ میلادی",
            capital = "تیسفون و قصر شیرین",
            summary = "دارای بزرگ‌ترین قلمرو ساسانی، فتح اورشلیم، مصر و اسکندریه و داستان خسرو و شیرین.",
            biography = "خسرو پرویز آخرین پادشاه مقتدر ساسانی بود. در زمان او سپاهیان ایران مصر، شام و اورشلیم را فتح کردند و صلیب واقعی را به تیسفون آوردند. باربد و سرکش موسیقی‌دانان بزرگ در دربار او بودند.",
            achievements = listOf(
                "گسترش قلمرو ساسانی تا نیل، مصر و حومه قسطنطنیه",
                "شکوفایی بی‌نظیر موسیقی ایرانی توسط باربد و نکیسا",
                "احداث قصر شیرین و کاخ‌های مجلل ساسانی"
            ),
            famousQuote = "شکوه ایران در آوای چنگ باربد و پهنای قلمرو ساسانی می‌درخشد.",
            imageResId = null
        ),
        King(
            id = "queen_boran",
            namePersian = "پوراندخت (بوران)",
            nameEnglish = "Queen Borandukht",
            titlePersian = "نخستین شاهنشاه زن در تاریخ ایران ساسانی",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۶۳۰ - ۶۳۱ میلادی",
            capital = "تیسفون",
            summary = "دختر خسرو پرویز و نخستین پادشاه زن ساسانی که صلح و دادگری را برقرار کرد.",
            biography = "پوراندخت دختر خسرو پرویز بود که در دورانی پرآشوب فرمانروایی ایران را بر عهده گرفت. او صلح با امپراتوری روم را برقرار کرد، مالیات‌ها را بخشید و ضرب سکه به نام خویش را آغاز نمود.",
            achievements = listOf(
                "ایجاد صلح پایدار با امپراتوری بیزانس و بازگرداندن آرامی",
                "لغو مالیات‌های سنگین و بازسازی عدالت اجتماعی"
            ),
            famousQuote = "پادشاهی از آنِ کسی است که دادگری ورزد، چه مرد باشد و چه زن.",
            imageResId = null
        ),
        King(
            id = "yazdegerd_iii",
            namePersian = "یزدگرد سوم",
            nameEnglish = "Yazdegerd III",
            titlePersian = "آخرین شاهنشاه شاهنشاهی ساسانی",
            dynastyId = "sasanian",
            dynastyNamePersian = "شاهنشاهی ساسانیان",
            reignPeriod = "۶۳۲ - ۶۵۱ میلادی",
            capital = "تیسفون و مرو",
            summary = "آخرین پادشاه ساسانی که در نبردهای قادسیه و نهاوند با اعراب مسلمان جنگید.",
            biography = "یزدگرد سوم نوه خسرو پرویز و آخرین شاه ساسانی بود. با حمله اعراب مسلمان، نبردهای قادسیه و نهاوند رخ داد و با قتل وی در مرو، سلسله ۴۰۰ ساله ساسانی پایان یافت.",
            achievements = listOf(
                "ایستادگی حماسی در برابر تهاجم و حفظ روحیه میهنی"
            ),
            famousQuote = "نام ایران و فرهنگ پهلوی هرگز از یادها نخواهد رفت.",
            imageResId = null
        ),

        // === صفاریان (SAFFARID) ===
        King(
            id = "yaqub_layth",
            namePersian = "یعقوب لیث صفاری",
            nameEnglish = "Ya'qub ibn al-Layth",
            titlePersian = "عیار سیستان، احیاگر زبان فارسی",
            dynastyId = "saffarid",
            dynastyNamePersian = "دودمان صفاریان",
            reignPeriod = "۸۶۱ - ۸۷۹ میلادی",
            capital = "زرنج (سیستان)",
            summary = "فرمانروای مردمی سیستان که زبان فارسی را زبان رسمی دیوان و دادگاه‌های ایران ساخت.",
            biography = "یعقوب لیث صفاری رویگرزاده‌ای از سیستان بود که با شجاعت و عیاری به قدرت رسید. وقتی شاعری به عربی در مدح او شعر گفت، یعقوب بانگ برآورد: «چیزی که من اندر نیابم چرا باید گفت؟» و دستور داد تمام مکاتبات دیوانی به زبان فارسی نگاشته شود.",
            achievements = listOf(
                "احیای رسمی زبان پارسی به عنوان زبان رسمی ایران",
                "شکست عباسیان و استقلال مناطق وسیعی از ایران",
                "مردمداری و پاک‌دستی افسانه‌ای در تاریخ سیستان"
            ),
            famousQuote = "چیزی که من اندر نیابم چرا باید گفت؟ شعر به پارسی گویید تا من بفهمم.",
            imageResId = R.drawable.img_yaqub_saffar_hero_1786115911526
        ),

        // === سامانیان (SAMANID) ===
        King(
            id = "ismail_samani",
            namePersian = "امیر اسماعیل سامانی",
            nameEnglish = "Ismail Samani",
            titlePersian = "امیر عادل سامانی",
            dynastyId = "samanid",
            dynastyNamePersian = "امپراتوری سامانیان",
            reignPeriod = "۸۹۲ - ۹۰۷ میلادی",
            capital = "بخارا",
            summary = "احیاگر فرهنگ و ادبیات پارسی، فرزانه و پشتیبان بزرگ زبان فارسی.",
            biography = "امیر اسماعیل سامانی فرامانروایی باایمان و شجاع بود که دژهای بخارا را نساخت و گفت: «تا من زنده‌ام، دژ بخارا منم!». آرامگاه او در بخارا از زیباترین شاهکارهای آجرکاری اسلامی-ایرانی است.",
            achievements = listOf(
                "بنیان‌گذاری عصر طلایی ادبیات فارسی و حمایت از رودکی",
                "تثبیت امنیت کامل در ماوراءالنهر و خراسان بزرگ",
                "سادگی در زیست و عدالت اجتماعی کم‌نظیر"
            ),
            famousQuote = "تا هنگامی که من زنده‌ام، باروی شهر بخارا من هستم.",
            imageResId = R.drawable.img_all_dynasties_banner_1786114636990
        ),
        King(
            id = "nasr_ii_samani",
            namePersian = "امیر نصر دوم سامانی",
            nameEnglish = "Nasr II Samani",
            titlePersian = "امیر السعید، پادشاه عصر رودکی",
            dynastyId = "samanid",
            dynastyNamePersian = "امپراتوری سامانیان",
            reignPeriod = "۹۱۴ - ۹۴۳ میلادی",
            capital = "بخارا",
            summary = "پادشاهی که در زمان او بخارا مرکز فرهنگ، هنر و سروده‌های رودکی پدر شعر فارسی شد.",
            biography = "امیر نصر دوم سامانی خامی از هنر و ادبیات بود. قصیده معروف «بوی جوی مولیان آید همی» رودکی در مدح او سروده شد که امیر را شیفته بازگشت به بخارا ساخت.",
            achievements = listOf(
                "اوچ شکوفایی شعر فارسی و وزارت وزیران دانشمند چون جیهانی و بلعمی",
                "مبدل ساختن بخارا به کانون علمی و ادبی جهان اسلام"
            ),
            famousQuote = "بوی جوی مولیان آید همی / یاد یار مهربان آید همی",
            imageResId = null
        ),

        // === آل بویه (BUYID) ===
        King(
            id = "imad_al_dawla",
            namePersian = "عمادالدوله علی دیلمی",
            nameEnglish = "Imad al-Dawla",
            titlePersian = "بنیان‌گذار حکومت آل بویه در فارس",
            dynastyId = "buyid",
            dynastyNamePersian = "آل بویه (دیلمیان)",
            reignPeriod = "۹۳۴ - ۹۴۹ میلادی",
            capital = "شیراز",
            summary = "بزرگ‌ترین برادر از برادران دیلمی آل بویه و بنیان‌گذار قدرت آل بویه.",
            biography = "عمادالدوله علی فرزند بویه بود که با شجاعت شیراز را فتح کرد و سلسله آل بویه را بنیان نهاد.",
            achievements = listOf(
                "تاسیس حکومت آل بویه در فارس و اصفهان"
            ),
            famousQuote = "دیلمیان دژ استوار استقلال ایرانند.",
            imageResId = null
        ),
        King(
            id = "adud_al_dawla",
            namePersian = "عضدالدوله دیلمی (آل بویه)",
            nameEnglish = "Adud al-Dawla",
            titlePersian = "شاهنشاه آل بویه",
            dynastyId = "buyid",
            dynastyNamePersian = "آل بویه (دیلمیان)",
            reignPeriod = "۹۴۹ - ۹۸۳ میلادی",
            capital = "شیراز و بغداد",
            summary = "مقتدرترین شهریار دیلمی آل بویه، احیاگر لقب شاهنشاه و سازنده بیمارستان عضدی.",
            biography = "عضدالدوله دیلمی قدرتمندترین فرمانروای سلسله آل بویه بود. او شیراز را به اوج آبادی رساند، بند امیر را بر روی رود کر ساخت و بیمارستان عظیم عضدی را در بغداد تأسیس نمود.",
            achievements = listOf(
                "احیای رسمی عنوان شاهنشاه پس از سه سده در ایران",
                "احداث سد باشکوه بند امیر در فارس",
                "تأسیس بیمارستان و رصدخانه بین‌المللی عضدی"
            ),
            famousQuote = "علم و دادگری، استوارترین پایه‌های فرمانروایی بر دل‌هاست.",
            imageResId = R.drawable.img_buyid_hero_1786185142045
        ),

        // === طاهریان (TAHIRID) ===
        King(
            id = "tahir_ibn_husayn",
            namePersian = "طاهر ذوالیمینین",
            nameEnglish = "Tahir ibn Husayn",
            titlePersian = "بنیان‌گذار دولت طاهریان و فاتح بغداد",
            dynastyId = "tahirid",
            dynastyNamePersian = "دولت طاهریان",
            reignPeriod = "۸۲۱ - ۸۲۲ میلادی",
            capital = "مرو و نیشابور",
            summary = "سردار نامدار ایرانی و بنیان‌گذار نخستین حکومت مستقل ایرانی پس از اسلام.",
            biography = "طاهر بن حسین ملقب به ذوالیمینین سردار خراسان بود که در سال ۸۲۱ میلادی نخستین حکومت مستقل ایرانی را در خراسان بنیان نهاد و نام خلیفه را از خطبه حذف کرد.",
            achievements = listOf(
                "بنیان‌گذاری نخستین حکومت مستقل ایرانی پس از اسلام در خراسان",
                "فتح بغداد و تثبیت اقتدار ایرانیان در دستگاه خلافت"
            ),
            famousQuote = "عدالت و دادگری در نیشابور و خراسان، والاترین ارزش فرمانروایی است.",
            imageResId = null
        ),
        King(
            id = "abdallah_ibn_tahir",
            namePersian = "عبدالله بن طاهر",
            nameEnglish = "Abdallah ibn Tahir",
            titlePersian = "مقتدرترین امیر طاهری، دادگر خراسان",
            dynastyId = "tahirid",
            dynastyNamePersian = "دولت طاهریان",
            reignPeriod = "۸۲۸ - ۸۴۵ میلادی",
            capital = "نیشابور",
            summary = "مقتدرترین و عادل‌ترین فرمانروای طاهری که نیشابور را به مرکز مهد دانش و کشاورزی بدل کرد.",
            biography = "عبدالله بن طاهر نیشابور را پایتخت خویش ساخت و به آبادانی، آموزش همگانی کودکان، قنات‌سازی و تدوین قوانین دقیق کشاورزی همت گماشت.",
            achievements = listOf(
                "تألیف کتاب جامع القنات برای مدیریت آب و کشاورزی ایران",
                "ترویج آموزش عمومی رایگان برای کودکان نیشابور و خراسان",
                "رونق بی‌نظیر اقتصادی و علمی نیشابور"
            ),
            famousQuote = "علم برای همه فرزندان این سرزمین است؛ از دهقان تا امیر.",
            imageResId = null
        ),
        King(
            id = "muhammad_ibn_tahir",
            namePersian = "محمد بن طاهر",
            nameEnglish = "Muhammad ibn Tahir",
            titlePersian = "آخرین امیر طاهری خراسان",
            dynastyId = "tahirid",
            dynastyNamePersian = "دولت طاهریان",
            reignPeriod = "۸۶۲ - ۸۷۳ میلادی",
            capital = "نیشابور",
            summary = "آخرین فرمانروای طاهریان که با فتح نیشابور توسط یعقوب لیث صفاری حکومتش پایان یافت.",
            biography = "محمد بن طاهر آخرین امیر سلسله طاهریان بود. با قیام عیاران سیستان به رهبری یعقوب لیث صفاری، نیشابور فتح شد و حکومت طاهریان در سال ۸۷۳ میلادی خاتمه یافت.",
            achievements = listOf(
                "حفظ سنت‌های دیوان‌سالاری طاهری تا پایان حکومت"
            ),
            famousQuote = "سرنوشت حکومت‌ها به اراده مردم و پهلوانان میهن گره خورده است.",
            imageResId = null
        ),

        // === غزنویان (GHAZNAVID) ===
        King(
            id = "sabuktigin",
            namePersian = "امیر سبکتگین غزنوی",
            nameEnglish = "Sabuktigin",
            titlePersian = "بنیان‌گذار دودمان غزنوی",
            dynastyId = "ghaznavid",
            dynastyNamePersian = "امپراتوری غزنویان",
            reignPeriod = "۹۷۷ - ۹۹۷ میلادی",
            capital = "غزنین",
            summary = "بنیان‌گذار قدرت غزنویان و پدر سلطان محمود غزنوی.",
            biography = "سبکتگین با درایت و شجاعت دژ غزنین را مرکز قلمرو خویش قرار داد و زمینه را برای شکل‌گیری امپراتوری بزرگ غزنوی فراهم ساخت.",
            achievements = listOf(
                "تأسیس سلسله غزنویان در غزنین",
                "گسترش مرزهای شرقی خراسان"
            ),
            famousQuote = "دادگری و شجاعت، دو بال اقتدار شاهی است.",
            imageResId = null
        ),
        King(
            id = "mahmud_ghaznavi",
            namePersian = "سلطان محمود غزنوی",
            nameEnglish = "Mahmud of Ghazni",
            titlePersian = "یقین‌الدین، فاتح هندوستان",
            dynastyId = "ghaznavid",
            dynastyNamePersian = "امپراتوری غزنویان",
            reignPeriod = "۹۹۸ - ۱۰۳۰ میلادی",
            capital = "غزنین و لاهور",
            summary = "فاتح هندوستان و پادشاهی که صدها شاعر و دانشمند چون فردوسی و ابوریحان بیرونی در عصر او می‌زیستند.",
            biography = "سلطان محمود غزنوی ۱۷ بار به هندوستان لشکر کشید و بتکده سومنات را فتح نمود. شاهنامه فردوسی و کتاب‌الحند ابوریحان بیرونی در روزگار او نگاشته شد.",
            achievements = listOf(
                "گسترش قلمرو ایران تا هندوستان و پنجاب",
                "حمایت از دانشمندان بزرگی چون ابوریحان بیرونی و فردوسی"
            ),
            famousQuote = "قدرت واقعی در سپاهیان پیلتن و دانش فرزانگان نهفته است.",
            imageResId = null
        ),
        King(
            id = "masud_ghaznavi",
            namePersian = "سلطان مسعود اول غزنوی",
            nameEnglish = "Mas'ud I of Ghazni",
            titlePersian = "سلطان شجاع غزنوی، پهلوان نبرد نیشابور",
            dynastyId = "ghaznavid",
            dynastyNamePersian = "امپراتوری غزنویان",
            reignPeriod = "۱۰۳۰ - ۱۰۴۰ میلادی",
            capital = "غزنین و بلخ",
            summary = "فرزند شجاع سلطان محمود که شرح نبردها و پادشاهی او در تاریخ بیهقی ثبت شده است.",
            biography = "سلطان مسعود غزنوی پهلوانی بی‌نظیر بود اما با شکست در نبرد تاریخی دندانقان در برابر سلجوقیان، خراسان را از دست داد. تاریخ معروف بیهقی (تاریخ مسعودی) یادگار روزگار اوست.",
            achievements = listOf(
                "ثبت دقیق وقایع دربار و تاریخ ایران در شاهکار «تاریخ بیهقی»",
                "پایداری و شجاعت شخصی در نبردهای سنگین خراسان و هند"
            ),
            famousQuote = "مرد باید که در بلا صبور باشد و در روز سختی شکیبا.",
            imageResId = null
        ),
        King(
            id = "ibrahim_ghaznavi",
            namePersian = "سلطان ابراهیم غزنوی",
            nameEnglish = "Ibrahim of Ghazni",
            titlePersian = "سلطان زاهد و عادل غزنوی",
            dynastyId = "ghaznavid",
            dynastyNamePersian = "امپراتوری غزنویان",
            reignPeriod = "۱۰۵۹ - ۱۰۹۹ میلادی",
            capital = "غزنین و لاهور",
            summary = "فرمانروایی که ۴۰ سال صلح و شکوفایی را برای امپراتوری غزنوی به ارمغان آورد.",
            biography = "سلطان ابراهیم با امضای پیمان صلح با سلجوقیان، ۴۰ سال صلح، ثبات اقتصادی و رونق ادبیات پارسی را در هند و افغانستان کنونی ایجاد نمود.",
            achievements = listOf(
                "ایجاد صلح پایدار ۴۰ ساله با امپراتوری سلجوقی",
                "رونق بی‌نظیر ادبیات فارسی و کتابت قرآن‌های نفیس به خط خویش"
            ),
            famousQuote = "صلح و رفاه مردم، بزرگ‌ترین فتح یک شهریار است.",
            imageResId = null
        ),

        // === سلجوقیان (SELJUK) ===
        King(
            id = "tughril_beg",
            namePersian = "طغرل بیک سلجوقی",
            nameEnglish = "Tughril Beg",
            titlePersian = "بنیان‌گذار امپراتوری سلجوقی",
            dynastyId = "seljuk",
            dynastyNamePersian = "امپراتوری سلجوقیان",
            reignPeriod = "۱۰۳۷ - ۱۰۶۳ میلادی",
            capital = "نیشابور و ری",
            summary = "بنیان‌گذار امپراتوری پهناور سلجوقی و فتح‌کننده بغداد.",
            biography = "طغرل بیک نوه سلجوق با شکست غزنویان در نبرد دندانقان، امپراتوری عظیم سلجوقی را بنیان گذاشت و برج طغرل در ری یادگار اوست.",
            achievements = listOf(
                "بنیان‌گذاری امپراتوری سلجوقی و ساخت برج طغرل در ری",
                "پایان دادن به سلطه غزنویان در خراسان"
            ),
            famousQuote = "با توکل و شمشیر، امپراتوری بزرگی ساختیم.",
            imageResId = null
        ),
        King(
            id = "alp_arslan",
            namePersian = "سلطان آلپ ارسلان سلجوقی",
            nameEnglish = "Alp Arslan",
            titlePersian = "شیر شجاع، دومین سلطان امپراتوری سلجوقی",
            dynastyId = "seljuk",
            dynastyNamePersian = "امپراتوری سلجوقیان",
            reignPeriod = "۱۰۶۳ - ۱۰۷۲ میلادی",
            capital = "اصفهان و مرو",
            summary = "فرمانده شجاع سلجوقی، پیروز نبرد تاریخی ملازگرد و گسترش‌دهنده فرهنگ ایران.",
            biography = "آلپ ارسلان دومین سلطان امپراتوری سلجوقی بود که با همراهی وزیر بزرگ ایران خواجه نظام‌الملک طوسی امپراتوری پهناور سلجوقی را اداره می‌کرد. پیروزی معجزه‌آسای او در نبرد ملازگرد در سال ۱۰۷۱ میلادی موجب اسارت امپراتور روم شد.",
            achievements = listOf(
                "پیروزی در نبرد ملازگرد و شکست امپراتوری بیزانس (روم شرقی)",
                "حمایت کامل از تأسیس مدارس نظامیه به همت خواجه نظام‌الملک",
                "توسعه نفوذ زبان و هنر معماری ایرانی در آناتولی و بین‌النهرین"
            ),
            famousQuote = "اگر روم با صد هزار سپاه آمد، ما با ایمان و شمشیر حق ایستاده‌ایم.",
            imageResId = R.drawable.img_alp_arslan_hero_1786115923758
        ),
        King(
            id = "malik_shah_i",
            namePersian = "سلطان ملکشاه سلجوقی",
            nameEnglish = "Malik-Shah I",
            titlePersian = "جلال‌الدوله، مقتدرترین سلطان سلجوقی",
            dynastyId = "seljuk",
            dynastyNamePersian = "امپراتوری سلجوقیان",
            reignPeriod = "۱۰۷۲ - ۱۰۹۲ میلادی",
            capital = "اصفهان",
            summary = "فرزند آلپ ارسلان که در زمان او و با تدبیر خواجه نظام‌الملک طوسی و خیام، ایران به اوج قدرت رسید.",
            biography = "سلطان ملکشاه با وزارت خواجه نظام‌الملک طوسی امپراتوری سلجوقی را از چین تا مدیترانه گسترش داد. اصلاح تقویم جلالی توسط حکیم عمر خیام در زمان او رخ داد.",
            achievements = listOf(
                "تنظیم دقیق‌ترین تقویم خورشیدی جهان (تقویم جلالی) توسط خیام",
                "تاسیس دانشگاه‌های نظامیه در اصفهان، بغداد و نیشابور",
                "رساندن قلمرو ایران به بزرگ‌ترین وسعت پس از اسلام"
            ),
            famousQuote = "تدبیر خواجه نظام‌الملک و دانش خیام، روشنی‌بخش ایران است.",
            imageResId = null
        ),

        // === خوارزمشاهیان (KHWARAZMIAN) ===
        King(
            id = "atsiz_khwarazm",
            namePersian = "اتسز خوارزمشاه",
            nameEnglish = "Atsiz Khwarazmshah",
            titlePersian = "بنیان‌گذار اقتدار مستقل خوارزمشاهیان",
            dynastyId = "khwarazmian",
            dynastyNamePersian = "خوارزمشاهیان",
            reignPeriod = "۱۱۲۷ - ۱۱۵۶ میلادی",
            capital = "گرگانج",
            summary = "فرمانروای هوشمند خوارزم که خوارزم را از تسلط سلجوقیان خارج ساخت.",
            biography = "اتسز خوارزمشاه با تدبیر و شجاعت در برابر سلطان سنجر سلجوقی ایستادگی کرد و پایه استقلال قلمرو پهناور خوارزمشاهیان را بنا نهاد.",
            achievements = listOf(
                "پایه‌گذاری استقلال سیاسی خوارزم از سلجوقیان",
                "توسعه شهر گرگانج به عنوان کانون تجاری و فرهنگی"
            ),
            famousQuote = "خوارزم، خاک آزادگان و مرکز تجارت شرق است.",
            imageResId = null
        ),
        King(
            id = "tekish_khwarazm",
            namePersian = "علاءالدین تکش خوارزمشاه",
            nameEnglish = "Ala al-Din Tekish",
            titlePersian = "فاتح ری و اصفهان، گسترش‌دهنده امپراتوری",
            dynastyId = "khwarazmian",
            dynastyNamePersian = "خوارزمشاهیان",
            reignPeriod = "۱۱۹۲ - ۱۲۰۰ میلادی",
            capital = "گرگانج و نیشابور",
            summary = "پادشاه مقتدر خوارزمشاهی که با شکست آخرین سلطان سلجوقی، تمام ایران را متحد ساخت.",
            biography = "علاءالدین تکش با شکست طغرل سوم سلجوقی در سال ۱۱۹۴ میلادی به حکومت سلجوقیان در ایران پایان داد و امپراتوری خوارزمشاهیان را بر سراسر ایران حاکم کرد.",
            achievements = listOf(
                "یکپارچه ساختن سراسر ایران تحت پرچم خوارزمشاهیان",
                "پایان دادن به سلسله سلجوقیان عراق و ایران"
            ),
            famousQuote = "یکپارچگی ایران، رمز قدرت ما در برابر هر تهدیدی است.",
            imageResId = null
        ),
        King(
            id = "muhammad_ii_khwarazm",
            namePersian = "سلطان علاءالدین محمد خوارزمشاه",
            nameEnglish = "Muhammad II of Khwarazm",
            titlePersian = "سنجر ثانی، پادشاه قدرتمند خوارزم",
            dynastyId = "khwarazmian",
            dynastyNamePersian = "خوارزمشاهیان",
            reignPeriod = "۱۲۰۰ - ۱۲۲۰ میلادی",
            capital = "سمرقند و گرگانج",
            summary = "پادشاه پهناورترین قلمرو خوارزمشاهی که عصر او همزمان با یورش چنگیزخان مغول بود.",
            biography = "سلطان محمد خوارزمشاه قلمرو خود را از ماوراءالنهر تا عمان گسترش داد. با رخ دادن واقعه اترار و کشتار بازرگانان مغول، چنگیزخان به ایران هجوم آورد.",
            achievements = listOf(
                "فتح ماوراءالنهر، سمرقند و غوریان و گسترش بی‌نظیر قلمرو",
                "ایجاد بزرگ‌ترین قلمرو اسلامی قرن هفتم هجری"
            ),
            famousQuote = "عظمت ایران در وسعت قلمرو و سپاهیان بیشمار آن است.",
            imageResId = null
        ),
        King(
            id = "jalal_din_khwarazm",
            namePersian = "سلطان جلال‌الدین خوارزمشاه",
            nameEnglish = "Jalal al-Din Mangburni",
            titlePersian = "آخرین پادشاه خوارزمشاهی، شیرآهن‌کوه دفاع از وطن",
            dynastyId = "khwarazmian",
            dynastyNamePersian = "خوارزمشاهیان",
            reignPeriod = "۱۲۲۰ - ۱۲۳۱ میلادی",
            capital = "تبریز و گرگانج",
            summary = "قهرمان ملی که در برابر تهاجم چنگیزخان مغول ایستادگی حماسی نمود.",
            biography = "سلطان جلال‌الدین فرزند علاءالدین محمد خوارزمشاه بود. او تنها فرمانروایی بود که در نبرد پروان چنگیزخان را شکست داد و هنگام محاصره در کنار رود سند، اسب خویش را به آب زد و نجات یافت، چنانکه چنگیزخان گفت: «پسر باید چون جلال‌الدین باشد».",
            achievements = listOf(
                "شکست دادن سپاهیان مغول در نبرد تاریخی پروان",
                "ایستادگی حماسی در برابر یورش مغولان و حفظ روحیه میهنی",
                "احیای پایداری ملی ایران در سخت‌ترین مقطع تاریخی"
            ),
            famousQuote = "تا هنگامی که من زنده‌ام، هیچ مغولی بر خاک ایران آسوده نخواهد خفت.",
            imageResId = R.drawable.img_jalal_din_hero_1786115936225
        ),

        // === ایلخانان (ILKHANATE) ===
        King(
            id = "hulagu_khan",
            namePersian = "هولاکوخان ایلخانی",
            nameEnglish = "Hulagu Khan",
            titlePersian = "بنیان‌گذار سلسله ایلخانان در ایران",
            dynastyId = "ilkhanate",
            dynastyNamePersian = "ایلخانان مغول",
            reignPeriod = "۱۲۵۶ - ۱۲۶۵ میلادی",
            capital = "مراغه",
            summary = "بنیان‌گذار حکومت ایلخانان و سازنده رصدخانه مراغه به وزارت خواجه نصیرالدین طوسی.",
            biography = "هولاکوخان نوه چنگیزخان بود. او به پیشنهاد خواجه نصیرالدین طوسی رصدخانه عظیم مراغه را ساخت و کتابخانه‌ای با ۴۰۰ هزار جلد کتاب دایر نمود.",
            achievements = listOf(
                "احداث رصدخانه مراغه به سرپرستی خواجه نصیرالدین طوسی",
                "پایان دادن به خلافت عباسیان در بغداد"
            ),
            famousQuote = "دانش فرزانگان ایران چراغ راه حکمرانی ماست.",
            imageResId = null
        ),
        King(
            id = "ghazan_khan",
            namePersian = "غازان خان (محمود غازان)",
            nameEnglish = "Ghazan Khan",
            titlePersian = "پادشاه مسلمان و اصلاح‌گر ایلخانی",
            dynastyId = "ilkhanate",
            dynastyNamePersian = "ایلخانان مغول",
            reignPeriod = "۱۲۹۵ - ۱۳۰۴ میلادی",
            capital = "تبریز",
            summary = "ایلخانی که اسلام آورد، اصلاحات وسیع مالیاتی انجام داد و فرهنگ ایرانی را پذیرفت.",
            biography = "غازان خان مقتدرترین فرمانروای ایلخانی بود که به اسلام گروید و نام خود را به محمود تغییر داد. اصلاحات اقتصادی، ضرب سکه عادلانه و وزارت خواجه رشیدالدین فضل‌الله همدانی از ویژگی‌های دوران اوست.",
            achievements = listOf(
                "اصلاح نظام مالیاتی و ایجاد ثبات اقتصادی در سراسر ایران",
                "پذیرش رسمی فرهنگ و زبان فارسی توسط ایلخانان"
            ),
            famousQuote = "عدالت بر رعایا، اولین شرط پادشاهی است.",
            imageResId = null
        ),
        King(
            id = "oljeitu",
            namePersian = "اولجایتو (سلطان محمد خدابنده)",
            nameEnglish = "Öljaitü",
            titlePersian = "سازنده گنبد سلطانیه زنجان",
            dynastyId = "ilkhanate",
            dynastyNamePersian = "ایلخانان مغول",
            reignPeriod = "۱۳۰۴ - ۱۳۱۶ میلادی",
            capital = "سلطانیه (زنجان)",
            summary = "برادر غازان خان و سازنده شاهکار معماری گنبد سلطانیه.",
            biography = "سلطان محمد خدابنده پایتخت را به سلطانیه منتقل کرد و گنبد بزرگ سلطانیه (بزرگ‌ترین گنبد آجری جهان) را بنا نهاد.",
            achievements = listOf(
                "احداث گنبد عظیم سلطانیه در زنجان شاهکار معماری ایرانی-اسلامی"
            ),
            famousQuote = "گنبد سلطانیه نشانه شکوه هنر و ایمان ایرانیان است.",
            imageResId = null
        ),

        // === تیموریان (TIMURID) ===
        King(
            id = "shah_rukh",
            namePersian = "شاهرخ میرزا تیموری",
            nameEnglish = "Shah Rukh",
            titlePersian = "پادشاه رنسانس هنر و معماری هرات",
            dynastyId = "timurid",
            dynastyNamePersian = "تیموریان",
            reignPeriod = "۱۴۰۵ - ۱۴۴۷ میلادی",
            capital = "هرات",
            summary = "فرزند تیمور و همسر گوهرشاد بیگم، بنیان‌گذار عصر طلایی هنر مینیاتور و معماری هرات.",
            biography = "شاهرخ میرزا بر خلاف پدرش تیمور، پادشاهی صلح‌جو و هنرپرور بود. با همراهی همسرش گوهرشاد بیگم، مسجد گوهرشاد مشهد و مکتب نگارگری هرات بنیان گذاشته شد.",
            achievements = listOf(
                "بنای مسجد باشکوه گوهرشاد در مشهد مقدس",
                "بنیان‌گذاری مکتب مینیاتور و خوشنویسی هرات"
            ),
            famousQuote = "هنر و معماری، جاودانه‌ترین یادگار شاهان است.",
            imageResId = null
        ),

        // === صفویان (SAFAVID) ===
        King(
            id = "shah_ismail_safavi",
            namePersian = "شاه اسماعیل یکم صفوی",
            nameEnglish = "Shah Ismail I Safavi",
            titlePersian = "بنیان‌گذار امپراتوری صفویه و احیاگر یکپارچگی ایران",
            dynastyId = "safavid",
            dynastyNamePersian = "دودمان صفوی",
            reignPeriod = "۱۵۰۱ - ۱۵۲۴ میلادی",
            capital = "تبریز",
            summary = "تاج‌گذاری در تبریز، اعلام رسمیت مذهب تشیع و یکپارچه‌سازی تمامیت ارضی ایران پس از ۹۰۰ سال.",
            biography = "شاه اسماعیل یکم صفوی در ۱۴ سالگی در تبریز تاج‌گذاری کرد. او با اتحاد ایلات قزلباش، سرزمین‌های پراکنده ایران را یکپارچه ساخت و هویت ملی و مذهبی نوین ایران‌زمین را پس از قرن‌ها بازسازی نمود. دلاوری حماسی او در نبرد چالدران نماد شجاعت میهنی است.",
            achievements = listOf(
                "یکپارچه‌سازی تمامیت ارضی ایران پس از ۹۰۰ سال تفرقه",
                "اعلام رسمیت مذهب تشیع به عنوان مذهب رسمی ایران",
                "احیای هویت ملی و ساختار دیوانی جدید ایران‌زمین"
            ),
            famousQuote = "ایران‌زمین یکپارچه و سربلند زیسته و خواهد زیست.",
            imageResId = R.drawable.shah_ismail_safavi_1786217411576
        ),
        King(
            id = "shah_tahmasp_safavi",
            namePersian = "شاه تهماسب یکم صفوی",
            nameEnglish = "Shah Tahmasp I Safavi",
            titlePersian = "شاه صبور با ۵۲ سال سلطنت و انتقال پایتخت به قزوین",
            dynastyId = "safavid",
            dynastyNamePersian = "دودمان صفوی",
            reignPeriod = "۱۵۲۴ - ۱۵۷۶ میلادی",
            capital = "قزوین و تبریز",
            summary = "طولانی‌ترین دوران سلطنت در صفویه، تثبیت مرزها، پیمان صلح آماسیه با عثمانی و رونق هنر مینیاتور.",
            biography = "شاه تهماسب یکم فرزند شاه اسماعیل بود و ۵۲ سال بر ایران فرمان راند. او با درایت، مرزهای کشور را تثبیت کرد و پایتخت را برای امنیت بیشتر به قزوین منتقل نمود. کتاب شاهنامه شاه تهماسبی از شاهکارهای بی‌نظیر هنری دوران اوست.",
            achievements = listOf(
                "امضای پیمان تاریخی صلح آماسیه با امپراتوری عثمانی",
                "انتقال پایتخت به قزوین و توسعه عمران و امنیت",
                "کتابت شاهکار شاهنامه شاه تهماسبی (اوج هنر نگارگری)"
            ),
            famousQuote = "صلح و تدبیر، ثبات‌بخش مرزهای ایران‌زمین است.",
            imageResId = null
        ),
        King(
            id = "shah_abbas_the_great",
            namePersian = "شاه عباس بزرگ (شاه عباس یکم)",
            nameEnglish = "Shah Abbas the Great",
            titlePersian = "بزرگ‌ترین شهریار صفوی، سازنده اصفهان نصف جهان",
            dynastyId = "safavid",
            dynastyNamePersian = "دودمان صفوی",
            reignPeriod = "۱۵۸۸ - ۱۶۲۹ میلادی",
            capital = "اصفهان",
            summary = "اوج اقتدار صفویان، انتقال پایتخت به اصفهان، ساخت میدان نقش جهان، عالی‌قاپو و بازپس‌گیری بندرعباس و بحرین.",
            biography = "شاه عباس یکم مقتدرترین و کارآمدترین پادشاه صفوی بود. او با اصلاحات نظامی، تشکیل ارتش منظم، ساخت جاده‌ها و کاروانسراهای شاه‌عباسی، تجارت و اقتصاد ایران را شکوفا کرد. او پرتغالی‌ها را از خلیج فارس اخراج نمود و اصفهان را به پرشکوه ترین شهر جهان تبدیل کرد.",
            achievements = listOf(
                "احداث میدان تاریخی نقش جهان، عالی‌قاپو، مسجد شاه و سی‌وسه‌پل",
                "اخراج متجاوزان پرتغالی از بندرعباس، جزیره هرمز و قشم",
                "احداث ۱۰۰۰ کاروانسرا و جاده‌های سراسری در سراسر ایران",
                "تشکیل ارتش جدید و سرکوب متجاوزان عثمانی و ازبک"
            ),
            famousQuote = "اصفهان، آینه هنر، صنعت و اقتدار ملت ایران است.",
            imageResId = R.drawable.shah_abbas_the_great_1786217395821
        ),
        King(
            id = "shah_abbas_ii",
            namePersian = "شاه عباس دوم صفوی",
            nameEnglish = "Shah Abbas II",
            titlePersian = "شاه دادگر و سازنده کاخ چهل‌ستون",
            dynastyId = "safavid",
            dynastyNamePersian = "دودمان صفوی",
            reignPeriod = "۱۶۴۲ - ۱۶۶۶ میلادی",
            capital = "اصفهان",
            summary = "فرمانروای دادگر صفوی، احداث کاخ چهل‌ستون و پل خواجو در اصفهان و بازپس‌گیری قندهار.",
            biography = "شاه عباس دوم در ۱۰ سالگی به سلطنت رسید. او پادشاهی عادل و علاقه‌مند به عمران بود. در زمان او کاخ چهل‌ستون و پل تاریخی خواجو ساخته شد و شهر قندهار بدون جنگ خونین به آغوش ایران بازگشت.",
            achievements = listOf(
                "بنای کاخ باشکوه چهل‌ستون و پل خواجو در اصفهان",
                "بازپس‌گیری قندهار و تثبیت اقتدار شرقی ایران"
            ),
            famousQuote = "عدالت در دادگری، مایه دوام و شکوه حکومت است.",
            imageResId = null
        ),

        // === افشاریان (AFSHARID) ===
        King(
            id = "nader_shah",
            namePersian = "نادرشاه افشار",
            nameEnglish = "Nader Shah Afshar",
            titlePersian = "جهانگشای شرق، شمشیر ایران",
            dynastyId = "afsharid",
            dynastyNamePersian = "افشاریان",
            reignPeriod = "۱۷۳۶ - ۱۷۴۷ میلادی",
            capital = "مشهد",
            summary = "نابغه نظامی بی‌نظیر که افغان‌ها، عثمانی‌ها و روس‌ها را شکست داد و تاج کوه نور و دریای نور را آورد.",
            biography = "نادرشاه افشار از گمنامی برخاست و در بحبوحه سقوط اصفهان، متجاوزان افغان، عثمانی و متصرفات روسیه را یک به یک شکست داد. فتح دهلی و آوردن جواهرات سلطنتی نظیر الماس کوه نور و دریای نور از وقایع بزرگ دوران اوست.",
            achievements = listOf(
                "یکپارچه‌سازی مجدد تمامیت ارضی ایران و اخراج بیگانگان",
                "پیروزی در نبرد کرنال و فتح دهلی",
                "تشکیل ناوگان دریایی ایران در خلیج فارس"
            ),
            famousQuote = "شمشیر من پاسدار مرزهای ایران است، نه تخت سلطنت.",
            imageResId = R.drawable.img_nader_shah_epic_1787818585133
        ),
        King(
            id = "shahrokh_shah_afshar",
            namePersian = "شاهرخ‌شاه افشار",
            nameEnglish = "Shahrokh Shah Afshar",
            titlePersian = "نوه نادرشاه و آخرین حکمران افشاری در خراسان",
            dynastyId = "afsharid",
            dynastyNamePersian = "افشاریان",
            reignPeriod = "۱۷۴۸ - ۱۷۹۶ میلادی",
            capital = "مشهد",
            summary = "نوه نادرشاه افشار که نزدیک به ۵۰ سال بر خراسان فرمان راند.",
            biography = "شاهرخ‌شاه فرزند رضا قلی میرزا و نوه نادرشاه افشار بود. وی پس از کشمکش‌های نابینایی، حکومت خراسان را تا زمان فتح آقامحمدخان قاجار حفظ نمود.",
            achievements = listOf(
                "حفظ امنیت و یکپارچگی استان خراسان در دوران هرج‌ومرج"
            ),
            famousQuote = "خراسان مهد یادگار نادرشاه بزرگ باقی می‌ماند.",
            imageResId = null
        ),

        // === زندیه (ZAND) ===
        King(
            id = "karim_khan_zand",
            namePersian = "کریم‌خان زند",
            nameEnglish = "Karim Khan Zand",
            titlePersian = "وکیل‌الرعایا (نماینده ملت)",
            dynastyId = "zand",
            dynastyNamePersian = "زندیه",
            reignPeriod = "۱۷۵۱ - ۱۷۷۹ میلادی",
            capital = "شیراز",
            summary = "فرمانروای محبوب و مردمی که لقب شاه را نپذیرفت و شیراز را مرکز هنر و آرامش ساخت.",
            biography = "کریم‌خان زند هیچ‌گاه خود را «شاه» ننامید و خود را «وکیل‌الرعایا» نامید. ارگ کریم‌خانی، بازار و مسجد و حمام وکیل در شیراز یادگار دوران پر از صلح و دادگری اوست.",
            achievements = listOf(
                "ساخت مجموعه‌های تاریخی وکیل در شیراز",
                "ایجاد امنیت و رونق اقتصادی پس از سال‌ها جنگ داخلی",
                "مردمداری و سادگی کم‌نظیر در طول تاریخ پادشاهی"
            ),
            famousQuote = "من شاه نیستم، من وکیل و خدمتگزار رعایای ایرانم.",
            imageResId = R.drawable.img_karim_khan_king_1786185215069
        ),
        King(
            id = "lotf_ali_khan_zand",
            namePersian = "لطفعلی‌خان زند",
            nameEnglish = "Lotf Ali Khan Zand",
            titlePersian = "آخرین پادشاه دلاور سلسله زندیه",
            dynastyId = "zand",
            dynastyNamePersian = "زندیه",
            reignPeriod = "۱۷۸۹ - ۱۷۹۴ میلادی",
            capital = "شیراز و کرمان",
            summary = "پهلوان جوان و شجاع که در برابر سپاهیان آقامحمدخان قاجار ایستادگی حماسی کرد.",
            biography = "لطفعلی‌خان زند آخرین شهریار زندیه بود. وی اسب‌سواری ماهر و شمشیرزنی بی‌نظیر بود که در بم و کرمان با خیانت دستگیر شد. شجاعت حماسی او الگوی پهلوانی در تاریخ ایران است.",
            achievements = listOf(
                "ایستادگی حماسی در نبردهای کرمان و شیراز",
                "نماد شجاعت و جوانمردی ایرانی در ادب عامه"
            ),
            famousQuote = "تا آخرین قطره خون در راه شرف و میهن می‌جنگم.",
            imageResId = null
        ),

        // === قاجار (QAJAR) ===
        King(
            id = "agha_mohammad_khan",
            namePersian = "آقامحمدخان قاجار",
            nameEnglish = "Agha Mohammad Khan Qajar",
            titlePersian = "بنیان‌گذار دودمان قاجار، انتخاب‌کننده تهران به پایتختی",
            dynastyId = "qajar",
            dynastyNamePersian = "دودمان قاجار",
            reignPeriod = "۱۷۸۹ - ۱۷۹۷ میلادی",
            capital = "تهران",
            summary = "بنیان‌گذار سلسله قاجاریه که تهران را به عنوان پایتخت ایران برگزید.",
            biography = "آقامحمدخان قاجار با سرکوب مدعیان و یکپارچه‌سازی ایران، تهران را به عنوان پایتخت انتخاب کرد. او در نبرد گرجستان تمامیت ارضی را یکپارچه ساخت.",
            achievements = listOf(
                "انتخاب رسمی شهر تهران به عنوان پایتخت ایران (۱۳۰۴ ق)",
                "یکپارچه‌سازی قلمرو ایران پس از هرج‌ومرج‌های دوره زندیه"
            ),
            famousQuote = "تهران پایتخت همیشگی ایران‌زمین خواهد ماند.",
            imageResId = null
        ),
        King(
            id = "fath_ali_shah",
            namePersian = "فتحعلی‌شاه قاجار",
            nameEnglish = "Fath-Ali Shah Qajar",
            titlePersian = "شاه دوران جنگ‌های ایران و روسیه",
            dynastyId = "qajar",
            dynastyNamePersian = "دودمان قاجار",
            reignPeriod = "۱۷۹۷ - ۱۸۳۴ میلادی",
            capital = "تهران",
            summary = "پادشاهی که در زمان او جنگ‌های ایران و روسیه و عهدنامه‌های گلستان و ترکمنچای رخ داد.",
            biography = "فتحعلی‌شاه قاجار ۳۷ سال حکومت کرد. رشادت‌های نایب‌السلطنه عباس‌میرزا در برابر ارتش روسیه تزار در این دوره رخ داد، اما به دلیل ناپایداری عهدنامه‌های ناگوار گلستان و ترکمنچای به ایران تحمیل شد.",
            achievements = listOf(
                "دلاوری‌های سپاه عباس‌میرزا در نبردهای قفقاز",
                "احداث کاخ نگارستان و مجموعه تخت طاووس"
            ),
            famousQuote = "دلاوری عباس‌میرزا مایه فخر ایران در برابر دشمنان است.",
            imageResId = null
        ),
        King(
            id = "naser_al_din_shah",
            namePersian = "ناصرالدین‌شاه قاجار",
            nameEnglish = "Naser al-Din Shah Qajar",
            titlePersian = "سلطان صاحبقران، شاه با ۴۸ سال سلطنت",
            dynastyId = "qajar",
            dynastyNamePersian = "دودمان قاجار",
            reignPeriod = "۱۸۴۸ - ۱۸۹۶ میلادی",
            capital = "تهران",
            summary = "شاه صاحبقران، عصر صدارت امیرکبیر، تأسیس دارالفنون و ورود عکاسی و تلگراف به ایران.",
            biography = "ناصرالدین‌شاه قاجار ۴۸ سال حکومت کرد. صدراعظم بزرگ او امیرکبیر مدرسه دارالفنون، روزنامه وقایع اتفاقیه و اصلاحات ساختاری را بنیان نهاد. نخستین خط تلگراف و عکس‌برداری در زمان او وارد ایران شد.",
            achievements = listOf(
                "تأسیس دارالفنون (نخستین دانشگاه مدرن ایران) به همت امیرکبیر",
                "ورود عکاسی، پست، تلگراف و راه‌آهن شاه‌عبدالعظیم",
                "احداث کاخ گلستان و تالار سلام"
            ),
            famousQuote = "امیرکبیر ستون نوسازی و افتخار ایران است.",
            imageResId = null
        ),
        King(
            id = "mozaffar_al_din_shah",
            namePersian = "مظفرالدین‌شاه قاجار",
            nameEnglish = "Mozaffar ad-Din Shah Qajar",
            titlePersian = "امضاکننده فرمان مشروطیت ایران",
            dynastyId = "qajar",
            dynastyNamePersian = "دودمان قاجار",
            reignPeriod = "۱۸۹۶ - ۱۹۰۷ میلادی",
            capital = "تهران",
            summary = "پادشاهی که فرمان مشروطیت و تاسیس مجلس شورای ملی ایران را در سال ۱۲۸۵ خورشیدی امضا کرد.",
            biography = "مظفرالدین‌شاه قاجار در پاسخ به قیام مردمی و آزادی‌خواهان مشروطه، فرمان تاریخی مشروطیت را در ۱۴ مرداد ۱۲۸۵ امضا نمود و نخستین مجلس شورای ملی ایران تشکیل شد.",
            achievements = listOf(
                "امضای فرمان تاریخی مشروطیت و تشکیل اولین مجلس قانون‌گذاری در ایران",
                "ورود سینما و دوربین فیلمبرداری به ایران"
            ),
            famousQuote = "مجلس شورای ملی، خواستگاه قانون و عدالت ملت ایران است.",
            imageResId = null
        ),
        King(
            id = "mohammad_ali_shah",
            namePersian = "محمدعلی‌شاه قاجار",
            nameEnglish = "Mohammad Ali Shah Qajar",
            titlePersian = "شاه مخالف مشروطه، عامل به توپ بستن مجلس",
            dynastyId = "qajar",
            dynastyNamePersian = "دودمان قاجار",
            reignPeriod = "۱۹۰۷ - ۱۹۰۹ میلادی",
            capital = "تهران",
            summary = "پادشاهی که با همکاری لیاقتوف روسی مجلس شورای ملی را به توپ بست و عزل گردید.",
            biography = "محمدعلی‌شاه قاجار شدیداً با مشروطیت مخالف بود. او به کمک کلنل لیاخوف روسی مجلس را به توپ بست و دوره استبداد صغیر را آغاز نمود، اما با فتح تهران توسط مجاهدین تبریز و بختیاری برکنار گردید.",
            achievements = listOf(
                "سرنگونی نهایی استبداد با فتح تهران توسط مشروطه‌خواهان"
            ),
            famousQuote = "پایان استبداد صغیر با اراده آزادی‌خواهان رقم خورد.",
            imageResId = null
        ),
        King(
            id = "ahmad_shah_qajar",
            namePersian = "احمدشاه قاجار",
            nameEnglish = "Ahmad Shah Qajar",
            titlePersian = "آخرین پادشاه سلسله قاجاریه",
            dynastyId = "qajar",
            dynastyNamePersian = "دودمان قاجار",
            reignPeriod = "۱۹۰۹ - ۱۹۲۵ میلادی",
            capital = "تهران",
            summary = "آخرین شاه قاجار که در جریان جنگ جهانی اول و انقراض قاجاریه در سال ۱۳۰۴ برکنار شد.",
            biography = "احمدشاه قاجار در کودکی پس از عزل پدرش به سلطنت رسید. دوران او هم‌زمان با جنگ جهانی اول، اشغال ایران توسط متفقین و قحطی بزرگ بود. در سال ۱۳۰۴ با مصوبه مجلس، سلسله قاجاریه منقرض شد.",
            achievements = listOf(
                "ایستادگی در برابر امضای قرارداد ۱۹۱۹ استعماری"
            ),
            famousQuote = "من کلم‌فروشی در سوئیس را به پادشاهی مشروط به اراده بیگانگان ترجیح می‌دهم.",
            imageResId = null
        ),

        // === پهلوی (PAHLAVI) ===
        King(
            id = "reza_shah_pahlavi",
            namePersian = "رضاشاه پهلوی",
            nameEnglish = "Reza Shah Pahlavi",
            titlePersian = "رضاشاه کبیر، بنیان‌گذار ایران نو",
            dynastyId = "pahlavi",
            dynastyNamePersian = "دودمان پهلوی",
            reignPeriod = "۱۹۲۵ - ۱۹۴۱ میلادی",
            capital = "تهران",
            summary = "بنیان‌گذار نوسازی ایران، راه‌آهن سراسری، دانشگاه تهران و دادگستری نوین.",
            biography = "رضاشاه پهلوی ایران فروپاشیده عصر قاجار را یکپارچه ساخت. ساخت راه‌آهن سراسری شمال به جنوب، تأسیس دانشگاه تهران، بانک ملی، شناسنامه و ثبت احوال، دادگستری، جاده چالوس و کشف حجاب اجباری از اقدامات تاریخی دوران اوست.",
            achievements = listOf(
                "احداث راه‌آهن سراسری ایران (شاهکار مهندسی)",
                "تأسیس دانشگاه تهران و بانک ملی ایران",
                "ایجاد ارتش نوین سراسری و حفظ تمامیت ارضی",
                "تأسیس دادگستری و ثبت احوال و لغو کاپیتولاسیون"
            ),
            famousQuote = "ایران باید به دست ایرانی و برای ایرانی ساخته شود.",
            imageResId = R.drawable.img_reza_shah_real_1787818372791
        ),
        King(
            id = "mohammad_reza_pahlavi",
            namePersian = "محمدرضاشاه پهلوی",
            nameEnglish = "Mohammad Reza Pahlavi",
            titlePersian = "آخرین پادشاه ایران، شاهنشاه آریامهر",
            dynastyId = "pahlavi",
            dynastyNamePersian = "دودمان پهلوی",
            reignPeriod = "۱۹۴۱ - ۱۹۷۹ میلادی (۱۳۲۰ - ۱۳۵۷)",
            capital = "تهران",
            summary = "دومین پادشاه پهلوی، نهضت ملی شدن صنعت نفت، نوسازی صنعتی و عمرانی و توسعه هواپیمایی و دفاعی.",
            biography = "محمدرضاشاه پهلوی ۳۷ سال فرمانروایی کرد. ملی شدن صنعت نفت به رهبری دکتر مصدق، انقلاب سفید، ساخت برج شهیاد (آزادی)، فرودگاه مهرآباد، ورزشگاه آریامهر (آزادی)، صنایع ذوب‌آهن اصفهان و توسعه ارتش در زمان او رخ داد.",
            achievements = listOf(
                "ملی شدن صنعت نفت ایران با همکاری دکتر محمد مصدق",
                "توسعه شتابان صنعتی، احداث ذوب‌آهن، سدها و راه‌ها",
                "احداث برج آزادی (شهیاد)، ورزشگاه آزادی و هواپیمایی ملی ایران (هما)",
                "گسترش آموزش رایگان، تغذیه رایگان مدارس و سپاه دانش"
            ),
            famousQuote = "کوروش، آسوده بخواب که ما بیداریم.",
            imageResId = R.drawable.mohammad_reza_shah_portrait_1786213439138
        ),

        // === جمهوری اسلامی ایران (ISLAMIC REPUBLIC) ===
        King(
            id = "khomeini",
            namePersian = "سید روح‌الله خمینی",
            nameEnglish = "Sayyid Ruhollah Khomeini",
            titlePersian = "بنیان‌گذار جمهوری اسلامی ایران، رهبر انقلاب ۱۳۵۷",
            dynastyId = "islamic_republic",
            dynastyNamePersian = "جمهوری اسلامی ایران",
            reignPeriod = "۱۹۷۹ - ۱۹۸۹ میلادی (۱۳۵۷ - ۱۳۶۸)",
            capital = "تهران",
            summary = "بنیان‌گذار نظام جمهوری اسلامی ایران و رهبر انقلاب سال ۱۳۵۷.",
            biography = "سید روح‌الله خمینی مرجع تقلید، فقیه و رهبر انقلاب ۱۳۵۷ ایران بود. او با رهبری جنبش مردمی، به حکومت پهلوی پایان داد و نظام جمهوری اسلامی را بنیان نهاد. دوران رهبری وی هم‌زمان با هشت سال دفاع مقدس در جنگ تحمیلی و حفظ تمامیت ارضی کشور بود.",
            achievements = listOf(
                "بنیان‌گذاری نظام جمهوری اسلامی ایران در فروردین ۱۳۵۸",
                "رهبری انقلاب و کوتاه کردن دست مداخله‌جویان خارجی",
                "فرماندهی کل قوا در هشت سال دفاع مقدس و حفظ تمامیت ارضی"
            ),
            famousQuote = "پشتیبان ولایت فقیه باشید تا به مملکت شما آسیبی نرسد.",
            imageResId = null
        ),
        King(
            id = "khamenei",
            namePersian = "سید علی خامنه‌ای",
            nameEnglish = "Sayyid Ali Khamenei",
            titlePersian = "رهبر معظم انقلاب اسلامی، دومین رهبر جمهوری اسلامی ایران",
            dynastyId = "islamic_republic",
            dynastyNamePersian = "جمهوری اسلامی ایران",
            reignPeriod = "۱۹۸۹ میلادی - تاکنون (۱۳۶۸ - تاکنون)",
            capital = "تهران",
            summary = "دومین رهبر جمهوری اسلامی ایران، رئیس‌جمهور سابق و فرمانده کل قوا.",
            biography = "سید علی خامنه‌ای پس از درگذشت بنیان‌گذار انقلاب در سال ۱۳۶۸ توسط مجلس خبرگان رهبری به عنوان رهبر انتخاب گردید. پیش از آن، وی دو دوره رئیس‌جمهور ایران در دوران دفاع مقدس بود. توسعه فناوری‌های موشکی، هسته‌ای، نانو، صنایع دفاعی و اقتدار منطقه‌ای از شاخصه‌های این دوره است.",
            achievements = listOf(
                "گسترش صنایع دفاعی، موشکی، پهپادی و اقتدار خودکفایی ایران",
                "پیشرفت‌های علمی در حوزه‌های هسته‌ای، سلول‌های بنیادی، نانو و هوافضا",
                "هدایت سیاست‌های کلی نظام و حفظ ثبات ملی"
            ),
            famousQuote = "ایران قوی، ایران مستقل و پیشرفته، آرمان و هدف بزرگ ملت ماست.",
            imageResId = null
        )
    )

    fun getShahnamehCharacters(): List<ShahnamehCharacter> = listOf(
        ShahnamehCharacter(
            id = "ferdowsi",
            namePersian = "حکیم ابوالقاسم فردوسی طوسی",
            titlePersian = "استاد بزرگ سخن، زنده کننده زبان پارسی و سراینده شاهنامه",
            eraPersian = "قرن چهارم هجری (دوران سامانیان و غزنویان)",
            shortStory = "بزرگ‌ترین حماسه‌سرای تاریخ ایران که با ۳۰ سال رنج خستگی‌ناپذیر، زبان پارسی و هویت ملی ایرانیان را جاودانه ساخت.",
            fullBiography = "حکیم ابوالقاسم فردوسی طوسی در سال ۳۲۹ هجری در روستای باژ طوس متولد شد. او دهقان‌زاده‌ای بافرهنگ بود که تمام دارایی و ۳۰ سال از عمر خویش را صرف سرودن ۶۰ هزار بیت شاهنامه نمود تا تاریخ، اساطیر و زبان پارسی را از فراموشی نجات دهد. شاهنامه او کاخی بلند از نظم است که گذر قرن‌ها و باد و باران نتوانست به آن آسیبی رساند.",
            keyFeats = listOf(
                "سرودن ۶۰ هزار بیت حماسه جاودانه شاهنامه در مدت ۳۰ سال",
                "زنده نگه‌داشتن هویت ملی، تاریخ و زبان پارسی پس از قرن‌ها",
                "پایه‌گذاری بزرگ‌ترین شاهکار ادبیات حماسی جهان"
            ),
            famousVerse = "بسی رنج بردم در این سال سی / عجم زنده کردم بدین پارسی\nنمیرم از این پس که من زنده‌ام / که تخم سخن را پراکنده‌ام",
            symbolEmoji = "📜",
            imageResId = R.drawable.img_ferdowsi_tous_epic_1787818549429
        ),
        ShahnamehCharacter(
            id = "rostam",
            namePersian = "رستم دستان",
            titlePersian = "جهان‌اطمئن / تهمتن، بزرگ‌ترین پهلوان ایران",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "پهلوان نامدار زابلستان، دارنده اسب رخش، عبورکننده از هفت‌خان و نگاهبان پیروز مرزهای ایران‌زمین.",
            fullBiography = "رستم دستان فرزند زال و رودابه، برجسته‌ترین پهلوان اساطیری شاهنامه فردوسی است. او با اسب وفادارش «رخش» در طول چند سده پاسدار پادشاهان عادل کیانی بود. گذر از هفت‌خان رستم برای نجات کیکاووس از دیوان مازندران، نبرد با دیو سفید، و سوگ‌نامه حماسی رستم و سهراب از جاودانه‌ترین بخش‌های شاهنامه است.",
            keyFeats = listOf(
                "پیروزی در هفت‌خان و کشتن دیو سپید مازندران",
                "رام کردن اسب پیلتن رخش",
                "رنج و سوگ‌نامه حماسی نبرد با سهراب",
                "پاسداری از مرزهای ایران در برابر توران"
            ),
            famousVerse = "چنین گفت رستم به اسفندیار / که گفتار ماند ز ما یادگار",
            symbolEmoji = "🗡️",
            imageResId = R.drawable.img_rostam_dastan_epic_1787818415982
        ),
        ShahnamehCharacter(
            id = "sohrab",
            namePersian = "سهراب پهلوان",
            titlePersian = "یل جوان، فرزند تهمتن و تهمینه",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "پهلوان نوجوان توران‌زمین که برای یافتن پدرش رستم به ایران تاخت و در نبردی ناشناخته به دست پدر کشته شد.",
            fullBiography = "سهراب فرزند رستم و تهمینه (دختر شاه سمنگان) بود. او که از کودکی قدرت بی‌نظیر پدرش را به ارث برده بود، سپاهی آراست تا به ایران آید، کیکاووس را برکنار کند و تاج و تخت را به رستم سپارد. اما دسیسه افراسیاب مانع شناخت پدر و پسر شد و سرانجام به دست رستم زخمی مرگبار خورد.",
            keyFeats = listOf(
                "فتح دژ سپید در نوجوانی و نبرد با گردآفرید",
                "جنگاوری بی‌نظیر و به زانو درآوردن سپاهیان",
                "سوگنامه‌ای که دل تمام ایرانیان را به درد آورد"
            ),
            famousVerse = "یکی داستان است پر آب چشم / دل غمگین به درد آورد از کژچشم",
            symbolEmoji = "🛡️",
            imageResId = R.drawable.img_sohrab_epic_1787819724220
        ),
        ShahnamehCharacter(
            id = "jamshid",
            namePersian = "جمشید شاه پیشدادی",
            titlePersian = "پادشاه صاحب‌فر، بنیان‌گذار نوروز و عصر طلایی",
            eraPersian = "پیشدادیان (دوران اساطیری)",
            shortStory = "پادشاه بزرگ پیشدادی که آهن، ابریشم، کشف دارو و ساخت جمشیدگاه (تخت جمشید اساطیری) و جشن نوروز از یادگارهای اوست.",
            fullBiography = "جمشید فرزند تهمورث و یکی از باشکوه‌ترین پادشاهان اساطیری ایران بود. در ۷۰۰ سال پادشاهی او مردم نه بیمار شدند و نه پیر. او جامعه را ساختار داد، آهن را نرم کرد، کشتی‌رانی و جام جم را پدید آورد و روز جلوسش بر تخت زرین را «نوروز» نامید.",
            keyFeats = listOf(
                "تأسیس جشن ملی نوروز در نخستین روز بهار",
                "ساخت جام جهان‌نما (جام جم) و ابداع کشف ابریشم و دارو",
                "عصر ۷۰۰ ساله شکوفایی، سلامت و دادگری پیشدادیان"
            ),
            famousVerse = "به جمشید بر گوهر افشاندند / مر آن روز را روز نو خواندند",
            symbolEmoji = "👑",
            imageResId = R.drawable.img_jamshid_epic_1787819737797
        ),
        ShahnamehCharacter(
            id = "kay_khosrow",
            namePersian = "کیخسرو کیانی",
            titlePersian = "نماد پادشاه آرمانی، دادگر و فرهمند شاهنامه",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "فرزند سیاوش و فرنگیس، پادشاه فرهمند کیانی که انتقام خون سیاوش را گرفت و تورانیان ستمگر را شکست داد.",
            fullBiography = "کیخسرو فرزند سیاوش و نوه کیکاووس بود. او در توران متولد شد و به همت گیو به ایران آورده شد. کیخسرو دادگرترین و پارساترین پادشاه شاهنامه است که کین سیاوش را داد و افراسیاب را نابود ساخت و سرانجام در اوج قدرت، تاج و تخت را رها کرده و زنده به آسمان عروج نمود.",
            keyFeats = listOf(
                "گرفتن کین سیاوش و پایان دادن به جنگ‌های خونین ایران و توران",
                "نماد فرهمندی، دادگری و پارسایی پادشاهی در شاهنامه",
                "ناپدید شدن اساطیری در برف البرزکوه همراه یارانش"
            ),
            famousVerse = "چو کیخسرو آمد بهگاه کیان / ببست از پی داد و بخشش میان",
            symbolEmoji = "🌟",
            imageResId = R.drawable.img_kaykhosrow_epic_1787819750107
        ),
        ShahnamehCharacter(
            id = "siavash",
            namePersian = "سیاوش پاک‌دامن",
            titlePersian = "شاهزاده پاک‌نهاد و مظلوم ایران",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "نماد راستی و پاک‌دامنی که برای اثبات بی‌گناهی خود از کوه آتش گذشت و مظلومانه در توران کشته شد.",
            fullBiography = "سیاوش فرزند کیکاووس بود که نزد رستم دستان آئین پهلوانی و آزادگی آموخت. پس از اتهام ناپاکی از سوی سودابه، سیاوش سوار بر اسب خود شبرنگ بهزاد از میان آتش سوزان گذشت و بی‌گناهی‌اش ثابت شد. سپس برای پرهیز از جنگ با توران به توران رفت و شهر سیاوش‌گرد را ساخت، اما به دسیسه گرسیوز به دستور افراسیاب شهید شد.",
            keyFeats = listOf(
                "عبور حماسی و پیروزمندانه از کوه آتش (آزمون ور)",
                "بنیان‌گذاری شهر زیبای سیاوش‌گرد",
                "روئیدن گیاه پرسیانوشان (خون سیاوش) از قطره خون او"
            ),
            famousVerse = "هر آنگه که خشم آورد کین و جنگ / به آتش بسوزد دل پلنگ",
            symbolEmoji = "🔥",
            imageResId = R.drawable.img_siavash_epic_1787819763027
        ),
        ShahnamehCharacter(
            id = "esfandiyar",
            namePersian = "اسفندیار رویین‌تن",
            titlePersian = "شاهزاده رویین‌تن کیانی",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "پهلوان رویین‌تن کیانی که با پیمودن هفت‌خان اسفندیار، برای گسترش آیین زرتشت نبرد کرد.",
            fullBiography = "اسفندیار فرزند گشتاسب شاه کیانی بود. او به دلیل شسته شدن در آب مقدس، بدنی رویین‌تن داشت و تنها چشمانش آسیب‌پذیر بود. اسفندیار هفت‌خان دشواری را پیمود تا خواهرانش را از دژ رویین نجات دهد، اما در نهایت بدسگالی گشتاسب او را به نبرد با رستم فرستاد و با تیر دو شاخ گَز و راهنمایی سیمرغ ناپدید شد.",
            keyFeats = listOf(
                "پیمودن موفقیت‌آمیز هفت‌خان اسفندیار",
                "فتح دژ تسخیرناپذیر رویین‌دژ",
                "رویین‌تنی شگفت‌انگیز در برابر تیغ و تیر"
            ),
            famousVerse = "بزه کرد تیر گز اندر کمان / به چشمان اسفندیار زمان",
            symbolEmoji = "🏹",
            imageResId = R.drawable.img_esfandiar_epic_1788173313310
        ),
        ShahnamehCharacter(
            id = "gordafarid",
            namePersian = "گردآفرید شیرزن",
            titlePersian = "نخستین شیرزن پهلوان تاریخ ایران",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "دختر گژدهم و شیرزن دژ سپید که با خرد و تدبیر در برابر سهراب رزمید و دژ را نجات داد.",
            fullBiography = "گردآفرید یکی از برجسته‌ترین زنان پهلوان در شاهنامه فردوسی است. هنگامی که سهراب به دژ سپید حمله کرد و هژیر را اسیر نمود، گردآفرید زره پهلوانی بر تن کرد، موهایش را زیر کلاهخود پنهان نمود و به نبرد تن‌به‌تن با سهراب رفت. او با هوشمندی و تدبیر توانست سهراب را فریب داده و دژ را تخلیه کند.",
            keyFeats = listOf(
                "نبرد حماسی تن‌به‌تن با سهراب جوان",
                "نماد شجاعت، خرد و تدبیر زنان ایرانی",
                "نجات ساکنان دژ سپید از چنگال دشمن"
            ),
            famousVerse = "ز زن‌ها ندیدم چنین جنگجوی / به رزم اندرون خشمگین تندخوی",
            symbolEmoji = "🗡️",
            imageResId = R.drawable.img_gordafarid_epic_1788173296097
        ),
        ShahnamehCharacter(
            id = "tahmineh",
            namePersian = "تهمینه بانوی سمنگان",
            titlePersian = "همسر رستم دستان و مادر سهراب پهلوان",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "شاهزاده‌خانم هوشمند سمنگان، همسر رستم و مادر سهراب که پرورش خردمندانه سهراب را بر عهده داشت.",
            fullBiography = "تهمینه دختر شاه سمنگان و یکی از چهره‌های برجسته زنان در شاهنامه فردوسی است. شب‌هنگام که رستم در جستجوی اسبش رخش به سمنگان آمد، تهمینه نادیده دل به شجاعت و آزادگی رستم بست. حاصل پیوند آنان سهراب بود. تهمینه سهراب را با اندرز و مهر مادری پرورش داد و مهره نشان رستم را به بازویش بست. سوگنامه او پس از شهادت سهراب از جانسوزترین ابیات شاهنامه است.",
            keyFeats = listOf(
                "شاهزاده‌خانم خردمند و آگاه سمنگان",
                "پرورش حماسی سهراب با مهر و دلاوری",
                "بستن مهره یادگار رستم بر بازوی سهراب"
            ),
            famousVerse = "یکی دخت شاه سمنگان منم / ز پشت هژبر و پلنگان منم",
            symbolEmoji = "👸",
            imageResId = R.drawable.img_tahmineh_epic_1788173275510
        ),
        ShahnamehCharacter(
            id = "kaveh_blacksmith",
            namePersian = "کاوه آهنگر",
            titlePersian = "برافرازنده درفش کاویانی و رهبر قیام مردمی",
            eraPersian = "پیشدادیان (دوران اساطیری)",
            shortStory = "آهنگر شجاع اصفهانی که پیش‌بند چرمی خود را بر سر نیزه کرد و مردم را علیه ستم ضحاک ماردوش شورانید.",
            fullBiography = "کاوه آهنگر نماد قیام دادخواهانه ملت ایران در برابر مظهر ظلم یعنی ضحاک ماردوش است. هنگامی که ضحاک ۱۷ فرزند کاوه را خوراک مارهای بر دوشش کرد، کاوه در بارگاه ضحاک خروشید، استشهادنامه دروغین را پاره نمود و با برافراشتن چرم‌آهنگری خویش، مردم را گرد فریدون جمع کرد.",
            keyFeats = listOf(
                "خروشیدن تاریخی در بارگاه ضحاک ستمگر",
                "خلق درفش کاویانی (میهنی‌ترین پرچم تاریخ ایران)",
                "رهبری جنبش مردمی و به بند کشیدن ضحاک در دماوند"
            ),
            famousVerse = "چو کاوه برون آمد از پیش شاه / برواندر آمد یکی دادخواه",
            symbolEmoji = "⚒️",
            imageResId = R.drawable.img_kaveh_blacksmith_1786115975036
        ),
        ShahnamehCharacter(
            id = "fereydun",
            namePersian = "فریدون فرخ",
            titlePersian = "پادشاه فرخنده و شکست‌دهنده ضحاک",
            eraPersian = "پیشدادیان (دوران اساطیری)",
            shortStory = "پادشاه دادگر پیشدادی که با همراهی کاوه آهنگر، ضحاک ماردوش را در غار کوه دماوند به بند کشید.",
            fullBiography = "فریدون فرزند آبتین و فرانک بود. او با گرز گران‌سنگ گاوپیکر که خود ساخته بود، به اروندکنار زد و بر دژ ضحاک در بیت‌المقدس چیره شد. به فرمان سروش، ضحاک را نکشت بلکه او را در غار دماوند غل‌وزنجیر کرد تا روز رستاخیز.",
            keyFeats = listOf(
                "ساخت گرز گاوپیکر و شکست ضحاک",
                "به بند کشیدن ضحاک ستمگر در کوه دماوند",
                "تقسیم عادلانه جهان میان سه فرزندش ایرج، تور و سلم"
            ),
            famousVerse = "فریدون فرخ فرشته نبود / ز مشک و ز عنبر سرشته نبود / به داد و دهش یافت آن خوب‌ویی / تو داد و دهش کن فریدون تویی",
            symbolEmoji = "👑",
            imageResId = R.drawable.img_fereydun_epic_1788173259480
        ),
        ShahnamehCharacter(
            id = "zahhak",
            namePersian = "ضحاک ماردوش",
            titlePersian = "پادشاه ستمگر ماردوش اساطیری",
            eraPersian = "پیشدادیان (دوران اساطیری)",
            shortStory = "فرمانروای ستمکار با دو مار بر دوش که هزار سال بر ایران حکومت کرد و سرانجام به دست فریدون و کاوه در دماوند محبوس گشت.",
            fullBiography = "ضحاک فرزند مرداس بود که با وسوسه ابلیس پدر را کشت و بر تخت نشست. ابلیس بوسه‌ای بر دوش او زد و دو مار سیاه رشت که تنها با مغز جوانان آرام می‌گرفتند. قیام کاوه آهنگر و نبرد فریدون با گرز گاوپیکر به حکومت هزارساله سیاهی او پایان داد.",
            keyFeats = listOf(
                "حکومت هزارساله اساطیری بر ایران‌زمین",
                "نماد ظلم و ستم پادشاهی در فرهنگ ایرانی",
                "به بند کشیده شدن جاویدان در غار کوه دماوند"
            ),
            famousVerse = "چو ضحاک بر برج داد آفرین / نشست از بر پایگاه مهین",
            symbolEmoji = "🐍",
            imageResId = R.drawable.img_zahhak_epic_1788170950610
        ),
        ShahnamehCharacter(
            id = "zal",
            namePersian = "زال زر (دستان)",
            titlePersian = "پهلوان سپیدموی، پرورش‌یافته سیمرغ",
            eraPersian = "پیشدادیان و کیانیان",
            shortStory = "فرزند سام که با موی سپید متولد شد، بر فراز البرز کوه توسط سیمرغ پرورش یافت و پدر رستم گردید.",
            fullBiography = "زال به دلیل موهای سپیدش در نوزادی توسط پدرش سام در البرزکوه رها شد. سیمرغ او را به آشیانه برد و چون فرزندی پرورش داد. داستان عشق حماسی زال و رودابه (دختر مهراب کابلی) از زیباترین بخش‌های شاهنامه است.",
            keyFeats = listOf(
                "پرورش در آشیانه سیمرغ و دریافت پر جادویی سیمرغ",
                "داستان عاشقانه و حماسی زال و رودابه",
                "پدر سپهسالار رستم دستان"
            ),
            famousVerse = "یکی بچه‌ای دید در زیر کوه / ز مادر جدا و ز مردم گروه",
            symbolEmoji = "🦅",
            imageResId = R.drawable.img_zal_epic_1788173226936
        ),
        ShahnamehCharacter(
            id = "rakhsh",
            namePersian = "رخش رستم",
            titlePersian = "اسب هوشمند، دلاور و وفادار تهمتن",
            eraPersian = "کیانیان (دوران حماسی)",
            shortStory = "اسب تیزرو و هوشمند رستم که در هفت‌خان شیر درنده را کشت و تا واپسین لحظه یار وفادار رستم بود.",
            fullBiography = "رخش اسبی پیلتن با پوستی چون برگ گل سرخ و خال‌های مفرغی بود. هیچ پهلوانی جز رستم توان سوار شدن بر او را نداشت. رخش نه تنها مرکب رستم بود بلکه هوشمندی فوق‌العاده‌ای داشت و در خان اول هفت‌خان شیر ژیان را در خواب رستم از پای درآورد.",
            keyFeats = listOf(
                "کشتن شیر ژیان در خان اول هفت‌خان",
                "هوشیاری و آگاهی‌بخشی به رستم در خطرات",
                "وفاداری جاودانه تا آخرین نبرد در چاه شغاد"
            ),
            famousVerse = "پی‌اش خرد چون سم آهو به سنگ / تنش پرنیان و برش چون پلنگ",
            symbolEmoji = "🐎",
            imageResId = R.drawable.img_rakhsh_epic_1788173245626
        )
    )

    fun getSuperIranianHeroes(): List<SuperIranianHero> = listOf(
        SuperIranianHero(
            id = "nizam_al_mulk",
            namePersian = "خواجه نظام‌الملک طوسی",
            titlePersian = "وزیر اعظم سلجوقیان و معمار مدارس نظامیه",
            eraPersian = "سلجوقیان (قرن پنجم هجری / ۱۰۱۸ - ۱۰۹۲ میلادی)",
            rolePersian = "وزیر مقتدر آلپ ارسلان و ملکشاه سلجوقی",
            storyPersian = "خواجه نظام‌الملک طوسی بزرگ‌ترین وزیر تاریخ ایران اسلامی بود. او ۳۰ سال اداره امپراتوری پهناور سلجوقی از هند تا مدیترانه را بر عهده داشت. تأسیس شبکه مدارس بزرگ «نظامیه» (نخستین دانشگاه‌های سازمان‌یافته جهان) و نگارش کتاب «سیاست‌نامه» از خدمات ماندگار اوست.",
            achievements = listOf(
                "تأسیس شبکه دانشگاه‌های نظامیه در بغداد، نیشابور و اصفهان",
                "تألیف شاهکار دیوانی و سیاسی «سیاست‌نامه» (سیرالملوک)",
                "سازمان‌دهی اداری و مالی عالی امپراتوری سلجوقی"
            ),
            famousQuote = "پادشاهی با کفر بپاید اما با ستم نپاید.",
            symbolEmoji = "📜",
            imageResId = R.drawable.img_nizam_al_mulk_1786279998856
        ),
        SuperIranianHero(
            id = "nasir_din_tusi",
            namePersian = "خواجه نصیرالدین طوسی",
            titlePersian = "استاد البشر، وزیر دانشمند و سازنده رصدخانه مراغه",
            eraPersian = "ایلخانان (قرن هفتم هجری / ۱۲۰۱ - ۱۲۷۴ میلادی)",
            rolePersian = "وزیر و مشاور ارشد هولاکوخان و دانشمند جامع‌الاطراف",
            storyPersian = "خواجه نصیرالدین طوسی فیلسوف، ریاضی‌دان و منجم نابغه ایرانی بود. در دوران تهاجم ویرانگر مغول، او با هوشمندی وزارت ایلخانان را پذیرفت و هزاران دانشمند، کتابخانه و نسخه خطی را از نابودی نجات داد. او رصدخانه عظیم مراغه را ساخت و علم مثلثات را به دانشی مستقل تبدیل کرد.",
            achievements = listOf(
                "تأسیس رصدخانه عظیم مراغه و کتابخانه ۴۰۰ هزار جلدی آن",
                "پایه‌گذاری مثلثات جدید و کشف جفت طوسی در نجوم",
                "نجات کتاب‌ها و دانشمندان جهان اسلام از کشتار مغولان"
            ),
            famousQuote = "دانش، دژ مستحکمی است که هیچ شمشیر ویرانگری توان رخنه در آن را ندارد.",
            symbolEmoji = "🔭",
            imageResId = R.drawable.img_nasir_din_tusi_1786280013750
        ),
        SuperIranianHero(
            id = "rashid_din_hamadani",
            namePersian = "خواجه رشیدالدین فضل‌الله همدانی",
            titlePersian = "وزیر اعظم دانشمند ایلخانان و بانی ربع رشیدی",
            eraPersian = "ایلخانان (قرن هفتم و هشتم هجری)",
            rolePersian = "وزیر غازان خان و اولجایتو",
            storyPersian = "خواجه رشیدالدین همدانی پزشک، تاریخ‌نگار و وزیر نابغه ایرانی بود. او شهرک علمی و بین‌المللی «ربع رشیدی» را در تبریز ساخت که هزاران دانشجو، پزشک و دانشمند از سراسر جهان در آن پژوهش می‌کردند. کتاب جامع‌التواریخ او نخستین تاریخ عمومی جهان است.",
            achievements = listOf(
                "احداث مجتمع عظیم دانشگاهی و پژوهشی ربع رشیدی تبریز",
                "تألیف کتاب بی‌نظیر «جامع‌التواریخ» (نخستین تاریخ جامع جهان)",
                "اصلاحات گسترده اقتصادی و کشاورزی در ایران"
            ),
            famousQuote = "آبادانی میهن با گسترش دانش و سلامت مردم محقق می‌شود.",
            symbolEmoji = "🏛️",
            imageResId = R.drawable.img_rashid_din_hamadani_1786281055635
        ),
        SuperIranianHero(
            id = "amir_kabir",
            namePersian = "امیرکبیر (میرزا تقی‌خان فراهانی)",
            titlePersian = "صدراعظم اسطوره‌ای، بانی دارالفنون و روزنامه وقایع اتفاقیه",
            eraPersian = "قاجاریه (۱۲۲۲ - ۱۲۶۸ هجری قمری)",
            rolePersian = "صدراعظم ایران در زمان ناصرالدین شاه",
            storyPersian = "امیرکبیر یکی از محبوب‌ترین و خادم‌ترین صدراعظم‌های تاریخ ایران است. او در مدت کوتاه ۳ سال و ۳ ماه صدارت، مدرسه دارالفنون (نخستین دانشگاه مدرن ایران) را تاسیس نمود، روزنامه وقایع اتفاقیه را منتشر کرد، به فساد مالی دربار پایان داد و مستقل از نفوذ انگلیس و روس حکومت کرد.",
            achievements = listOf(
                "تأسیس مدرسه دارالفنون و ورود علوم و فنون جدید به ایران",
                "انتشار روزنامه وقایع اتفاقیه و اصلاحات ساختاری اداری و مالی",
                "قطع دست‌اندازی سفارتخانه‌های بیگانه و اصلاح نظام پزشکی و واکسیناسیون"
            ),
            famousQuote = "مسئولیت نادانی ملت با ماست؛ اگر مردم آگاه شوند، هیچ بیگانه و ستمگری نمی‌تواند بر آنان حکومت کند.",
            symbolEmoji = "🖋️",
            imageResId = R.drawable.img_amir_kabir_real_1787818492750
        ),
        SuperIranianHero(
            id = "bozorgmehr",
            namePersian = "بزرگمهر بختگان",
            titlePersian = "وزیر خردمند و حکیم دربار ساسانی",
            eraPersian = "ساسانیان (زمان خسرو انوشیروان)",
            rolePersian = "وزیر اعظم و اندیشمند بزرگ ساسانی",
            storyPersian = "بزرگمهر بختگان نماد حکمت، تدبیر و هوش ایرانی در دوره ساسانیان است. هنگامی که فرستادگان هند شطرنج را به دربار ایران آوردند، بزرگمهر راز شطرنج را گشود و بازی نرد را اختراع کرد. اندرزنامه‌های او در زمره ارزشمندترین متون خردورزی ایران باستان است.",
            achievements = listOf(
                "گشودن رمز بازی شطرنج هندی و اختراع بازی تخته‌نرد",
                "نگارش پندنامه‌ها و اندرزنامه‌های حکمت ایرانی",
                "اداره خردمندانه امور کشور در عصر طلایی ساسانی"
            ),
            famousQuote = "سخت‌ترین نبردها، نبرد با نادانی و خشم خویشتن است.",
            symbolEmoji = "♟️",
            imageResId = R.drawable.img_bozorgmehr_vizier_1786281067634
        ),
        SuperIranianHero(
            id = "ariobarzanes",
            namePersian = "آریوبرزن",
            titlePersian = "سردار دلاور هخامنشی و مدافع دربند پارس",
            eraPersian = "هخامنشیان (۳۳۰ پیش از میلاد)",
            rolePersian = "فرمانده سپاه پارس در نبرد تنگه تکاب",
            storyPersian = "آریوبرزن آخرین سردار هخامنشی بود که با ۴۰۰ سوار و چند هزار پیاده، راه را بر سپاه ده‌ها هزار نفری اسکندر مقدونی در تنگه دربند پارس (کهگیلویه و بویراحمد) بست. او و یارانش تا آخرین قطره خون جنگیدند و اجازه ندادند اسکندر به راحتی به تخت جمشید دست یابد.",
            achievements = listOf(
                "ایستادگی حماسی در برابر سپاه عظیم اسکندر مقدونی",
                "رد کردن پیشنهاد تسلیم و شهادت قهرمانانه در راه میهن",
                "نماد جان‌فشانی و دفاع از خاک ایران‌زمین"
            ),
            famousQuote = "تا هنگامی که یک ایرانی زنده است، هیچ بیگانه‌ای بر پارس گام نخواهد نهاد.",
            symbolEmoji = "🗡️",
            imageResId = R.drawable.img_ariobarzanes_epic_1788173354724
        ),
        SuperIranianHero(
            id = "surena",
            namePersian = "سورنا (سورن)",
            titlePersian = "سپهبد نابغه اشکانی و فاتح نبرد تاریخی کاره",
            eraPersian = "اشکانیان (۵۳ پیش از میلاد)",
            rolePersian = "سپهسالار کل ایران در زمان ارد دوم اشکانی",
            storyPersian = "سورنا سپهبد ۳۰ ساله اشکانی بود که در نبرد حران (کاره) با ۱۰ هزار سوار کماندار پارتی، سپاه ۴۰ هزار نفری کراسوس (امپراتور روم) را به کلی نابود ساخت. تاکتیک تیراندازی پارتی و شترهای حامل هزاران تیر او در تاریخ نظامی جهان تدریس می‌شود.",
            achievements = listOf(
                "در هم کوبیدن کامل امپراتوری روم در نبرد کاره",
                "ابداع تاکتیک تیراندازی پارتی (Parthian Shot)",
                "نگهداری اقتدار ایران به عنوان تنها ابرقدرت جهان باستان"
            ),
            famousQuote = "تیرهای پارتی حتی هنگام عقب‌نشینی سینه‌های متجاوز را می‌شکافد.",
            symbolEmoji = "🏹",
            imageResId = R.drawable.img_surena_epic_1788173389696
        ),
        SuperIranianHero(
            id = "batis",
            namePersian = "به‌تیس (باتیس)",
            titlePersian = "فرماندار شجاع غزه و دژبان وفادار هخامنشی",
            eraPersian = "هخامنشیان (۳۳۲ پیش از میلاد)",
            rolePersian = "فرمانده دژ تسخیرناپذیر غزه",
            storyPersian = "به‌تیس سردار و دژبان ایرانی غزه در زمان داریوش سوم بود. او دو ماه تمام در برابر محاصره و منجنیق‌های سنگین اسکندر مقدونی پایداری کرد. پس از سقوط دژ، اسکندر خشمگین دستور داد پاشنه‌های به‌تیس را سوراخ کرده و او را زنده بر پشت ارابه ببندند، اما به‌تیس حتی یک کلمه خواهش نکرد.",
            achievements = listOf(
                "دو ماه مقاومت شگفت‌انگیز در برابر تمام ارتش اسکندر",
                "غرور و آزادگی بی‌نظیر حتی تحت شدیدترین شکنجه‌ها",
                "تجلیل مورخان یونانی از شجاعت نایاب او"
            ),
            famousQuote = "مرگ در راه میهن زیباتر از زانو زدن در برابر فاتح مغرور است.",
            symbolEmoji = "🛡️",
            imageResId = R.drawable.img_batis_epic_1788173408746
        ),
        SuperIranianHero(
            id = "hassan_sabbah",
            namePersian = "حسن صباح (خداوند الموت)",
            titlePersian = "بنیان‌گذار نزاریان و خداوندگار قلعه الموت",
            eraPersian = "سلجوقیان (قرن پنجم هجری)",
            rolePersian = "رهبر استراتژیک و فرمانده الموت",
            storyPersian = "حسن صباح دانش‌آموخته ری و نیشابور بود که قلعه نفوذناپذیر الموت را در صخره‌های قزوین مقر خود ساخت. او با بهره‌گیری از هوش فوق‌العاده، کتابخانه‌های عظیم و شبکه حشاشین (فداییان)، در برابر سلاطین سلجوقی و اشغالگران صلیبی پایداری نمود.",
            achievements = listOf(
                "تأسیس دژهای نفوذناپذیر الموت و لمسر",
                "ایجاد شبکه اطلاعاتی و سیاسی پیشرفته در قرون وسطی",
                "تأسیس یکی از غنی‌ترین کتابخانه‌های علمی و نجومی"
            ),
            famousQuote = "حقیقت در پناه دانایی و دژهای استوار ریشه می‌زند.",
            symbolEmoji = "🏰",
            imageResId = R.drawable.img_hassan_sabbah_hero_1786189911515
        ),
        SuperIranianHero(
            id = "youtab",
            namePersian = "یوتاب هخامنشی",
            titlePersian = "خواهر آریوبرزن و شیرزن دلاور نبرد دربند پارس",
            eraPersian = "هخامنشیان (۳۳۰ پیش از میلاد)",
            rolePersian = "فرمانده زنان و سواران پارسی",
            storyPersian = "یوتاب خواهر آریوبرزن بود که در نبرد تنگه تکاب دوشادوش برادرش با مقدونیان جنگید. او تا آخرین نفس شمشیر زد و نام خود را به عنوان یکی از جاودانه‌ترین زنان جنگجوی تاریخ ایران ثبت کرد.",
            achievements = listOf(
                "فرماندهی دلاورانه در کنار آریوبرزن",
                "شهادت در راه حفظ استقلال و شرافت ایران",
                "نماد تاریخی شجاعت زنان آریایی"
            ),
            famousQuote = "شرافت خاک پارس با خون ما پاسداری می‌شود.",
            symbolEmoji = "⚔️",
            imageResId = R.drawable.img_youtab_epic_1788173370618
        ),
        SuperIranianHero(
            id = "atossa",
            namePersian = "آتوسا (شهبانوی هخامنشی)",
            titlePersian = "دختر کوروش بزرگ، همسر داریوش و مادر خشایارشا",
            eraPersian = "هخامنشیان (قرن ششم پیش از میلاد)",
            rolePersian = "قدرتمندترین شهبانوی امپراتوری هخامنشی",
            storyPersian = "آتوسا بانوی پرنفوذ و خردمند هخامنشی بود. او نقش کلیدی در تصمیم‌گیری‌های سیاسی، کشورداری و فرهنگ امپراتوری ایفا کرد و مروج آموزش، اندیشه و خط پارسی باستان بود.",
            achievements = listOf(
                "هدایت سیاست دربار هخامنشی در اوج شکوه امپراتوری",
                "پشتیبانی از فرهنگ، خط و هنرهای پارسی",
                "مادر خشایارشاه بزرگ"
            ),
            famousQuote = "فرزندان پارس باید بر پایه خرد و دادگری آموزش بینند.",
            symbolEmoji = "👑",
            imageResId = R.drawable.img_atossa_epic_1788173468196
        ),
        SuperIranianHero(
            id = "xerxes_hero",
            namePersian = "خشایارشا (خشایارشاه بزرگ)",
            titlePersian = "شاهنشاه قدرتمند هخامنشی و فاتح آتن",
            eraPersian = "هخامنشیان (۴۸۶ - ۴۶۵ پیش از میلاد)",
            rolePersian = "شاهنشاه ایران و فرمانده ارتش بزرگ شرق",
            storyPersian = "خشایارشا شاهنشاه مقتدر هخامنشی بود که پل حماسی هلپونت را بر روی تنگه داردانل ساخت، کانال آتوس را حفر کرد و با فتح آتن، اقتدار امپراتوری ایران را در اروپا طنین‌انداز نمود.",
            achievements = listOf(
                "احداث پل شناور بر روی تنگه داردانل",
                "فتح آتن و گسترش شاهنشاهی هخامنشی",
                "تکمیل بناهای عظیم تخت جمشید"
            ),
            famousQuote = "هیچ نیرویی نمی‌تواند اراده امپراتوری پارس را متوقف سازد.",
            symbolEmoji = "🏛️",
            imageResId = R.drawable.img_xerxes_hero_1786189895200
        ),
        SuperIranianHero(
            id = "nader_shah_hero",
            namePersian = "نادرشاه افشار",
            titlePersian = "جهانگشای شرق و شمشیر ایران",
            eraPersian = "افشاریان (۱۷۳۶ میلادی)",
            rolePersian = "شاهنشاه و نابغه نظامی ایران",
            storyPersian = "نادرشاه افشار نابغه نظامی بود که تمام دشمنان داخلی و خارجی (افغان‌ها، عثمانی‌ها و روس‌ها) را سرکوب کرد، تمامیت ارضی ایران را پس از فروپاشی صفویه احیا نمود و تا دهلی پیش رفت.",
            achievements = listOf(
                "نجات کامل ایران از فروپاشی و تجزیه",
                "پیروزی‌های بی‌نظیر نظامی در آسیا",
                "آورنده الماس‌های کوه نور و دریای نور"
            ),
            famousQuote = "هرگاه که شمشیر بزنم، مرزهای ایران فراخ‌تر می‌شود.",
            symbolEmoji = "🗡️",
            imageResId = R.drawable.img_nader_shah_epic_1787818585133
        ),
        SuperIranianHero(
            id = "reza_shah_hero",
            namePersian = "رضاشاه پهلوی",
            nameEnglish = "Reza Shah Pahlavi",
            titlePersian = "بنیان‌گذار ایران مدرن و نوسازی کشور",
            eraPersian = "پهلوی (۱۹۲۵ میلادی)",
            rolePersian = "پادشاه و معمار نوسازی مدرن ایران",
            storyPersian = "رضاشاه پهلوی با اراده‌ای پولادین ساختارهای سنتی و فروپاشیده قاجار را دگرگون ساخت. ساخت راه‌آهن سراسری، تأسیس دانشگاه تهران، دادگستری، ثبت احوال، جاده چالوس و ارتش نوین ایران از دستاوردهای دوران اوست.",
            achievements = listOf(
                "احداث راه‌آهن سراسری شمال-جنوب",
                "تأسیس دانشگاه تهران و بانک ملی",
                "لغو کاپیتولاسیون و ایجاد ثبت اسناد و املاک"
            ),
            famousQuote = "پیشرفت ایران تنها با علم، قانون و تلاش خستگی‌ناپذیر میسر است.",
            symbolEmoji = "🛤️",
            imageResId = R.drawable.img_reza_shah_real_1787818372791
        ),
        SuperIranianHero(
            id = "arash_kamangir",
            namePersian = "آرش کمانگیر",
            titlePersian = "پهلوان اساطیری و جان‌نثار مرزهای ایران",
            eraPersian = "پیشدادیان (دوران اساطیری)",
            storyPersian = "آرش پهلوان کمانگیر ایرانی بود که در نبرد ایران و توران، برای تعیین مرز دو کشور بر بالای قزمازد رفت و تمام جان و توان خود را در چله تیر گذاشت. تیر او پس از پرواز طولانی بر درخت گردویی در کنار رود جیحون فرود آمد و مرز ایران فراخ گردید.",
            achievements = listOf(
                "جان‌نثاری جاودانه برای تعیین مرزهای مقدس ایران",
                "نماد فداکاری کامل برای میهن",
                "جشن تیرگان به یاد پرتاب تیر آرش"
            ),
            famousQuote = "جان من در این تیر است و برای ایران فدا می‌شود.",
            symbolEmoji = "🏹",
            imageResId = R.drawable.img_arash_epic_1788173427807
        ),
        SuperIranianHero(
            id = "babak_khorramdin",
            namePersian = "بابک خرمدین",
            titlePersian = "سردار دلاور آذربایجان و رهبر خرمدینان",
            eraPersian = "عباسیان / قرن دوم هجری",
            rolePersian = "فرمانده قیام قلعه بذ در اردبیل",
            storyPersian = "بابک خرمدین ۲۲ سال در قلعه بذ (آذربایجان) علیه خلافت عباسیان جنگید. او با شجاعت و تاکتیک‌های چریکی ده‌ها ارتش عباسی را شکست داد و تا آخرین لحظه مثله شدن دست و پا در بغداد، صورت خود را با خونش سرخ کرد تا دشمن زردی چهره‌اش را نبیند.",
            achievements = listOf(
                "۲۲ سال پایداری بی‌نظیر در قلعه بذ",
                "سرخ کردن صورت با خون خویش برای خوار کردن دشمن",
                "نماد پایداری و آزادی‌خواهی مردم ایران"
            ),
            famousQuote = "ترجیح می‌دهم یک روز مانند شیر زندگی کنم تا هزار سال مانند گوسفند.",
            symbolEmoji = "🦅",
            imageResId = R.drawable.img_babak_epic_1788173443057
        ),
        SuperIranianHero(
            id = "abbas_mirza_qajar",
            namePersian = "عباس میرزا قاجار",
            titlePersian = "نایب‌السلطنه شجاع ایران و اصلاح‌گر صنایع دفاعی",
            eraPersian = "قاجاریه (قرن ۱۹ میلادی)",
            rolePersian = "فرمانده کل ارتش ایران در جنگ‌های ایران و روس",
            storyPersian = "عباس میرزا نایب‌السلطنه شجاع و میهن‌پرست قاجار بود که در نبردهای قهرمانانه با ارتش روسیه تزاری برای حفظ آذربایجان و قفقاز فداکاری کرد. او نخستین کسی بود که به ضرورت نوسازی ارتش، ایجاد توپخانه مدرن، تأسیس کارخانه‌های باروت‌سازی و اعزام محصلان ایرانی به اروپا پی برد.",
            achievements = listOf(
                "فرماندهی دلاورانه سپاه ایران در نبردهای سخت با روسیه تزاری",
                "پایه‌گذاری ارتش مدرن نظام جدید در ایران",
                "اعزام نخستین گروه دانشجویان ایرانی به اروپا برای کسب علوم نوین"
            ),
            famousQuote = "کاش می‌دانستم علت پیشرفت اروپاییان و عقب‌ماندگی ما چیست تا ایران را سربلند سازم.",
            symbolEmoji = "🎖️",
            imageResId = R.drawable.img_abbas_mirza_hero_1786115898497
        ),
        SuperIranianHero(
            id = "sattar_khan",
            namePersian = "ستارخان (سردار ملی)",
            titlePersian = "سردار ملی، قهرمان جنبش مشروطه ایران و فاتح تبریز",
            eraPersian = "دوران مشروطیت (۱۲۸۷ - ۱۲۹۳ خورشیدی)",
            rolePersian = "فرمانده مجاهدین مشروطه‌خواه تبریز",
            storyPersian = "ستارخان قهرمان ملی جنبش مشروطه‌خواهی ایران است. در هنگامی که محمدعلی‌شاه استبداد صغیر را برقرار کرد و مجلس را به توپ بست، ستارخان در محله امیرخیز تبریز ۱۱ ماه در برابر سپاه قاجار و محاصره سخت مقاومت نمود، پرچم‌های تسلیم را پایین کشید و مشروطه ایران را زنده نگه داشت.",
            achievements = listOf(
                "ایستادگی ۱۱ ماهه حماسی در محاصره تبریز و نجات مشروطه ایران",
                "مقاومت در برابر استبداد محمدعلی‌شاه و زمینه‌سازی فتح تهران",
                "کسب لقب تاریخی «سردار ملی» از سوی مردم و انجمن تبریز"
            ),
            famousQuote = "من می‌خواهم هفت دولت زیر پرچم ایران باشد، نه اینکه پرچم بیگانه بالای سر ما باشد!",
            symbolEmoji = "🦁",
            imageResId = R.drawable.sattar_khan_real_photo_1787818395700
        ),
        SuperIranianHero(
            id = "sardar_asad",
            namePersian = "سردار اسعد بختیاری",
            titlePersian = "فاتح مشروطه، ایلخان مجاهد بختیاری و فتح‌کننده تهران",
            eraPersian = "دوران مشروطیت (۱۲۸۸ خورشیدی)",
            rolePersian = "فرمانده سپاه سواران بختیاری و وزیر مشروطه",
            storyPersian = "علی‌قلی‌خان سردار اسعد بختیاری از برجسته‌ترین رهبران جنبش مشروطه بود. او با گسیل داشتن سواران شجاع ایل بختیاری از اصفهان به سوی تهران، با همکاری مجاهدین شمال به رهبری سپهدار تنکابنی، تهران را فتح کرد، به استبداد محمدعلی‌شاه پایان داد و حکومت مشروطه را دوباره برپا ساخت.",
            achievements = listOf(
                "فرماندهی سواران بختیاری و فتح تاریخی تهران در سال ۱۲۸۸ خورشیدی",
                "اعاده مشروطیت و عزل محمدعلی شاه قاجار",
                "ترجمه و تالیف کتب متعدد تاریخی و فرهنگ‌دوستی"
            ),
            famousQuote = "ایمان سواران بختیاری، آزادی و حکومت قانون برای تمام ملت ایران است.",
            symbolEmoji = "🐎",
            imageResId = R.drawable.img_sardar_asaad_real_1787818453119
        ),
        SuperIranianHero(
            id = "ahmad_kasravi",
            namePersian = "احمد کسروی",
            nameEnglish = "Ahmad Kasravi",
            titlePersian = "مورخ برجسته مشروطه، حقوق‌دان، زبان‌شناس و پژوهشگر نواندیش",
            eraPersian = "عصر پهلوی اول و دوم (۱۲۶۹ - ۱۳۲۴ خورشیدی)",
            rolePersian = "نویسنده کتاب «تاریخ مشروطه ایران» و دادستان عدلیه",
            storyPersian = "احمد کسروی مورخ، نواندیش و دادستان برجسته ایرانی بود. کتاب «تاریخ مشروطه ایران» او مستندترین و دقیق‌ترین مرجع تاریخ مشروطیت ایران به شمار می‌رود. او همچنین پژوهش‌های بی‌نظیری درباره زبان آذری کهن، تاریخ ۵۰۰ ساله خوزستان و اصلاح ساختار عدلیه انجام داد.",
            achievements = listOf(
                "نگارش شاهکار ماندگار «تاریخ مشروطه ایران»",
                "اثبات علمی ریشه زبان‌های ایرانی آذربایجان (زبان آذری کهن)",
                "خدمت صادقانه در دادگستری و مبارزه با خرافات"
            ),
            famousQuote = "تاریخ، آینه بیداری ملت‌هاست و ملتی که تاریخ خود را نداند بار دیگر محکوم به تکرار اشتباهات است.",
            symbolEmoji = "📜",
            imageResId = R.drawable.img_kasravi_historian_1787818465741
        ),
        SuperIranianHero(
            id = "fereydoun_izadseta",
            namePersian = "سرهنگ خلبان فریدون ایزدستا",
            titlePersian = "طراح نابغه عملیات تاریخی اچ سه (حمله به پایگاه‌های الولید)",
            eraPersian = "دفاع مقدس (۱۳۶۰ خورشیدی)",
            rolePersian = "معاون عملیاتی نیروی هوایی و طراح پیچیده‌ترین عملیات هوایی جهان",
            storyPersian = "سرهنگ خلبان فریدون ایزدستا طراح برجسته عملیات شگفت‌انگیز اچ سه بود. در ۱۵ فروردین ۱۳۶۰، ۸ فروند جنگنده بمب‌افکن اف چهار فانتوم ارتش ایران با ۴ مرحله سوخت‌گیری هوایی پیچیده و پرواز در ارتفاع بسیار پایین، بیش از ۴۸ فروند هواپیمای دشمن را در دوردست‌ترین پایگاه الولید (اچ سه) در مرز اردن نابود کردند بدون آنکه هیچ‌گونه تلفاتی بدهند.",
            achievements = listOf(
                "طراحی شگفت‌انگیز عملیات اچ سه (بزرگ‌ترین و موفق‌ترین عملیات هوایی تاریخ جنگ‌ها)",
                "انجام ۴ مرحله سوخت‌گیری هوایی و راهبری جنگنده‌های اف چهار تا مرزهای دوردست",
                "طراحی عملیات‌های متعدد دفاع هوایی و پشتیبانی از رزمندگان"
            ),
            famousQuote = "با ایمان و دانش هوانوردی، دوردست‌ترین پایگاه‌های دشمن نیز در تیررس عقابان ایران است.",
            symbolEmoji = "✈️",
            imageResId = R.drawable.izadseta_real_1786387012251
        ),
        SuperIranianHero(
            id = "nader_jahanbani",
            namePersian = "سپهبد خلبان نادر جهانبانی",
            titlePersian = "عقاب طلایی ایران، بنیان‌گذار تیم آکروجت تاج طلایی",
            eraPersian = "دوران پهلوی (۱۳۰۷ - ۱۳۵۷ خورشیدی)",
            rolePersian = "فرمانده تیم آکروجت تاج طلایی و معاون نیروی هوایی",
            storyPersian = "سپهبد نادر جهانبانی معروف به «عقاب طلایی»، از زبده‌ترین خلبانان تاریخ هوانوردی جهان بود. او پس از تحصیل در آلمان و آمریکا، تیم آکروجت «تاج طلایی» ایران را بنیان گذاشت که در مسابقات بین‌المللی نمایش‌های هوایی، شگفت‌انگیزترین مانورها را اجرا می‌کردند و نیروی هوایی ایران را به مدرن‌ترین سطح در خاورمیانه رساندند.",
            achievements = listOf(
                "بنیان‌گذاری تیم آکروجت تاج طلایی ایران و کسب رتبه‌های جهانی",
                "تربیت نسل برجسته‌ای از خلبانان شجاع و تاکتیکی نیروی هوایی",
                "ارتقای سطح فنی و عملیاتی خلبانی ایران به استانداردهای جهانی"
            ),
            famousQuote = "آسمان ایران متعلق به فرزندان شجاع این مرزوبوم است.",
            symbolEmoji = "🦅",
            imageResId = R.drawable.img_jahanbani_airforce_1787818440191
        )
    )

    fun getTimelineEvents(): List<TimelineEvent> = listOf(
        TimelineEvent(
            id = "t0",
            year = "۷۲۸ پیش از میلاد",
            yearNumeric = -728,
            titlePersian = "بنیان‌گذاری پادشاهی مادها در هگمتانه",
            descriptionPersian = "دیاکو با اتحاد قبایل ماد، نخستین دولت سراسری ایران‌زمین را در هگمتانه (همدان) تاسیس کرد.",
            dynastyName = "مادها",
            kingName = "دیاکو"
        ),
        TimelineEvent(
            id = "t1",
            year = "۵۵۰ پیش از میلاد",
            yearNumeric = -550,
            titlePersian = "بنیان‌گذاری شاهنشاهی هخامنشی",
            descriptionPersian = "کوروش بزرگ با پیروزی بر آستیاگ پادشاه ماد، نخستین امپراتوری جهانی را پایه‌گذاری کرد.",
            dynastyName = "هخامنشیان",
            kingName = "کوروش بزرگ"
        ),
        TimelineEvent(
            id = "t2",
            year = "۵۳۹ پیش از میلاد",
            yearNumeric = -539,
            titlePersian = "فتح بابل و صدور منشور حقوق بشر",
            descriptionPersian = "ورود مسالمت‌آمیز کوروش به بابل و نگارش نخستین استوانه حقوق بشر جهان.",
            dynastyName = "هخامنشیان",
            kingName = "کوروش بزرگ"
        ),
        TimelineEvent(
            id = "t3",
            year = "۵۱۸ پیش از میلاد",
            yearNumeric = -518,
            titlePersian = "آغاز ساخت کاخ تخت جمشید (پارسه)",
            descriptionPersian = "داریوش بزرگ دستور ساخت با عظمت‌ترین بنای معماری سنگی جهان باستان را داد.",
            dynastyName = "هخامنشیان",
            kingName = "داریوش بزرگ"
        ),
        TimelineEvent(
            id = "t3_b",
            year = "۳۳۰ پیش از میلاد",
            yearNumeric = -330,
            titlePersian = "نبرد دربند پارس و حماسه آریوبرزن",
            descriptionPersian = "ایستادگی حماسی آریوبرزن و خواهرش یوتاب در برابر سپاه مقدونی برای دفاع از پارسه.",
            dynastyName = "هخامنشیان",
            kingName = "آریوبرزن / داریوش سوم"
        ),
        TimelineEvent(
            id = "t4",
            year = "۲۴۷ پیش از میلاد",
            yearNumeric = -247,
            titlePersian = "تأسیس امپراتوری اشکانیان",
            descriptionPersian = "ارشک یکم با مبارزه علیه سلوکیان، حکومت پارتی اشکانی را بنیان گذاشت.",
            dynastyName = "اشکانیان",
            kingName = "ارشک یکم"
        ),
        TimelineEvent(
            id = "t5",
            year = "۵۳ پیش از میلاد",
            yearNumeric = -53,
            titlePersian = "نبرد کاره و پیروزی سورنا بر سپاه روم",
            descriptionPersian = "سپهبد سورنا با تاکتیک تیراندازی پارتی، سپاه سنگین کراسوس امپراتور روم را شکست داد.",
            dynastyName = "اشکانیان",
            kingName = "مهرداد دوم / سورنا"
        ),
        TimelineEvent(
            id = "t5_b",
            year = "۲۲۴ میلادی",
            yearNumeric = 224,
            titlePersian = "بنیان‌گذاری شاهنشاهی ساسانیان",
            descriptionPersian = "اردشیر بابکان با شکست اردوان پنجم اشکانی، امپراتوری ساسانی را در فیروزآباد پایه‌گذاری نمود.",
            dynastyName = "ساسانیان",
            kingName = "اردشیر بابکان"
        ),
        TimelineEvent(
            id = "t6",
            year = "۲۶۰ میلادی",
            yearNumeric = 260,
            titlePersian = "اسارت والریان امپراتور روم به دست شاپور یکم",
            descriptionPersian = "اوج اقتدار ساسانیان با شکست روم و ثبت کتیبه‌های تاریخی در نقش رستم.",
            dynastyName = "ساسانیان",
            kingName = "شاپور یکم"
        ),
        TimelineEvent(
            id = "t6_b",
            year = "۵۳۱ میلادی",
            yearNumeric = 531,
            titlePersian = "عصر دادگری خسرو انوشیروان و تاسیس دانشگاه گندی‌شاپور",
            descriptionPersian = "شکوفایی علمی و پزشکی ایران با تاسیس دانشگاه گندی‌شاپور و اصلاحات مالیاتی خسرو انوشیروان.",
            dynastyName = "ساسانیان",
            kingName = "خسرو انوشیروان"
        ),
        TimelineEvent(
            id = "t7",
            year = "۸۶۷ میلادی",
            yearNumeric = 867,
            titlePersian = "رسمیت یافتن زبان فارسی توسط یعقوب لیث",
            descriptionPersian = "یعقوب لیث صفاری زبان پارسی را زبان رسمی دیوان‌ها و دربارهای ایران اعلام کرد.",
            dynastyName = "صفاریان",
            kingName = "یعقوب لیث صفاری"
        ),
        TimelineEvent(
            id = "t8",
            year = "۸۹۲ میلادی",
            yearNumeric = 892,
            titlePersian = "رنسانس زبان و ادبیات پارسی در عصر سامانیان",
            descriptionPersian = "بخارا به مرکز شعر پارسی تبدیل شد و رودکی و فردوسی آثار جاودان خلق نمودند.",
            dynastyName = "سامانیان",
            kingName = "امیر اسماعیل سامانی"
        ),
        TimelineEvent(
            id = "t8_b",
            year = "۹۳۴ میلادی",
            yearNumeric = 934,
            titlePersian = "تسخیر بغداد توسط آل‌بویه و احیای هویت ایرانی",
            descriptionPersian = "برادران بویهی با فتح بغداد، اقتدار ایرانی را بر دستگاه خلافت عباسی حاکم ساختند.",
            dynastyName = "آل بویه",
            kingName = "عضدالدوله دیلمی"
        ),
        TimelineEvent(
            id = "t8_c",
            year = "۱۰۷۱ میلادی",
            yearNumeric = 1071,
            titlePersian = "نبرد ملازگرد و پیروزی سلجوقیان",
            descriptionPersian = "آلپ ارسلان با شکست امپراتور بیزانس (روم شرقی)، مرزهای ایران سلجوقی را تا آناطولی گسترش داد.",
            dynastyName = "سلجوقیان",
            kingName = "آلپ ارسلان سلجوقی"
        ),
        TimelineEvent(
            id = "t8_d",
            year = "۱۲۲۱ میلادی",
            yearNumeric = 1221,
            titlePersian = "پایداری حماسی سلطان جلال‌الدین در نبرد پروان",
            descriptionPersian = "ایستادگی سلطان جلال‌الدین خوارزمشاه در برابر چنگیزخان مغول و نجات شرف ملی ایران.",
            dynastyName = "خوارزمشاهیان",
            kingName = "جلال‌الدین خوارزمشاه"
        ),
        TimelineEvent(
            id = "t8_e",
            year = "۱۵۰۱ میلادی",
            yearNumeric = 1501,
            titlePersian = "رسمیت تشیع و یکپارچه‌سازی تمامیت ارضی ایران",
            descriptionPersian = "شاه اسماعیل یکم صفوی در تبریز تاج‌گذاری نمود و ایران فروپاشیده را پس از ۹۰۰ سال یکپارچه کرد.",
            dynastyName = "صفویان",
            kingName = "شاه اسماعیل یکم"
        ),
        TimelineEvent(
            id = "t9",
            year = "۱۵۹۸ میلادی",
            yearNumeric = 1598,
            titlePersian = "پایتختی اصفهان و ساخت میدان نقش جهان",
            descriptionPersian = "شاه عباس صفوی اصفهان را پایتخت کرد و زیباترین مجموعه شهری دنیا را پدید آورد.",
            dynastyName = "صفویان",
            kingName = "شاه عباس بزرگ"
        ),
        TimelineEvent(
            id = "t10",
            year = "۱۷۳۹ میلادی",
            yearNumeric = 1739,
            titlePersian = "نبرد کرنال و ورود نادرشاه به دهلی",
            descriptionPersian = "پیروزی نادرشاه افشار و انتقال جواهرات سلطنتی کوه نور و دریای نور به ایران.",
            dynastyName = "افشاریان",
            kingName = "نادرشاه افشار"
        ),
        TimelineEvent(
            id = "t10_b",
            year = "۱۷۶۰ میلادی",
            yearNumeric = 1760,
            titlePersian = "فرمانروایی دادگرانه کریم‌خان زند و شکوفایی شیراز",
            descriptionPersian = "سازندگی مجموعه تاریخی وکیل در شیراز و احیای امنیت و رفاه پس از سال‌ها جنگ.",
            dynastyName = "زندیه",
            kingName = "کریم‌خان زند"
        ),
        TimelineEvent(
            id = "t10_c",
            year = "۱۹۰۶ میلادی",
            yearNumeric = 1906,
            titlePersian = "پیروزی جنبش مشروطیت ایران",
            descriptionPersian = "امضای فرمان مشروطیت، تاسیس مجلس شورای ملی و آغاز قانون‌گرایی در عصر قاجار.",
            dynastyName = "قاجاریه",
            kingName = "مظفرالدین‌شاه قاجار"
        ),
        TimelineEvent(
            id = "t11",
            year = "۱۹۳۸ میلادی",
            yearNumeric = 1938,
            titlePersian = "افتتاح راه‌آهن سراسری و دانشگاه تهران",
            descriptionPersian = "تحول مدرن زیرساخت‌های ایران توسط رضاشاه پهلوی و اتصال خلیج فارس به خزر.",
            dynastyName = "دودمان پهلوی",
            kingName = "رضاشاه پهلوی"
        ),
        TimelineEvent(
            id = "t11_b",
            year = "۱۹۵۱ میلادی",
            yearNumeric = 1951,
            titlePersian = "ملی شدن صنعت نفت ایران",
            descriptionPersian = "تصویب قانون ملی شدن صنعت نفت با همکاری دکتر محمد مصدق و محمدرضاشاه پهلوی.",
            dynastyName = "دودمان پهلوی",
            kingName = "محمدرضاشاه پهلوی / دکتر مصدق"
        ),
        TimelineEvent(
            id = "t12",
            year = "۱۹۷۹ میلادی",
            yearNumeric = 1979,
            titlePersian = "پیروزی انقلاب اسلامی ۱۳۵۷",
            descriptionPersian = "پایان نظام سلطنتی ۲۵۰۰ ساله و بنیان‌گذاری جمهوری اسلامی ایران به رهبری امام خمینی.",
            dynastyName = "جمهوری اسلامی ایران",
            kingName = "سید روح‌الله خمینی"
        )
    )

    fun getQuotes(): List<Quote> = listOf(
        Quote(
            id = "q1",
            textPersian = "منم کوروش، شاه جهان، شاه بزرگ، شاه دادگر. وقتی که بدون جنگ و پیکار وارد بابل شدم، همه مردم گام‌های مرا با شادی پذیرفتند.",
            textEnglish = "I am Cyrus, king of the world, great king, righteous king.",
            authorPersian = "کوروش بزرگ",
            dynastyPersian = "هخامنشیان",
            sourcePersian = "استوانه کوروش بزرگ"
        ),
        Quote(
            id = "q2",
            textPersian = "اهورامزدا این کشور را از دشمن، از خشکسالی و از دروغ بپاید.",
            textEnglish = "May Ahura Mazda protect this land from enemy, from famine, and from falsehood.",
            authorPersian = "داریوش بزرگ",
            dynastyPersian = "هخامنشیان",
            sourcePersian = "کتیبه داریوش در تخت جمشید"
        ),
        Quote(
            id = "q3",
            textPersian = "فرمان دادم که هیچ‌کس مردم شهر را از هستی ساقط نکند و همه معابد و خانه دین‌داران ایمن باشد.",
            authorPersian = "خشایارشاه بزرگ",
            dynastyPersian = "هخامنشیان",
            sourcePersian = "کتیبه کعبه زرتشت"
        ),
        Quote(
            id = "q4",
            textPersian = "چیزی که من اندر نیابم چرا باید گفت؟ شعر به پارسی گویید تا من بفهمم.",
            authorPersian = "یعقوب لیث صفاری",
            dynastyPersian = "صفاریان",
            sourcePersian = "تاریخ سیستان"
        ),
        Quote(
            id = "q5",
            textPersian = "پادشاهی بدون دادگری، همچون جویبار بدون آب و درختی بدون میوه است.",
            authorPersian = "خسرو انوشیروان",
            dynastyPersian = "ساسانیان",
            sourcePersian = "پندنامه انوشیروان"
        ),
        Quote(
            id = "q6",
            textPersian = "تا هنگامی که من زنده‌ام، باروی شهر بخارا من هستم.",
            authorPersian = "امیر اسماعیل سامانی",
            dynastyPersian = "سامانیان",
            sourcePersian = "تاریخ بخارا"
        ),
        Quote(
            id = "q7",
            textPersian = "مرا شاه مخوانید! من وکیل‌الرعایا و خادم این مردم رنج‌دیده هستم.",
            authorPersian = "کریم‌خان زند",
            dynastyPersian = "زندیه",
            sourcePersian = "تاریخ گیتی‌گشا"
        ),
        Quote(
            id = "q8",
            textPersian = "شمشیر من پاسدار مرزهای ایران است، نه تخت سلطنت.",
            authorPersian = "نادرشاه افشار",
            dynastyPersian = "افشاریان",
            sourcePersian = "جهانگشای نادری"
        )
    )
}
