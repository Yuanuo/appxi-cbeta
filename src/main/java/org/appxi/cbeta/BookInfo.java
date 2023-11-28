package org.appxi.cbeta;

import java.util.HashMap;
import java.util.Map;

public final class BookInfo {
    public static final Map<String, BookInfo> data = new HashMap<>(6000);

    static {
        addA();
        addB();
        addC();
        addD();
        addF();
        addG();
        addI();
        addJ();
        addK();
        addL();
        addM();
        addN();
        addP();
        addS();
        addT();
        addT1000();
        addT2000();
        addU();
        addX();
        addY();
        addZ();
    }

    public static void add(Object... kvPairs) {
        for (int i = 0; i < kvPairs.length; ) {
            BookInfo.data.put((String) kvPairs[i++], (BookInfo) kvPairs[i++]);
        }
    }

    private static void addA() {
        add(
                "A1057", new BookInfo("新譯大方廣佛華嚴經音義", new String[]{"唐"}, "慧菀"), // 唐 慧菀述
                "A1267", new BookInfo("大唐開元釋教廣品歷章", new String[]{"唐"}, "玄逸"), // 唐 玄逸撰
                "A1490", new BookInfo("天聖釋教總錄", new String[]{"宋"}, "惟淨"), // 宋 惟淨等編修
                "A1493", new BookInfo("大中祥符法寶錄", new String[]{"宋"}, "楊億"), // 宋 楊億等編修
                "A1494", new BookInfo("景祐新修法寶錄", new String[]{"宋"}, "呂夷簡"), // 宋 呂夷簡等編修
                "A1504", new BookInfo("佛說大乘僧伽吒法義經", new String[]{"宋"}, "金總持"), // 宋 金總持等譯
                "A1505", new BookInfo("佛說清淨毘奈耶最上大乘經", new String[]{"宋"}, "智吉祥"), // 宋 智吉祥等譯
                "A1548", new BookInfo("因明論理門十四過類疏", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "A1561", new BookInfo("瑜伽師地論義演", new String[]{"唐"}, "清素", "澄淨") // 唐 清素．澄淨述
        );
    }

    private static void addB() {
        add(
                "B0001", new BookInfo("均如大師華嚴學全書", null, "均如", "金知見"), // 均如著　金知見編
                "B0002", new BookInfo("華嚴經疏論纂要", null, "道霈"), // 道霈編
                "B0003", new BookInfo("南傳長部經典", null, "江鍊百"), // 江鍊百譯
                "B0004", new BookInfo("南傳中部經典", null, "芝峯"), // 芝峯譯
                "B0005", new BookInfo("南傳小部經典", null, "夏丏尊"), // 夏丏尊譯
                "B0006", new BookInfo("泰國大藏經小部經", null, "黃謹良"), // 黃謹良譯
                "B0007", new BookInfo("發趣論", null, "范寄東"), // 范寄東譯
                "B0008", new BookInfo("大發趣論註", null, "覺音", "范寄東"), // 覺音造　范寄東譯
                "B0009", new BookInfo("冠導阿毗達磨俱舍論", null, "佐伯旭雅"), // 佐伯旭雅編
                "B0010", new BookInfo("南傳轉法輪經", null, "丘哌博"), // 丘哌博譯
                "B0011", new BookInfo("轉法輪經", null, "岫廬"), // 岫廬譯
                "B0012", new BookInfo("三寶經", null, "法舫"), // 法舫譯
                "B0013", new BookInfo("吉祥經", null, "法舫"), // 法舫譯
                "B0014", new BookInfo("婆羅門正法經", null, "法舫"), // 法舫譯
                "B0015", new BookInfo("南傳羯臘摩經", null, "丘寶光", "徐鄂雲"), // 丘寶光．徐鄂雲同譯
                "B0016", new BookInfo("南傳大悲經", null, "法舫"), // 法舫譯
                "B0017", new BookInfo("南傳法句經", null, "了參"), // 了參譯
                "B0018", new BookInfo("南傳大般湼槃經", null, "巴宙"), // 巴宙譯
                "B0019", new BookInfo("南傳念安般經", null, "湯用彤"), // 湯用彤譯
                "B0020", new BookInfo("隨念三寶經淺說", new String[]{"现代"}, "法尊", "雲根"), // 法尊口述 雲根記
                "B0021", new BookInfo("毒語心經", null, "白隱慧鶴", "南天棒鄧州"), // 白隱慧鶴註釋 南天棒鄧州提唱
                "B0022", new BookInfo("新譯薄伽梵母智慧到彼岸心經詮釋", null, "貢噶呼圖克圖"), // 貢噶呼圖克圖譯
                "B0023", new BookInfo("金剛般若波羅蜜經講義", null, "江味農"), // 江味農著
                "B0024", new BookInfo("佛說阿彌陀經註釋會要", null, "鳩摩羅什", "法舫"), // 鳩摩羅什譯　法舫譯
                "B0025", new BookInfo("阿毗達摩攝義論", null, "阿耨樓陀", "法舫"), // 阿耨樓陀造　法舫譯
                "B0026", new BookInfo("四分比丘尼戒本註解", null, "佛瑩"), // 佛瑩編
                "B0027", new BookInfo("瑜伽師地論戒品纂釋", new String[]{"明"}, "宗喀巴", "湯薌銘"), // 宗喀巴釋論　湯薌銘譯纂
                "B0028", new BookInfo("菩提正道菩薩戒論", new String[]{"明"}, "宗喀巴", "湯薌銘"), // 宗喀巴造　湯薌銘譯
                "B0029", new BookInfo("菩薩戒品釋", new String[]{"现代"}, "宗喀巴", "法尊"), // 宗喀巴造　法尊譯
                "B0030", new BookInfo("現觀莊嚴論中八品七十義略解", new String[]{"现代"}, "法尊"), // 法尊述
                "B0031", new BookInfo("現觀莊嚴論略釋", new String[]{"现代"}, "彌勒", "法尊"), // 彌勒造頌 法尊譯釋
                "B0032", new BookInfo("七十空性論科攝", new String[]{"现代"}, "龍樹", "法尊", "弘悲"), // 龍樹造 法尊譯 弘悲科攝
                "B0033", new BookInfo("大乘修心七義論釋", new String[]{"古印度"}, "無著賢", "慧海"), // 無著造 慧海等譯
                "B0034", new BookInfo("辨法法性論", new String[]{"现代"}, "彌勒", "法尊"), // 彌勒造 法尊譯
                "B0035", new BookInfo("西藏傳本攝大乘論", new String[]{"古印度", "民國"}, "無著", "呂澂"), // 無著造 呂澂譯
                "B0036", new BookInfo("三自性論", new String[]{"古印度"}, "世親", "劉孝蘭"), // 世親造 劉孝蘭譯
                "B0037", new BookInfo("集量論釋略抄", new String[]{"民國"}, "呂澂"), // 呂澂輯
                "B0038", new BookInfo("安慧三十唯識釋略抄", new String[]{"民國"}, "呂澂"), // 呂澂輯
                "B0039", new BookInfo("觀所緣釋論會譯", new String[]{"民國"}, "呂澂", "印滄"), // 呂澂．印滄編
                "B0040", new BookInfo("集量論略解", new String[]{"现代"}, "陳那", "法尊"), // 陳那著 法尊譯編
                "B0041", new BookInfo("正理滴論（譯自梵文本）", null, "法稱", "王森"), // 法稱著 王森譯
                "B0042", new BookInfo("正理滴論（譯自西藏文本）", null, "法稱", "楊化群"), // 法稱著 楊化群譯
                "B0043", new BookInfo("釋量論略解", new String[]{"现代"}, "法稱", "僧成", "法尊"), // 法稱著 僧成釋 法尊譯
                "B0044", new BookInfo("入中論善顯密意疏", new String[]{"现代"}, "宗喀巴", "法尊"), // 宗喀巴造 法尊譯
                "B0045", new BookInfo("入中論講記", new String[]{"现代"}, "月稱", "法尊"), // 月稱造頌 法尊譯講
                "B0046", new BookInfo("中論略義", new String[]{"明"}, "宗喀巴", "潭影"), // 宗喀巴著 潭影譯
                "B0047", new BookInfo("中論文句釋", null, "僧成", "常浩"), // 僧成釋 常浩譯
                "B0048", new BookInfo("辨了不了義善說藏論", new String[]{"现代"}, "宗喀巴", "法尊"), // 宗喀巴造 法尊譯
                "B0049", new BookInfo("菩提道炬論", null, "阿底霞", "超一"), // 阿底霞造 超一譯
                "B0050", new BookInfo("地道建立", new String[]{"现代"}, "三寶無畏王", "法尊"), // 三寶無畏王造 法尊譯
                "B0051", new BookInfo("菩提道次恒修教授", new String[]{"现代"}, "札迦", "法尊"), // 札迦說 法尊譯
                "B0052", new BookInfo("緣起讚", new String[]{"现代"}, "宗喀巴", "法尊"), // 宗喀巴著 法尊譯
                "B0053", new BookInfo("集諸學頌", null, "寂靜", "超一"), // 寂靜造 超一譯
                "B0054", new BookInfo("菩提道次第論攝頌", new String[]{"明"}, "宗喀巴", "超一"), // 宗喀巴造 超一譯
                "B0055", new BookInfo("菩提道次第論極略頌", new String[]{"明"}, "宗喀巴", "超一"), // 宗喀巴著 超一譯
                "B0056", new BookInfo("西藏法寶貫珠", null, "達瓦桑杜", "伊文思溫慈", "趙洪鑄"), // 達瓦桑杜譯英 伊文思溫慈編註 趙洪鑄譯漢
                "B0057", new BookInfo("密宗道次第論", new String[]{"现代"}, "克主", "法尊"), // 克主著 法尊譯
                "B0058", new BookInfo("涅般道大手印瑜伽法要釋", null, "白蓮花", "光明心"), // 白蓮花造 光明心譯
                "B0059", new BookInfo("明行道六成就法", null, "珀瑪迦爾", "張妙定蓮菩提金剛正"), // 珀瑪迦爾著 張妙定蓮菩提金剛正譯
                "B0060", new BookInfo("頗哇心要轉識自在法", null, "達瓦桑杜", "伊文思溫慈", "張妙定蓮菩提金剛正"), // 達瓦桑杜譯英 伊文思溫慈纂集 張妙定蓮菩提金剛正譯漢
                "B0061", new BookInfo("椎擊三要訣勝法解", null, "大善解功德主", "貢噶", "滿空"), // 大善解功德主著 貢噶傳 滿空譯
                "B0062", new BookInfo("貢噶上師恒河大手印直講", null, "貢噶"), // 貢噶講
                "B0063", new BookInfo("大密妙義深道六法引導廣論纂要", null, "吉祥", "鍾伯毅"), // 吉祥造 鍾伯毅纂
                "B0064", new BookInfo("大圓滿", new String[]{"现代"}, "郭元興", "慈威"), // 郭元興著 慈威校註
                "B0065", new BookInfo("菩提道次第略論", new String[]{"明"}, "宗喀巴", "邢肅芝"), // 宗喀巴著 邢肅芝譯
                "B0066", new BookInfo("菩提道次第直講", new String[]{"明"}, "宗喀巴", "大勇", "智湛"), // 宗喀巴著 大勇口譯 智湛筆錄
                "B0067", new BookInfo("菩提道次第廣論", new String[]{"现代"}, "宗喀巴", "法尊"), // 宗喀巴著 法尊譯
                "B0068", new BookInfo("密宗道次第廣論", new String[]{"现代"}, "宗喀巴", "法尊"), // 宗喀巴著 法尊譯
                "B0069", new BookInfo("七系付法傳", new String[]{"现代"}, "多羅那他", "郭元興"), // 多羅那他著 郭元興譯
                "B0070", new BookInfo("安樂妙寶", null, "金慧暢"), // 金慧暢編
                "B0071", new BookInfo("蓮華生大士應化史略", null, "諾那呼圖克圖逞列匠磋"), // 諾那呼圖克圖逞列匠磋譯
                "B0072", new BookInfo("阿底峽尊者傳", new String[]{"现代"}, "法尊"), // 法尊譯述
                "B0073", new BookInfo("木納記", null, "惹穹多傑札把", "多傑", "張心若"), // 惹穹多傑札把著 多傑譯述 張心若筆錄
                "B0074", new BookInfo("宗喀巴大師傳", new String[]{"现代"}, "法尊"), // 法尊譯述
                "B0075", new BookInfo("西藏王臣護法記", null, "第五世達賴喇嘛", "郭和卿"), // 第五世達賴喇嘛著 郭和卿譯
                "B0076", new BookInfo("印度佛教史", null, "達喇那他", "王沂暖"), // 達喇那他著 王沂暖譯
                "B0077", new BookInfo("洛陽伽藍記校釋", null, "楊衒之", "周祖謨"), // 楊衒之著 周祖謨校釋
                "B0078", new BookInfo("洛陽伽藍記校注", null, "楊衒之", "范祥雍"), // 楊衒之著 范祥雍校注
                "B0079", new BookInfo("釋氏六帖", null, "義楚"), // 義楚集
                "B0080", new BookInfo("大唐西域記", null, "玄奘", "辯機"), // 玄奘口述 辯機編纂
                "B0081", new BookInfo("雙峰山曹侯溪寶林傳", null, "智炬"), // 智炬著
                "B0082", new BookInfo("傳燈玉英集", null, "王隨"), // 王隨編
                "B0084", new BookInfo("藏逸經書標目", null, "密藏"), // 密藏編
                "B0085", new BookInfo("憨山大師年譜疏註", null, "福善", "福徵"), // 福善記錄 福徵述疏
                "B0086", new BookInfo("南朝寺考", null, "劉世珩"), // 劉世珩著
                "B0087", new BookInfo("合訂天台三聖二和詩集", null, "寒山", "豐干", "拾得", "梵琦", "濟岳"), // 寒山．豐干．拾得原詩 梵琦．濟岳和
                "B0088", new BookInfo("古今圖書集成選輯（上）", null), //
                "B0089", new BookInfo("太平廣記選輯", null, "李昉"), // 李昉等編纂
                "B0090", new BookInfo("酉陽雜俎選輯", null, "段成式"), // 段成式著
                "B0091", new BookInfo("正史選輯", null), //
                "B0092", new BookInfo("唐會要、五代會要、明書、明會典選輯", null), //
                "B0093", new BookInfo("象教皮編", null, "陳士元"), // 陳士元編
                "B0094", new BookInfo("冊府元龜選輯", null, "王欽若", "楊億"), // 王欽若、楊億等著
                "B0095", new BookInfo("入唐求法巡禮行記", null, "圓仁"), // 圓仁著
                "B0096", new BookInfo("佛教繪畫史料", null), //
                "B0097", new BookInfo("歸元鏡", null, "智達"), // 智達著
                "B0098", new BookInfo("高旻寺規約", null, "來果"), // 來果著
                "B0099", new BookInfo("相宗絡索", null, "王夫之"), // 王夫之著
                "B0101", new BookInfo("絕觀論", null, "菩提達磨"), // 菩提達磨（？）著
                "B0103", new BookInfo("禪林象器箋", null, "無著道忠"), // 無著道忠著
                "B0116", new BookInfo("金剛般若波羅蜜經集註", null, "明成祖朱棣"), // 明成祖朱棣集註
                "B0117", new BookInfo("三藏法數", null, "一如", "丁福保"), // 一如等編 丁福保重校
                "B0118", new BookInfo("律宗燈譜", null, "源諒", "劉霞彩"), // 源諒著 劉霞彩編
                "B0119", new BookInfo("天然和尚年譜", null, "汪宗衍"), // 江宗衍著
                "B0130", new BookInfo("靈峰宗論", null, "智旭"), // 智旭著
                "B0131", new BookInfo("法海觀瀾", null, "智旭"), // 智旭輯
                "B0132", new BookInfo("尚直編", null, "空谷景隆"), // 空谷景隆著
                "B0133", new BookInfo("尚理編", null, "空谷景隆"), // 空谷景隆著
                "B0134", new BookInfo("闢邪集", null, "鍾始聲"), // 鍾始聲著
                "B0135", new BookInfo("蒲室集", null, "笑隱大訢"), // 笑隱大訢著
                "B0136", new BookInfo("選佛譜", null, "智旭"), // 智旭著
                "B0137", new BookInfo("正名錄", null, "智楷"), // 智楷著
                "B0138", new BookInfo("開元寺志", null, "元賢"), // 元賢纂修
                "B0139", new BookInfo("獻花巖志", null, "陳沂"), // 陳沂著
                "B0140", new BookInfo("雪峰志", null, "徐𤊹"), // 徐𤊹纂輯
                "B0141", new BookInfo("嵩山少林寺輯志", null, "傅梅"), // 輯自傅梅撰《嵩書》
                "B0142", new BookInfo("新校定的敦煌寫本神會和尚遺著兩種", null, "胡適"), // 胡適校定
                "B0143", new BookInfo("神會和尚語錄的第三個敦煌寫本：南陽和尚問答雜徵義", null, "劉澄", "胡適"), // 胡適校定
                "B0144", new BookInfo("祖堂集", null, "靜師", "筠禪師"), // 靜、筠二禪德編著
                "B0145", new BookInfo("天目中峰廣錄", null, "中峰明本"), // 中峰明本著
                "B0146", new BookInfo("房山雲居寺石經──經文、題記、碑銘等拓片之選輯", null), //
                "B0147", new BookInfo("三階教殘卷", null, "矢吹慶輝"), // 矢吹慶輝輯
                "B0148", new BookInfo("東坡禪喜集", null, "徐長孺"), // 徐長孺輯
                "B0149", new BookInfo("鳴道集說", null, "李屏山"), // 李屏山著
                "B0150", new BookInfo("道餘錄", null, "姚廣孝"), // 姚廣孝著
                "B0151", new BookInfo("新續高僧傳", null, "喻謙"), // 喻謙著
                "B0152", new BookInfo("普濟玉琳國師語錄", null, "音緯"), // 音緯等編
                "B0153", new BookInfo("法藏碎金錄", null, "晁逈"), // 晁逈著
                "B0155", new BookInfo("聖朝破邪集", null, "徐昌治"), // 徐昌治編
                "B0156", new BookInfo("佛法金湯", null, "屠隆"), // 屠隆著
                "B0157", new BookInfo("楊仁山居士遺著", null, "楊文會"), // 楊文會著
                "B0158", new BookInfo("陰騭文圖", null, "費丹旭", "許光清"), // 費丹旭繪圖 許光清集證
                "B0159", new BookInfo("了凡四訓", null, "袁了凡"), // 袁了凡著
                "B0160", new BookInfo("金陵梵剎志", null, "葛寅亮"), // 葛寅亮著
                "B0161", new BookInfo("武林梵志", null, "吳之鯨"), // 吳之鯨著
                "B0163", new BookInfo("重修曹溪通志", null, "馬元", "釋真樸"), // 馬元、釋真樸重修
                "B0169", new BookInfo("朝鮮寺剎史料", null), //
                "B0170", new BookInfo("朝鮮佛教通史", null, "李能和"), // 李能和著
                "B0171", new BookInfo("八宗綱要鈔", null, "凝然"), // 凝然述
                "B0172", new BookInfo("出定後語", null, "富永仲基"), // 富永仲基著
                "B0173", new BookInfo("元亨釋書", null, "師鍊"), // 師鍊著
                "B0174", new BookInfo("參天台五台山記", null, "成尋"), // 成尋著
                "B0175", new BookInfo("喫茶養生記", null, "榮西"), // 榮西著
                "B0176", new BookInfo("四宗要文", null, "日朝", "英園"), // 日朝著 英園纂補
                "B0177", new BookInfo("本朝諸宗要集", null, "義觀"), // 義觀述
                "B0178", new BookInfo("東大寺六宗未決義", null), //
                "B0179", new BookInfo("八海含藏", null, "師鍊"), // 師鍊著
                "B0180", new BookInfo("華嚴通關", null, "定仙"), // 定仙著
                "B0181", new BookInfo("諸宗教理同異釋", null, "賴瑜"), // 賴瑜釋
                "B0182", new BookInfo("內典塵露章", null, "凝然"), // 凝然述
                "B0183", new BookInfo("禪祖念佛集", null, "慧中"), // 慧中集
                "B0184", new BookInfo("顯揚正法復古集", null, "普寂"), // 普寂著
                "B0185", new BookInfo("初學題額集", null, "良山"), // 良山集
                "B0186", new BookInfo("三國佛法傳通緣起", null, "凝然"), // 凝然述
                "B0187", new BookInfo("二障義", null, "元曉"), // 元曉著
                "B0189", new BookInfo("大華嚴一乘法界圖註并序", null, "雪岑"), // 雪岑著
                "B0190", new BookInfo("華嚴經釋題", null, "雪岑"), // 雪岑著
                "B0191", new BookInfo("義相法師法性偈", null, "有聞", "聖奎"), // 有聞科註 聖奎證正
                "B0192", new BookInfo("釋文紀", null, "梅鼎祚"), // 梅鼎祚輯
                "B0193", new BookInfo("吳都法乘", null, "周永年"), // 周永年編
                "B0194", new BookInfo("中華大藏經總目錄", null, "蔡念生"), // 蔡念生編
                "B0195", new BookInfo("頓悟大乘政理決", null, "王錫"), // 王錫著
                "B0196", new BookInfo("大乘中宗見解", null), //
                "B0197", new BookInfo("摩訶婆羅多的故事", null, "拉賈戈帕拉查理", "唐季雍"), // 拉賈戈帕拉查理改寫 唐季雍譯
                "B0198", new BookInfo("博伽梵歌", null, "雅蘇瑪蒂書達．踏薩"), // 雅蘇瑪蒂書達．踏薩譯
                "Ba001", new BookInfo("出版說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba002", new BookInfo("全書內容簡介", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba003", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba004", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba005", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba006", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba007", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba008", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba009", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba010", new BookInfo("洛陽伽藍記解題", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba011", new BookInfo("釋氏六帖解題", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba012", new BookInfo("大唐西域記解題", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba013", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba014", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba015", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba016", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba017", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba018", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba019", new BookInfo("禪林象器箋序", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba020", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba021", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba022", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba023", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba024", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba025", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba026", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba027", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba028", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba029", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba030", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba031", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba032", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba033", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba034", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba035", new BookInfo("吳都法乘簡介", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba036", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富"), // 藍吉富
                "Ba037", new BookInfo("編輯說明", new String[]{"现代"}, "藍吉富") // 藍吉富
        );
    }

    private static void addC() {
        add(
                "C1163", new BookInfo("一切經音義", new String[]{"唐"}, "玄應"), // 唐 玄應撰
                "C1169", new BookInfo("紹興重雕大藏音", new String[]{"宋"}, "處觀"), // 宋 處觀著
                "C1665", new BookInfo("菩薩名經", new String[]{"宋"}, "羅濬"), // 宋 羅濬集
                "C1666", new BookInfo("梵本大悲神咒", null), //
                "C1679", new BookInfo("御製佛賦", new String[]{"宋"}, "趙炅"), // 宋 趙炅撰
                "C1680", new BookInfo("御製詮源歌", new String[]{"宋"}, "趙炅"), // 宋 趙炅撰
                "C1710", new BookInfo("古尊宿語錄", new String[]{"宋", "明"}, "頤藏", "淨戒"), // 宋 頤藏主集　明 淨戒重校
                "C1720", new BookInfo("禪宗頌古聯珠通集", new String[]{"宋", "元", "明"}, "法應", "普會", "淨戒"), // 宋 法應集　元 普會續集　明 淨戒重校
                "C1821", new BookInfo("楞伽經纂", new String[]{"劉宋", "宋"}, "求那跋陀羅", "楊彥國"), // 劉宋 求那跋陀羅譯經　宋 楊彥國詮註
                "C1937", new BookInfo("大明重刊三藏聖教目錄", new String[]{"明"}, "雙徑山僧眾"), // 明 雙徑山僧眾編
                "CC0001", new BookInfo("續比丘尼傳", new String[]{"明", "民國"}, "釋震華") // 民國 釋震華編述
        );
    }

    private static void addD() {
        add(
                "D8679", new BookInfo("佛說佛名經（存卷四）", null), //
                "D8680", new BookInfo("佛說佛名經（存卷七）", null), //
                "D8701", new BookInfo("盂蘭盆經講經文（前殘）", null), //
                "D8724", new BookInfo("報恩金剛經文十二段", new String[]{"唐"}, "楊仙鸖"), // 唐 楊仙鸖撰
                "D8774", new BookInfo("羯磨文（前殘）", null), //
                "D8775", new BookInfo("式叉摩那尼六法", null), //
                "D8779", new BookInfo("鳩摩羅什法師誦法（後殘）", new String[]{"東晉"}, "釋慧融"), // 東晉 釋慧融等集
                "D8780", new BookInfo("小鈔", null), //
                "D8790", new BookInfo("佛性觀（前殘）", null), //
                "D8814", new BookInfo("佛頂尊勝陀羅尼等靈異神咒二十道", null), //
                "D8817", new BookInfo("佛說觀世音三昧經", null), //
                "D8820", new BookInfo("新菩薩經", null), //
                "D8838", new BookInfo("金剛般若波羅蜜經（註解）", new String[]{"元"}, "釋思聰"), // 元 釋思聰註解
                "D8842", new BookInfo("般若心經註解", new String[]{"日本"}, "釋圓耳"), // 日本 釋圓耳撰
                "D8853", new BookInfo("梵網古跡抄", null), //
                "D8859", new BookInfo("楞嚴妙指", new String[]{"明"}, "釋弘演"), // 明 釋弘演撰
                "D8862", new BookInfo("楞嚴經四依解", new String[]{"明"}, "釋觀衡"), // 明 釋觀衡述
                "D8863", new BookInfo("大日經疏指心鈔", new String[]{"唐"}, "釋一行"), // 唐 釋一行撰
                "D8864", new BookInfo("大日經劫心義章", new String[]{"日本"}, "釋運敞"), // 日本 釋運敞撰
                "D8869", new BookInfo("惟教三昧（存卷下　前殘）", null), //
                "D8871", new BookInfo("□者眷屬", null), //
                "D8874", new BookInfo("成實論義記（存卷中　前殘）", new String[]{"唐"}, "釋其甲"), // 唐 釋其甲撰
                "D8879", new BookInfo("成唯識論訂正", new String[]{"明"}, "釋廣伸"), // 明 釋廣伸撰
                "D8880", new BookInfo("成唯識論述記序釋", new String[]{"日本"}, "釋善珠"), // 日本 釋善珠撰
                "D8881", new BookInfo("菩提心論問題", new String[]{"日本"}, "釋善珠"), // 日本 釋善珠撰
                "D8882", new BookInfo("菩提心論口筆", new String[]{"日本"}, "釋實順"), // 日本 釋實順撰
                "D8883", new BookInfo("百法問答聞書抄", null), //
                "D8885", new BookInfo("因明入正理論後記", new String[]{"清"}, "吳樹虛"), // 清 吳樹虛撰
                "D8888", new BookInfo("表無表章詮要鈔", new String[]{"唐"}, "釋窺基"), // 唐 釋窺基撰
                "D8889", new BookInfo("教相樞要鈔", new String[]{"日本"}, "釋高範"), // 日本 釋高範撰
                "D8890", new BookInfo("唐三藏法師唯識量質疑錄", new String[]{"清"}, "吳樹虛"), // 清 吳樹虛撰
                "D8891", new BookInfo("表無表章詳體文集", new String[]{"日本"}, "釋叡尊"), // 日本 釋叡尊撰
                "D8892", new BookInfo("略述法相義依釋", new String[]{"日本"}, "釋高範"), // 日本 釋高範撰
                "D8893", new BookInfo("法宗原私記", new String[]{"日本"}, "釋龍謙"), // 日本 釋龍謙撰
                "D8894", new BookInfo("頌義八拔萃", null), //
                "D8895", new BookInfo("略述法相義", new String[]{"日本"}, "釋良光"), // 日本 釋良光撰
                "D8896", new BookInfo("唯識義", new String[]{"日本"}, "釋真興"), // 日本 釋真興撰
                "D8898", new BookInfo("脩大方廣佛華嚴法界觀", new String[]{"唐"}, "釋杜順"), // 唐 釋杜順編
                "D8899", new BookInfo("圭峰禪師原人論發微錄", new String[]{"宋"}, "釋淨源"), // 宋 釋淨源撰
                "D8903", new BookInfo("天台名目類聚鈔", new String[]{"日本"}, "釋貞舜"), // 日本 釋貞舜撰
                "D8904", new BookInfo("西谷名目句解", null), //
                "D8905", new BookInfo("選擇傳弘決疑鈔", new String[]{"日本"}, "釋良忠"), // 日本 釋良忠撰
                "D8913", new BookInfo("識知淨土論", new String[]{"日本"}, "弁阿"), // 日本 弁阿撰
                "D8914", new BookInfo("釋淨土群疑論探要記", null), //
                "D8915", new BookInfo("禪門偈（前殘）", null), //
                "D8930", new BookInfo("特賜興禪大燈國師參詳語要", new String[]{"日本"}, "釋妙超"), // 日本 釋妙超撰
                "D8936", new BookInfo("正信念佛偈私見聞", new String[]{"日本"}, "釋空誓"), // 日本 釋空誓撰
                "D8939", new BookInfo("古尊宿語錄", null), //
                "D8942", new BookInfo("四家錄", new String[]{"元"}, "釋海島"), // 元 釋海島編
                "D8945", new BookInfo("雪峰空和尚外集", new String[]{"宋"}, "釋慧空", "釋惠然"), // 宋 釋慧空撰　釋惠然編
                "D8948", new BookInfo("佛國禪師語錄", new String[]{"元"}, "釋無學", "釋妙環"), // 元 釋無學撰　釋妙環等編
                "D8951", new BookInfo("如來香", new String[]{"清"}, "唐時"), // 清 唐時編
                "D8952", new BookInfo("為二太子中元盂蘭薦福文", null), //
                "D8953", new BookInfo("結壇散食迴向發願文（首尾殘缺）", null), //
                "D8954", new BookInfo("儀註備簡", new String[]{"明"}, "釋大惠"), // 明 釋大惠撰
                "D8980", new BookInfo("冥樞會要", new String[]{"宋"}, "釋祖心"), // 宋 釋祖心編
                "D9000", new BookInfo("空谷集", new String[]{"明"}, "釋景隆"), // 明 釋景隆撰
                "D9010", new BookInfo("閱藏隨錄", new String[]{"明"}, "王芥庵"), // 明 王芥庵撰
                "D9011", new BookInfo("藏經值畫一目錄", null), //
                "D9021", new BookInfo("知儒編", new String[]{"明"}, "周夢秀"), // 明 周夢秀撰
                "D9025", new BookInfo("淨土三部經音義集", new String[]{"日本"}, "釋信瑞"), // 日本 釋信瑞撰
                "D9026", new BookInfo("大悲觀世音菩薩至道禮文", null), //
                "D9027", new BookInfo("道安法師念佛讚文附入山讚文", null), //
                "D9031", new BookInfo("僧家禮儀文", new String[]{"朝鮮"}, "釋冲絢") // 朝鮮 釋冲絢撰
        );
    }

    private static void addF() {
        add(
                "F0016", new BookInfo("大王觀世音經", null), //
                "F0041", new BookInfo("比丘尼羯磨經", new String[]{"劉宋"}, "求那跋摩"), // 劉宋 求那跋摩譯
                "F0069", new BookInfo("因果本起經", new String[]{"宋"}, "求那跋陀羅"), // 宋 求那跋陀羅譯
                "F0088", new BookInfo("佛說灌頂章句拔除過罪生死得度經", new String[]{"東晉"}, "帛尸梨密多羅"), // 東晉 帛尸梨密多羅譯
                "F0089", new BookInfo("佛說恒水流樹經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 天竺三藏求那跋陀羅譯
                "F0100", new BookInfo("金剛般若波羅蜜經（御注並序）", new String[]{"唐"}, "李隆基"), // 唐 玄宗李隆基注
                "F0181", new BookInfo("大般若關", null), //
                "F0248", new BookInfo("佛說救護身命經", null, "道真"), // 比丘道真譯
                "F0546", new BookInfo("大方廣圓覺修多羅了義經（選錄「附文：金剛禮一本」）", new String[]{"遼"}, "通理大師"), // 遼 通理大師集
                "F0761", new BookInfo("觀自在菩薩廣大圓滿無礙大悲根本陀羅尼", new String[]{"唐"}, "金剛智"), // 唐 南天竺國三藏金剛智譯
                "F1048", new BookInfo("一切如來白傘蓋大佛頂陀羅尼", new String[]{"唐"}, "不空"), // 唐 不空譯
                "F1050", new BookInfo("聖千手千眼觀自在菩薩摩訶薩廣大圓滿無礙大悲心陀羅尼", new String[]{"唐"}, "不空"), // 唐 不空譯
                "F1056", new BookInfo("梵本般若波羅蜜多心經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "F1060", new BookInfo("梵本般若波羅蜜多心經", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "F1061", new BookInfo("大隨求陀羅尼", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "F1062", new BookInfo("佛頂尊勝陀羅尼", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "F1063", new BookInfo("一切如來白傘蓋大佛頂陀羅尼", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "F1064", new BookInfo("大悲心陀羅尼", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "F1071", new BookInfo("釋教最上乘秘密藏陀羅尼集", null, "行琳"), // 行琳集
                "F1072", new BookInfo("一切佛菩薩名集", null, "德雲"), // 德雲集
                "F1076", new BookInfo("發菩提心戒", null, "志仙"), // 石經寺主講經律沙門志仙記
                "F1081", new BookInfo("一乘法界圖合詩一印", null, "儼法師"), // 儼法師造
                "F1082", new BookInfo("釋華嚴漩澓偈", null, "惟勁"), // 南岳般舟道場比丘惟勁釋
                "F1083", new BookInfo("漩澓偈", null, "杜順法師"), // 杜順法師造
                "F1084", new BookInfo("健拏標訶一乘修行者秘密義記", null, "釋法藏"), // 大香山隱士釋法藏述
                "F1098", new BookInfo("高上玉皇本行集經髓", null, "儼法師"), // 儼法師造
                "F1099", new BookInfo("無上玉皇心印經", null, "杜順法師") // 杜順法師造
        );
    }

    private static void addG() {
        add(
                "G1222", new BookInfo("一字頂輪王瑜伽經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "G1977", new BookInfo("科始終心要", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "G2073", new BookInfo("大明太宗文皇帝御製文殊讚", new String[]{"明"}, "明太宗"), // 明 太宗御製
                "G2075", new BookInfo("御製釋迦牟尼佛讚", new String[]{"明"}, "明太宗"), // 明 太宗御製
                "G2084", new BookInfo("坐禪箴", new String[]{"日本"}, "道元"), // 日本 道元撰
                "G2086", new BookInfo("三根坐禪說", new String[]{"日本"}, "瑩山"), // 日本 瑩山撰
                "GA0002", new BookInfo("洛陽伽藍記集證", new String[]{"清"}, "吳若準"), // 清 吳若準集證
                "GA0003", new BookInfo("洛陽伽藍記鉤沈", new String[]{"民國"}, "唐晏"), // 民國 唐晏鉤沈
                "GA0004", new BookInfo("洛陽伽藍記合校本", new String[]{"民國"}, "張宗祥"), // 民國 張宗祥合校
                "GA0005", new BookInfo("南朝佛寺志", new String[]{"清"}, "孫文川", "陳作霖"), // 清 孫文川撰　陳作霖編
                "GA0008", new BookInfo("重修普陀山志", new String[]{"明"}, "周應賓"), // 明 周應賓撰
                "GA0009", new BookInfo("普陀洛迦新志", new String[]{"民國"}, "王亨彥"), // 民國 王亨彥撰
                "GA0010", new BookInfo("明州阿育王山志", new String[]{"明"}, "郭子章"), // 明 郭子章撰
                "GA0011", new BookInfo("明州阿育王山續志", new String[]{"清"}, "釋畹荃"), // 清 釋畹荃撰
                "GA0012", new BookInfo("天童寺志", new String[]{"清"}, "聞性道", "釋德介"), // 清 聞性道．釋德介撰
                "GA0013", new BookInfo("七塔寺志", new String[]{"民國"}, "陳寥士"), // 民國 陳寥士撰
                "GA0014", new BookInfo("明州岳林寺志", new String[]{"清"}, "戴明琮"), // 清 戴明琮撰
                "GA0015", new BookInfo("大昭慶律寺志", new String[]{"清"}, "吳樹虛"), // 清 吳樹虛撰
                "GA0017", new BookInfo("玉岑山慧因高麗華嚴教寺志", new String[]{"明"}, "李翥", "丁丙"), // 明 李翥撰 清 丁丙補
                "GA0018", new BookInfo("鳳凰山聖果寺志", new String[]{"清"}, "釋超乾"), // 清 釋超乾撰
                "GA0019", new BookInfo("武林理安寺志", new String[]{"清"}, "杭世駿"), // 清 杭世駿撰
                "GA0020", new BookInfo("龍井見聞錄", new String[]{"清"}, "汪孟鋗"), // 清 汪孟鋗撰
                "GA0021", new BookInfo("武林靈隱寺志", new String[]{"清"}, "孫治", "徐增"), // 清 孫治撰　徐增重編
                "GA0022", new BookInfo("增修雲林寺志", new String[]{"清"}, "厲鶚", "張熷"), // 清 厲鶚．張熷撰
                "GA0023", new BookInfo("雲林寺續志", new String[]{"清"}, "沈鑅彪"), // 清 沈鑅彪撰
                "GA0024", new BookInfo("杭州上天竺講寺志", new String[]{"明"}, "釋廣賓"), // 明 釋廣賓撰
                "GA0025", new BookInfo("雲居聖水寺志", new String[]{"清"}, "釋𧧌湛", "釋明倫", "釋通淵", "釋實懿"), // 清 釋𧧌湛．釋明倫原輯　釋通淵．釋實懿重纂
                "GA0027", new BookInfo("雲棲紀事", new String[]{"清"}), // 清 聞性道．釋德介撰
                "GA0028", new BookInfo("龍興祥符戒壇寺志", new String[]{"清"}, "張大昌"), // 清 張大昌撰
                "GA0029", new BookInfo("西谿梵隱志", new String[]{"清"}, "吳本泰", "釋智一"), // 清 吳本泰撰　釋智一編
                "GA0030", new BookInfo("崇福寺志", new String[]{"清"}, "朱文藻"), // 清 朱文藻撰
                "GA0031", new BookInfo("續崇福寺志", new String[]{"清"}, "章庭棫"), // 清 章庭棫撰
                "GA0032", new BookInfo("徑山志", new String[]{"明"}, "宋奎光"), // 明 宋奎光撰
                "GA0036", new BookInfo("破山興福寺志", new String[]{"明"}, "程嘉燧", "蘇先"), // 明 程嘉燧撰　蘇先繪圖
                "GA0043", new BookInfo("寒山寺志", new String[]{"清"}, "葉昌熾"), // 清 葉昌熾纂
                "GA0049", new BookInfo("峨眉山志", new String[]{"清", "民國"}, "蔣超", "釋印光"), // 清 蔣超撰 民國 釋印光重修
                "GA0062", new BookInfo("泉州開元寺志", new String[]{"明"}, "釋元賢"), // 明 釋元賢撰
                "GA0077", new BookInfo("九華山志", new String[]{"民國"}, "釋印光"), // 民國 釋印光重修
                "GA0081", new BookInfo("清涼山志", new String[]{"民國"}, "釋印光"), // 民國 釋印光重修
                "GA0084", new BookInfo("雞足山寺志", new String[]{"明"}, "錢邦", "范承勳"), // 明 錢邦纂 清 茫承勳增修
                "GA0086", new BookInfo("黃檗山寺志", new String[]{"清"}, "性幽獨往"), // 清 性幽獨往等編訂續修
                "GA0089", new BookInfo("天台山方外志", new String[]{"清"}, "釋傳燈"), // 清 釋傳燈編撰
                "GAa001", new BookInfo("編輯說明", null, "中華電子佛典協會"), // 中華電子佛典協會
                "GB0109", new BookInfo("徑山集", new String[]{"明"}, "釋宗淨"), // 明 釋宗淨集
                "GBa001", new BookInfo("編輯說明", null, "中華電子佛典協會") // 中華電子佛典協會
        );
    }

    private static void addI() {
        add(
                "I0001", new BookInfo("宕昌公暉福寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0002", new BookInfo("姚伯多等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0003", new BookInfo("元景造石窟記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0004", new BookInfo("韓貞等造石窟記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0005", new BookInfo("劉未等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0006", new BookInfo("高伏德等三百人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0007", new BookInfo("比丘法雅等千人造九級浮圖碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0008", new BookInfo("張道智造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0009", new BookInfo("高洛周七十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0010", new BookInfo("僧暈等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0011", new BookInfo("馮神育等二百廿人造像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0012", new BookInfo("嵩顯寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0013", new BookInfo("南石窟寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0014", new BookInfo("比丘郭曇勝造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0015", new BookInfo("張安世造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0016", new BookInfo("比丘劉僧真等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0017", new BookInfo("夫蒙文慶造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0018", new BookInfo("張乾度七十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0019", new BookInfo("錡雙胡廿人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0020", new BookInfo("袁永等五十人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0021", new BookInfo("馬鳴寺根法師碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0022", new BookInfo("比丘尼統慈慶墓誌銘", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0023", new BookInfo("孫遼浮圖銘", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0024", new BookInfo("仇臣生造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0025", new BookInfo("常煥等造浮圖記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0026", new BookInfo("蔣伯仙造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0027", new BookInfo("杜善勝合邑七十人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0028", new BookInfo("大覺寺元尼墓誌銘并序", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0029", new BookInfo("僧智薛鳳規等道俗造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0030", new BookInfo("廣業寺造像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0031", new BookInfo("儁蒙文姬卅一人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0032", new BookInfo("大魏故昭玄沙門大統令法師墓誌銘", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0033", new BookInfo("法義兄弟等二百人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0034", new BookInfo("中岳嵩陽寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0035", new BookInfo("張法壽息榮遷等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0036", new BookInfo("安村道俗一百餘人修塔記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0037", new BookInfo("白實等造中興寺石像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0038", new BookInfo("僧演造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0039", new BookInfo("合邑四十人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0040", new BookInfo("凝禪寺三級浮圖碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0041", new BookInfo("敬史君碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0042", new BookInfo("巨始光等造像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0043", new BookInfo("李氏合邑造像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0044", new BookInfo("李贊邑等邑義五百餘人造像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0045", new BookInfo("道俗九十人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0046", new BookInfo("王貳郎法義三百人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0047", new BookInfo("朱永隆七十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0048", new BookInfo("報德玉像七佛頌碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0049", new BookInfo("杜照賢十三人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0050", new BookInfo("陳神姜等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0051", new BookInfo("邑子七十人等造大道如來記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0052", new BookInfo("比丘道\uD852\uDEDE造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0053", new BookInfo("杜英儁等十四人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0054", new BookInfo("道俗卅七人造經像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0055", new BookInfo("邢多五十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0056", new BookInfo("馬敬賢五十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0057", new BookInfo("葉容等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0058", new BookInfo("李清造報德像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0059", new BookInfo("郭猛八十人等造塔像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0060", new BookInfo("趙郡王高叡定國寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0061", new BookInfo("趙郡王高叡修定國寺頌", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0062", new BookInfo("靜明等修塔造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0063", new BookInfo("劉碑造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0064", new BookInfo("強獨樂為周文王造像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0065", new BookInfo("宋敬業等造塔記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0066", new BookInfo("魯思明等造寺記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0067", new BookInfo("董黃頭七十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0068", new BookInfo("東平郡須昌縣□檀寺造經碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0069", new BookInfo("方法師鏤石班經記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0070", new BookInfo("周大將軍延壽公碑頌", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0071", new BookInfo("陳神忻七十二人等造石室記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0072", new BookInfo("彭城王高浟修寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0073", new BookInfo("標異鄉義慈惠石柱頌", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0074", new BookInfo("比丘尼法藏等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0075", new BookInfo("陳榮等三百餘人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0076", new BookInfo("阿鹿交村七十人等造石室像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0077", new BookInfo("嚴壽等重修故塔記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0078", new BookInfo("比丘道政四十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0079", new BookInfo("王氏道俗百人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0080", new BookInfo("郭顯邕等造一切經記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0081", new BookInfo("雷暉嫗造釋迦像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0082", new BookInfo("陳氏合村造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0083", new BookInfo("雷明香造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0084", new BookInfo("宋買廿二人等造天宮石像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0085", new BookInfo("韓永義等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0086", new BookInfo("潘景暉造碑像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0087", new BookInfo("棲閑寺邑義六十人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0088", new BookInfo("劉氏造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0089", new BookInfo("舜禪師等百餘人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0090", new BookInfo("董洪達四十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0091", new BookInfo("楊暎香等八十人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0092", new BookInfo("道略等造神碑像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0093", new BookInfo("永顯寺道端等三百人造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0094", new BookInfo("興聖寺四十人等造碑像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0095", new BookInfo("唐邕刻經記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0096", new BookInfo("馮翊王高潤修平等寺碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0097", new BookInfo("瓽仲義八十人等造像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0098", new BookInfo("臨淮王像碑", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0099", new BookInfo("建崇寺浮圖銘", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "I0100", new BookInfo("比丘尼圓照圓光造雙像記", new String[]{"现代"}, "顏娟英"), // 顏娟英主編
                "Ia001", new BookInfo("說明", new String[]{"现代"}, "中華電子佛典協會") // 中華電子佛典協會
        );
    }

    private static void addJ() {
        add(
                "JA042", new BookInfo("大慧普覺禪師年譜", new String[]{"宋"}, "祖詠", "張掄", "宗演"), // 宋 祖詠編　張掄序　宗演跋
                "JA123", new BookInfo("起信論疏（選錄「科文」）", new String[]{"宋"}, "子璿"), // 宋 子璿脩定
                "JA158", new BookInfo("密雲禪師語錄", new String[]{"明"}, "圓悟", "如瑩"), // 明 圓悟說　如瑩等編
                "JB005", new BookInfo("大方廣佛華嚴經普賢行願品別行疏鈔（選錄「華嚴宗七祖行蹟」及「附錄」）", new String[]{"唐"}, "澄觀", "宗密"), // 唐 澄觀別行疏　宗密隨疏鈔
                "JB044", new BookInfo("諸經日誦集要", null, "佚名"), // 佚名
                "JB047", new BookInfo("瑜伽集要燄口施食儀", new String[]{"唐", "西夏", "清"}, "不空", "不動金剛", "受登"), // 唐 不空譯　西夏 不動金剛重集　清 受登詮次　有圖像四十　緣起
                "JB048", new BookInfo("北京五大部直音會韻", new String[]{"明"}, "久隱"), // 明 久隱撰
                "JB090", new BookInfo("續原教論", new String[]{"明"}, "沈士榮"), // 明 沈士榮著
                "JB091", new BookInfo("道餘錄", new String[]{"明"}, "姚廣孝"), // 明 姚廣孝著並序
                "JB095", new BookInfo("蕅益三頌", new String[]{"明"}, "智旭"), // 明 智旭述並序　三頌為華嚴．楞嚴．法華　有偶拈問答及重刻自跋
                "JB096", new BookInfo("周易禪解", new String[]{"明"}, "智旭"), // 明 智旭著
                "JB097", new BookInfo("天樂鳴空集", new String[]{"明"}, "鮑宗肇", "智旭"), // 明 鮑宗肇述　智旭定
                "JB098", new BookInfo("黃蘗無念禪師復問", new String[]{"明"}, "深有", "明聞"), // 明 深有撰　明 聞刪定
                "JB103", new BookInfo("寒山子詩集", new String[]{"唐", "明"}, "閭丘胤", "王宗沐"), // 唐 閭丘胤集並序　明 王宗沐序　附拾得．豐干詩
                "JB109", new BookInfo("大藏一覽", new String[]{"明"}, "陳實", "姚舜漁"), // 明 陳實編　姚舜漁重輯
                "JB110", new BookInfo("護法錄", new String[]{"明"}, "宋濂", "袾宏", "錢謙益"), // 明 宋濂著　袾宏輯　錢謙益訂
                "JB116", new BookInfo("憨山老人夢遊全集", new String[]{"明"}, "德清", "福善"), // 明 德清撰　福善日錄
                "JB118", new BookInfo("密藏開禪師遺稿", new String[]{"明"}, "道開"), // 明 道開著
                "JB120", new BookInfo("闢邪集", new String[]{"明"}, "鍾始聲", "大朗", "程啟用"), // 明 鍾始聲著　大朗序　文分天學初徵及天學再徵　附書柬四則　程啟用跋
                "JB122", new BookInfo("醒世錄", new String[]{"清"}, "徐昌治"), // 清 徐昌治輯
                "JB125", new BookInfo("先覺宗乘（選錄「帝王問道錄」）", new String[]{"明"}, "郭凝之"), // 明 郭凝之編
                "JB127", new BookInfo("無依道人錄", new String[]{"清"}, "徐昌治", "超悟", "僧鑑"), // 清 徐昌治著　超悟錄　僧鑑序　附疏稿（原有缺頁）
                "JB128", new BookInfo("普明禪師牧牛圖頌", new String[]{"明", "清"}, "普明", "嚴大參", "如念"), // 明 普明原唱　諸方和韻　嚴大參序　清 如念編目　有圖十
                "JB129", new BookInfo("牧牛圖頌", new String[]{"明", "清"}, "普明", "性音", "納信", "袾宏", "超格", "了彙"), // 明 普明原輯　性音續集舊跋　清 納信序　明 袾宏序　清 超格序　乾隆四十九年了彙重刊
                "JB134", new BookInfo("五家語錄（選錄）", new String[]{"唐", "明"}, "慧然", "郭凝之"), // 唐 慧然集　明 郭凝之重訂
                "JB135", new BookInfo("石門文字禪", new String[]{"宋"}, "德洪"), // 宋 德洪著　原書缺　依民國十年常州天寧寺刻本印
                "JB137", new BookInfo("趙州和尚語錄", new String[]{"唐"}, "從諗", "文遠", "大參", "明聲"), // 唐 從諗說　文遠記　大參重校　明聲重刻
                "JB138", new BookInfo("雲門匡真禪師語錄", new String[]{"南漢"}, "文偃", "守堅"), // 南漢 文偃說　守堅編
                "JB154", new BookInfo("松隱唯菴然和尚語錄", new String[]{"明"}, "德然", "慧省"), // 明 德然說　慧省編次
                "JB155", new BookInfo("無趣老人語錄", new String[]{"明"}, "如空", "性沖"), // 明 如空說　性沖編
                "JB156", new BookInfo("無幻禪師語錄", new String[]{"明"}, "性沖", "慧廣"), // 明 性沖說　慧廣編集
                "JB159", new BookInfo("天真毒峰善禪師要語", new String[]{"明"}, "本善", "悟深"), // 明 本善記　悟深編
                "JB163", new BookInfo("古庭禪師語錄輯略", new String[]{"明"}, "善堅"), // 明 善堅說　各卷首皆題曹溪一滴古庭禪師語錄
                "JB164", new BookInfo("曹溪一滴", new String[]{"明"}, "周理"), // 明 周理編　附夢語摘要
                "JB165", new BookInfo("大巍禪師竹室集", new String[]{"明"}, "淨倫", "周理"), // 明 淨倫撰　周理輯　內題曹溪一滴卷六
                "JB166", new BookInfo("浮山法句", new String[]{"明"}, "本智", "周理"), // 明 本智撰　周理輯　內題曹溪一滴卷七　前有明 吳應賓塔銘及王舜鼎夢禪語
                "JB167", new BookInfo("徹庸和尚谷響集", new String[]{"明"}, "徹庸", "洪如"), // 明 徹庸撰　洪如錄　內題曹溪一滴卷八　後附淨土偈一卷
                "JB171", new BookInfo("天隱和尚語錄", new String[]{"明"}, "圓修", "通問"), // 明 圓修說　通問等編
                "JB173", new BookInfo("壽昌無明和尚語錄", new String[]{"明"}, "慧經", "元來"), // 明 慧經說　元來集
                "JB174", new BookInfo("天界覺浪盛禪師語錄", new String[]{"明"}, "道盛", "大成", "大奇"), // 明 道盛說　大成．大奇等編
                "JB175", new BookInfo("大溈五峰學禪師語錄", new String[]{"明", "清"}, "如學", "智海", "周堪賡", "陶汝鼐"), // 明 如學說　清 智海重刻　周堪賡序　有行實　明 陶汝鼐塔銘
                "JB176", new BookInfo("大溈密印寺養拙明禪師語錄", new String[]{"清"}, "正明", "智海", "通雲", "陶之典", "周堪賡"), // 清 正明說　智海編　通雲序　陶之典序　有行實　周堪賡塔銘　附大溈四記一卷
                "JB177", new BookInfo("破山禪師語錄", new String[]{"清"}, "海明", "印正", "印巒", "印綬"), // 清 海明說　印正等編　附年譜　印巒等輯　印綬等編　原書缺依駒本印
                "JB178", new BookInfo("費隱禪師語錄", new String[]{"明"}, "通容", "隆琦", "行觀", "王谷", "徐昌治", "董行", "行宗", "行古"), // 明 通容說　隆琦等編　附紀年錄　行觀．王谷同集　徐昌治．董行證較　行宗．行古重訂刻
                "JB180", new BookInfo("天童弘覺忞禪師北遊集", new String[]{"清"}, "道忞", "真樸"), // 清 道忞說　真樸編次
                "JB181", new BookInfo("布水臺集", new String[]{"明"}, "道忞"), // 明 道忞著（中央圖書館善本書目編在集部別集類）
                "JB182", new BookInfo("萬如禪師語錄", new String[]{"清"}, "通微", "行猷"), // 清 通微說　行猷等編
                "JB183", new BookInfo("雪竇石奇禪師語錄", new String[]{"清"}, "通雲", "行正"), // 清 通雲說　行正等編錄
                "JB184", new BookInfo("牧雲和尚七會語錄", new String[]{"清"}, "通門", "行瑋"), // 清 通門說　行瑋等編
                "JB185", new BookInfo("浮石禪師語錄", new String[]{"明"}, "通賢", "行浚"), // 明 通賢說　行浚等編
                "JB186", new BookInfo("林野奇禪師語錄", new String[]{"明"}, "通奇", "行謐"), // 明 通奇說　行謐等編
                "JB187", new BookInfo("天岸昇禪師語錄", new String[]{"清"}, "天岸昇禪師", "元玉"), // 清 昇說　元玉等記錄
                "JB188", new BookInfo("入就瑞白禪師語錄", new String[]{"明"}, "明雪", "寂蘊"), // 明 明雪說　寂蘊編
                "JB189", new BookInfo("三宜盂禪師語錄", new String[]{"明"}, "明盂", "淨範"), // 明 明盂說　淨範等編
                "JB190", new BookInfo("石雨禪師法檀", new String[]{"明"}, "明方", "淨柱"), // 明 明方說　淨柱編
                "JB191", new BookInfo("象田即念禪師語錄", new String[]{"明"}, "淨現", "淨癡"), // 明 淨現說　淨癡等錄
                "JB192", new BookInfo("大休珠禪師語錄", new String[]{"清"}, "大休珠禪師", "廣熙"), // 清 珠說　廣熙等錄
                "JB193", new BookInfo("隱元禪師語錄", new String[]{"清"}, "隆琦", "海寧"), // 清 隆琦說　海寧等編
                "JB194", new BookInfo("昭覺丈雪醉禪師語錄", new String[]{"清"}, "通醉", "徹綱"), // 清 通醉說　徹綱等編
                "JB196", new BookInfo("鴛湖用禪師語錄", new String[]{"清"}, "妙用", "悟進", "悟元"), // 清 妙用說　悟進．悟元等編
                "JB197", new BookInfo("博山無異大師語錄集要", new String[]{"明"}, "元來", "成正", "元賢"), // 明 元來說　成正錄　元賢集
                "JB198", new BookInfo("雪關禪師語錄", new String[]{"明"}, "智誾", "成巒", "開詗"), // 明 智誾說　成巒等錄　開詗編
                "JB199", new BookInfo("雪關和尚語錄", new String[]{"明"}, "智誾", "傳善"), // 明 智誾說　傳善輯
                "JB200", new BookInfo("石霜爾瞻尊禪師語錄", new String[]{"清"}, "達尊", "本開"), // 清 達尊說　本開等記錄
                "JB202", new BookInfo("百癡禪師語錄", new String[]{"清"}, "元禪師", "超宣"), // 清 元說　超宣等編
                "JB203", new BookInfo("雲峨喜禪師語錄", new String[]{"清"}, "雲峨喜禪師", "智恒"), // 清 喜說　智恒等編
                "JB204", new BookInfo("斌雅禪師語錄", new String[]{"清"}, "斌雅禪師", "海岳"), // 清 鑑說　海岳記錄
                "JB205", new BookInfo("介為舟禪師語錄", new String[]{"清"}, "行舟", "海鹽", "益證"), // 清 行舟說　海鹽．益證等編
                "JB206", new BookInfo("笑堂和尚語錄", new String[]{"清"}, "笑堂和尚", "超源", "超晙"), // 清 說　超源等記錄　超晙等編
                "JB207", new BookInfo("古瓶山牧道者究心錄", new String[]{"明"}, "真本", "機峻"), // 明 真本說　機峻等編
                "JB208", new BookInfo("古雪哲禪師語錄", new String[]{"明"}, "真哲", "傳我"), // 明 真哲說　傳我等編
                "JB209", new BookInfo("永濟融禪師語錄", new String[]{"清"}, "永濟融禪師", "師住", "妙印"), // 清 融說　師住．妙印等錄
                "JB210", new BookInfo("伏獅祇園禪師語錄", new String[]{"清"}, "行剛", "授遠", "超宿"), // 清 行剛（尼）說　授遠．超宿等編
                "JB211", new BookInfo("季總徹禪師語錄", new String[]{"清"}, "季總徹禪師", "超祥"), // 清 徹（尼）說　超祥記錄
                "JB212", new BookInfo("二隱謐禪師語錄", new String[]{"清"}, "二隱謐禪師", "超巨", "超秀"), // 清 謐說　超巨．超秀等編
                "JB213", new BookInfo("芝巖秀禪師語錄", new String[]{"清"}, "芝巖秀禪師", "明一"), // 清 秀說　明一等編
                "JB214", new BookInfo("蕅益大師佛學十種（選錄「性學開蒙」．「梵室偶談」兩種）", new String[]{"明"}, "智旭"), // 明 智旭著
                "JB215", new BookInfo("頌古合響集", new String[]{"明"}, "徹（尼）", "符（尼）", "張有譽"), // 明 徹（尼）．符（尼）合頌　張有譽輯並序
                "JB216", new BookInfo("絕餘編", new String[]{"明"}, "智旭", "圓果"), // 明 智旭著　圓果錄
                "JB218", new BookInfo("懶石聆禪師語錄", new String[]{"清"}, "懶石聆禪師", "海瑞"), // 清 聆說　海瑞等錄
                "JB219", new BookInfo("紫竹林顓愚衡和尚語錄", new String[]{"清"}, "觀衡", "正印"), // 清 觀衡說　正印重編
                "JB220", new BookInfo("法璽印禪師語錄", new String[]{"清"}, "法璽印禪師", "性圓"), // 清 印說　性圓等編
                "JB221", new BookInfo("楞嚴法璽印禪師語錄", new String[]{"清"}, "法璽印禪師", "旋性"), // 清 印說　旋性記錄
                "JB222", new BookInfo("夔州臥龍字水禪師語錄", new String[]{"明"}, "圓䂐", "觀誰"), // 明 圓䂐說　觀誰等錄
                "JB223", new BookInfo("山暉禪師語錄", new String[]{"清"}, "山暉禪師", "如崇", "宗上"), // 清 璧說　如崇等錄　宗上編
                "JB224", new BookInfo("嵩山野竹禪師錄", new String[]{"清"}, "福慧", "宗宏", "宗上", "宗堅"), // 清 福慧說　宗宏錄　宗上．宗堅仝編
                "JB225", new BookInfo("鄂州龍光達夫禪師雞肋集", new String[]{"清"}, "蘊上", "道汜", "道沖"), // 清 蘊上說　道汜．道沖等錄（依駒本印）
                "JB226", new BookInfo("頌古鉤鉅", new String[]{"清"}, "蘊上", "蘊宏"), // 清 蘊上頌并跋　蘊宏著語（依駒本印）
                "JB227", new BookInfo("集文字禪", new String[]{"清"}, "蘊上", "舒峻極", "杜國柱"), // 清 蘊上著　舒峻極序　杜國柱序（依駒本印）
                "JB229", new BookInfo("法瀾澂禪師語錄", new String[]{"清"}, "原澂", "清杲"), // 清 原澂說　清杲編次（依駒本印）
                "JB230", new BookInfo("天王水鑑海和尚六會錄", new String[]{"清"}, "慧海", "原澂"), // 清 慧海說　原澂等編（依駒本印）
                "JB231", new BookInfo("天王水鑑海和尚五會錄", new String[]{"清"}, "慧海", "原澂"), // 清 慧海說　原澂等編
                "JB232", new BookInfo("天王水鑑海和尚住金粟語錄", new String[]{"清"}, "慧海", "原澂", "原上"), // 清 慧海說　原澂．原上等編
                "JB233", new BookInfo("介菴進禪師語錄", new String[]{"清"}, "悟進", "真理"), // 清 悟進說　真理等編　附源流頌
                "JB234", new BookInfo("一初元禪師語錄", new String[]{"清"}, "一初元禪師", "真開", "真智"), // 清 元說　真開．真智等編
                "JB235", new BookInfo("蓮月禪師語錄", new String[]{"清"}, "道正", "性容"), // 清 道正說　性容等錄
                "JB236", new BookInfo("玉泉蓮月正禪師語錄", new String[]{"清"}, "道正", "發慧"), // 清 道正說　發慧等錄
                "JB237", new BookInfo("月幢了禪師語錄", new String[]{"清"}, "月幢了禪師", "達最"), // 清 了說　達最等編
                "JB238", new BookInfo("聚雲吹萬真禪師語錄", new String[]{"明"}, "廣真", "燈來"), // 明 廣真說　燈來編
                "JB239", new BookInfo("吹萬禪師語錄", new String[]{"明"}, "廣真", "燈來"), // 明 廣真說　燈來重編（依駒本印）
                "JB240", new BookInfo("慶忠鐵壁機禪師語錄", new String[]{"明"}, "慧機", "燈來"), // 明 慧機說　燈來編
                "JB241", new BookInfo("慶忠鐵壁機禪師語錄", new String[]{"明"}, "慧機", "幻敏"), // 明 慧機說　幻敏重編（依駒本印）
                "JB242", new BookInfo("鐵眉三巴掌禪師語錄", new String[]{"明"}, "鐵眉三巴掌禪師", "性養", "性亮"), // 明 鐵眉號三巴掌說　性養．性亮同編
                "JB243", new BookInfo("耳庵嵩禪師語錄", new String[]{"清"}, "耳庵嵩禪師", "性愷", "徐善"), // 清 嵩說　性愷編　徐善序　有附記
                "JB244", new BookInfo("三山來禪師語錄", new String[]{"清"}, "燈來", "普定"), // 清 燈來說　普定編（原目二十八卷　卷十七下註有「嗣刻」二字　此為初刻本）
                "JB245", new BookInfo("高峰三山來禪師年譜", new String[]{"清"}, "性統", "至善"), // 清 性統編　至善序（依駒本印）
                "JB246", new BookInfo("嘉興退菴斷愚智禪師語錄", new String[]{"清"}, "嘉興退菴斷愚智禪師", "機輪"), // 清 智說　機輪等編
                "JB247", new BookInfo("普光坦菴禪師語錄", new String[]{"清"}, "機峻", "全弘", "羅開麟"), // 清 機峻說　全弘錄　羅開麟序（依駒本印）
                "JB248", new BookInfo("達變權禪師語錄", new String[]{"清"}, "顯權", "海澂"), // 清 顯權說　海澂錄
                "JB249", new BookInfo("方融璽禪師語錄", new String[]{"清"}, "如璽", "興林"), // 清 如璽說　興林等編　附淨土詩
                "JB259", new BookInfo("怡山禮佛發願文略釋", new String[]{"清"}, "書玉"), // 清 書玉略釋並序跋　有事義（依駒本印）
                "JB260", new BookInfo("大懺悔文略解", new String[]{"清"}, "書玉"), // 清 書玉略解（依駒本印）
                "JB267", new BookInfo("牧雲和尚嬾齋別集", new String[]{"明"}, "通明", "毛晉"), // 明 通明撰　毛晉編
                "JB268", new BookInfo("牧雲和尚宗本投機頌", new String[]{"明"}, "通明"), // 明 通明撰　附病遊遊刃．病遊初草．病遊後草
                "JB269", new BookInfo("金剛般若經疏論纂要刊定記會編", new String[]{"唐", "宋", "清"}, "宗密", "子璿", "行策"), // 唐 宗密述疏　宋 子璿錄記　清 行策會編
                "JB271", new BookInfo("閱藏知津", new String[]{"明"}, "智旭"), // 明 智旭彙輯　總目四卷
                "JB272", new BookInfo("明州天童景德禪寺宏智覺禪師語錄", new String[]{"宋"}, "正覺", "淨啟"), // 宋 正覺說　淨啟重編
                "JB273", new BookInfo("千巖和尚語錄", new String[]{"元"}, "元長", "嗣詔"), // 元 元長說　嗣詔錄
                "JB275", new BookInfo("興善南明廣禪師語錄", new String[]{"明"}, "慧廣", "妙用", "悟進", "明方", "黃承昊"), // 明 慧廣說　妙用集　悟進重輯並跋　明方序　黃承昊序　有行狀
                "JB276", new BookInfo("不會禪師語錄", new String[]{"清"}, "法通", "性靈"), // 清 法通說　性靈等編（依駒本印）
                "JB277", new BookInfo("雲棲法彙（選錄）", new String[]{"明"}, "袾宏"), // 明 袾宏著（原本多缺　依金陵本補印　並補後增讚序等文　凡補印者　於該條目上作△以志之）
                "JB279", new BookInfo("虛舟禪師註八識規矩頌", new String[]{"清"}, "行省"), // 清 行省撰
                "JB280", new BookInfo("神鼎雲外澤禪師語錄", new String[]{"清"}, "行澤", "宏怤"), // 清 行澤說　宏怤等編（依駒本印）
                "JB281", new BookInfo("壇溪梓舟船禪師語錄", new String[]{"明"}, "壇溪梓舟船禪師", "明法"), // 明 船說　明法等編（依駒本印）
                "JB282", new BookInfo("虛舟省禪師語錄", new String[]{"清"}, "行省", "超直"), // 清 行省說　超直等編（依駒本印）
                "JB283", new BookInfo("天台三聖詩集和韻", new String[]{"元", "清"}, "梵琦", "福慧"), // 元 梵琦首和　清 福慧重和
                "JB284", new BookInfo("益州嵩山野竹禪師後錄", new String[]{"清"}, "福慧", "洪希"), // 清 福慧說　洪希等編
                "JB285", new BookInfo("兜率不磷堅禪師語錄", new String[]{"清"}, "宗堅", "妙聖"), // 清 宗堅說　妙聖等記
                "JB286", new BookInfo("攖寧靜禪師語錄", new String[]{"清"}, "智靜", "德亮", "德峨"), // 清 智靜說　德亮等編　德莪等錄
                "JB287", new BookInfo("自閒覺禪師語錄", new String[]{"清"}, "自閒覺禪師", "洪暹"), // 清 覺說　洪暹等編
                "JB288", new BookInfo("憨予暹禪師語錄", new String[]{"清"}, "洪暹", "法雲"), // 清 洪暹說　法雲等編
                "JB293", new BookInfo("擬寒山詩", new String[]{"明"}, "張守約", "唐守禮", "蔡善繼"), // 明 張守約追擬並序　唐守禮序　蔡善繼序（依駒本印）
                "JB294", new BookInfo("雲溪俍亭挺禪師語錄", new String[]{"清"}, "淨挺", "智淙"), // 清 淨挺說　智淙等編
                "JB295", new BookInfo("學佛考訓", new String[]{"清"}, "淨挺"), // 清 淨挺輯
                "JB296", new BookInfo("漆園指通", new String[]{"清"}, "淨挺"), // 清 淨挺著
                "JB298", new BookInfo("屾峰憲禪師語錄", new String[]{"清"}, "屾峰憲禪師", "智質", "智原"), // 清 憲說　智質．智原同編（依駒本印）
                "JB299", new BookInfo("三峰藏和尚語錄", new String[]{"明"}, "法藏", "弘儲"), // 明 法藏說　弘儲記　後附年譜一卷．南嶽勒古一卷
                "JB300", new BookInfo("朝宗禪師語錄", new String[]{"明"}, "通忍", "行導"), // 明 通忍說　行導編（依駒本印）
                "JB301", new BookInfo("南嶽繼起和尚語錄", new String[]{"清"}, "弘儲", "濟璣"), // 清 弘儲說　濟機等編
                "JB303", new BookInfo("燮雲璣禪師國清無畏堂語錄", new String[]{"清"}, "濟璣", "玄杲", "張有譽"), // 清 濟璣說　玄杲錄　張有譽序
                "JB304", new BookInfo("靈樹遠禪師雲嵒集", new String[]{"清"}, "靈樹遠禪師", "廣仍", "余懷"), // 清 僧遠說　廣仍記　附雲嵒頌古　附雲嵒九頌　余懷製
                "JB305", new BookInfo("國清大庾韜禪師語錄", new String[]{"清"}, "行韜", "顯裕"), // 清 行韜說　顯裕等錄　有塔銘　行略（依駒本印）
                "JB306", new BookInfo("內紹種禪師語錄", new String[]{"清"}, "內紹種禪師", "照維"), // 清 種說　照維等記　附頌古
                "JB308", new BookInfo("象崖珽禪師語錄", new String[]{"清"}, "性珽", "益聞"), // 清 性珽說　益聞重刊
                "JB309", new BookInfo("雲腹智禪師語錄", new String[]{"清"}, "道智", "嶽賢", "聯昇"), // 清 道智說　嶽賢．聯昇記錄
                "JB310", new BookInfo("雲叟住禪師語錄", new String[]{"清"}, "雲叟住禪師", "元一"), // 清 住說　元一記錄
                "JB311", new BookInfo("天界覺浪盛禪師全錄", new String[]{"明"}, "道盛", "大成", "大然"), // 明 道盛說　大成．大然等較　後附杖門隨集
                "JB312", new BookInfo("天界覺浪盛禪師嘉禾語錄", new String[]{"明"}, "道盛", "大樞", "大英", "譚貞默"), // 明 道盛說　大樞．大英錄　譚貞默序
                "JB313", new BookInfo("青原愚者智禪師語錄", new String[]{"清"}, "青原愚者智禪師", "興磬", "興斧"), // 清 智說　興磬．興斧編
                "JB325", new BookInfo("解惑篇", new String[]{"清"}, "弘贊"), // 清 弘贊編（依駒本印）
                "JB326", new BookInfo("木人剩稿", new String[]{"清"}, "弘贊", "開溈"), // 清 弘贊編　開溈錄
                "JB336", new BookInfo("南海寶象林慧弓詗禪師語錄", new String[]{"清"}, "開詗", "傳一"), // 清 開詗說　傳一等錄
                "JB337", new BookInfo("寶持總禪師語錄", new String[]{"清"}, "寶持玄總", "明英"), // 清 玄總（尼）說　明英等記
                "JB338", new BookInfo("靈瑞尼祖揆符禪師妙湛錄", new String[]{"清"}, "靈瑞尼祖揆符禪師", "師炤"), // 清 符（尼）說　師炤等記
                "JB339", new BookInfo("靈瑞禪師嵒華集", new String[]{"清"}, "靈瑞禪師", "振澂"), // 清 符（尼）說　振澂等記
                "JB340", new BookInfo("慧覺衣禪師語錄", new String[]{"清"}, "照衣", "徹御"), // 清 照衣說　徹御等編
                "JB341", new BookInfo("佛語御禪師語錄", new String[]{"清"}, "徹御", "法傑", "法秀", "聖可"), // 清 徹御說　法傑．法秀等編　聖可序
                "JB342", new BookInfo("華嚴聖可禪師語錄", new String[]{"清"}, "德玉", "光佛"), // 清 德玉說　光佛等編
                "JB343", new BookInfo("廣福山勝覺寺密印禪師語錄", new String[]{"清"}, "真傳", "如暐"), // 清 真傳說　如暐等編
                "JB345", new BookInfo("蘇州竹庵衍禪師語錄", new String[]{"清"}, "真衍", "機如"), // 清 真衍說　機如編
                "JB346", new BookInfo("古林如禪師語錄", new String[]{"清"}, "機如", "全威"), // 清 機如說　全威等記錄
                "JB348", new BookInfo("靈峰蕅益大師宗論", new String[]{"明"}, "智旭"), // 明 智旭著
                "JB351", new BookInfo("道德經順硃", new String[]{"清"}, "德玉"), // 清 德玉順硃
                "JB352", new BookInfo("東山破峰重禪師語錄", new String[]{"清"}, "普重", "傳慧"), // 清 普重說　傳慧等編
                "JB353", new BookInfo("雲幻宸禪師語錄", new String[]{"清"}, "印宸", "發林", "王民皞", "李道泰"), // 清 印宸說　發林等編　王民皞序　李道泰塔記
                "JB354", new BookInfo("錦屏破石卓禪師雜著", new String[]{"明"}, "悟卓", "超常", "發林"), // 明 悟卓說　超常記錄　發林行狀
                "JB355", new BookInfo("綠蘿恒秀林禪師語錄", new String[]{"清"}, "發林", "光悠"), // 清 發林說　光悠等編
                "JB356", new BookInfo("奇然智禪師語錄", new String[]{"清"}, "超智", "明林", "明燦"), // 清 超智說　明林．明燦等編
                "JB357", new BookInfo("秀野林禪師語錄", new String[]{"清"}, "明林", "最正"), // 清 明林說　最正等編
                "JB358", new BookInfo("智覃正禪師語錄", new String[]{"清"}, "最正", "尚能", "尚瑩"), // 清 最正說　尚能．尚瑩等編　末附助緣耆德
                "JB359", new BookInfo("百愚禪師語錄", new String[]{"清"}, "淨斯", "智操", "智海", "智朴", "方拱乾"), // 清 淨斯說　智操．智海等編語錄　智朴．方拱乾等編蔓堂集　附蔓堂集
                "JB362", new BookInfo("觀濤奇禪師語錄", new String[]{"清"}, "大奇", "興舒"), // 清 大奇說　興舒等編
                "JB363", new BookInfo("文穆念禪師語錄", new String[]{"清"}, "念說", "真慧"), // 清 念說　真慧等編
                "JB364", new BookInfo("佛古聞禪師語錄", new String[]{"清"}, "行聞", "超質"), // 清 行聞說　超質等編
                "JB365", new BookInfo("石璞質禪師語錄", new String[]{"清"}, "超質", "明嵩"), // 清 超質說　明嵩等編
                "JB366", new BookInfo("大方禪師語錄", new String[]{"明"}, "行海", "超鳴"), // 明 行海說　超鳴編
                "JB367", new BookInfo("寂光豁禪師語錄", new String[]{"清"}, "寂光豁禪師", "發育"), // 清 豁說　發育等編
                "JB368", new BookInfo("天台通玄寺獨朗禪師語錄", new String[]{"清"}, "行日", "超心", "超香"), // 清 行曰說　超心．超香等編
                "JB369", new BookInfo("蔗菴範禪師語錄", new String[]{"清"}, "淨範", "智璋"), // 清 淨範說　智璋等錄
                "JB370", new BookInfo("草堂耨雲實禪師語錄", new String[]{"清"}, "真實", "寂訥"), // 清 真實說　寂訥等編（依駒本印）
                "JB371", new BookInfo("佛冤禪師語錄", new String[]{"清"}, "徹綱", "性純"), // 清 徹綱說　性純等編（依駒本印）
                "JB372", new BookInfo("印心佛敏訥禪師語錄", new String[]{"清"}, "寂納", "法棟", "法通"), // 清 寂納說　法棟等錄　法通等編（依駒本印）
                "JB383", new BookInfo("憨休禪師語錄", null, "繼堯"), // 繼堯等編
                "JB384", new BookInfo("憨休禪師敲空遺響", new String[]{"清"}, "如乾", "張恂", "繼堯"), // 清 如乾說　張恂編閱　繼堯校訂（依駒本印）
                "JB386", new BookInfo("遠菴僼禪師語錄", new String[]{"清"}, "本僼", "元視"), // 清 本僼說　元視等編（依駒本印）
                "JB387", new BookInfo("古宿尊禪師語錄", new String[]{"清"}, "古宿尊禪師", "明圓"), // 清 尊說　明圓等編（依駒本印）
                "JB388", new BookInfo("神鼎一揆禪師語錄", new String[]{"清"}, "元揆", "成炯"), // 清 元揆說　成炯等編（依駒本印）
                "JB389", new BookInfo("洪山俞昭允汾禪師語錄", new String[]{"清"}, "允汾", "上睿"), // 清 允汾說　上睿等編（依駒本印）
                "JB390", new BookInfo("北京楚林禪師語錄", new String[]{"清"}, "上睿", "照琮"), // 清 上睿說　照琮等錄（依駒本印）
                "JB391", new BookInfo("長目電禪師語錄", new String[]{"清"}, "光電", "悟本"), // 清 光電說　悟本編（依駒本印）
                "JB392", new BookInfo("寒松操禪師語錄", new String[]{"清"}, "智操", "德昊"), // 清 智操說　德昊編（依駒本印）
                "JB393", new BookInfo("華巖還初佛禪師語錄", new String[]{"清"}, "華巖還初佛禪師", "通量"), // 清 佛說　通量等編（依駒本印）
                "JB394", new BookInfo("翼菴禪師語錄", new String[]{"清"}, "善酇", "序燈", "序璋", "力端"), // 清 善酇說　分為國清語錄二卷　序燈等記　真如語錄三卷　序璋等記　通玄語錄一卷　力端等錄　和寒山詩二卷（依駒本印）
                "JB395", new BookInfo("荊南內護國寺啟真誠禪師語錄", new String[]{"清"}, "啟真誠禪師", "振聞"), // 清 誠說　振聞編（依駒本印）
                "JB396", new BookInfo("終南山蟠龍子肅禪師語錄", new String[]{"清"}, "超遠", "性明", "海闊"), // 清 超遠說　性明編　海闊等錄（依駒本印）
                "JB399", new BookInfo("鶴林天樹植禪師語錄", new String[]{"清"}, "行植", "湛祐"), // 清 行植說　湛祐編（依駒本印）
                "JB400", new BookInfo("知空蘊禪師語錄", new String[]{"清"}, "學蘊", "通來"), // 清 學蘊說　通來等編（依駒本印）
                "JB401", new BookInfo("浦峰長明炅禪師語錄", new String[]{"清"}, "性炅", "海棟"), // 清 性炅說　海棟編（依駒本印）
                "JB402", new BookInfo("浦峰法柱棟禪師語錄", new String[]{"清"}, "海棟", "慧昇", "慧渠", "慧岱"), // 清 海棟說　慧昇集　慧渠編　慧岱錄（依駒本印）
                "JB406", new BookInfo("廬山天然禪師語錄", new String[]{"明"}, "函昰", "今辯"), // 明 函昰說　今辯重編（依駒本印）
                "JB407", new BookInfo("千山剩人禪師語錄", new String[]{"明"}, "函可", "元賦", "今羞", "今盧", "今又"), // 明 函可說　元賦等編　今羞等錄　今盧．今又重梓（依駒本印）
                "JB408", new BookInfo("海幢阿字無禪師語錄", new String[]{"清"}, "今無", "今辯"), // 清 今無說　今辯重編（依駒本印）
                "JB409", new BookInfo("丹霞澹歸禪師語錄", new String[]{"明"}, "今釋", "今辯"), // 明 今釋說　今辯重編（依駒本印）
                "JB410", new BookInfo("蓮峰禪師語錄", new String[]{"清"}, "蓮峰禪師", "性深"), // 清 素說　性深等編（依駒本印）
                "JB411", new BookInfo("德風禪師般若語錄", new String[]{"清"}, "德風禪師", "如惺"), // 清 說　如惺等編（依駒本印）
                "JB412", new BookInfo("三塔主峰禪師語錄", new String[]{"清"}, "三塔主峰禪師", "覺海", "譚貞默"), // 清 說　覺海錄　譚貞默等請啟（依駒本印）
                "JB413", new BookInfo("黃蓮東巖禪師語錄", new String[]{"清"}, "黃蓮東巖禪師", "機琇", "黎元寬", "文德翼"), // 清 說　機琇記錄　黎元寬序　文德翼序　內分黃蓮語錄　蘄州語錄　有行實　末附懷淨土偈（依駒本印）
                "JB414", new BookInfo("山鐸真在禪師語錄", new String[]{"清"}, "真在", "機雲", "智旭"), // 清 真在說　機雲．智旭等錄（依駒本印）
                "JB415", new BookInfo("大悲妙雲禪師語錄", new String[]{"清"}, "真雄", "機德"), // 清 真雄說　機德等編（依駒本印）
                "JB416", new BookInfo("調實居士證源錄", new String[]{"清"}, "陸瑛", "羅機徹", "羅開驎", "佚名"), // 清 陸瑛說　羅機徹編　羅開驎序　佚名序（末頁缺）　有行略（依駒本印）
                "JB417", new BookInfo("天則能禪師語錄", new String[]{"清"}, "機能", "道崇", "續彌", "羅開驎", "機雲"), // 清 機能說　道崇．續彌同錄　羅開驎序　機雲序　有行略（依駒本印）
                "JB418", new BookInfo("晦嶽旭禪師語錄", new String[]{"清"}, "晦嶽旭禪師", "全琳"), // 清 旭說　全琳等錄（依駒本印）
                "JB419", new BookInfo("華嚴不厭樂禪師語錄", new String[]{"清"}, "道樂", "德普"), // 清 道樂說　德普記錄（依駒本印）
                "JB420", new BookInfo("三峰半水元禪師語錄", new String[]{"清"}, "三峰半水元禪師", "光深", "華嚴玉"), // 清 元說　光深等錄　華嚴玉序（依駒本印）
                "JB421", new BookInfo("鶴峰禪師語錄", new String[]{"清"}, "濟悟", "上震"), // 清 濟悟說　上震等編（依駒本印）
                "JB422", new BookInfo("林我禪師語錄", new String[]{"清"}, "林我禪師", "海錱", "海茲"), // 清 鑑說　海錱．海茲等編錄（依駒本印）
                "JB423", new BookInfo("石關禪師語錄", new String[]{"清"}, "石關禪師", "芳桂"), // 清 說　芳桂等編（依駒本印）
                "JB424", new BookInfo("香嚴禪師語錄", new String[]{"清"}, "香嚴禪師", "明耀", "葉燮"), // 清 說　明耀等編錄　葉燮序　有行實（依駒本印）
                "JB425", new BookInfo("即非禪師全錄", new String[]{"清"}, "如一", "明洞"), // 清 如一說　明洞等編（依駒本印）　附佛祖圖
                "JB427", new BookInfo("青城竹浪生禪師語錄", new String[]{"清"}, "徹生", "如鵬"), // 清 徹生說　如鵬等編（依駒本印）
                "JB428", new BookInfo("密行忍禪師語錄", new String[]{"清"}, "寂忍", "明廣", "明珍"), // 清 寂忍說　明廣．明珍等編（依駒本印）　附嗣燈錄
                "JB429", new BookInfo("盛京奉天般若古林禪師語錄", new String[]{"清"}, "古林禪師", "正繼", "正燈"), // 清 智說　正繼等錄　正燈等編（依駒本印）
                "JB430", new BookInfo("玉泉其白富禪師語錄", new String[]{"清"}, "德富", "圓頂"), // 清 德富說　圓頂等編（依駒本印）　附融徹錄
                "JB431", new BookInfo("雲峰體宗寧禪師語錄", new String[]{"清"}, "雲峰體宗寧禪師", "續清", "德玉", "徹生"), // 清 寧說　續清等編　德玉序　徹生序　有行實（依駒本印）
                "JB432", new BookInfo("幻住明禪師語錄", new String[]{"清"}, "幻住明禪師", "清尚"), // 清 明說　清尚等編（依駒本印）
                "JB433", new BookInfo("純備德禪師語錄", new String[]{"清"}, "廣德", "智遠"), // 清 廣德說　智遠等編（依駒本印）
                "JB434", new BookInfo("法幢遠禪師語錄", new String[]{"清"}, "智遠", "通慧", "弘源"), // 清 智遠說　通慧等編　弘源序（依駒本印）
                "JB435", new BookInfo("伏獅義公禪師語錄", new String[]{"清"}, "伏獅義公禪師", "明元", "高以永", "超琛"), // 清 （尼）說　明元記錄　高以永序　超琛跋　有行狀（依駒本印　原書第十七　十八兩頁缺）
                "JB436", new BookInfo("參同一揆禪師語錄", new String[]{"清"}, "超琛", "普明", "明俊"), // 清 超琛（尼）說　普明編　明俊錄（依駒本印）
                "JB438", new BookInfo("衡山禪師語錄", new String[]{"清"}, "燈炳", "宗位", "超源", "藍理"), // 清 燈炳說　宗位編　超源序　藍理序　有塔銘（依駒本印）
                "JB439", new BookInfo("高峰三山來禪師疏語", new String[]{"清"}, "燈來", "性統"), // 清 燈來撰　性統編（依駒本印）
                "JB440", new BookInfo("高峰喬松億禪師語錄", new String[]{"清"}, "玄億", "燈洪"), // 清 玄億說　燈洪編（依駒本印）
                "JB441", new BookInfo("萬峰童真禪師語錄", new String[]{"清"}, "至善", "德林"), // 清 至善說　德林記（依駒本印）
                "JB442", new BookInfo("大笑崇禪師語錄", new String[]{"清"}, "大笑崇禪師", "空情"), // 清 崇說　空情錄（依駒本印）
                "JB443", new BookInfo("玉眉亮禪師語錄", new String[]{"清"}, "玉眉亮禪師", "空謐", "張廷勱"), // 清 亮說　空謐編　張廷勱序（依駒本印）
                "JB444", new BookInfo("卓峰玨禪師語錄", new String[]{"清"}, "性玨", "宗位", "超原", "藍理"), // 清 性玨說　宗位編　超原序　藍理序　有塔銘　附冰玄法師語錄（依駒本印　塔銘有缺頁）
                "JB445", new BookInfo("別菴禪師同門錄", new String[]{"清"}, "性統", "弘秀"), // 清 性統錄　弘秀編（依駒本印）
                "JB446", new BookInfo("靈隱文禪師語錄", new String[]{"清"}, "印文", "福度"), // 清 印文說　福度復編（依駒本印）
                "JB447", new BookInfo("東山梅溪度禪師語錄", new String[]{"清"}, "福度", "慶緒"), // 清 福度說　慶緒等編（依駒本印）
                "JB448", new BookInfo("靈機禪師語錄", new String[]{"清"}, "行觀", "寂方"), // 清 行觀說　寂方等編（依駒本印）
                "JB449", new BookInfo("祖亮啟禪師語錄", new String[]{"清"}, "超啟", "廣和"), // 清 超啟說　廣和記錄（依駒本印）
                "JB450", new BookInfo("敏樹禪師語錄", new String[]{"清"}, "如相", "道崇", "道領"), // 清 如相說　道崇編　道領錄（依駒本印）
                "JB451", new BookInfo("赤松領禪師語錄", new String[]{"清"}, "道領", "寂源"), // 清 道領說　寂源錄（依駒本印）
                "JB452", new BookInfo("侶巖荷禪師語錄", new String[]{"清"}, "侶巖荷禪師", "成純"), // 清 荷說　成純等記錄（依駒本印）
                "JB453", new BookInfo("元潔瑩禪師語錄", new String[]{"清"}, "淨瑩", "智祥"), // 清 淨瑩說　智祥編（依駒本印）
                "JB454", new BookInfo("頻吉祥禪師語錄", new String[]{"清"}, "智祥", "德能"), // 清 智祥說　德能等編（依駒本印）
                "JB455", new BookInfo("通天逸叟高禪師語錄", new String[]{"清"}, "行高", "明德", "超原"), // 清 行高說　明德重梓　超原行略（依駒本印）
                "JB456", new BookInfo("通天澹崖原禪師語錄", new String[]{"清"}, "超原", "明德"), // 清 超原說　明德等編（依駒本印）
                "JB457", new BookInfo("白雲象林本真禪師語錄", new String[]{"清"}, "本真", "照水", "妙心"), // 清 本真說　照水重梓　妙心序　有行實（依駒本印）
                "JB458", new BookInfo("正覺潤光澤禪師澡雪集", new String[]{"清"}, "正覺潤光澤禪師", "照水", "陳聞道"), // 清 澤著　照水重編　陳聞道序　有自狀（依駒本印）
                "JB459", new BookInfo("香巖洗心水禪師語錄", new String[]{"清"}, "照水", "實雪", "海清"), // 清 照水說　實雲．海清等編
                "JB460", new BookInfo("灤州萬善暉州昊禪師語錄", new String[]{"清"}, "暉州昊禪師", "性珍", "寂寶"), // 清 昊說　性珍．寂寶等錄（依駒本印）
                "JB461", new BookInfo("性空臻禪師語錄", new String[]{"清"}, "行臻", "超自"), // 清 行臻說　超自等編（依駒本印）
                "JB462", new BookInfo("何一自禪師語錄", new String[]{"清"}, "超自", "明修", "明惠", "明智"), // 清 超自說　明修．明惠．明智等編（依駒本印）
                "JB463", new BookInfo("溈山古梅冽禪師語錄", new String[]{"清"}, "定冽", "真謙"), // 清 定冽說　真謙記錄（依駒本印）
                "JB464", new BookInfo("華嚴起宗真禪師語錄", new String[]{"清"}, "華嚴起宗真禪師", "力廣"), // 清 真說　力廣等錄（依駒本印）
                "JB465", new BookInfo("子雍如禪師語錄", new String[]{"清"}, "成如（尼）", "祖圓"), // 清 成如尼說　祖圓記錄（依駒本印）
                "JB466", new BookInfo("山西柏山楷禪師語錄", new String[]{"清"}, "德楷", "行悟"), // 清 德楷說　行悟等編次（依駒本印）
                "JB468", new BookInfo("善一純禪師語錄", new String[]{"清"}, "如純", "學正"), // 清 如純說　學正錄　附續錄（依駒本印）
                "JB469", new BookInfo("善權位禪師語錄", new String[]{"清"}, "達位", "大悅"), // 清 達位說　大悅等編（依駒本印）
                "JB470", new BookInfo("天一悅禪師語錄", new String[]{"清"}, "大悅", "學愚"), // 清 大悅說　學愚錄　有塔銘（依駒本印）
                "JB471", new BookInfo("空谷道澄禪師語錄", new String[]{"清"}, "道澄", "德儒"), // 清 道澄說　德儒編（依駒本增入並印）
                "JB472", new BookInfo("大博乾禪師語錄", new String[]{"清"}, "大博乾禪師", "超宗"), // 清 乾說　超宗等錄（依駒本增入並印）
                "JB473", new BookInfo("盤山朗空順禪師語錄", new String[]{"清"}, "盤山朗空順禪師", "實性"), // 清 順說　實性記錄　附了宗見禪師法嗣　瑞亭晟法嗣（依駒本增入並印）
                "JB474", new BookInfo("盤山了宗禪師語錄", new String[]{"清"}, "超見", "徹凡", "心月"), // 清 超見說　徹凡．心月等錄（依駒本增入並印）
                "JB475", new BookInfo("逕庭宗禪師語錄", new String[]{"清"}, "德宗", "行謙"), // 清 德宗說　行謙等編（依駒本增入並印）
                "JB476", new BookInfo("別牧純禪師語錄", new String[]{"清"}, "別牧純禪師", "福月", "慧輅"), // 清 純說　福月等編　慧輅序　有行實（依駒本增入並印）
                "JB477", new BookInfo("天翼翔禪師語錄", new String[]{"清"}, "巨翔", "寂乾", "際鋒"), // 清 巨翔說　寂乾錄　際鋒等編（駒本附於前目四七六之後　今分出增入並印）
                "JB478", new BookInfo("雲山燕居申禪師語錄", new String[]{"清"}, "德申", "合哲"), // 清 德申說　合哲等編（依駒本增入並印）
                "JB479", new BookInfo("昭覺竹峰續禪師語錄", new String[]{"清"}, "真續", "實悟"), // 清 真續說　實悟等編（依駒本增入並印）
                "JB480", new BookInfo("一貫別傳", new String[]{"清"}, "廣真"), // 清 廣真著（依駒本增入並印）
                "JB481", new BookInfo("古音王傳", new String[]{"清"}, "廣真", "古心", "黃毓英", "元善", "燈輝", "慧澤"), // 清 廣真著並序　古心評并引　凡則　黃毓英評　元善評　前有船子曲　燈輝集　慧澤序（依駒本增入並印）
                "JB483", new BookInfo("竺峰敏禪師語錄", new String[]{"清"}, "幻敏", "性鉅", "性湛", "性珩", "性濟"), // 清 幻敏說　性鉅．性湛．性珩．性濟等編　附後錄（依駒本增入並印）
                "JB484", new BookInfo("野雲映禪師宗統頌", new String[]{"清"}, "燈映", "性燦"), // 清 燈映頌　性燦錄　有塔銘　行狀（依駒本增入並印　原書第二十三頁起至末頁缺）
                "JB485", new BookInfo("普門顯禪師語錄", new String[]{"清"}, "燈顯", "性胤"), // 清 燈顯說　性胤錄（依駒本增入並印）
                "JB486", new BookInfo("鑑堂一禪師語錄", new String[]{"清"}, "鑑堂一禪師", "明滿", "明慧", "杜允貞"), // 清 一說　明滿．明慧等錄　杜允貞序（依駒本增入並印）
                "JB487", new BookInfo("翠崖必禪師語錄", new String[]{"清"}, "翠崖必禪師", "道通"), // 清 必說　道通錄（依駒本增入並印）
                "JB488", new BookInfo("斗南暐禪師語錄", new String[]{"清"}, "斗南暐禪師", "普潤"), // 清 暐說　普潤等錄（依駒本增入並印）
                "JB490", new BookInfo("博山粟如瀚禪師語錄", new String[]{"清"}, "弘瀚", "傅鵬"), // 清 弘瀚說　傅鵬編（依駒本增入並印）
                "JB491", new BookInfo("天寧法舟濟禪師剩語", new String[]{"明"}, "道濟", "如淵"), // 明 道濟撰　如淵等編
                "JB492", new BookInfo("萬峰和尚語錄", new String[]{"明"}, "時蔚", "普壽"), // 明 時蔚說　普壽集
                "JB493", new BookInfo("磬山牧亭樸夫拙禪師語錄", new String[]{"清"}, "磬山牧亭樸夫拙禪師", "光模"), // 清 拙說　光模等編
                "JB494", new BookInfo("雨山和尚語錄", new String[]{"清"}, "上思"), // 清 上思說
                "JB495", new BookInfo("天然居士懷淨土詩", new String[]{"清"}, "朱道則", "明康"), // 清 朱道則撰　明康錄
                "JB497", new BookInfo("鶴山禪師執帚集", new String[]{"清"}, "鶴山", "德敷") // 清 鶴山撰　德敷錄
        );
    }

    private static void addK() {
        add(
                "K0016", new BookInfo("能斷金剛般若波羅蜜多經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "K1064", new BookInfo("新譯大方廣佛華嚴經音義", new String[]{"唐"}, "慧菀"), // 唐 慧菀述
                "K1257", new BookInfo("新集藏經音義隨函錄", new String[]{"後晉"}, "可洪"), // 後晉 可洪撰
                "K1258", new BookInfo("御製蓮華心輪迴文偈頌", new String[]{"宋"}, "趙炅"), // 宋 太宗趙炅撰
                "K1259", new BookInfo("御製秘藏詮", new String[]{"宋"}, "趙炅"), // 宋 太宗趙炅撰
                "K1260", new BookInfo("御製逍遙詠", new String[]{"宋"}, "趙炅"), // 宋 太宗趙炅撰
                "K1261", new BookInfo("御製緣識", new String[]{"宋"}, "趙炅"), // 宋 太宗趙炅撰
                "K1402", new BookInfo("高麗國新雕大藏校正別錄", new String[]{"高麗"}, "守其"), // 高麗 守其等校勘
                "K1482", new BookInfo("大乘中觀釋論", new String[]{"宋"}, "安慧菩薩", "惟淨") // 安慧菩薩造  宋 惟淨等譯
        );
    }

    private static void addL() {
        add(
                "L1490", new BookInfo("妙法蓮華經玄義釋籤", new String[]{"隋", "唐"}, "智顗", "灌頂", "湛然"), // 隋 智顗說、灌頂記　唐 湛然釋
                "L1557", new BookInfo("大方廣佛華嚴經疏鈔會本", new String[]{"唐"}, "實叉難陀", "澄觀"), // 唐 實叉難陀譯　唐 澄觀述
                "L1571", new BookInfo("觀自在菩薩如意輪咒課法", new String[]{"宋"}, "仁岳"), // 宋 仁岳撰
                "L1600", new BookInfo("大乘起信論疏", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "L1608", new BookInfo("大藏聖教法寶標目", new String[]{"元"}, "王古"), // 元 王古撰
                "L1629", new BookInfo("大乘百法明門論註", new String[]{"唐"}, "玄奘", "慈恩法師"), // 唐 玄奘譯　增修慈恩法師解
                "L1635", new BookInfo("性相通說（選錄序文）", new String[]{"明"}, "德清"), // 明 德清述
                "L1636", new BookInfo("莊子內篇註", new String[]{"明"}, "德清"), // 明 德清註
                "L1637", new BookInfo("幻有傳禪師語錄", new String[]{"明"}, "正傳", "圓悟", "圓修"), // 明 正傅說 圓悟．圓修等編
                "L1638", new BookInfo("雪嶠信禪師語錄", new String[]{"明"}, "圓信", "弘歇"), // 明 圓信說 弘歇等編
                "L1639", new BookInfo("天隱修禪師語錄", new String[]{"明"}, "圓修", "通琇"), // 明 圓修說 通琇編
                "L1640", new BookInfo("密雲悟禪師語錄", new String[]{"明"}, "圓悟", "道忞"), // 明 圓悟說 道忞上進
                "L1641", new BookInfo("大覺普濟能仁琇國師語錄", new String[]{"清"}, "通琇", "行岳"), // 清 通琇說 行岳編
                "L1642", new BookInfo("明道正覺森禪師語錄", new String[]{"清"}, "行森", "超德"), // 清 行森說 超德等編
                "L1643", new BookInfo("弘覺忞禪師語錄", new String[]{"清"}, "道忞", "顯權"), // 清 道忞撰述 顯權等編
                "L1649", new BookInfo("山茨際禪師語錄", new String[]{"清"}, "通際", "達尊", "達謙"), // 清 通際撰述 達尊．達謙等編次
                "L1651", new BookInfo("五百羅漢尊號", new String[]{"明"}, "高道素"), // 明 高道素手錄
                "L1652", new BookInfo("明覺聰禪師語錄", new String[]{"清"}, "性聰", "寂空", "方醒"), // 清 性聰撰述 寂空．方醒等編次
                "L1666", new BookInfo("重訂教乘法數（選錄序文）", new String[]{"清"}, "超海"), // 清 超海等重訂
                "L1668", new BookInfo("御錄宗鏡大綱", new String[]{"清"}, "胤禛"), // 清 胤禎錄
                "L1669", new BookInfo("御錄經海一滴", new String[]{"清"}, "胤禛"), // 清 胤禎錄
                "LC0001", new BookInfo("印度佛學源流略講", new String[]{"民國"}, "呂澂"), // 民國 呂澂 著
                "LC0002", new BookInfo("中國佛學源流略講", new String[]{"民國"}, "呂澂"), // 民國 呂澂 著
                "LC0003", new BookInfo("西藏佛學原論及佛學論著選集", new String[]{"民國"}, "呂澂"), // 民國 呂澂 著
                "LC0004", new BookInfo("因明入正理論講解及相關論著", new String[]{"民國"}, "呂澂"), // 民國 呂澂 著
                "LC0005", new BookInfo("佛教重要名相釋義及經論攷證", new String[]{"民國"}, "呂澂"), // 民國 呂澂 著
                "LC0006", new BookInfo("歷朝藏經略考及新編漢文大藏經目錄", new String[]{"民國"}, "呂澂"), // 民國 呂澂 著
                "LC0007", new BookInfo("經論講要", new String[]{"民國"}, "呂澂") // 民國 呂澂 著
        );
    }

    private static void addM() {
        add(
                "M1540", new BookInfo("大慧普覺禪師普說", new String[]{"宋"}, "蘊聞") // 宋 蘊聞錄
        );
    }

    private static void addN() {
        add("N0001", new BookInfo("經分別", null, "通妙"), // 通妙譯
                "N0002", new BookInfo("犍度", null, "通妙"), // 通妙譯
                "N0003", new BookInfo("附隨", null, "通妙"), // 通妙譯
                "N0004", new BookInfo("長部經典", null, "通妙"), // 通妙譯
                "N0005", new BookInfo("中部經典", null, "通妙"), // 通妙譯
                "N0006", new BookInfo("相應部經典", null, "雲庵"), // 通妙譯
                "N0007", new BookInfo("增支部經典", null, "葉慶春", "關世謙", "郭哲彰"), // 葉慶春譯
                "N0008", new BookInfo("小誦經", null, "悟醒"), // 悟醒譯
                "N0009", new BookInfo("法句經", null, "悟醒"), // 悟醒譯
                "N0010", new BookInfo("自說經", null, "悟醒"), // 悟醒譯
                "N0011", new BookInfo("如是語經", null, "悟醒"), // 悟醒譯
                "N0012", new BookInfo("經集", null, "雲庵"), // 雲庵譯
                "N0013", new BookInfo("天宮事經", null, "雲庵"), // 雲庵譯
                "N0014", new BookInfo("餓鬼事經", null, "雲庵"), // 雲庵譯
                "N0015", new BookInfo("長老偈經", null, "雲庵"), // 雲庵譯
                "N0016", new BookInfo("長老尼偈經", null, "雲庵"), // 雲庵譯
                "N0017", new BookInfo("譬喻經", null, "悟醒"), // 悟醒譯
                "N0018", new BookInfo("本生經", null, "悟醒"), // 悟醒譯
                "N0019", new BookInfo("無礙解道", null, "悟醒"), // 悟醒譯
                "N0020", new BookInfo("佛種姓經", null, "悟醒"), // 悟醒譯
                "N0021", new BookInfo("所行藏經", null, "悟醒"), // 悟醒譯
                "N0022", new BookInfo("大義釋", null, "悟醒"), // 悟醒譯
                "N0023", new BookInfo("小義釋", null, "悟醒"), // 悟醒譯
                "N0024", new BookInfo("法集論", null, "郭哲彰"), // 郭哲彰譯
                "N0025", new BookInfo("分別論", null, "郭哲彰"), // 郭哲彰譯
                "N0026", new BookInfo("界論", null, "郭哲彰"), // 郭哲彰譯
                "N0027", new BookInfo("人施設論", null, "郭哲彰"), // 郭哲彰譯
                "N0028", new BookInfo("雙論", null, "郭哲彰"), // 郭哲彰譯
                "N0029", new BookInfo("發趣論", null, "郭哲彰"), // 郭哲彰譯
                "N0030", new BookInfo("論事", null, "郭哲彰"), // 郭哲彰譯
                "N0031", new BookInfo("彌蘭王問經", null, "郭哲彰"), // 郭哲彰譯
                "N0032", new BookInfo("島王統史", null, "悟醒"), // 悟醒譯
                "N0033", new BookInfo("大王統史", null, "悟醒"), // 悟醒譯
                "N0034", new BookInfo("小王統史", null, "悟醒"), // 悟醒譯
                "N0035", new BookInfo("清淨道論", null, "佛音", "悟醒"), // 佛音撰 悟醒譯
                "N0036", new BookInfo("一切善見律註序", null, "佛音", "悟醒"), // 佛音譯述 悟醒譯
                "N0037", new BookInfo("攝阿毘達磨義論", null, "阿那律陀", "悟醒"), // 阿那律陀著 悟醒譯
                "N0038", new BookInfo("阿育王刻文", null, "悟醒") // 悟醒譯
        );
    }

    private static void addP() {
        add(
                "P1519", new BookInfo("宗門統要正續集", new String[]{"宋", "元"}, "宗永;清茂"), // 宋 宗永集　元 清茂續集
                "P1573", new BookInfo("修懺要旨", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "P1581", new BookInfo("首楞嚴經義海", new String[]{"唐", "宋"}, "懷迪", "咸輝"), // 唐 懷迪證釋　宋 咸輝排經入注
                "P1590", new BookInfo("佛遺教經論疏節要", new String[]{"宋"}, "淨源"), // 宋 淨源述
                "P1610", new BookInfo("大明太宗文皇帝御製序讚文", new String[]{"明"}, "朱棣"), // 明 太宗朱棣撰
                "P1611", new BookInfo("諸佛世尊如來菩薩尊者神僧名經", new String[]{"明"}, "朱棣"), // 明 太宗朱棣制
                "P1612", new BookInfo("諸佛世尊如來菩薩尊者名稱歌曲", new String[]{"明"}, "朱棣"), // 明 太宗朱棣制
                "P1615", new BookInfo("大明三藏法數", new String[]{"明"}, "一如"), // 明 一如等編集
                "P1617", new BookInfo("妙法蓮華經要解（選錄「要解」本文）", new String[]{"宋"}, "戒環"), // 宋 戒環解
                "P1618", new BookInfo("大佛頂萬行首楞嚴經會解", new String[]{"唐", "宋", "元"}, "九師", "惟則"), // 唐宋 九師釋　元 惟則會解
                "P1624", new BookInfo("金剛經疏論纂要（選錄「釋金剛經纂要疏科」）", new String[]{"宋"}, "子璿"), // 宋 子璿錄
                "P1629", new BookInfo("天台四教儀集註（選錄「集註」本文）", new String[]{"元"}, "蒙潤"), // 元 蒙潤集
                "P1630", new BookInfo("教乘法數（選錄序文）", new String[]{"明"}, "圓瀞") // 明 圓瀞集
        );
    }

    private static void addS() {
        add(
                "S0046", new BookInfo("上生經會古通今新抄", new String[]{"唐"}, "詮明"), // 唐 詮明集
                "S0047", new BookInfo("上生經疏隨新抄科文", null) //
        );
    }

    private static void addT() {
        add(
                "T0001", new BookInfo("長阿含經", new String[]{"後秦"}, "佛陀耶舍", "竺佛念"), // 後秦 佛陀耶舍共竺佛念譯
                "T0002", new BookInfo("七佛經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0003", new BookInfo("毘婆尸佛經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0004", new BookInfo("七佛父母姓字經", null, "失譯"), // 失譯
                "T0005", new BookInfo("佛般泥洹經", new String[]{"西晉"}, "帛遠"), // 西晉 白法祖譯
                "T0006", new BookInfo("般泥洹經", null, "失譯"), // 失譯
                "T0007", new BookInfo("大般涅槃經", new String[]{"東晉"}, "法顯"), // 東晉 法顯譯
                "T0008", new BookInfo("大堅固婆羅門緣起經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0009", new BookInfo("人仙經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0010", new BookInfo("白衣金幢二婆羅門緣起經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0011", new BookInfo("尼拘陀梵志經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0012", new BookInfo("大集法門經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0013", new BookInfo("長阿含十報法經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0014", new BookInfo("人本欲生經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0015", new BookInfo("帝釋所問經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0016", new BookInfo("尸迦羅越六方禮經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0017", new BookInfo("善生子經", new String[]{"西晉"}, "支法度"), // 西晉 支法度譯
                "T0018", new BookInfo("信佛功德經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0019", new BookInfo("大三摩惹經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0020", new BookInfo("佛開解梵志阿颰經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0021", new BookInfo("梵網六十二見經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0022", new BookInfo("寂志果經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0023", new BookInfo("大樓炭經", new String[]{"西晉"}, "法立", "法炬"), // 西晉 法立共法炬譯
                "T0024", new BookInfo("起世經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多等譯
                "T0025", new BookInfo("起世因本經", new String[]{"隋"}, "達摩笈多"), // 隋 達摩笈多譯
                "T0026", new BookInfo("中阿含經", new String[]{"東晉"}, "僧伽提婆"), // 東晉 瞿曇僧伽提婆譯
                "T0027", new BookInfo("七知經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0028", new BookInfo("園生樹經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0029", new BookInfo("鹹水喻經", null, "失譯"), // 失譯
                "T0030", new BookInfo("薩鉢多酥哩踰捺野經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0031", new BookInfo("一切流攝守因經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0032", new BookInfo("四諦經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0033", new BookInfo("恒水經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0034", new BookInfo("法海經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0035", new BookInfo("海八德經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0036", new BookInfo("本相猗致經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0037", new BookInfo("緣本致經", null, "失譯"), // 失譯
                "T0038", new BookInfo("輪王七寶經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0039", new BookInfo("頂生王故事經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0040", new BookInfo("文陀竭王經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0041", new BookInfo("頻婆娑羅王經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0042", new BookInfo("鐵城泥犁經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0043", new BookInfo("閻羅王五天使者經", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T0044", new BookInfo("古來世時經", null, "失譯"), // 失譯
                "T0045", new BookInfo("大正句王經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0046", new BookInfo("阿那律八念經", new String[]{"東漢"}, "支曜"), // 後漢 支曜譯
                "T0047", new BookInfo("離睡經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0048", new BookInfo("是法非法經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0049", new BookInfo("求欲經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0050", new BookInfo("受歲經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0051", new BookInfo("梵志計水淨經", null, "失譯"), // 失譯
                "T0052", new BookInfo("大生義經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0053", new BookInfo("苦陰經", null, "失譯"), // 失譯
                "T0054", new BookInfo("釋摩男本四子經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0055", new BookInfo("苦陰因事經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0056", new BookInfo("樂想經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0057", new BookInfo("漏分布經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0058", new BookInfo("阿耨風經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0059", new BookInfo("諸法本經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0060", new BookInfo("瞿曇彌記果經", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T0061", new BookInfo("受新歲經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0062", new BookInfo("新歲經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0063", new BookInfo("解夏經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0064", new BookInfo("瞻婆比丘經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0065", new BookInfo("伏婬經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0066", new BookInfo("魔嬈亂經", null, "失譯"), // 失譯
                "T0067", new BookInfo("弊魔試目連經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0068", new BookInfo("賴吒和羅經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0069", new BookInfo("護國經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0070", new BookInfo("數經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0071", new BookInfo("梵志頞波羅延問種尊經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0072", new BookInfo("三歸五戒慈心厭離功德經", null, "失譯"), // 失譯
                "T0073", new BookInfo("須達經", new String[]{"蕭齊"}, "求那毗地"), // 蕭齊 求那毘地譯
                "T0074", new BookInfo("長者施報經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0075", new BookInfo("佛為黃竹園老婆羅門說學經", null, "失譯"), // 失譯
                "T0076", new BookInfo("梵摩渝經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0077", new BookInfo("尊上經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0078", new BookInfo("兜調經", null, "失譯"), // 失譯
                "T0079", new BookInfo("鸚鵡經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0080", new BookInfo("佛為首迦長者說業報差別經", new String[]{"隋"}, "瞿曇法智"), // 隋 瞿曇法智譯
                "T0081", new BookInfo("分別善惡報應經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0082", new BookInfo("意經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0083", new BookInfo("應法經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0084", new BookInfo("分別布施經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0085", new BookInfo("息諍因緣經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0086", new BookInfo("泥犁經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0087", new BookInfo("齋經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0088", new BookInfo("優陂夷墮舍迦經", null, "失譯"), // 失譯
                "T0089", new BookInfo("八關齋經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0090", new BookInfo("鞞摩肅經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0091", new BookInfo("婆羅門子命終愛念不離經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0092", new BookInfo("十支居士八城人經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0093", new BookInfo("邪見經", null, "失譯"), // 失譯
                "T0094", new BookInfo("箭喻經", null, "失譯"), // 失譯
                "T0095", new BookInfo("蟻喻經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0096", new BookInfo("治意經", null, "失譯"), // 失譯
                "T0097", new BookInfo("廣義法門經", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T0098", new BookInfo("普法義經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0099", new BookInfo("雜阿含經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0100", new BookInfo("別譯雜阿含經", null, "失譯"), // 失譯
                "T0101", new BookInfo("雜阿含經", null, "失譯"), // 失譯
                "T0102", new BookInfo("佛說五蘊皆空經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0103", new BookInfo("佛說聖法印經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0104", new BookInfo("佛說法印經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0105", new BookInfo("五陰譬喻經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0106", new BookInfo("佛說水沫所漂經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0107", new BookInfo("佛說不自守意經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0108", new BookInfo("佛說滿願子經", null, "失譯"), // 失譯
                "T0109", new BookInfo("佛說轉法輪經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0110", new BookInfo("佛說三轉法輪經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0111", new BookInfo("佛說相應相可經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0112", new BookInfo("佛說八正道經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0113", new BookInfo("佛說難提釋經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0114", new BookInfo("佛說馬有三相經", new String[]{"東漢"}, "支曜"), // 後漢 支曜譯
                "T0115", new BookInfo("佛說馬有八態譬人經", new String[]{"東漢"}, "支曜"), // 後漢 支曜譯
                "T0116", new BookInfo("佛說戒德香經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0117", new BookInfo("佛說戒香經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0118", new BookInfo("佛說鴦掘摩經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0119", new BookInfo("佛說鴦崛髻經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0120", new BookInfo("央掘魔羅經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0121", new BookInfo("佛說月喻經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0122", new BookInfo("佛說波斯匿王太后崩塵土坌身經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0123", new BookInfo("佛說放牛經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0124", new BookInfo("緣起經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0125", new BookInfo("增壹阿含經", new String[]{"東晉"}, "僧伽提婆"), // 東晉 瞿曇僧伽提婆譯
                "T0126", new BookInfo("佛說阿羅漢具德經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0127", new BookInfo("佛說四人出現世間經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0128a", new BookInfo("須摩提女經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0128b", new BookInfo("須摩提女經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0129", new BookInfo("佛說三摩竭經", new String[]{"吳"}, "竺律炎"), // 吳 竺律炎譯
                "T0130", new BookInfo("佛說給孤長者女得度因緣經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0131", new BookInfo("佛說婆羅門避死經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0132a", new BookInfo("佛說食施獲五福報經", null, "失譯"), // 失譯
                "T0132b", new BookInfo("施食獲五福報經", null, "失譯"), // 失譯
                "T0133", new BookInfo("頻毘娑羅王詣佛供養經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0134", new BookInfo("佛說長者子六過出家經", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T0135", new BookInfo("佛說力士移山經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0136", new BookInfo("佛說四未曾有法經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0137", new BookInfo("舍利弗摩訶目連遊四衢經", new String[]{"東漢"}, "康孟詳"), // 後漢 康孟詳譯
                "T0138", new BookInfo("佛說十一想思念如來經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0139", new BookInfo("佛說四泥犁經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0140", new BookInfo("阿那邠邸化七子經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0141", new BookInfo("佛說阿遬達經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0142a", new BookInfo("佛說玉耶女經", null, "失譯"), // 失譯
                "T0142b", new BookInfo("玉耶女經", null, "失譯"), // 失譯
                "T0143", new BookInfo("玉耶經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0144", new BookInfo("佛說大愛道般泥洹經", new String[]{"西晉"}, "帛遠"), // 西晉 白法祖譯
                "T0145", new BookInfo("佛母般泥洹經", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T0146", new BookInfo("舍衛國王夢見十事經", null, "失譯"), // 失譯
                "T0147", new BookInfo("佛說舍衛國王十夢經", null, "失譯"), // 失譯
                "T0148", new BookInfo("國王不梨先泥十夢經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0149", new BookInfo("佛說阿難同學經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0150A", new BookInfo("七處三觀經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0150B", new BookInfo("九橫經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0151", new BookInfo("佛說阿含正行經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0152", new BookInfo("六度集經", new String[]{"吳"}, "康僧會"), // 吳 康僧會譯
                "T0153", new BookInfo("菩薩本緣經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0154", new BookInfo("生經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0155", new BookInfo("菩薩本行經", null, "失譯"), // 失譯
                "T0156", new BookInfo("大方便佛報恩經", null, "失譯"), // 失譯
                "T0157", new BookInfo("悲華經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0158", new BookInfo("大乘悲分陀利經", null, "失譯"), // 失譯
                "T0159", new BookInfo("大乘本生心地觀經", new String[]{"唐"}, "般若"), // 唐 般若譯
                "T0160", new BookInfo("菩薩本生鬘論", new String[]{"宋"}, "紹德", "慧詢"), // 宋 紹德慧詢等譯
                "T0161", new BookInfo("長壽王經", null, "失譯"), // 失譯
                "T0162", new BookInfo("金色王經", new String[]{"東魏"}, "般若流支"), // 東魏 瞿曇般若流支譯
                "T0163", new BookInfo("妙色王因緣經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0164", new BookInfo("師子素馱娑王斷肉經", new String[]{"唐"}, "智嚴"), // 唐 智嚴譯
                "T0165", new BookInfo("頂生王因緣經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0166", new BookInfo("月光菩薩經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0167", new BookInfo("太子慕魄經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0168", new BookInfo("太子墓魄經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0169", new BookInfo("月明菩薩經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0170", new BookInfo("德光太子經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0171", new BookInfo("太子須大拏經", new String[]{"西秦"}, "法堅"), // 西秦 聖堅譯
                "T0172", new BookInfo("菩薩投身飴餓虎起塔因緣經", new String[]{"北涼"}, "法盛"), // 北涼 法盛譯
                "T0173", new BookInfo("福力太子因緣經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0174", new BookInfo("菩薩睒子經", null, "失譯"), // 失譯
                "T0175a", new BookInfo("睒子經", new String[]{"西秦"}, "法堅"), // 西秦 聖堅譯
                "T0175b", new BookInfo("佛說睒子經", new String[]{"乞伏秦"}, "法堅"), // 乞伏秦 聖堅譯
                "T0175c", new BookInfo("佛說睒子經", new String[]{"姚秦"}, "法堅"), // 姚秦 聖堅譯
                "T0176", new BookInfo("師子月佛本生經", null, "失譯"), // 失譯
                "T0177", new BookInfo("大意經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0178", new BookInfo("前世三轉經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0179", new BookInfo("銀色女經", new String[]{"東魏"}, "佛陀扇多"), // 元魏 佛陀扇多譯
                "T0180", new BookInfo("過去世佛分衛經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0181a", new BookInfo("九色鹿經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0181b", new BookInfo("佛說九色鹿經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0182a", new BookInfo("鹿母經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0182b", new BookInfo("佛說鹿母經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0183", new BookInfo("一切智光明仙人慈心因緣不食肉經", null, "失譯"), // 失譯
                "T0184", new BookInfo("修行本起經", new String[]{"東漢"}, "竺大力", "康孟詳"), // 後漢 竺大力共康孟詳譯
                "T0185", new BookInfo("太子瑞應本起經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0186", new BookInfo("普曜經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0187", new BookInfo("方廣大莊嚴經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0188", new BookInfo("異出菩薩本起經", new String[]{"西晉"}, "聶道真"), // 西晉 聶道真譯
                "T0189", new BookInfo("過去現在因果經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0190", new BookInfo("佛本行集經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0191", new BookInfo("眾許摩訶帝經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0192", new BookInfo("佛所行讚", new String[]{"北涼"}, "曇無讖", "馬鳴"), // 馬鳴菩薩造  北涼 曇無讖譯
                "T0193", new BookInfo("佛本行經", new String[]{"劉宋"}, "寶雲"), // 宋 釋寶雲譯
                "T0194", new BookInfo("僧伽羅剎所集經", new String[]{"符秦"}, "僧伽跋澄"), // 符秦 僧伽跋澄等譯
                "T0195", new BookInfo("佛說十二遊經", new String[]{"東晉"}, "迦留陀迦"), // 東晉 迦留陀伽譯
                "T0196", new BookInfo("中本起經", new String[]{"東漢"}, "曇果", "康孟詳"), // 後漢 曇果共康孟詳譯
                "T0197", new BookInfo("佛說興起行經", new String[]{"東漢"}, "康孟詳"), // 後漢 康孟詳譯
                "T0198", new BookInfo("佛說義足經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0199", new BookInfo("佛五百弟子自說本起經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0200", new BookInfo("撰集百緣經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0201", new BookInfo("大莊嚴論經", new String[]{"後秦"}, "鳩摩羅什", "馬鳴"), // 馬鳴菩薩造  後秦 鳩摩羅什譯
                "T0202", new BookInfo("賢愚經", new String[]{"元魏"}, "慧覺"), // 元魏 慧覺等譯
                "T0203", new BookInfo("雜寶藏經", new String[]{"元魏"}, "吉迦夜", "曇曜"), // 元魏 吉迦夜共曇曜譯
                "T0204", new BookInfo("雜譬喻經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0205", new BookInfo("雜譬喻經", null, "失譯"), // 失譯
                "T0206", new BookInfo("舊雜譬喻經", new String[]{"吳"}, "康僧會"), // 吳 康僧會譯
                "T0207", new BookInfo("雜譬喻經", null, "道略"), // 道略集
                "T0208", new BookInfo("眾經撰雜譬喻", new String[]{"姚秦"}, "鳩摩羅什", "道略"), // 道略集  姚秦 鳩摩羅什譯
                "T0209", new BookInfo("百喻經", new String[]{"蕭齊"}, "求那毗地", "僧伽斯那"), // 僧伽斯那撰  蕭齊 求那毘地譯
                "T0210", new BookInfo("法句經", new String[]{"吳"}, "維祇難", "法救"), // 法救撰  吳 維祇難等譯
                "T0211", new BookInfo("法句譬喻經", new String[]{"西晉"}, "法炬", "法立"), // 晉世 法炬共法立譯
                "T0212", new BookInfo("出曜經", new String[]{"前秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T0213", new BookInfo("法集要頌經", new String[]{"宋"}, "天息災", "法救"), // 法救集  宋 天息災譯
                "T0214", new BookInfo("猘狗經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0215", new BookInfo("群牛譬經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0216", new BookInfo("大魚事經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0217", new BookInfo("譬喻經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0218", new BookInfo("灌頂王喻經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0219", new BookInfo("醫喻經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0220", new BookInfo("大般若波羅蜜多經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0221", new BookInfo("放光般若經", new String[]{"西晉"}, "無羅叉"), // 西晉 無羅叉譯
                "T0222", new BookInfo("光讚經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0223", new BookInfo("摩訶般若波羅蜜經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0224", new BookInfo("道行般若經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0225", new BookInfo("大明度經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0226", new BookInfo("摩訶般若鈔經", new String[]{"前秦"}, "曇摩蜱", "竺佛念"), // 前秦 曇摩蜱共竺佛念譯
                "T0227", new BookInfo("小品般若波羅蜜經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0228", new BookInfo("佛說佛母出生三法藏般若波羅蜜多經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0229", new BookInfo("佛說佛母寶德藏般若波羅蜜經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0230", new BookInfo("聖八千頌般若波羅蜜多一百八名真實圓義陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0231", new BookInfo("勝天王般若波羅蜜經", new String[]{"陳"}, "月婆首那"), // 陳 月婆首那譯
                "T0232", new BookInfo("文殊師利所說摩訶般若波羅蜜經", new String[]{"梁"}, "曼陀羅仙"), // 梁 曼陀羅仙譯
                "T0233", new BookInfo("文殊師利所說般若波羅蜜經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T0234", new BookInfo("佛說濡首菩薩無上清淨分衛經", new String[]{"劉宋"}, "翔公"), // 宋 翔公譯
                "T0235", new BookInfo("金剛般若波羅蜜經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0236a", new BookInfo("金剛般若波羅蜜經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0236b", new BookInfo("金剛般若波羅蜜經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0237", new BookInfo("金剛般若波羅蜜經", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T0238", new BookInfo("金剛能斷般若波羅蜜經", new String[]{"隋"}, "達摩笈多"), // 隋 笈多譯
                "T0239", new BookInfo("佛說能斷金剛般若波羅蜜多經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0240", new BookInfo("實相般若波羅蜜經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0241", new BookInfo("金剛頂瑜伽理趣般若經", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0242", new BookInfo("佛說遍照般若波羅蜜經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0243", new BookInfo("大樂金剛不空真實三麼耶經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0244", new BookInfo("佛說最上根本大樂金剛不空三昧大教王經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0245", new BookInfo("佛說仁王般若波羅蜜經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0246", new BookInfo("仁王護國般若波羅蜜多經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0247", new BookInfo("佛說了義般若波羅蜜多經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0248", new BookInfo("佛說五十頌聖般若波羅蜜經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0249", new BookInfo("佛說帝釋般若波羅蜜多心經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0250", new BookInfo("摩訶般若波羅蜜大明呪經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0251", new BookInfo("般若波羅蜜多心經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0252", new BookInfo("普遍智藏般若波羅蜜多心經", new String[]{"唐"}, "法月"), // 唐 法月重譯
                "T0253", new BookInfo("般若波羅蜜多心經", new String[]{"唐"}, "般若", "利言"), // 唐 般若共利言等譯
                "T0254", new BookInfo("般若波羅蜜多心經", new String[]{"唐"}, "智慧輪"), // 唐 智慧輪譯
                "T0255", new BookInfo("般若波羅蜜多心經", new String[]{"唐"}, "法成"), // 唐 法成譯
                "T0256", new BookInfo("唐梵翻對字音般若波羅蜜多心經", null), //
                "T0257", new BookInfo("佛說聖佛母般若波羅蜜多經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0258", new BookInfo("佛說聖佛母小字般若波羅蜜多經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0259", new BookInfo("佛說觀想佛母般若波羅蜜多菩薩經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0260", new BookInfo("佛說開覺自性般若波羅蜜多經", new String[]{"宋"}, "惟淨"), // 宋 惟淨等譯
                "T0261", new BookInfo("大乘理趣六波羅蜜多經", new String[]{"唐"}, "般若"), // 唐 般若譯
                "T0262", new BookInfo("妙法蓮華經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0263", new BookInfo("正法華經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0264", new BookInfo("添品妙法蓮華經", new String[]{"隋"}, "闍那崛多", "達摩笈多"), // 隋 闍那崛多共笈多譯
                "T0265", new BookInfo("薩曇分陀利經", null, "失譯"), // 失譯
                "T0266", new BookInfo("佛說阿惟越致遮經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0267", new BookInfo("不退轉法輪經", null, "失譯"), // 失譯
                "T0268", new BookInfo("佛說廣博嚴淨不退轉輪經", new String[]{"劉宋"}, "智嚴"), // 宋 智嚴譯
                "T0269", new BookInfo("佛說法華三昧經", new String[]{"劉宋"}, "智嚴"), // 宋 智嚴譯
                "T0270", new BookInfo("大法鼓經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0271", new BookInfo("佛說菩薩行方便境界神通變化經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0272", new BookInfo("大薩遮尼乾子所說經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提留支譯
                "T0273", new BookInfo("金剛三昧經", null, "失譯"), // 失譯
                "T0274", new BookInfo("佛說濟諸方等學經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0275", new BookInfo("大乘方廣總持經", new String[]{"隋"}, "毘尼多流支"), // 隋 毘尼多流支譯
                "T0276", new BookInfo("無量義經", new String[]{"蕭齊"}, "曇摩迦陀耶舍"), // 蕭齊 曇摩伽陀耶舍譯
                "T0277", new BookInfo("佛說觀普賢菩薩行法經", new String[]{"劉宋"}, "曇摩蜜多"), // 劉宋 曇無蜜多譯
                "T0278", new BookInfo("大方廣佛華嚴經", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛馱跋陀羅譯
                "T0279", new BookInfo("大方廣佛華嚴經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0280", new BookInfo("佛說兜沙經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0281", new BookInfo("佛說菩薩本業經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0282", new BookInfo("諸菩薩求佛本業經", new String[]{"西晉"}, "聶道真"), // 西晉 聶道真譯
                "T0283", new BookInfo("菩薩十住行道品", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0284", new BookInfo("佛說菩薩十住經", new String[]{"東晉"}, "祇多蜜"), // 東晉 祇多蜜譯
                "T0285", new BookInfo("漸備一切智德經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0286", new BookInfo("十住經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0287", new BookInfo("佛說十地經", new String[]{"唐"}, "尸羅達摩"), // 唐 尸羅達摩譯
                "T0288", new BookInfo("等目菩薩所問三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0289", new BookInfo("顯無邊佛土功德經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0290", new BookInfo("佛說較量一切佛剎功德經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0291", new BookInfo("佛說如來興顯經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0292", new BookInfo("度世品經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0293", new BookInfo("大方廣佛華嚴經", new String[]{"唐"}, "般若"), // 唐 般若譯
                "T0294", new BookInfo("佛說羅摩伽經", new String[]{"西秦"}, "法堅"), // 西秦 聖堅譯
                "T0295", new BookInfo("大方廣佛華嚴經入法界品", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0296", new BookInfo("文殊師利發願經", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛陀跋陀羅譯
                "T0297", new BookInfo("普賢菩薩行願讚", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0298", new BookInfo("大方廣普賢所說經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0299", new BookInfo("大方廣總持寶光明經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0300", new BookInfo("大方廣佛華嚴經不思議佛境界分", new String[]{"唐"}, "提雲般若"), // 唐 提雲般若譯
                "T0301", new BookInfo("大方廣如來不思議境界經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0302", new BookInfo("度諸佛境界智光嚴經", null, "失譯"), // 失譯
                "T0303", new BookInfo("佛華嚴入如來德智不思議境界經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0304", new BookInfo("大方廣入如來智德不思議經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0305", new BookInfo("信力入印法門經", new String[]{"元魏"}, "曇摩流支"), // 元魏 曇摩流支譯
                "T0306", new BookInfo("大方廣佛花嚴經修慈分", new String[]{"唐"}, "提雲般若"), // 唐 提雲般若等譯
                "T0307", new BookInfo("佛說莊嚴菩提心經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0308", new BookInfo("佛說大方廣菩薩十地經", new String[]{"元魏"}, "吉迦夜"), // 元魏 吉迦夜譯
                "T0309", new BookInfo("最勝問菩薩十住除垢斷結經", new String[]{"姚秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T0310", new BookInfo("大寶積經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0311", new BookInfo("大方廣三戒經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0312", new BookInfo("佛說如來不思議祕密大乘經", new String[]{"宋"}, "法護"), // 宋 法護譯
                "T0313", new BookInfo("阿閦佛國經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0314", new BookInfo("佛說大乘十法經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T0315a", new BookInfo("佛說普門品經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0315b", new BookInfo("佛說普門品經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0316", new BookInfo("佛說大乘菩薩藏正法經", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T0317", new BookInfo("佛說胞胎經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0318", new BookInfo("文殊師利佛土嚴淨經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0319", new BookInfo("大聖文殊師利菩薩佛剎功德莊嚴經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0320", new BookInfo("父子合集經", new String[]{"宋"}, "日稱"), // 宋 日稱等譯
                "T0321", new BookInfo("佛說護國尊者所問大乘經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0322", new BookInfo("法鏡經", new String[]{"東漢"}, "安玄"), // 後漢 安玄譯
                "T0323", new BookInfo("郁迦羅越問菩薩行經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0324", new BookInfo("佛說幻士仁賢經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0325", new BookInfo("佛說決定毘尼經", new String[]{"西晉"}, "竺法護"), // 西晉 燉煌三藏譯
                "T0326", new BookInfo("佛說三十五佛名禮懺文", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0327", new BookInfo("發覺淨心經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0328", new BookInfo("佛說須賴經", new String[]{"曹魏"}, "白延"), // 曹魏 白延譯
                "T0329", new BookInfo("佛說須賴經", new String[]{"前涼"}, "支施侖"), // 前涼 支施崙譯
                "T0330", new BookInfo("佛說菩薩修行經", new String[]{"西晉"}, "帛遠"), // 西晉 白法祖譯
                "T0331", new BookInfo("佛說無畏授所問大乘經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0332", new BookInfo("佛說優填王經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0333", new BookInfo("佛說大乘日子王所問經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0334", new BookInfo("佛說須摩提菩薩經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0335", new BookInfo("佛說須摩提菩薩經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0336", new BookInfo("須摩提經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0337", new BookInfo("佛說阿闍貰王女阿術達菩薩經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0338", new BookInfo("佛說離垢施女經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0339", new BookInfo("得無垢女經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0340", new BookInfo("文殊師利所說不思議佛境界經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0341", new BookInfo("聖善住意天子所問經", new String[]{"東魏"}, "毗目智仙", "般若流支"), // 元魏 毘目智仙共般若流支譯
                "T0342", new BookInfo("佛說如幻三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0343", new BookInfo("佛說太子刷護經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0344", new BookInfo("佛說太子和休經", null, "失譯"), // 失譯
                "T0345", new BookInfo("慧上菩薩問大善權經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0346", new BookInfo("佛說大方廣善巧方便經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0347", new BookInfo("大乘顯識經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0348", new BookInfo("佛說大乘方等要慧經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0349", new BookInfo("彌勒菩薩所問本願經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0350", new BookInfo("佛說遺日摩尼寶經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0351", new BookInfo("佛說摩訶衍寶嚴經", null, "失譯"), // 失譯
                "T0352", new BookInfo("佛說大迦葉問大寶積正法經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0353", new BookInfo("勝鬘師子吼一乘大方便方廣經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0354", new BookInfo("毘耶娑問經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0355", new BookInfo("入法界體性經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0356", new BookInfo("佛說寶積三昧文殊師利菩薩問法身經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0357", new BookInfo("如來莊嚴智慧光明入一切佛境界經", new String[]{"元魏"}, "曇摩流支"), // 元魏 曇摩流支譯
                "T0358", new BookInfo("度一切諸佛境界智嚴經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅等譯
                "T0359", new BookInfo("佛說大乘入諸佛境界智光明莊嚴經", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T0360", new BookInfo("佛說無量壽經", new String[]{"曹魏"}, "康僧鎧"), // 曹魏 康僧鎧譯
                "T0361", new BookInfo("佛說無量清淨平等覺經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0362", new BookInfo("佛說阿彌陀三耶三佛薩樓佛檀過度人道經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0363", new BookInfo("佛說大乘無量壽莊嚴經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0364", new BookInfo("佛說大阿彌陀經", new String[]{"宋"}, "王日休"), // 宋 王日休校輯
                "T0365", new BookInfo("佛說觀無量壽佛經", new String[]{"劉宋"}, "畺良耶舍"), // 宋 畺良耶舍譯
                "T0366", new BookInfo("佛說阿彌陀經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0367", new BookInfo("稱讚淨土佛攝受經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0368", new BookInfo("拔一切業障根本得生淨土神呪", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅重譯
                "T0369", new BookInfo("阿彌陀佛說呪", null), //
                "T0370", new BookInfo("阿彌陀鼓音聲王陀羅尼經", null, "失譯"), // 失譯
                "T0371", new BookInfo("觀世音菩薩授記經", new String[]{"劉宋"}, "法勇"), // 宋 曇無竭譯
                "T0372", new BookInfo("佛說如幻三摩地無量印法門經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0373", new BookInfo("後出阿彌陀佛偈", null, "失譯"), // 失譯
                "T0374", new BookInfo("大般涅槃經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0375", new BookInfo("大般涅槃經", new String[]{"劉宋"}, "慧嚴"), // 宋 慧嚴等依泥洹經加之
                "T0376", new BookInfo("佛說大般泥洹經", new String[]{"東晉"}, "法顯"), // 東晉 法顯譯
                "T0377", new BookInfo("大般涅槃經後分", new String[]{"唐"}, "若那跋陀羅"), // 唐 若那跋陀羅譯
                "T0378", new BookInfo("佛說方等般泥洹經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0379", new BookInfo("四童子三昧經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0380", new BookInfo("大悲經", new String[]{"高齊"}, "那連提黎耶舍"), // 高齊 那連提耶舍譯
                "T0381", new BookInfo("等集眾德三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0382", new BookInfo("集一切福德三昧經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0383", new BookInfo("摩訶摩耶經", new String[]{"蕭齊"}, "曇景"), // 蕭齊 曇景譯
                "T0384", new BookInfo("菩薩從兜術天降神母胎說廣普經", new String[]{"姚秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T0385", new BookInfo("中陰經", new String[]{"姚秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T0386", new BookInfo("蓮華面經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0387", new BookInfo("大方等無想經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0388", new BookInfo("大雲無想經卷第九", new String[]{"姚秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T0389", new BookInfo("佛垂般涅槃略說教誡經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0390", new BookInfo("佛臨涅槃記法住經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0391", new BookInfo("般泥洹後灌臘經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0392", new BookInfo("佛滅度後棺斂葬送經", null, "失譯"), // 失譯
                "T0393", new BookInfo("迦葉赴佛般涅槃經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0394", new BookInfo("佛入涅槃密迹金剛力士哀戀經", null, "失譯"), // 失譯
                "T0395", new BookInfo("佛說當來變經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0396", new BookInfo("佛說法滅盡經", null, "失譯"), // 失譯
                "T0397", new BookInfo("大方等大集經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0398", new BookInfo("大哀經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0399", new BookInfo("寶女所問經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0400", new BookInfo("佛說海意菩薩所問淨印法門經", new String[]{"宋"}, "惟淨"), // 宋 惟淨等譯
                "T0401", new BookInfo("佛說無言童子經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0402", new BookInfo("寶星陀羅尼經", new String[]{"唐"}, "波羅頗迦羅蜜多羅"), // 唐 波羅頗蜜多羅譯
                "T0403", new BookInfo("阿差末菩薩經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0404", new BookInfo("大集大虛空藏菩薩所問經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0405", new BookInfo("虛空藏菩薩經", new String[]{"姚秦"}, "佛陀耶舍"), // 姚秦 佛陀耶舍譯
                "T0406", new BookInfo("虛空藏菩薩神呪經", null, "失譯"), // 失譯
                "T0407", new BookInfo("虛空藏菩薩神呪經", new String[]{"劉宋"}, "曇摩蜜多"), // 宋 曇摩蜜多譯
                "T0408", new BookInfo("虛空孕菩薩經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0409", new BookInfo("觀虛空藏菩薩經", new String[]{"劉宋"}, "曇摩蜜多"), // 劉宋 曇摩蜜多譯
                "T0410", new BookInfo("大方廣十輪經", null, "失譯"), // 失譯
                "T0411", new BookInfo("大乘大集地藏十輪經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0412", new BookInfo("地藏菩薩本願經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0413", new BookInfo("百千頌大集經地藏菩薩請問法身讚", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0414", new BookInfo("菩薩念佛三昧經", new String[]{"劉宋"}, "功德直"), // 劉宋 功德直譯
                "T0415", new BookInfo("大方等大集經菩薩念佛三昧分", new String[]{"隋"}, "達摩笈多"), // 隋 達磨笈多譯
                "T0416", new BookInfo("大方等大集經賢護分", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0417", new BookInfo("般舟三昧經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0418", new BookInfo("般舟三昧經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0419", new BookInfo("拔陂菩薩經", null, "失譯"), // 失譯
                "T0420", new BookInfo("自在王菩薩經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0421", new BookInfo("奮迅王問經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0422", new BookInfo("大集譬喻王經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0423", new BookInfo("僧伽吒經", new String[]{"東魏"}, "月婆首那"), // 元魏 月婆首那譯
                "T0424", new BookInfo("大集會正法經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0425", new BookInfo("賢劫經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0426", new BookInfo("佛說千佛因緣經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0427", new BookInfo("佛說八吉祥神呪經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0428", new BookInfo("佛說八陽神呪經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0429", new BookInfo("佛說八部佛名經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0430", new BookInfo("八吉祥經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T0431", new BookInfo("八佛名號經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0432", new BookInfo("佛說十吉祥經", null, "失譯"), // 失譯
                "T0433", new BookInfo("佛說寶網經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0434", new BookInfo("佛說稱揚諸佛功德經", new String[]{"元魏"}, "吉迦夜"), // 元魏 吉迦夜譯
                "T0435", new BookInfo("佛說滅十方冥經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0436", new BookInfo("受持七佛名號所生功德經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0437", new BookInfo("大乘寶月童子問法經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0438", new BookInfo("佛說大乘大方廣佛冠經", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T0439", new BookInfo("佛說諸佛經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0440", new BookInfo("佛說佛名經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0441", new BookInfo("佛說佛名經", null), //
                "T0442", new BookInfo("十方千五百佛名經", null, "失譯"), // 失譯
                "T0443", new BookInfo("五千五百佛名神呪除障滅罪經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0444", new BookInfo("佛說百佛名經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0445", new BookInfo("佛說不思議功德諸佛所護念經", null, "失譯"), // 失譯
                "T0446a", new BookInfo("過去莊嚴劫千佛名經", null, "闕譯"), // 闕譯
                "T0446b", new BookInfo("過去莊嚴劫千佛名經", null, "失譯"), // 失譯
                "T0447a", new BookInfo("現在賢劫千佛名經", null, "闕譯"), // 闕譯
                "T0447b", new BookInfo("現在賢劫千佛名經", null), //
                "T0448a", new BookInfo("未來星宿劫千佛名經", null, "闕譯"), // 闕譯
                "T0448b", new BookInfo("未來星宿劫千佛名經", null, "失譯"), // 失譯
                "T0449", new BookInfo("佛說藥師如來本願經", new String[]{"隋"}, "達摩笈多"), // 隋 達摩笈多譯
                "T0450", new BookInfo("藥師琉璃光如來本願功德經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0451", new BookInfo("藥師琉璃光七佛本願功德經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0452", new BookInfo("佛說觀彌勒菩薩上生兜率天經", new String[]{"劉宋"}, "沮渠京聲"), // 宋 沮渠京聲譯
                "T0453", new BookInfo("佛說彌勒下生經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0454", new BookInfo("佛說彌勒下生成佛經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0455", new BookInfo("佛說彌勒下生成佛經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0456", new BookInfo("佛說彌勒大成佛經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0457", new BookInfo("佛說彌勒來時經", null, "失譯"), // 失譯
                "T0458", new BookInfo("文殊師利問菩薩署經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0459", new BookInfo("佛說文殊悔過經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0460", new BookInfo("佛說文殊師利淨律經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0461", new BookInfo("佛說文殊師利現寶藏經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0462", new BookInfo("大方廣寶篋經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0463", new BookInfo("佛說文殊師利般涅槃經", new String[]{"西晉"}, "聶道真"), // 西晉 聶道真譯
                "T0464", new BookInfo("文殊師利問菩提經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0465", new BookInfo("伽耶山頂經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0466", new BookInfo("佛說象頭精舍經", new String[]{"隋"}, "毘尼多流支"), // 隋 毘尼多流支譯
                "T0467", new BookInfo("大乘伽耶山頂經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0468", new BookInfo("文殊師利問經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T0469", new BookInfo("文殊問經字母品第十四", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0470", new BookInfo("佛說文殊師利巡行經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0471", new BookInfo("佛說文殊師利行經", new String[]{"隋"}, "闍那崛多"), // 隋 豆那掘多譯
                "T0472", new BookInfo("佛說大乘善見變化文殊師利問法經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0473", new BookInfo("佛說妙吉祥菩薩所問大乘法螺經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0474", new BookInfo("佛說維摩詰經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0475", new BookInfo("維摩詰所說經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0476", new BookInfo("說無垢稱經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0477", new BookInfo("佛說大方等頂王經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0478", new BookInfo("大乘頂王經", new String[]{"梁"}, "月婆首那"), // 梁 月婆首那譯
                "T0479", new BookInfo("善思童子經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0480", new BookInfo("佛說月上女經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0481", new BookInfo("持人菩薩經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0482", new BookInfo("持世經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0483", new BookInfo("三曼陀跋陀羅菩薩經", new String[]{"西晉"}, "聶道真"), // 西晉 聶道真譯
                "T0484", new BookInfo("不思議光菩薩所說經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T0485", new BookInfo("無所有菩薩經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多等譯
                "T0486", new BookInfo("師子莊嚴王菩薩請問經", new String[]{"唐"}, "那提"), // 唐 那提譯
                "T0487", new BookInfo("離垢慧菩薩所問禮佛法經", new String[]{"唐"}, "那提"), // 唐 那提譯
                "T0488", new BookInfo("寶授菩薩菩提行經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0489", new BookInfo("佛說除蓋障菩薩所問經", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T0490", new BookInfo("佛說八大菩薩經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0491", new BookInfo("六菩薩亦當誦持經", null, "失譯"), // 失譯
                "T0492a", new BookInfo("佛說阿難問事佛吉凶經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0492b", new BookInfo("阿難問事佛吉凶經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0493", new BookInfo("佛說阿難四事經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0494", new BookInfo("阿難七夢經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0495", new BookInfo("佛說阿難分別經", new String[]{"乞伏秦"}, "法堅"), // 乞伏秦 法堅譯
                "T0496", new BookInfo("佛說大迦葉本經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0497", new BookInfo("佛說摩訶迦葉度貧母經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0498", new BookInfo("佛說初分說經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0499", new BookInfo("佛為阿支羅迦葉自化作苦經", null, "失譯"), // 失譯
                "T0500", new BookInfo("羅云忍辱經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0501", new BookInfo("佛說沙曷比丘功德經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0502", new BookInfo("佛為年少比丘說正事經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0503", new BookInfo("比丘避女惡名欲自殺經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0504", new BookInfo("比丘聽施經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T0505", new BookInfo("佛說隨勇尊者經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0506", new BookInfo("犍陀國王經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0507", new BookInfo("佛說未生冤經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0508", new BookInfo("阿闍世王問五逆經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0509", new BookInfo("阿闍世王授決經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0510", new BookInfo("採花違王上佛授決號妙花經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0511", new BookInfo("佛說蓱沙王五願經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0512", new BookInfo("佛說淨飯王般涅槃經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0513", new BookInfo("佛說琉璃王經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0514", new BookInfo("佛說諫王經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0515", new BookInfo("如來示教勝軍王經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0516", new BookInfo("佛說勝軍王所問經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0517", new BookInfo("佛說末羅王經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0518", new BookInfo("佛說旃陀越國王經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0519", new BookInfo("佛說摩達國王經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0520", new BookInfo("佛說薩羅國經", null, "失譯"), // 失譯
                "T0521", new BookInfo("佛說梵摩難國王經", null, "失譯"), // 失譯
                "T0522", new BookInfo("普達王經", null, "失譯"), // 失譯
                "T0523", new BookInfo("佛說五王經", null, "失譯"), // 失譯
                "T0524", new BookInfo("佛為優填王說王法政論經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0525", new BookInfo("佛說長者子懊惱三處經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0526", new BookInfo("佛說長者子制經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0527", new BookInfo("佛說逝童子經", new String[]{"西晉"}, "支法度"), // 西晉 支法度譯
                "T0528", new BookInfo("佛說菩薩逝經", new String[]{"西晉"}, "帛遠"), // 西晉 白法祖譯
                "T0529", new BookInfo("佛說阿鳩留經", null, "失譯"), // 失譯
                "T0530", new BookInfo("佛說須摩提長者經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0531", new BookInfo("佛說長者音悅經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0532", new BookInfo("私呵昧經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0533", new BookInfo("菩薩生地經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0534", new BookInfo("佛說月光童子經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0535", new BookInfo("佛說申日經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0536", new BookInfo("申日兒本經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0537", new BookInfo("佛說越難經", new String[]{"西晉"}, "聶承遠"), // 西晉 聶承遠譯
                "T0538", new BookInfo("佛說呵雕阿那鋡經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0539", new BookInfo("盧至長者因緣經", null, "失譯"), // 失譯
                "T0540a", new BookInfo("佛說樹提伽經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0540b", new BookInfo("佛說樹提伽經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0541", new BookInfo("佛說佛大僧大經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0542", new BookInfo("佛說耶祇經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0543", new BookInfo("佛說巨力長者所問大乘經", new String[]{"宋"}, "智吉祥"), // 宋 智吉祥等譯
                "T0544", new BookInfo("辯意長者子經", new String[]{"後魏"}, "法場"), // 後魏 法場譯
                "T0545", new BookInfo("佛說德護長者經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0546", new BookInfo("佛說金耀童子經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0547", new BookInfo("大花嚴長者問佛那羅延力經", new String[]{"唐"}, "般若", "利言"), // 唐 般若共利言譯
                "T0548", new BookInfo("佛說金光王童子經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0549", new BookInfo("佛說光明童子因緣經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0550", new BookInfo("金色童子因緣經", new String[]{"宋"}, "惟淨"), // 宋 惟淨等譯
                "T0551", new BookInfo("佛說摩鄧女經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0552", new BookInfo("佛說摩登女解形中六事經", null, "失譯"), // 失譯
                "T0553", new BookInfo("佛說㮈女祇域因緣經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0554", new BookInfo("佛說奈女耆婆經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0555a", new BookInfo("五母子經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0555b", new BookInfo("五母子經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0556", new BookInfo("佛說七女經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0557", new BookInfo("佛說龍施女經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0558", new BookInfo("佛說龍施菩薩本起經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0559", new BookInfo("佛說老女人經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0560", new BookInfo("佛說老母女六英經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0561", new BookInfo("佛說老母經", null, "失譯"), // 失譯
                "T0562", new BookInfo("佛說無垢賢女經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0563", new BookInfo("佛說腹中女聽經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0564", new BookInfo("佛說轉女身經", new String[]{"劉宋"}, "曇摩蜜多"), // 劉宋 曇摩蜜多譯
                "T0565", new BookInfo("順權方便經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0566", new BookInfo("樂瓔珞莊嚴方便品經", new String[]{"姚秦"}, "曇摩耶舍"), // 姚秦 曇摩耶舍譯
                "T0567", new BookInfo("佛說梵志女首意經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0568", new BookInfo("有德女所問大乘經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0569", new BookInfo("佛說心明經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0570", new BookInfo("佛說賢首經", new String[]{"西秦"}, "法堅"), // 西秦 聖堅譯
                "T0571", new BookInfo("佛說婦人遇辜經", new String[]{"乞伏秦"}, "法堅"), // 乞伏秦 聖堅譯
                "T0572", new BookInfo("佛說長者法志妻經", null, "失譯"), // 失譯
                "T0573", new BookInfo("差摩婆帝授記經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0574", new BookInfo("佛說堅固女經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0575", new BookInfo("佛說大方等修多羅王經", new String[]{"後魏"}, "菩提流支"), // 後魏 菩提流支譯
                "T0576", new BookInfo("佛說轉有經", new String[]{"東魏"}, "佛陀扇多"), // 元魏 佛陀扇多譯
                "T0577", new BookInfo("佛說大乘流轉諸有經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0578", new BookInfo("無垢優婆夷問經", new String[]{"東魏"}, "般若流支"), // 後魏 瞿曇般若流支譯
                "T0579", new BookInfo("優婆夷淨行法門經", null, "失譯"), // 失譯
                "T0580", new BookInfo("佛說長者女菴提遮師子吼了義經", null, "失譯"), // 失譯
                "T0581", new BookInfo("佛說八師經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0582", new BookInfo("佛說孫多耶致經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0583", new BookInfo("佛說黑氏梵志經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0584", new BookInfo("長爪梵志請問經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0585", new BookInfo("持心梵天所問經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0586", new BookInfo("思益梵天所問經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0587", new BookInfo("勝思惟梵天所問經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0588", new BookInfo("佛說須真天子經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0589", new BookInfo("佛說魔逆經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0590", new BookInfo("佛說四天王經", new String[]{"劉宋"}, "智嚴", "寶雲"), // 劉宋 智嚴共寶雲譯
                "T0591", new BookInfo("商主天子所問經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0592", new BookInfo("天請問經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0593", new BookInfo("佛為勝光天子說王法經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0594", new BookInfo("佛說大自在天子因地經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0595", new BookInfo("佛說嗟韈曩法天子受三歸依獲免惡道經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0596", new BookInfo("佛說天王太子辟羅經", null, "失譯"), // 失譯
                "T0597", new BookInfo("龍王兄弟經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0598", new BookInfo("佛說海龍王經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0599", new BookInfo("佛為海龍王說法印經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0600", new BookInfo("十善業道經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0601", new BookInfo("佛為娑伽羅龍王所說大乘經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0602", new BookInfo("佛說大安般守意經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0603", new BookInfo("陰持入經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0604", new BookInfo("佛說禪行三十七品經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0605", new BookInfo("禪行法想經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0606", new BookInfo("修行道地經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0607", new BookInfo("道地經", new String[]{"東漢"}, "安清", "眾護"), // 僧伽羅剎造  後漢 安世高譯
                "T0608", new BookInfo("小道地經", new String[]{"東漢"}, "支曜"), // 後漢 支曜譯
                "T0609", new BookInfo("禪要經", null, "失譯"), // 失譯
                "T0610", new BookInfo("佛說內身觀章句經", null, "失譯"), // 失譯
                "T0611", new BookInfo("法觀經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0612", new BookInfo("身觀經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0613", new BookInfo("禪祕要法經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什等譯
                "T0614", new BookInfo("坐禪三昧經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0615", new BookInfo("菩薩訶色欲法經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0616", new BookInfo("禪法要解", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0617", new BookInfo("思惟略要法", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0618", new BookInfo("達摩多羅禪經", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛陀跋陀羅譯
                "T0619", new BookInfo("五門禪經要用法", new String[]{"劉宋"}, "曇摩蜜多", "佛陀蜜多"), // 佛陀蜜多撰  劉宋 曇摩蜜多譯
                "T0620", new BookInfo("治禪病祕要法", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0621", new BookInfo("佛說佛印三昧經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0622", new BookInfo("佛說自誓三昧經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0623", new BookInfo("佛說如來獨證自誓三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0624", new BookInfo("佛說伅真陀羅所問如來三昧經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0625", new BookInfo("大樹緊那羅王所問經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0626", new BookInfo("佛說阿闍世王經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0627", new BookInfo("文殊支利普超三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0628", new BookInfo("佛說未曾有正法經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0629", new BookInfo("佛說放鉢經", null, "闕譯"), // 闕譯
                "T0630", new BookInfo("佛說成具光明定意經", new String[]{"東漢"}, "支曜"), // 後漢 支曜譯
                "T0631", new BookInfo("佛說法律三昧經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0632", new BookInfo("佛說慧印三昧經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0633", new BookInfo("佛說如來智印經", null, "失譯"), // 失譯
                "T0634", new BookInfo("佛說大乘智印經", new String[]{"宋"}, "智吉祥"), // 宋 智吉祥等譯
                "T0635", new BookInfo("佛說弘道廣顯三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0636", new BookInfo("無極寶三昧經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0637", new BookInfo("佛說寶如來三昧經", new String[]{"東晉"}, "祇多蜜"), // 東晉 祇多蜜譯
                "T0638", new BookInfo("佛說超日明三昧經", new String[]{"西晉"}, "聶承遠"), // 西晉 聶承遠譯
                "T0639", new BookInfo("月燈三昧經", new String[]{"高齊"}, "那連提黎耶舍"), // 高齊 那連提耶舍譯
                "T0640", new BookInfo("佛說月燈三昧經", new String[]{"劉宋"}, "先公"), // 劉宋 先公譯
                "T0641", new BookInfo("佛說月燈三昧經", new String[]{"劉宋"}, "先公"), // 劉宋 先公譯
                "T0642", new BookInfo("佛說首楞嚴三昧經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0643", new BookInfo("佛說觀佛三昧海經", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛陀跋陀羅譯
                "T0644", new BookInfo("佛說金剛三昧本性清淨不壞不滅經", null, "失譯"), // 失譯
                "T0645", new BookInfo("不必定入定入印經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0646", new BookInfo("入定不定印經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0647", new BookInfo("力莊嚴三昧經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0648", new BookInfo("寂照神變三摩地經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0649", new BookInfo("觀察諸法行經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0650", new BookInfo("諸法無行經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0651", new BookInfo("佛說諸法本無經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0652", new BookInfo("佛說大乘隨轉宣說諸法經", new String[]{"宋"}, "紹德"), // 宋 紹德等譯
                "T0653", new BookInfo("佛藏經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0654", new BookInfo("佛說入無分別法門經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0655", new BookInfo("佛說勝義空經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0656", new BookInfo("菩薩瓔珞經", new String[]{"前秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T0657", new BookInfo("佛說華手經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0658", new BookInfo("寶雲經", new String[]{"梁"}, "曼陀羅仙"), // 梁 曼陀羅仙譯
                "T0659", new BookInfo("大乘寶雲經", new String[]{"梁"}, "曼陀羅仙", "僧伽婆羅"), // 梁 曼陀羅仙共僧伽婆羅譯
                "T0660", new BookInfo("佛說寶雨經", new String[]{"唐"}, "菩提流志"), // 唐 達摩流支譯
                "T0661", new BookInfo("大乘百福相經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0662", new BookInfo("大乘百福莊嚴相經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0663", new BookInfo("金光明經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T0664", new BookInfo("合部金光明經", new String[]{"隋"}, "寶貴"), // 隋 寶貴合
                "T0665", new BookInfo("金光明最勝王經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0666", new BookInfo("大方等如來藏經", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛陀跋陀羅譯
                "T0667", new BookInfo("大方廣如來藏經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0668", new BookInfo("佛說不增不減經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0669", new BookInfo("佛說無上依經", new String[]{"梁"}, "真諦"), // 梁 真諦譯
                "T0670", new BookInfo("楞伽阿跋多羅寶經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0671", new BookInfo("入楞伽經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0672", new BookInfo("大乘入楞伽經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0673", new BookInfo("大乘同性經", new String[]{"宇文周"}, "闍那耶舍"), // 宇文周 闍那耶舍譯
                "T0674", new BookInfo("證契大乘經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0675", new BookInfo("深密解脫經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0676", new BookInfo("解深密經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0677", new BookInfo("佛說解節經", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T0678", new BookInfo("相續解脫地波羅蜜了義經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0679", new BookInfo("相續解脫如來所作隨順處了義經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0680", new BookInfo("佛說佛地經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0681", new BookInfo("大乘密嚴經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0682", new BookInfo("大乘密嚴經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0683", new BookInfo("佛說諸德福田經", new String[]{"西晉"}, "法立", "法炬"), // 西晉 法立法炬共譯
                "T0684", new BookInfo("佛說父母恩難報經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0685", new BookInfo("佛說盂蘭盆經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0686", new BookInfo("佛說報恩奉盆經", null, "失譯"), // 失譯
                "T0687", new BookInfo("佛說孝子經", null, "失譯"), // 失譯
                "T0688", new BookInfo("佛說未曾有經", null, "失譯"), // 失譯
                "T0689", new BookInfo("甚希有經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0690", new BookInfo("佛說希有挍量功德經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0691", new BookInfo("最無比經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0692", new BookInfo("佛說作佛形像經", null, "闕譯"), // 闕譯
                "T0693", new BookInfo("佛說造立形像福報經", null, "闕譯"), // 闕譯
                "T0694", new BookInfo("佛說大乘造像功德經", new String[]{"唐"}, "提雲般若"), // 唐 提雲般若譯
                "T0695", new BookInfo("佛說灌洗佛形像經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0696", new BookInfo("佛說摩訶剎頭經", new String[]{"西秦"}, "法堅"), // 西秦 聖堅譯
                "T0697", new BookInfo("佛說浴像功德經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T0698", new BookInfo("浴佛功德經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0699", new BookInfo("佛說造塔功德經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0700", new BookInfo("右繞佛塔功德經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0701", new BookInfo("佛說溫室洗浴眾僧經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0702", new BookInfo("佛說施燈功德經", new String[]{"高齊"}, "那連提黎耶舍"), // 高齊 那連提耶舍譯
                "T0703", new BookInfo("燈指因緣經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0704", new BookInfo("佛說樓閣正法甘露鼓經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0705", new BookInfo("佛說布施經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0706", new BookInfo("佛說五大施經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0707", new BookInfo("佛說出家功德經", null, "失譯"), // 失譯
                "T0708", new BookInfo("了本生死經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0709", new BookInfo("佛說稻芉經", null, "闕譯"), // 闕譯
                "T0710", new BookInfo("慈氏菩薩所說大乘緣生稻𦼮喻經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0711", new BookInfo("大乘舍黎娑擔摩經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0712", new BookInfo("佛說大乘稻芉經", null, "失譯"), // 失譯
                "T0713", new BookInfo("貝多樹下思惟十二因緣經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0714", new BookInfo("緣起聖道經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0715", new BookInfo("佛說舊城喻經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0716", new BookInfo("緣生初勝分法本經", new String[]{"隋"}, "達摩笈多"), // 隋 達摩笈多譯
                "T0717", new BookInfo("分別緣起初勝法門經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0718", new BookInfo("佛說分別緣生經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0719", new BookInfo("十二緣生祥瑞經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0720", new BookInfo("無明羅剎集", null, "失譯"), // 失譯
                "T0721", new BookInfo("正法念處經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0722", new BookInfo("妙法聖念處經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0723", new BookInfo("分別業報略經", new String[]{"劉宋"}, "僧伽跋摩", "大勇"), // 大勇菩薩撰  劉宋 僧伽跋摩譯
                "T0724", new BookInfo("佛說罪業應報教化地獄經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0725", new BookInfo("佛說六道伽陀經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0726", new BookInfo("六趣輪迴經", new String[]{"宋"}, "日稱", "馬鳴"), // 馬鳴菩薩集  宋 日稱等譯
                "T0727", new BookInfo("十不善業道經", new String[]{"宋"}, "日稱", "馬鳴"), // 馬鳴菩薩集  宋 日稱等譯
                "T0728", new BookInfo("諸法集要經", new String[]{"宋"}, "日稱", "觀無畏"), // 觀無畏尊者集  宋 日稱等譯
                "T0729", new BookInfo("佛說分別善惡所起經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0730", new BookInfo("佛說處處經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0731", new BookInfo("佛說十八泥犁經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0732", new BookInfo("佛說罵意經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0733", new BookInfo("佛說堅意經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0734", new BookInfo("佛說鬼問目連經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0735", new BookInfo("佛說四願經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0736", new BookInfo("佛說四自侵經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0737", new BookInfo("所欲致患經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0738", new BookInfo("佛說分別經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0739", new BookInfo("佛說慢法經", new String[]{"西晉"}, "法炬"), // 西晉 法炬譯
                "T0740", new BookInfo("佛說頞多和多耆經", null, "失譯"), // 失譯
                "T0741", new BookInfo("五苦章句經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0742", new BookInfo("佛說自愛經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0743", new BookInfo("佛說忠心經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0744", new BookInfo("佛說除恐災患經", new String[]{"乞伏秦"}, "法堅"), // 乞伏秦 聖堅譯
                "T0745", new BookInfo("佛說雜藏經", new String[]{"東晉"}, "法顯"), // 東晉 法顯譯
                "T0746", new BookInfo("餓鬼報應經", null, "失譯"), // 失譯
                "T0747a", new BookInfo("佛說罪福報應經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0747b", new BookInfo("佛說輪轉五道罪福報應經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0748", new BookInfo("佛說護淨經", null, "失譯"), // 失譯
                "T0749", new BookInfo("佛說因緣僧護經", null, "失譯"), // 失譯
                "T0750", new BookInfo("沙彌羅經", null, "失譯"), // 失譯
                "T0751a", new BookInfo("佛說五無反復經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0751b", new BookInfo("佛說五無返復經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0752", new BookInfo("佛說五無返復經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0753", new BookInfo("十二品生死經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0754", new BookInfo("佛說未曾有因緣經", new String[]{"蕭齊"}, "曇景"), // 蕭齊 曇景譯
                "T0755", new BookInfo("佛說淨意優婆塞所問經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0756", new BookInfo("佛說八無暇有暇經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0757", new BookInfo("佛說身毛喜豎經", new String[]{"宋"}, "惟淨"), // 宋 惟淨等譯
                "T0758", new BookInfo("佛說諸行有為經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0759", new BookInfo("佛說較量壽命經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0760", new BookInfo("惟日雜難經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0761", new BookInfo("佛說法集經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0762", new BookInfo("佛說決定義經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0763", new BookInfo("佛說法乘義決定經", new String[]{"宋"}, "金總持"), // 宋 金總持等譯
                "T0764", new BookInfo("佛說法集名數經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0765", new BookInfo("本事經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0766", new BookInfo("佛說法身經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0767", new BookInfo("佛說三品弟子經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0768", new BookInfo("三慧經", null, "失譯"), // 失譯
                "T0769", new BookInfo("佛說四輩經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0770", new BookInfo("佛說四不可得經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0771", new BookInfo("四品學法經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0772", new BookInfo("大乘四法經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0773", new BookInfo("佛說菩薩修行四法經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0774", new BookInfo("大乘四法經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T0775", new BookInfo("佛說四無所畏經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0776", new BookInfo("佛說四品法門經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0777", new BookInfo("佛說賢者五福德經", new String[]{"西晉"}, "帛遠"), // 西晉 白法祖譯
                "T0778", new BookInfo("佛說菩薩內習六波羅蜜經", new String[]{"東漢"}, "嚴佛調"), // 後漢 嚴佛調譯
                "T0779", new BookInfo("佛說八大人覺經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0780", new BookInfo("佛說十力經", new String[]{"唐"}, "勿提提羼魚"), // 唐 勿提提犀魚譯
                "T0781", new BookInfo("佛說佛十力經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0782", new BookInfo("佛說十號經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0783", new BookInfo("佛說十二頭陀經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T0784", new BookInfo("四十二章經", new String[]{"東漢"}, "攝摩騰", "竺法蘭"), // 後漢 迦葉摩騰共法蘭譯
                "T0785", new BookInfo("得道梯橙錫杖經", null, "失譯"), // 失譯
                "T0786", new BookInfo("佛說木槵子經", null, "失譯"), // 失譯
                "T0787", new BookInfo("曼殊室利呪藏中校量數珠功德經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0788", new BookInfo("佛說校量數珠功德經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T0789", new BookInfo("金剛頂瑜伽念珠經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0790", new BookInfo("佛說孛經抄", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0791", new BookInfo("佛說出家緣經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0792", new BookInfo("佛說法受塵經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T0793", new BookInfo("佛說佛醫經", new String[]{"吳"}, "竺律炎", "支謙"), // 吳 竺律炎共支越譯
                "T0794a", new BookInfo("佛說時非時經", new String[]{"西晉"}, "若羅嚴"), // 西晉 若羅嚴譯
                "T0794b", new BookInfo("佛說時非時經", new String[]{"西晉"}, "若羅嚴"), // 西晉 若羅嚴譯
                "T0795", new BookInfo("佛治身經", null, "失譯"), // 失譯
                "T0796", new BookInfo("佛說見正經", new String[]{"東晉"}, "曇無蘭"), // 東晉 竺曇無蘭譯
                "T0797a", new BookInfo("佛說貧窮老公經", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T0797b", new BookInfo("佛說貧窮老公經", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T0798", new BookInfo("佛說進學經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0799", new BookInfo("佛說略教誡經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0800", new BookInfo("佛說無上處經", null, "失譯"), // 失譯
                "T0801", new BookInfo("佛說無常經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0802", new BookInfo("佛說信解智力經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0803", new BookInfo("佛說清淨心經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0804", new BookInfo("佛說解憂經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0805", new BookInfo("佛說栴檀樹經", null, "失譯"), // 失譯
                "T0806", new BookInfo("佛說枯樹經", null), //
                "T0807", new BookInfo("佛說內藏百寶經", new String[]{"東漢"}, "支婁迦讖"), // 後漢 支婁迦讖譯
                "T0808", new BookInfo("佛說犢子經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T0809", new BookInfo("佛說乳光佛經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0810", new BookInfo("諸佛要集經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0811", new BookInfo("佛說決定總持經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0812", new BookInfo("菩薩行五十緣身經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0813", new BookInfo("佛說無希望經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0814", new BookInfo("佛說象腋經", new String[]{"劉宋"}, "曇摩蜜多"), // 劉宋 曇摩蜜多譯
                "T0815", new BookInfo("佛昇忉利天為母說法經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0816", new BookInfo("佛說道神足無極變化經", new String[]{"西晉"}, "安法欽"), // 西晉 安法欽譯
                "T0817", new BookInfo("佛說大淨法門經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T0818", new BookInfo("大莊嚴法門經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0819", new BookInfo("佛說法常住經", null, "失譯"), // 失譯
                "T0820", new BookInfo("佛說演道俗業經", new String[]{"乞伏秦"}, "法堅"), // 乞伏秦 聖堅譯
                "T0821", new BookInfo("大方廣如來祕密藏經", null, "失譯"), // 失譯
                "T0822", new BookInfo("佛說諸法勇王經", new String[]{"劉宋"}, "曇摩蜜多"), // 劉宋 曇摩蜜多譯
                "T0823", new BookInfo("佛說一切法高王經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0824", new BookInfo("諸法最上王經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0825", new BookInfo("佛說甚深大迴向經", null, "失譯"), // 失譯
                "T0826", new BookInfo("弟子死復生經", new String[]{"劉宋"}, "沮渠京聲"), // 劉宋 沮渠京聲譯
                "T0827", new BookInfo("佛說懈怠耕者經", new String[]{"劉宋"}, "慧簡"), // 劉宋 惠簡譯
                "T0828", new BookInfo("無字寶篋經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0829", new BookInfo("大乘離文字普光明藏經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0830", new BookInfo("大乘遍照光明藏無字法門經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅再譯
                "T0831", new BookInfo("謗佛經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0832", new BookInfo("佛語經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T0833", new BookInfo("第一義法勝經", new String[]{"東魏"}, "般若流支"), // 元魏 瞿曇般若流支譯
                "T0834", new BookInfo("大威燈光仙人問疑經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多等譯
                "T0835", new BookInfo("如來師子吼經", new String[]{"元魏"}, "佛陀扇多"), // 元魏 佛陀扇多譯
                "T0836", new BookInfo("大方廣師子吼經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0837", new BookInfo("佛說出生菩提心經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T0838", new BookInfo("佛說發菩提心破諸魔經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0839", new BookInfo("占察善惡業報經", new String[]{"隋"}, "菩提登"), // 隋 菩提燈譯
                "T0840", new BookInfo("稱讚大乘功德經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0841", new BookInfo("說妙法決定業障經", new String[]{"唐"}, "智嚴"), // 唐 智嚴譯
                "T0842", new BookInfo("大方廣圓覺修多羅了義經", new String[]{"唐"}, "佛陀多羅"), // 唐 佛陀多羅譯
                "T0843", new BookInfo("佛說大乘不思議神通境界經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0844", new BookInfo("佛說大方廣未曾有經善巧方便品", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0845", new BookInfo("佛說尊那經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0846", new BookInfo("外道問聖大乘法無我義經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0847", new BookInfo("大乘修行菩薩行門諸經要集", new String[]{"唐"}, "智嚴"), // 唐 智嚴譯
                "T0848", new BookInfo("大毘盧遮那成佛神變加持經", new String[]{"唐"}, "善無畏", "一行"), // 唐 善無畏．一行譯
                "T0849", new BookInfo("大毘盧遮那佛說要略念誦經", new String[]{"唐"}, "金剛智"), // 唐 菩提金剛譯
                "T0850", new BookInfo("攝大毘盧遮那成佛神變加持經入蓮華胎藏海會悲生曼荼攞廣大念誦儀軌供養方便會", new String[]{"唐"}, "善無畏"), // 唐 輸婆迦羅譯
                "T0851", new BookInfo("大毘盧遮那經廣大儀軌", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0852a", new BookInfo("大毘盧遮那成佛神變加持經蓮華胎藏悲生曼荼羅廣大成就儀軌供養方便會", new String[]{"唐"}, "法全"), // 唐 法全撰
                "T0852b", new BookInfo("大毘盧舍那成佛神變加持經蓮華胎藏悲生曼荼羅廣大成就儀軌", null), //
                "T0853", new BookInfo("大毘盧遮那成佛神變加持經蓮華胎藏菩提幢標幟普通真言藏廣大成就瑜伽", new String[]{"唐"}, "法全"), // 唐 法全集
                "T0854", new BookInfo("胎藏梵字真言", null, "失譯"), // 失譯
                "T0855", new BookInfo("青龍寺軌記", null), //
                "T0856", new BookInfo("大毘盧遮那成佛神變加持經略示七支念誦隨行法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0857", new BookInfo("大日經略攝念誦隨行法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0858", new BookInfo("大毘盧遮那略要速疾門五支念誦法", null), //
                "T0859", new BookInfo("供養儀式", null), //
                "T0860", new BookInfo("大日經持誦次第儀軌", null), //
                "T0861", new BookInfo("毘盧遮那五字真言修習儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0862", new BookInfo("阿闍梨大曼荼攞灌頂儀軌", null), //
                "T0863", new BookInfo("大毘盧遮那經阿闍梨真實智品中阿闍梨住阿字觀門", new String[]{"唐"}, "惟謹"), // 唐 惟謹述
                "T0864A", new BookInfo("大日如來劍印", null), //
                "T0864B", new BookInfo("胎藏金剛教法名號", new String[]{"唐"}, "義操"), // 唐 義操集
                "T0865", new BookInfo("金剛頂一切如來真實攝大乘現證大教王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0866", new BookInfo("金剛頂瑜伽中略出念誦經", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0867", new BookInfo("金剛峰樓閣一切瑜伽瑜祇經", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0868", new BookInfo("諸佛境界攝真實經", new String[]{"唐"}, "般若"), // 唐 般若譯
                "T0869", new BookInfo("金剛頂經瑜伽十八會指歸", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0870", new BookInfo("略述金剛頂瑜伽分別聖位修證法門", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0871", new BookInfo("金剛頂瑜伽略述三十七尊心要", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0872", new BookInfo("金剛頂瑜伽三十七尊出生義", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0873", new BookInfo("金剛頂蓮華部心念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0874", new BookInfo("金剛頂一切如來真實攝大乘現證大教王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0875", new BookInfo("蓮華部心念誦儀軌", null, "失譯"), // 失譯
                "T0876", new BookInfo("金剛頂瑜伽修習毘盧遮那三摩地法", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0877", new BookInfo("金剛頂經毘盧遮那一百八尊法身契印", new String[]{"唐"}, "善無畏", "一行"), // 唐 善無畏．一行譯
                "T0878", new BookInfo("金剛頂經金剛界大道場毘盧遮那如來自受用身內證智眷屬法身異名佛最上乘祕密三摩地禮懺文", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0879", new BookInfo("金剛頂瑜伽三十七尊禮", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0880", new BookInfo("瑜伽金剛頂經釋字母品", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0881", new BookInfo("賢劫十六尊", null), //
                "T0882", new BookInfo("佛說一切如來真實攝大乘現證三昧大教王經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0883", new BookInfo("佛說祕密三昧大教王經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0884", new BookInfo("佛說祕密相經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T0885", new BookInfo("佛說一切如來金剛三業最上祕密大教王經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0886", new BookInfo("佛說金剛場莊嚴般若波羅蜜多教中一分", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0887", new BookInfo("佛說無二平等最上瑜伽大教王經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0888", new BookInfo("一切祕密最上名義大教王儀軌", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0889", new BookInfo("一切如來大祕密王未曾有最上微妙大曼拏羅經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T0890", new BookInfo("佛說瑜伽大教王經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0891", new BookInfo("佛說幻化網大瑜伽教十忿怒明王大明觀想儀軌經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0892", new BookInfo("佛說大悲空智金剛大教王儀軌經", new String[]{"宋"}, "法護"), // 宋 法護譯
                "T0893a", new BookInfo("蘇悉地羯羅經", new String[]{"唐"}, "善無畏"), // 唐 輸波迦羅譯
                "T0893b", new BookInfo("蘇悉地羯羅經", new String[]{"唐"}, "善無畏"), // 唐 輸波迦羅譯
                "T0893c", new BookInfo("蘇悉地羯羅經", new String[]{"唐"}, "善無畏"), // 唐 輸波迦羅譯
                "T0894a", new BookInfo("蘇悉地羯羅供養法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0894b", new BookInfo("蘇悉地羯羅供養法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0895a", new BookInfo("蘇婆呼童子請問經", new String[]{"唐"}, "善無畏"), // 唐 輸波迦羅譯
                "T0895b", new BookInfo("蘇婆呼童子請問經", new String[]{"唐"}, "善無畏"), // 唐 輸波迦羅譯
                "T0896", new BookInfo("妙臂菩薩所問經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0897", new BookInfo("蕤呬耶經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0898", new BookInfo("佛說毘奈耶經", null), //
                "T0899", new BookInfo("清淨法身毘盧遮那心地法門成就一切陀羅尼三種悉地", null), //
                "T0900", new BookInfo("十八契印", new String[]{"唐"}, "慧果"), // 唐 惠果造
                "T0901", new BookInfo("陀羅尼集經", new String[]{"唐"}, "阿地瞿多"), // 唐 阿地瞿多譯
                "T0902", new BookInfo("總釋陀羅尼義讚", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0903", new BookInfo("都部陀羅尼目", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0904", new BookInfo("念誦結護法普通諸部", new String[]{"唐"}, "金剛智"), // 唐 金剛智述
                "T0905", new BookInfo("三種悉地破地獄轉業障出三界祕密陀羅尼法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0906", new BookInfo("佛頂尊勝心破地獄轉業障出三界祕密三身佛果三種悉地真言儀軌", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0907", new BookInfo("佛頂尊勝心破地獄轉業障出三界祕密陀羅尼", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0908", new BookInfo("金剛頂瑜伽護摩儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0909", new BookInfo("金剛頂瑜伽護摩儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0910", new BookInfo("梵天擇地法", null), //
                "T0911", new BookInfo("建立曼荼羅及揀擇地法", new String[]{"唐"}, "慧琳"), // 唐 慧琳集
                "T0912", new BookInfo("建立曼荼羅護摩儀軌", new String[]{"唐"}, "法全"), // 唐 法全集
                "T0913", new BookInfo("火𤙖供養儀軌", null), //
                "T0914", new BookInfo("火吽軌別錄", null), //
                "T0915", new BookInfo("受菩提心戒儀", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0916", new BookInfo("受五戒八戒文", null), //
                "T0917", new BookInfo("無畏三藏禪要", new String[]{"唐"}, "善無畏"), // 唐 善無畏說
                "T0918", new BookInfo("諸佛心陀羅尼經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T0919", new BookInfo("諸佛心印陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0920", new BookInfo("佛心經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0921", new BookInfo("阿閦如來念誦供養法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0922", new BookInfo("藥師琉璃光如來消災除難念誦儀軌", new String[]{"唐"}, "一行"), // 唐 一行撰
                "T0923", new BookInfo("藥師如來觀行儀軌法", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0924A", new BookInfo("藥師如來念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0924B", new BookInfo("藥師如來念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0924C", new BookInfo("藥師儀軌一具", null), //
                "T0925", new BookInfo("藥師琉璃光王七佛本願功德經念誦儀軌", new String[]{"元"}, "沙囉巴"), // 元 沙囉巴譯
                "T0926", new BookInfo("藥師琉璃光王七佛本願功德經念誦儀軌供養法", new String[]{"元"}, "沙囉巴"), // 元 沙囉巴譯
                "T0927", new BookInfo("藥師七佛供養儀軌如意王經", new String[]{"清"}, "工布查布"), // 清 工布查布譯
                "T0928", new BookInfo("修藥師儀軌布壇法", new String[]{"清"}, "阿旺扎什"), // 清 阿旺扎什補譯
                "T0929", new BookInfo("淨瑠璃淨土摽", null), //
                "T0930", new BookInfo("無量壽如來觀行供養儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0931", new BookInfo("金剛頂經觀自在王如來修行法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0932", new BookInfo("金剛頂經瑜伽觀自在王如來修行法", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0933", new BookInfo("九品往生阿彌陀三摩地集陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0934", new BookInfo("佛說無量功德陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0935", new BookInfo("極樂願文", new String[]{"清"}, "薩穆丹達爾吉"), // 清 達喇嘛嘎卜楚薩木丹達爾吉譯
                "T0936", new BookInfo("大乘無量壽經", new String[]{"唐"}, "法成"), // 唐 法成譯
                "T0937", new BookInfo("佛說大乘聖無量壽決定光明王如來陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0938", new BookInfo("釋迦文尼佛金剛一乘修行儀軌法品", null), //
                "T0939", new BookInfo("佛說大乘觀想曼拏羅淨諸惡趣經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T0940", new BookInfo("佛說帝釋巖祕密成就儀軌", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0941", new BookInfo("釋迦牟尼佛成道在菩提樹降魔讚", null), //
                "T0942", new BookInfo("釋迦佛讚", new String[]{"清"}, "薩穆丹達爾吉"), // 清 達喇嘛薩穆丹達爾吉譯
                "T0943", new BookInfo("佛說無能勝幡王如來莊嚴陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0944A", new BookInfo("大佛頂如來放光悉怛多鉢怛囉陀羅尼", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0944B", new BookInfo("大佛頂大陀羅尼", null), //
                "T0945", new BookInfo("大佛頂如來密因修證了義諸菩薩萬行首楞嚴經", new String[]{"唐"}, "般剌蜜帝"), // 唐 般剌蜜帝譯
                "T0946", new BookInfo("大佛頂廣聚陀羅尼經", null), //
                "T0947", new BookInfo("大佛頂如來放光悉怛多般怛羅大神力都攝一切呪王陀羅尼經大威德最勝金輪三昧呪品", null), //
                "T0948", new BookInfo("金輪王佛頂要略念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0949", new BookInfo("奇特最勝金輪佛頂念誦儀軌法要", null), //
                "T0950", new BookInfo("菩提場所說一字頂輪王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0951", new BookInfo("一字佛頂輪王經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0952", new BookInfo("五佛頂三昧陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T0953", new BookInfo("一字奇特佛頂經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0954A", new BookInfo("一字頂輪王念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0954B", new BookInfo("一字頂輪王念誦儀軌", null), //
                "T0955", new BookInfo("一字頂輪王瑜伽觀行儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0956", new BookInfo("大陀羅尼末法中一字心呪經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T0957", new BookInfo("金剛頂一字頂輪王瑜伽一切時處念誦成佛儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0958", new BookInfo("金剛頂經一字頂輪王儀軌音義", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0959", new BookInfo("頂輪王大曼荼羅灌頂儀軌", new String[]{"唐"}, "辯弘"), // 唐 [(工*刀)/言]弘集
                "T0960", new BookInfo("一切如來說佛頂輪王一百八名讚", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T0961", new BookInfo("如意寶珠轉輪祕密現身成佛金輪呪王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0962", new BookInfo("寶悉地成佛陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0963", new BookInfo("佛說熾盛光大威德消災吉祥陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0964", new BookInfo("佛說大威德金輪佛頂熾盛光如來消除一切災難陀羅尼經", null, "失譯"), // 失譯
                "T0965", new BookInfo("大妙金剛大甘露軍拏利焰鬘熾盛佛頂經", new String[]{"唐"}, "達摩栖那"), // 唐 達磨栖那譯
                "T0966", new BookInfo("大聖妙吉祥菩薩說除災教令法輪", new String[]{"唐"}, "尸羅達摩"), // 唐 尸羅跋陀羅譯
                "T0967", new BookInfo("佛頂尊勝陀羅尼經", new String[]{"唐"}, "佛陀波利"), // 唐 佛陀波利譯
                "T0968", new BookInfo("佛頂尊勝陀羅尼經", new String[]{"唐"}, "杜行顗"), // 唐 杜行顗譯
                "T0969", new BookInfo("佛頂最勝陀羅尼經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0970", new BookInfo("最勝佛頂陀羅尼淨除業障呪經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T0971", new BookInfo("佛說佛頂尊勝陀羅尼經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0972", new BookInfo("佛頂尊勝陀羅尼念誦儀軌法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0973", new BookInfo("尊勝佛頂脩瑜伽法軌儀", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T0974A", new BookInfo("最勝佛頂陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0974B", new BookInfo("佛頂尊勝陀羅尼", null), //
                "T0974C", new BookInfo("加句靈驗佛頂尊勝陀羅尼記", new String[]{"唐"}, "武徹"), // 唐 武徹述
                "T0974D", new BookInfo("佛頂尊勝陀羅尼注義", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0974E", new BookInfo("佛頂尊勝陀羅尼真言", null), //
                "T0974F", new BookInfo("佛頂尊勝陀羅尼別法", new String[]{"唐"}, "若那"), // 唐 若那譯
                "T0975", new BookInfo("白傘蓋大佛頂王最勝無比大威德金剛無礙大道場陀羅尼念誦法要", null), //
                "T0976", new BookInfo("佛頂大白傘蓋陀羅尼經", new String[]{"元"}, "沙囉巴"), // 元 沙囉巴譯
                "T0977", new BookInfo("佛說大白傘蓋總持陀羅尼經", new String[]{"元"}, "真智"), // 元 真智等譯
                "T0978", new BookInfo("佛說一切如來烏瑟膩沙最勝總持經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T0979", new BookInfo("于瑟抳沙毘左野陀囉尼", new String[]{"高麗"}, "指空"), // 高麗 指空譯
                "T0980", new BookInfo("大勝金剛佛頂念誦儀軌", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T0981", new BookInfo("大毘盧遮那佛眼修行儀軌", new String[]{"唐"}, "一行"), // 唐 一行記
                "T0982", new BookInfo("佛母大孔雀明王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0983A", new BookInfo("佛說大孔雀明王畫像壇場儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0983B", new BookInfo("孔雀經真言等梵本", new String[]{"唐"}, "圓仁"), // 唐 圓仁請來
                "T0984", new BookInfo("孔雀王呪經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T0985", new BookInfo("佛說大孔雀呪王經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T0986", new BookInfo("大金色孔雀王呪經", null, "失譯"), // 失譯
                "T0987", new BookInfo("佛說大金色孔雀王呪經", null, "失譯"), // 失譯
                "T0988", new BookInfo("孔雀王呪經", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T0989", new BookInfo("大雲輪請雨經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0990", new BookInfo("大雲經祈雨壇法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0991", new BookInfo("大雲輪請雨經", new String[]{"隋"}, "那連提黎耶舍"), // 隋 那連提耶舍譯
                "T0992", new BookInfo("大方等大雲經請雨品第六十四", new String[]{"北周"}, "闍那耶舍"), // 北周 闍那耶舍譯
                "T0993", new BookInfo("大雲經請雨品第六十四", new String[]{"北周"}, "闍那耶舍"), // 北周 闍那耶舍譯
                "T0994", new BookInfo("仁王護國般若波羅蜜多經陀羅尼念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0995", new BookInfo("仁王般若念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0996", new BookInfo("仁王般若陀羅尼釋", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T0997", new BookInfo("守護國界主陀羅尼經", new String[]{"唐"}, "般若", "牟尼室利"), // 唐 般若共牟尼室利譯
                "T0998", new BookInfo("佛說迴向輪經", new String[]{"唐"}, "尸羅達摩"), // 唐 尸羅達摩譯
                "T0999", new BookInfo("佛說守護大千國土經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1000", new BookInfo("成就妙法蓮華經王瑜伽觀智儀軌", new String[]{"唐"}, "不空") // 唐 不空譯
        );
    }

    private static void addT1000() {
        add(
                "T1001", new BookInfo("法華曼荼羅威儀形色法經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1002", new BookInfo("不空羂索毘盧遮那佛大灌頂光真言", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1003", new BookInfo("大樂金剛不空真實三昧耶經般若波羅蜜多理趣釋", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1004", new BookInfo("般若波羅蜜多理趣經大樂不空三昧真實金剛薩埵菩薩等一十七聖大曼荼羅義述", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1005A", new BookInfo("大寶廣博樓閣善住祕密陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1005B", new BookInfo("寶樓閣經梵字真言", null), //
                "T1006", new BookInfo("廣大寶樓閣善住祕密陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1007", new BookInfo("牟梨曼陀羅呪經", null, "失譯"), // 失譯
                "T1008", new BookInfo("菩提場莊嚴陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1009", new BookInfo("出生無邊門陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1010", new BookInfo("佛說出生無邊門陀羅尼儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1011", new BookInfo("佛說無量門微密持經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T1012", new BookInfo("佛說出生無量門持經", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛陀跋陀羅譯
                "T1013", new BookInfo("阿難陀目佉尼呵離陀經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T1014", new BookInfo("無量門破魔陀羅尼經", new String[]{"劉宋"}, "功德直", "玄暢"), // 劉宋 功德直．玄暢譯
                "T1015", new BookInfo("佛說阿難陀目佉尼呵離陀隣尼經", new String[]{"元魏"}, "佛陀扇多"), // 元魏 佛馱扇多譯
                "T1016", new BookInfo("舍利弗陀羅尼經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T1017", new BookInfo("佛說一向出生菩薩經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1018", new BookInfo("出生無邊門陀羅尼經", new String[]{"唐"}, "智嚴"), // 唐 智嚴譯
                "T1019", new BookInfo("大方廣佛華嚴經入法界品四十二字觀門", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1020", new BookInfo("大方廣佛花嚴經入法界品頓證毘盧遮那法身字輪瑜伽儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1021", new BookInfo("華嚴經心陀羅尼", null), //
                "T1022A", new BookInfo("一切如來心祕密全身舍利寶篋印陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1022B", new BookInfo("一切如來心祕密全身舍利寶篋印陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1023", new BookInfo("一切如來正法祕密篋印心陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1024", new BookInfo("無垢淨光大陀羅尼經", new String[]{"唐"}, "寂友"), // 唐 彌陀山譯
                "T1025", new BookInfo("佛頂放無垢光明入普門觀察一切如來心陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1026", new BookInfo("佛說造塔延命功德經", new String[]{"唐"}, "般若"), // 唐 般若譯
                "T1027a", new BookInfo("金剛光焰止風雨陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1027b", new BookInfo("金剛光焰止風雨陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1028A", new BookInfo("佛說護諸童子陀羅尼經", new String[]{"元魏"}, "菩提流支"), // 元魏 菩提流支譯
                "T1028B", new BookInfo("童子經念誦法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1029", new BookInfo("佛說安宅陀羅尼呪經", null), //
                "T1030", new BookInfo("觀自在大悲成就瑜伽蓮華部念誦法門", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1031", new BookInfo("聖觀自在菩薩心真言瑜伽觀行儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1032", new BookInfo("瑜伽蓮華部念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1033", new BookInfo("金剛恐怖集會方廣軌儀觀自在菩薩三世最勝心明王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1034", new BookInfo("呪五首", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1035", new BookInfo("千轉陀羅尼觀世音菩薩呪", new String[]{"唐"}, "智通"), // 唐 智通譯
                "T1036", new BookInfo("千轉大明陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1037", new BookInfo("觀自在菩薩說普賢陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1038", new BookInfo("清淨觀世音普賢陀羅尼經", new String[]{"唐"}, "智通"), // 唐 智通譯
                "T1039", new BookInfo("阿唎多羅陀羅尼阿嚕力經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1040", new BookInfo("金剛頂降三世大儀軌法王教中觀自在菩薩心真言一切如來蓮華大曼荼羅品", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1041", new BookInfo("觀自在菩薩心真言一印念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1042", new BookInfo("觀自在菩薩大悲智印周遍法界利益眾生薰真如法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1043", new BookInfo("請觀世音菩薩消伏毒害陀羅尼呪經", new String[]{"東晉"}, "難提"), // 東晉 難提譯
                "T1044", new BookInfo("佛說六字呪王經", null, "失譯"), // 失譯
                "T1045a", new BookInfo("佛說六字神呪王經", null, "失譯"), // 失譯
                "T1045b", new BookInfo("六字神呪王經", null, "失譯"), // 失譯
                "T1046", new BookInfo("六字大陀羅尼呪經", null, "失譯"), // 失譯
                "T1047", new BookInfo("佛說聖六字大明王陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1048", new BookInfo("佛說大護明大陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1049", new BookInfo("聖六字增壽大明陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1050", new BookInfo("佛說大乘莊嚴寶王經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1051", new BookInfo("佛說一切佛攝相應大教王經聖觀自在菩薩念誦儀軌", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1052", new BookInfo("讚觀世音菩薩頌", new String[]{"唐"}, "慧智"), // 唐 慧智譯
                "T1053", new BookInfo("聖觀自在菩薩功德讚", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1054", new BookInfo("聖觀自在菩薩一百八名經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1055", new BookInfo("佛說聖觀自在菩薩梵讚", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1056", new BookInfo("金剛頂瑜伽千手千眼觀自在菩薩修行儀軌經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1057a", new BookInfo("千眼千臂觀世音菩薩陀羅尼神呪經", new String[]{"唐"}, "智通"), // 唐 智通譯
                "T1057b", new BookInfo("千眼千臂觀世音菩薩陀羅尼神呪經", new String[]{"唐"}, "智通"), // 唐 智通譯
                "T1058", new BookInfo("千手千眼觀世音菩薩姥陀羅尼身經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1059", new BookInfo("千手千眼觀世音菩薩治病合藥經", new String[]{"唐"}, "伽梵達摩"), // 唐 伽梵達摩譯
                "T1060", new BookInfo("千手千眼觀世音菩薩廣大圓滿無礙大悲心陀羅尼經", new String[]{"唐"}, "伽梵達摩"), // 唐 伽梵達摩譯
                "T1061", new BookInfo("千手千眼觀自在菩薩廣大圓滿無礙大悲心陀羅尼呪本", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1062A", new BookInfo("千手千眼觀世音菩薩大身呪本", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1062B", new BookInfo("世尊聖者千眼千首千足千舌千臂觀自在菩提薩埵怛嚩廣大圓滿無礙大悲心陀羅尼", null, "空海"), //
                "T1063", new BookInfo("番大悲神呪", null), //
                "T1064", new BookInfo("千手千眼觀世音菩薩大悲心陀羅尼", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1065", new BookInfo("千光眼觀自在菩薩祕密法經", new String[]{"唐"}, "三昧蘇嚩羅"), // 唐 三昧蘇嚩羅譯
                "T1066", new BookInfo("大悲心陀羅尼修行念誦略儀", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1067", new BookInfo("攝無礙大悲心大陀羅尼經計一法中出無量義南方滿願補陀落海會五部諸尊等弘誓力方位及威儀形色執持三摩耶幖幟曼荼羅儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1068", new BookInfo("千手觀音造次第法儀軌", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1069", new BookInfo("十一面觀自在菩薩心密言念誦儀軌經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1070", new BookInfo("佛說十一面觀世音神呪經", new String[]{"北周"}, "耶舍崛多"), // 北周 耶舍崛多譯
                "T1071", new BookInfo("十一面神呪心經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1072A", new BookInfo("聖賀野紇哩縛大威怒王立成大神驗供養念誦儀軌法品", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1072B", new BookInfo("馬頭觀音心陀羅尼", null, "空海"), //
                "T1073", new BookInfo("何耶揭唎婆像法", null), //
                "T1074", new BookInfo("何耶揭唎婆觀世音菩薩受法壇", null), //
                "T1075", new BookInfo("佛說七俱胝佛母准提大明陀羅尼經", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1076", new BookInfo("七俱胝佛母所說准提陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1077", new BookInfo("佛說七俱胝佛母心大准提陀羅尼經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T1078", new BookInfo("七佛俱胝佛母心大准提陀羅尼法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1079", new BookInfo("七俱胝獨部法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1080", new BookInfo("如意輪陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1081", new BookInfo("佛說觀自在菩薩如意心陀羅尼呪經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1082", new BookInfo("觀世音菩薩祕密藏如意輪陀羅尼神呪經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1083", new BookInfo("觀世音菩薩如意摩尼陀羅尼經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T1084", new BookInfo("觀世音菩薩如意摩尼輪陀羅尼念誦法", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T1085", new BookInfo("觀自在菩薩如意輪念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1086", new BookInfo("觀自在菩薩如意輪瑜伽", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1087", new BookInfo("觀自在如意輪菩薩瑜伽法要", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1088", new BookInfo("如意輪菩薩觀門義注祕訣", null), //
                "T1089", new BookInfo("都表如意摩尼轉輪聖王次第念誦祕密最要略法", new String[]{"唐"}, "解脫師子"), // 唐 解脫師子譯
                "T1090", new BookInfo("佛說如意輪蓮華心如來修行觀門儀", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "T1091", new BookInfo("七星如意輪祕密要經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1092", new BookInfo("不空羂索神變真言經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1093", new BookInfo("不空羂索呪經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1094", new BookInfo("不空羂索神呪心經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1095", new BookInfo("不空羂索呪心經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1096", new BookInfo("不空羂索陀羅尼經", new String[]{"唐"}, "李無諂"), // 唐 李無諂譯
                "T1097", new BookInfo("不空羂索陀羅尼自在王呪經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T1098", new BookInfo("佛說不空羂索陀羅尼儀軌經", new String[]{"唐"}, "不空"), // 唐 阿目佉譯
                "T1099", new BookInfo("佛說聖觀自在菩薩不空王祕密心陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T1100", new BookInfo("葉衣觀自在菩薩經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1101", new BookInfo("佛說大方廣曼殊室利經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1102", new BookInfo("金剛頂經多羅菩薩念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1103a", new BookInfo("觀自在菩薩隨心呪經", new String[]{"唐"}, "智通"), // 唐 智通譯
                "T1103b", new BookInfo("觀自在菩薩怛嚩多唎隨心陀羅尼經", new String[]{"唐"}, "智通"), // 唐 智通譯
                "T1104", new BookInfo("佛說聖多羅菩薩經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1105", new BookInfo("聖多羅菩薩一百八名陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1106", new BookInfo("讚揚聖德多羅菩薩一百八名經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1107", new BookInfo("聖多羅菩薩梵讚", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1108A", new BookInfo("聖救度佛母二十一種禮讚經", new String[]{"元"}, "安藏"), // 元 安藏譯
                "T1108B", new BookInfo("救度佛母二十一種禮讚經", null, "安藏"), //
                "T1109", new BookInfo("白救度佛母讚", new String[]{"清"}, "阿旺扎什"), // 清 阿旺扎什譯
                "T1110", new BookInfo("佛說一髻尊陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1111", new BookInfo("青頸觀自在菩薩心陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空注
                "T1112", new BookInfo("金剛頂瑜伽青頸大悲王觀自在念誦儀軌", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1113A", new BookInfo("觀自在菩薩廣大圓滿無礙大悲心陀羅尼", new String[]{"高麗"}, "指空"), // 高麗 指空校
                "T1113B", new BookInfo("大慈大悲救苦觀世音自在王菩薩廣大圓滿無礙自在青頸大悲心陀羅尼", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1114", new BookInfo("毘俱胝菩薩一百八名經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1115", new BookInfo("觀自在菩薩阿麼𪘨法", null), //
                "T1116", new BookInfo("廣大蓮華莊嚴曼拏羅滅一切罪陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1117", new BookInfo("佛說觀自在菩薩母陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1118", new BookInfo("佛說十八臂陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1119", new BookInfo("大樂金剛薩埵修行成就儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1120A", new BookInfo("金剛頂勝初瑜伽經中略出大樂金剛薩埵念誦儀", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1120B", new BookInfo("勝初瑜伽儀軌真言", new String[]{"唐"}, "空海"), // 唐 空海請來
                "T1121", new BookInfo("金剛頂普賢瑜伽大教王經大樂不空金剛薩埵一切時方成就儀", null), //
                "T1122", new BookInfo("金剛頂瑜伽他化自在天理趣會普賢修行念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1123", new BookInfo("金剛頂勝初瑜伽普賢菩薩念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1124", new BookInfo("普賢金剛薩埵略瑜伽念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1125", new BookInfo("金剛頂瑜伽金剛薩埵五祕密修行念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1126", new BookInfo("佛說普賢曼拏羅經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1127", new BookInfo("佛說普賢菩薩陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1128", new BookInfo("最上大乘金剛大教寶王經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1129", new BookInfo("佛說金剛手菩薩降伏一切部多大教王經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1130", new BookInfo("大乘金剛髻珠菩薩修行分", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1131", new BookInfo("聖金剛手菩薩一百八名梵讚", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1132", new BookInfo("金剛王菩薩祕密念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1133", new BookInfo("金剛壽命陀羅尼念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1134A", new BookInfo("金剛壽命陀羅尼經法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1134B", new BookInfo("金剛壽命陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1135", new BookInfo("佛說一切如來金剛壽命陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1136", new BookInfo("佛說一切諸如來心光明加持普賢菩薩延命金剛最勝陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1137", new BookInfo("佛說善法方便陀羅尼經", null, "失譯"), // 失譯
                "T1138a", new BookInfo("金剛祕密善門陀羅尼呪經", null, "失譯"), // 失譯
                "T1138b", new BookInfo("金剛祕密善門陀羅尼經", null, "失譯"), // 失譯
                "T1139", new BookInfo("護命法門神呪經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1140", new BookInfo("佛說延壽妙門陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1141", new BookInfo("慈氏菩薩略修瑜伽念誦法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1142", new BookInfo("佛說慈氏菩薩陀羅尼", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1143", new BookInfo("佛說慈氏菩薩誓願陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1144", new BookInfo("佛說彌勒菩薩發願王偈", new String[]{"清"}, "工布查布"), // 清 工布查布譯
                "T1145", new BookInfo("虛空藏菩薩能滿諸願最勝心陀羅尼求聞持法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1146", new BookInfo("大虛空藏菩薩念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1147", new BookInfo("聖虛空藏菩薩陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1148", new BookInfo("佛說虛空藏菩薩陀羅尼", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1149", new BookInfo("五大虛空藏菩薩速疾大神驗祕密式經", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1150", new BookInfo("轉法輪菩薩摧魔怨敵法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1151", new BookInfo("修習般若波羅蜜菩薩觀行念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1152", new BookInfo("佛說佛母般若波羅蜜多大明觀想儀軌", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1153", new BookInfo("普遍光明清淨熾盛如意寶印心無能勝大明王大隨求陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1154", new BookInfo("佛說隨求即得大自在陀羅尼神呪經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T1155", new BookInfo("金剛頂瑜伽最勝祕密成佛隨求即得神變加持成就陀羅尼儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1156A", new BookInfo("大隨求即得大陀羅尼明王懺悔法", new String[]{"唐"}, "惟謹"), // 唐 惟謹述
                "T1156B", new BookInfo("宗叡僧正於唐國師所口受", null), //
                "T1157", new BookInfo("香王菩薩陀羅尼呪經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1158", new BookInfo("地藏菩薩儀軌", new String[]{"唐"}, "善無畏"), // 唐 輸婆迦羅譯
                "T1159A", new BookInfo("[峚-大+(企-止)]𡇪大道心驅策法", null), //
                "T1159B", new BookInfo("佛說地藏菩薩陀羅尼經", null), //
                "T1160", new BookInfo("日光菩薩月光菩薩陀羅尼", null), //
                "T1161", new BookInfo("佛說觀藥王藥上二菩薩經", new String[]{"劉宋"}, "畺良耶舍"), // 劉宋 畺良耶舍譯
                "T1162", new BookInfo("持世陀羅尼經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1163", new BookInfo("佛說雨寶陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1164", new BookInfo("佛說大乘聖吉祥持世陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1165", new BookInfo("聖持世陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1166", new BookInfo("馬鳴菩薩大神力無比驗法念誦軌儀", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1167", new BookInfo("八大菩薩曼荼羅經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1168A", new BookInfo("佛說大乘八大曼拏羅經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1168B", new BookInfo("八曼荼羅經", null), //
                "T1169", new BookInfo("佛說持明藏瑜伽大教尊那菩薩大明成就儀軌經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1170", new BookInfo("佛說金剛香菩薩大明成就儀軌經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1171", new BookInfo("金剛頂經瑜伽文殊師利菩薩法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1172", new BookInfo("金剛頂超勝三界經說文殊五字真言勝相", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1173", new BookInfo("金剛頂經曼殊室利菩薩五字心陀羅尼品", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1174", new BookInfo("五字陀羅尼頌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1175", new BookInfo("金剛頂經瑜伽文殊師利菩薩供養儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1176", new BookInfo("曼殊室利童子菩薩五字瑜伽法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1177A", new BookInfo("大乘瑜伽金剛性海曼殊室利千臂千鉢大教王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1177B", new BookInfo("千鉢文殊一百八名讚", new String[]{"唐"}, "空海"), // 唐 空海請來
                "T1178", new BookInfo("文殊菩薩獻佛陀羅尼名烏蘇吒", null), //
                "T1179", new BookInfo("文殊師利菩薩六字呪功能法經", null), //
                "T1180", new BookInfo("六字神呪經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1181", new BookInfo("大方廣菩薩藏經中文殊師利根本一字陀羅尼經", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T1182", new BookInfo("曼殊室利菩薩呪藏中一字呪王經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1183", new BookInfo("一髻文殊師利童子陀羅尼念誦儀軌", new String[]{"唐"}, "金剛福壽"), // 唐 金剛福壽譯
                "T1184", new BookInfo("大聖妙吉祥菩薩祕密八字陀羅尼修行曼荼羅次第儀軌法", new String[]{"唐"}, "菩提㗚使"), // 唐 菩提仙譯
                "T1185A", new BookInfo("佛說文殊師利法寶藏陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1185B", new BookInfo("文殊師利寶藏陀羅尼經", new String[]{"唐"}, "菩提流志"), // 唐 菩提流志譯
                "T1186", new BookInfo("佛說妙吉祥菩薩陀羅尼", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1187", new BookInfo("佛說最勝妙吉祥根本智最上祕密一切名義三摩地分", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1188", new BookInfo("文殊所說最勝名義經", new String[]{"宋"}, "金總持"), // 宋 金總持等譯
                "T1189", new BookInfo("佛說文殊菩薩最勝真實名義經", new String[]{"元"}, "沙囉巴"), // 元 沙囉巴譯
                "T1190", new BookInfo("聖妙吉祥真實名經", new String[]{"元"}, "釋智"), // 元 釋智譯
                "T1191", new BookInfo("大方廣菩薩藏文殊師利根本儀軌經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1192", new BookInfo("妙吉祥平等祕密最上觀門大教王經", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "T1193", new BookInfo("妙吉祥平等瑜伽祕密觀身成佛儀軌", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "T1194", new BookInfo("妙吉祥平等觀門大教王經略出護摩儀", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "T1195", new BookInfo("大聖文殊師利菩薩讚佛法身禮", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1196", new BookInfo("曼殊室利菩薩吉祥伽陀", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1197", new BookInfo("佛說文殊師利一百八名梵讚", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1198", new BookInfo("聖者文殊師利發菩提心願文", new String[]{"元"}, "智慧"), // 元 智慧譯
                "T1199", new BookInfo("金剛手光明灌頂經最勝立印聖無動尊大威怒王念誦儀軌法品", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1200", new BookInfo("底哩三昧耶不動尊威怒王使者念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1201", new BookInfo("底哩三昧耶不動尊聖者念誦祕密法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1202", new BookInfo("不動使者陀羅尼祕密法", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1203", new BookInfo("聖無動尊安鎮家國等法", null), //
                "T1204", new BookInfo("聖無動尊一字出生八大童子祕要法品", null), //
                "T1205", new BookInfo("勝軍不動明王四十八使者祕密成就儀軌", new String[]{"唐"}, "遍智"), // 唐 遍智集
                "T1206", new BookInfo("佛說俱利伽羅大龍勝外道伏陀羅尼經", null), //
                "T1207", new BookInfo("說矩里迦龍王像法", null), //
                "T1208", new BookInfo("俱力迦羅龍王儀軌", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1209", new BookInfo("金剛頂瑜伽降三世成就極深密門", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1210", new BookInfo("降三世忿怒明王念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1211", new BookInfo("甘露軍荼利菩薩供養念誦成就儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1212", new BookInfo("西方陀羅尼藏中金剛族阿蜜哩多軍吒利法", new String[]{"唐"}, "海雲"), // 唐 海雲記
                "T1213", new BookInfo("千臂軍荼利梵字真言", new String[]{"唐"}, "義操"), // 唐 義操記
                "T1214", new BookInfo("聖閻曼德迦威怒王立成大神驗念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1215", new BookInfo("大乘方廣曼殊室利菩薩華嚴本教閻曼德迦忿怒王真言大威德儀軌品", null), //
                "T1216", new BookInfo("大方廣曼殊室利童真菩薩華嚴本教讚閻曼德迦忿怒王真言阿毘遮嚕迦儀軌品", null), //
                "T1217", new BookInfo("佛說妙吉祥最勝根本大教經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1218", new BookInfo("文殊師利耶曼德迦呪法", new String[]{"唐"}, "宗叡"), // 唐 宗叡將來
                "T1219", new BookInfo("曼殊室利焰曼德迦萬愛祕術如意法", new String[]{"唐"}, "一行"), // 唐 一行撰
                "T1220", new BookInfo("金剛藥叉瞋怒王息災大威神驗念誦儀軌", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1221", new BookInfo("青色大金剛藥叉辟鬼魔法", new String[]{"唐"}, "空蜞"), // 唐 空蜝述
                "T1222a", new BookInfo("聖迦抳忿怒金剛童子菩薩成就儀軌經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1222b", new BookInfo("聖迦柅忿怒金剛童子菩薩成就儀軌經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1223", new BookInfo("佛說無量壽佛化身大忿迅俱摩羅金剛念誦瑜伽儀軌法", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1224", new BookInfo("金剛童子持念經", null), //
                "T1225", new BookInfo("大威怒烏芻澁麼儀軌經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1226", new BookInfo("烏芻澁明王儀軌梵字", new String[]{"唐"}, "空海"), // 唐 空海請來
                "T1227", new BookInfo("大威力烏樞瑟摩明王經", new String[]{"唐"}, "阿質達霰"), // 唐 阿質達霰譯
                "T1228", new BookInfo("穢跡金剛說神通大滿陀羅尼法術靈要門", new String[]{"唐"}, "阿質達霰"), // 唐 阿質達霰譯
                "T1229", new BookInfo("穢跡金剛禁百變法經", new String[]{"唐"}, "阿質達霰"), // 唐 阿質達霰譯
                "T1230", new BookInfo("佛說大輪金剛總持陀羅尼經", null), //
                "T1231", new BookInfo("大輪金剛修行悉地成就及供養法", null), //
                "T1232", new BookInfo("播般曩結使波金剛念誦儀", null), //
                "T1233", new BookInfo("佛說無能勝大明王陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1234", new BookInfo("無能勝大明陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1235", new BookInfo("無能勝大明心陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1236", new BookInfo("聖無能勝金剛火陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1237", new BookInfo("阿吒婆拘鬼神大將上佛陀羅尼神呪經", null, "失譯"), // 失譯
                "T1238", new BookInfo("阿吒婆𤘽鬼神大將上佛陀羅尼經", null, "失譯"), // 失譯
                "T1239", new BookInfo("阿吒薄俱元帥大將上佛陀羅尼經修行儀軌", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1240", new BookInfo("阿吒薄𤘽付囑呪", null), //
                "T1241", new BookInfo("伽馱金剛真言", null), //
                "T1242", new BookInfo("佛說妙吉祥瑜伽大教金剛陪囉嚩輪觀想成就儀軌經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1243", new BookInfo("佛說出生一切如來法眼遍照大力明王經", new String[]{"宋"}, "法護"), // 宋 法護譯
                "T1244", new BookInfo("毘沙門天王經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1245", new BookInfo("佛說毘沙門天王經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1246", new BookInfo("摩訶吠室囉末那野提婆喝囉闍陀羅尼儀軌", new String[]{"唐"}, "智慧輪"), // 唐 般若斫羯囉譯
                "T1247", new BookInfo("北方毘沙門天王隨軍護法儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1248", new BookInfo("北方毘沙門天王隨軍護法真言", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1249", new BookInfo("毘沙門儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1250", new BookInfo("北方毘沙門多聞寶藏天王神妙陀羅尼別行儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1251", new BookInfo("吽迦陀野儀軌", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1252a", new BookInfo("佛說大吉祥天女十二名號經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1252b", new BookInfo("佛說大吉祥天女十二名號經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1253", new BookInfo("大吉祥天女十二契一百八名無垢大乘經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1254", new BookInfo("末利支提婆華鬘經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1255a", new BookInfo("佛說摩利支天菩薩陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1255b", new BookInfo("佛說摩利支天經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1256", new BookInfo("佛說摩利支天陀羅尼呪經", null, "失譯"), // 失譯
                "T1257", new BookInfo("佛說大摩里支菩薩經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1258", new BookInfo("摩利支菩薩略念誦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1259", new BookInfo("摩利支天一印法", null), //
                "T1260", new BookInfo("大藥叉女歡喜母并愛子成就法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1261", new BookInfo("訶利帝母真言經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1262", new BookInfo("佛說鬼子母經", null, "失譯"), // 失譯
                "T1263", new BookInfo("氷揭羅天童子經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1264a", new BookInfo("觀自在菩薩化身蘘麌哩曳童女銷伏毒害陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1264b", new BookInfo("佛說穰麌梨童女經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1265", new BookInfo("佛說常瞿利毒女陀羅尼呪經", new String[]{"唐"}, "瞿多"), // 唐 瞿多譯
                "T1266", new BookInfo("大聖天歡喜雙身毘那夜迦法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1267", new BookInfo("使呪法經", new String[]{"唐"}, "菩提流志"), // 唐 菩提留支譯
                "T1268", new BookInfo("大使呪法經", new String[]{"唐"}, "菩提流志"), // 唐 菩提留支譯
                "T1269", new BookInfo("佛說金色迦那鉢底陀羅尼經", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1270", new BookInfo("大聖歡喜雙身大自在天毘那夜迦王歸依念誦供養法", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1271", new BookInfo("摩訶毘盧遮那如來定惠均等入三昧耶身雙身大聖歡喜天菩薩修行祕密法儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1272", new BookInfo("金剛薩埵說頻那夜迦天成就儀軌經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1273", new BookInfo("毘那夜迦誐那鉢底瑜伽悉地品祕要", new String[]{"唐"}, "含光"), // 唐 含光記
                "T1274", new BookInfo("大聖歡喜雙身毘那夜迦天形像品儀軌", new String[]{"唐"}, "憬瑟"), // 唐 憬瑟撰
                "T1275", new BookInfo("聖歡喜天式法", new String[]{"唐"}, "智慧輪"), // 唐 般若惹羯羅撰
                "T1276", new BookInfo("文殊師利菩薩根本大教王經金翅鳥王品", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1277", new BookInfo("速疾立驗魔醯首羅天說阿尾奢法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1278", new BookInfo("迦樓羅及諸天密言經", new String[]{"唐"}, "般若力"), // 唐 般若力譯
                "T1279", new BookInfo("摩醯首羅天法要", null), //
                "T1280", new BookInfo("摩醯首羅大自在天王神通化生伎藝天女念誦法", null), //
                "T1281", new BookInfo("那羅延天共阿修羅王鬪戰法", new String[]{"唐"}, "寶思惟"), // 唐 寶思惟譯
                "T1282", new BookInfo("寶藏天女陀羅尼法", null), //
                "T1283", new BookInfo("佛說寶藏神大明曼拏羅儀軌經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1284", new BookInfo("佛說聖寶藏神儀軌經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1285", new BookInfo("佛說寶賢陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1286", new BookInfo("堅牢地天儀軌", new String[]{"唐"}, "善無畏"), // 唐 善無畏譯
                "T1287", new BookInfo("大黑天神法", new String[]{"唐"}, "神愷"), // 唐 神愷記
                "T1288", new BookInfo("佛說最上祕密那拏天經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1289", new BookInfo("佛說金毘羅童子威德經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1290", new BookInfo("焰羅王供行法次第", new String[]{"唐"}, "不空"), // 唐 阿謨伽撰
                "T1291", new BookInfo("深沙大將儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1292", new BookInfo("法華十羅剎法", null), //
                "T1293", new BookInfo("般若守護十六善神王形體", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1294", new BookInfo("施八方天儀則", null), //
                "T1295", new BookInfo("供養護世八天法", new String[]{"唐"}, "法全"), // 唐 法全集
                "T1296", new BookInfo("十天儀軌", null), //
                "T1297", new BookInfo("供養十二大威德天報恩品", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1298", new BookInfo("十二天供儀軌", null), //
                "T1299", new BookInfo("文殊師利菩薩及諸仙所說吉凶時日善惡宿曜經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1300", new BookInfo("摩登伽經", new String[]{"吳"}, "竺律炎", "支謙"), // 吳 竺律炎支謙共譯
                "T1301", new BookInfo("舍頭諫太子二十八宿經", new String[]{"西晉"}, "竺法護"), // 西晉 竺法護譯
                "T1302", new BookInfo("諸星母陀羅尼經", new String[]{"唐"}, "法成"), // 唐 法成譯
                "T1303", new BookInfo("佛說聖曜母陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1304", new BookInfo("宿曜儀軌", new String[]{"唐"}, "一行"), // 唐 一行撰
                "T1305", new BookInfo("北斗七星念誦儀軌", new String[]{"唐"}, "金剛智"), // 唐 金剛智譯
                "T1306", new BookInfo("北斗七星護摩祕要儀軌", new String[]{"唐"}, "不空"), // 唐 不空述
                "T1307", new BookInfo("佛說北斗七星延命經", null), //
                "T1308", new BookInfo("七曜攘災決", new String[]{"唐"}, "金俱吒"), // 唐 金俱吒撰
                "T1309", new BookInfo("七曜星辰別行法", new String[]{"唐"}, "一行"), // 唐 一行撰
                "T1310", new BookInfo("北斗七星護摩法", new String[]{"唐"}, "一行"), // 唐 一行撰
                "T1311", new BookInfo("梵天火羅九曜", new String[]{"唐"}, "一行"), // 唐 一行述
                "T1312", new BookInfo("難儞計濕嚩囉天說支輪經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1313", new BookInfo("佛說救拔焰口餓鬼陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1314", new BookInfo("佛說救面然餓鬼陀羅尼神呪經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1315", new BookInfo("施諸餓鬼飲食及水法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1316", new BookInfo("佛說甘露經陀羅尼呪", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1317", new BookInfo("甘露陀羅尼呪", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1318", new BookInfo("瑜伽集要救阿難陀羅尼焰口軌儀經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1319", new BookInfo("瑜伽集要焰口施食起教阿難陀緣由", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1320", new BookInfo("瑜伽集要焰口施食儀", null), //
                "T1321", new BookInfo("佛說施餓鬼甘露味大陀羅尼經", new String[]{"唐"}, "跋馱木阿"), // 唐 跋馱木阿譯
                "T1322", new BookInfo("新集浴像儀軌", new String[]{"唐"}, "慧琳"), // 唐 慧琳述
                "T1323", new BookInfo("除一切疾病陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1324", new BookInfo("能淨一切眼疾病陀羅尼經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1325", new BookInfo("佛說療痔病經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1326", new BookInfo("佛說呪時氣病經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1327", new BookInfo("佛說呪齒經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1328", new BookInfo("佛說呪目經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1329", new BookInfo("佛說呪小兒經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1330", new BookInfo("囉嚩拏說救療小兒疾病經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1331", new BookInfo("佛說灌頂經", new String[]{"東晉"}, "帛尸梨密多羅"), // 東晉 帛尸梨蜜多羅譯
                "T1332", new BookInfo("七佛八菩薩所說大陀羅尼神呪經", null, "失譯"), // 失譯
                "T1333", new BookInfo("虛空藏菩薩問七佛陀羅尼呪經", null, "失譯"), // 失譯
                "T1334", new BookInfo("如來方便善巧呪經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1335", new BookInfo("大吉義神呪經", new String[]{"元魏"}, "曇曜"), // 元魏 曇曜譯
                "T1336", new BookInfo("陀羅尼雜集", null, "失譯"), // 失譯
                "T1337", new BookInfo("種種雜呪經", new String[]{"北周"}, "闍那崛多"), // 北周 闍那崛多譯
                "T1338", new BookInfo("呪三首經", new String[]{"唐"}, "地婆訶羅"), // 唐 地婆訶羅譯
                "T1339", new BookInfo("大方等陀羅尼經", new String[]{"北涼"}, "法眾"), // 北涼 法眾譯
                "T1340", new BookInfo("大法炬陀羅尼經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1341", new BookInfo("大威德陀羅尼經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1342", new BookInfo("佛說無崖際總持法門經", new String[]{"西秦"}, "法堅"), // 西秦 聖堅譯
                "T1343", new BookInfo("尊勝菩薩所問一切諸法入無量門陀羅尼經", new String[]{"北齊"}, "萬天懿"), // 北齊 萬天懿譯
                "T1344", new BookInfo("金剛上味陀羅尼經", new String[]{"元魏"}, "佛陀扇多"), // 元魏 佛陀扇多譯
                "T1345", new BookInfo("金剛場陀羅尼經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1346", new BookInfo("諸佛集會陀羅尼經", new String[]{"唐"}, "提雲般若"), // 唐 提雲般若等譯
                "T1347", new BookInfo("息除中夭陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1348", new BookInfo("佛說十二佛名神呪校量功德除障滅罪經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1349", new BookInfo("佛說稱讚如來功德神呪經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1350", new BookInfo("佛說一切如來名號陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1351", new BookInfo("佛說持句神呪經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T1352", new BookInfo("佛說陀隣尼鉢經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1353", new BookInfo("東方最勝燈王陀羅尼經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1354", new BookInfo("東方最勝燈王如來經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多等譯
                "T1355", new BookInfo("佛說聖最上燈明如來陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1356", new BookInfo("佛說華積陀羅尼神呪經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T1357", new BookInfo("佛說師子奮迅菩薩所問經", null, "失譯"), // 失譯
                "T1358", new BookInfo("佛說花聚陀羅尼呪經", null, "失譯"), // 失譯
                "T1359", new BookInfo("佛說花積樓閣陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1360", new BookInfo("六門陀羅尼經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1361", new BookInfo("六門陀羅尼經論", new String[]{"古印度"}, "世親"), // 世親菩薩造
                "T1362", new BookInfo("佛說善夜經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1363", new BookInfo("勝幢臂印陀羅尼經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1364", new BookInfo("妙臂印幢陀羅尼經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1365", new BookInfo("八名普密陀羅尼經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1366", new BookInfo("佛說祕密八名陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1367", new BookInfo("佛說大普賢陀羅尼經", null, "失譯"), // 失譯
                "T1368", new BookInfo("佛說大七寶陀羅尼經", null, "失譯"), // 失譯
                "T1369a", new BookInfo("百千印陀羅尼經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1369b", new BookInfo("百千印陀羅尼經", new String[]{"唐"}, "實叉難陀"), // 唐 實叉難陀譯
                "T1370", new BookInfo("佛說持明藏八大總持王經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1371", new BookInfo("佛說聖大總持王經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1372", new BookInfo("增慧陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1373", new BookInfo("佛說施一切無畏陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護等譯
                "T1374", new BookInfo("佛說一切功德莊嚴王經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1375", new BookInfo("佛說莊嚴王陀羅尼呪經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1376", new BookInfo("佛說聖莊嚴陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1377", new BookInfo("佛說寶帶陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1378a", new BookInfo("佛說玄師颰陀所說神呪經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1378b", new BookInfo("幻師颰陀神呪經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1379", new BookInfo("佛說大愛陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1380", new BookInfo("佛說善樂長者經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1381", new BookInfo("佛說大吉祥陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1382", new BookInfo("佛說宿命智陀羅尼", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1383", new BookInfo("佛說宿命智陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1384", new BookInfo("佛說鉢蘭那賒嚩哩大陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1385", new BookInfo("佛說俱枳羅陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1386", new BookInfo("佛說妙色陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1387", new BookInfo("佛說栴檀香身陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1388", new BookInfo("佛說無畏陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1389", new BookInfo("佛說無量壽大智陀羅尼", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1390", new BookInfo("佛說洛叉陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1391", new BookInfo("佛說檀特羅麻油述經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1392", new BookInfo("大寒林聖難拏陀羅尼經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1393", new BookInfo("佛說摩尼羅亶經", new String[]{"東晉"}, "曇無蘭"), // 東晉 曇無蘭譯
                "T1394", new BookInfo("佛說安宅神呪經", null, "失譯"), // 失譯
                "T1395", new BookInfo("拔濟苦難陀羅尼經", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T1396", new BookInfo("佛說拔除罪障呪王經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1397", new BookInfo("智炬陀羅尼經", new String[]{"唐"}, "提雲般若"), // 唐 提雲般若等譯
                "T1398", new BookInfo("佛說智光滅一切業障陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1399", new BookInfo("佛說滅除五逆罪大陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1400", new BookInfo("佛說消除一切災障寶髻陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1401", new BookInfo("佛說大金剛香陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1402", new BookInfo("消除一切閃電障難隨求如意陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1403", new BookInfo("佛說如意摩尼陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1404", new BookInfo("佛說如意寶總持王經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1405", new BookInfo("佛說息除賊難陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1406", new BookInfo("佛說辟除賊害呪經", null), //
                "T1407", new BookInfo("佛說辟除諸惡陀羅尼經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1408", new BookInfo("佛說最上意陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1409", new BookInfo("佛說聖最勝陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1410", new BookInfo("佛說勝幡瓔珞陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1411", new BookInfo("佛說蓮華眼陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1412", new BookInfo("佛說寶生陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1413", new BookInfo("佛說尊勝大明王經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1414", new BookInfo("佛說金身陀羅尼經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1415", new BookInfo("大金剛妙高山樓閣陀羅尼", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1416", new BookInfo("金剛摧碎陀羅尼", new String[]{"宋"}, "慈賢"), // 宋 慈賢譯
                "T1417", new BookInfo("佛說壞相金剛陀羅尼經", new String[]{"元"}, "沙囉巴"), // 元 沙囉巴譯
                "T1418", new BookInfo("佛說一切如來安像三昧儀軌經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1419", new BookInfo("佛說造像量度經解", new String[]{"清"}, "工布查布"), // 清 工布查布譯解
                "T1420", new BookInfo("龍樹五明論", null), //
                "T1421", new BookInfo("彌沙塞部和醯五分律", new String[]{"劉宋"}, "佛陀什", "竺道生"), // 劉宋 佛陀什共竺道生等譯
                "T1422a", new BookInfo("彌沙塞五分戒本", new String[]{"劉宋"}, "佛陀什"), // 劉宋 佛陀什等譯
                "T1422b", new BookInfo("五分戒本", new String[]{"劉宋"}, "佛陀什"), // 劉宋 佛陀什等譯
                "T1423", new BookInfo("五分比丘尼戒本", new String[]{"梁"}, "明徽"), // 梁 明徽集
                "T1424", new BookInfo("彌沙塞羯磨本", new String[]{"唐"}, "愛同"), // 唐 愛同錄
                "T1425", new BookInfo("摩訶僧祇律", new String[]{"東晉"}, "佛馱跋陀羅", "法顯"), // 東晉 佛陀跋陀羅共法顯譯
                "T1426", new BookInfo("摩訶僧祇律大比丘戒本", new String[]{"東晉"}, "佛馱跋陀羅"), // 東晉 佛陀跋陀羅譯
                "T1427", new BookInfo("摩訶僧祇比丘尼戒本", new String[]{"東晉"}, "法顯", "佛馱跋陀羅"), // 東晉 法顯共覺賢譯
                "T1428", new BookInfo("四分律", new String[]{"姚秦"}, "佛陀耶舍", "竺佛念"), // 姚秦 佛陀耶舍共竺佛念等譯
                "T1429", new BookInfo("四分律比丘戒本", new String[]{"後秦"}, "佛陀耶舍"), // 後秦 佛陀耶舍譯
                "T1430", new BookInfo("四分僧戒本", new String[]{"後秦"}, "佛陀耶舍"), // 後秦 佛陀耶舍譯
                "T1431", new BookInfo("四分比丘尼戒本", new String[]{"後秦"}, "佛陀耶舍"), // 後秦 佛陀耶舍譯
                "T1432", new BookInfo("曇無德律部雜羯磨", new String[]{"曹魏"}, "康僧鎧"), // 曹魏 康僧鎧譯
                "T1433", new BookInfo("羯磨", new String[]{"曹魏"}, "曇帝"), // 曹魏 曇諦譯
                "T1434", new BookInfo("四分比丘尼羯磨法", new String[]{"劉宋"}, "求那跋摩"), // 劉宋 求那跋摩譯
                "T1435", new BookInfo("十誦律", new String[]{"後秦"}, "弗若多羅", "鳩摩羅什"), // 後秦 弗若多羅共羅什譯
                "T1436", new BookInfo("十誦比丘波羅提木叉戒本", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T1437", new BookInfo("十誦比丘尼波羅提木叉戒本", new String[]{"劉宋"}, "法頴"), // 劉宋 法顯集出
                "T1438", new BookInfo("大沙門百一羯磨法", null), //
                "T1439", new BookInfo("十誦羯磨比丘要用", new String[]{"劉宋"}, "僧璩"), // 劉宋 僧璩撰出
                "T1440", new BookInfo("薩婆多毘尼毘婆沙", null, "失譯"), // 失譯
                "T1441", new BookInfo("薩婆多部毘尼摩得勒伽", new String[]{"劉宋"}, "僧伽跋摩"), // 劉宋 僧伽跋摩譯
                "T1442", new BookInfo("根本說一切有部毘奈耶", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1443", new BookInfo("根本說一切有部苾芻尼毘奈耶", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1444", new BookInfo("根本說一切有部毘奈耶出家事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1445", new BookInfo("根本說一切有部毘奈耶安居事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1446", new BookInfo("根本說一切有部毘奈耶隨意事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1447", new BookInfo("根本說一切有部毘奈耶皮革事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1448", new BookInfo("根本說一切有部毘奈耶藥事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1449", new BookInfo("根本說一切有部毘奈耶羯恥那衣事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1450", new BookInfo("根本說一切有部毘奈耶破僧事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1451", new BookInfo("根本說一切有部毘奈耶雜事", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1452", new BookInfo("根本說一切有部尼陀那目得迦", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1453", new BookInfo("根本說一切有部百一羯磨", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1454", new BookInfo("根本說一切有部戒經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1455", new BookInfo("根本說一切有部苾芻尼戒經", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1456", new BookInfo("根本說一切有部毘奈耶尼陀那目得迦攝頌", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1457", new BookInfo("根本說一切有部略毘奈耶雜事攝頌", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1458", new BookInfo("根本薩婆多部律攝", new String[]{"唐"}, "義淨", "勝友"), // 尊者勝友造  唐 義淨譯
                "T1459", new BookInfo("根本說一切有部毘奈耶頌", new String[]{"唐"}, "義淨", "毗舍佉"), // 尊者毘舍佉造  唐 義淨譯
                "T1460", new BookInfo("解脫戒經", new String[]{"東魏"}, "般若流支"), // 元魏 般若流支譯
                "T1461", new BookInfo("律二十二明了論", new String[]{"陳"}, "真諦", "弗陀多羅多"), // 弗陀多羅多造  陳 真諦譯
                "T1462", new BookInfo("善見律毘婆沙", new String[]{"蕭齊"}, "僧伽跋陀羅"), // 蕭齊 僧伽跋陀羅譯
                "T1463", new BookInfo("毘尼母經", null, "失譯"), // 失譯
                "T1464", new BookInfo("鼻奈耶", new String[]{"前秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T1465", new BookInfo("舍利弗問經", null, "失譯"), // 失譯
                "T1466", new BookInfo("優波離問佛經", new String[]{"劉宋"}, "求那跋摩"), // 宋 求那跋摩譯
                "T1467a", new BookInfo("佛說犯戒罪報輕重經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T1467b", new BookInfo("佛說犯戒罪報輕重經", null), //
                "T1468", new BookInfo("佛說目連所問經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1469", new BookInfo("佛說迦葉禁戒經", new String[]{"劉宋"}, "沮渠京聲"), // 宋 沮渠京聲譯
                "T1470", new BookInfo("大比丘三千威儀", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T1471", new BookInfo("沙彌十戒法并威儀", null, "失譯"), // 失譯
                "T1472", new BookInfo("沙彌威儀", new String[]{"劉宋"}, "求那跋摩"), // 宋 求那跋摩譯
                "T1473", new BookInfo("佛說沙彌十戒儀則經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1474", new BookInfo("沙彌尼戒經", null, "失譯"), // 失譯
                "T1475", new BookInfo("沙彌尼離戒文", null, "失譯"), // 失譯
                "T1476", new BookInfo("佛說優婆塞五戒相經", new String[]{"劉宋"}, "求那跋摩"), // 宋 求那跋摩譯
                "T1477", new BookInfo("佛說戒消災經", new String[]{"吳"}, "支謙"), // 吳 支謙譯
                "T1478", new BookInfo("大愛道比丘尼經", null, "失譯"), // 失譯
                "T1479", new BookInfo("佛說苾芻五法經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1480", new BookInfo("佛說苾芻迦尸迦十法經", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1481", new BookInfo("佛說五恐怖世經", new String[]{"劉宋"}, "沮渠京聲"), // 宋 沮渠京聲譯
                "T1482", new BookInfo("佛阿毘曇經出家相品", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1483a", new BookInfo("佛說目連問戒律中五百輕重事", null, "失譯"), // 失譯
                "T1483b", new BookInfo("佛說目連問戒律中五百輕重事經", null, "失譯"), // 失譯
                "T1484", new BookInfo("梵網經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T1485", new BookInfo("菩薩瓔珞本業經", new String[]{"前秦"}, "竺佛念"), // 姚秦 竺佛念譯
                "T1486", new BookInfo("受十善戒經", null, "失譯"), // 失譯
                "T1487", new BookInfo("佛說菩薩內戒經", new String[]{"劉宋"}, "求那跋摩"), // 宋 求那跋摩譯
                "T1488", new BookInfo("優婆塞戒經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T1489", new BookInfo("清淨毘尼方廣經", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T1490", new BookInfo("寂調音所問經", new String[]{"劉宋"}, "法海"), // 宋 法海譯
                "T1491", new BookInfo("菩薩藏經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T1492", new BookInfo("佛說舍利弗悔過經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T1493", new BookInfo("大乘三聚懺悔經", new String[]{"隋"}, "闍那崛多", "達摩笈多"), // 隋 闍那崛多共笈多等譯
                "T1494", new BookInfo("佛說淨業障經", null, "失譯"), // 失譯
                "T1495", new BookInfo("善恭敬經", new String[]{"隋"}, "闍那崛多"), // 隋 闍那崛多譯
                "T1496", new BookInfo("佛說正恭敬經", new String[]{"東魏"}, "佛陀扇多"), // 元魏 佛陀扇多譯
                "T1497", new BookInfo("佛說大乘戒經", new String[]{"宋"}, "施護"), // 宋 施護譯
                "T1498", new BookInfo("佛說八種長養功德經", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T1499", new BookInfo("菩薩戒羯磨文", new String[]{"唐"}, "玄奘", "彌勒菩薩"), // 彌勒菩薩說  唐 玄奘譯
                "T1500", new BookInfo("菩薩戒本", new String[]{"北涼"}, "曇無讖", "彌勒菩薩"), // 慈氏菩薩說  北涼 曇無讖譯
                "T1501", new BookInfo("菩薩戒本", new String[]{"唐"}, "玄奘", "彌勒菩薩"), // 彌勒菩薩說  唐 玄奘譯
                "T1502", new BookInfo("菩薩受齋經", new String[]{"西晉"}, "聶道真"), // 西晉 聶道真譯
                "T1503", new BookInfo("優婆塞五戒威儀經", new String[]{"劉宋"}, "求那跋摩"), // 宋 求那跋摩譯
                "T1504", new BookInfo("菩薩五法懺悔文", null, "失譯"), // 失譯
                "T1505", new BookInfo("四阿鋡暮抄解", new String[]{"符秦"}, "婆素跋陀;鳩摩羅佛提"), // 婆素跋陀造  符秦 鳩摩羅佛提等譯
                "T1506", new BookInfo("三法度論", new String[]{"東晉"}, "僧伽提婆"), // 東晉 僧伽提婆譯
                "T1507", new BookInfo("分別功德論", null, "失譯"), // 失譯附後漢錄
                "T1508", new BookInfo("阿含口解十二因緣經", new String[]{"東漢"}, "安玄", "嚴佛調"), // 後漢 安玄共嚴佛調譯
                "T1509", new BookInfo("大智度論", new String[]{"後秦"}, "鳩摩羅什", "龍樹"), // 龍樹菩薩造  後秦 鳩摩羅什譯
                "T1510a", new BookInfo("金剛般若論", new String[]{"隋"}, "無著;達摩笈多"), // 無著菩薩造  隋 達磨笈多譯
                "T1510b", new BookInfo("金剛般若波羅蜜經論", new String[]{"古印度", "隋"}, "無著;達摩笈多"), // 無著菩薩造  隋 達磨笈多譯
                "T1511", new BookInfo("金剛般若波羅蜜經論", new String[]{"古印度", "元魏"}, "菩提流支", "世親"), // 天親菩薩造  元魏 菩提流支譯
                "T1512", new BookInfo("金剛仙論", new String[]{"古印度", "元魏"}, "菩提流支", "世親", "金剛仙"), // 世親菩薩造  金剛仙論師釋  元魏 菩提流支譯
                "T1513", new BookInfo("能斷金剛般若波羅蜜多經論釋", new String[]{"古印度", "唐"}, "義淨", "無著", "世親"), // 無著菩薩造頌  世親菩薩釋  唐 義淨譯
                "T1514", new BookInfo("能斷金剛般若波羅蜜多經論頌", new String[]{"古印度", "唐"}, "義淨", "無著"), // 無著菩薩造  唐 義淨譯
                "T1515", new BookInfo("金剛般若波羅蜜經破取著不壞假名論", new String[]{"唐"}, "地婆訶羅", "功德施"), // 功德施菩薩造  唐 地婆訶羅等譯
                "T1516", new BookInfo("聖佛母般若波羅蜜多九頌精義論", new String[]{"宋"}, "法護", "勝德赤衣"), // 勝德赤衣菩薩造  宋 法護等譯
                "T1517", new BookInfo("佛母般若波羅蜜多圓集要義釋論", new String[]{"宋"}, "施護", "三寶尊", "陳那"), // 三寶尊菩薩造  大域龍菩薩造本論  宋 施護等譯
                "T1518", new BookInfo("佛母般若波羅蜜多圓集要義論", new String[]{"宋"}, "施護", "陳那"), // 大域龍菩薩造  宋 施護等譯
                "T1519", new BookInfo("妙法蓮華經憂波提舍", new String[]{"後魏"}, "菩提流支", "曇琳", "世親"), // 大乘論師婆藪槃豆釋  後魏 菩提留支共曇林等譯
                "T1520", new BookInfo("妙法蓮華經論優波提舍", new String[]{"元魏"}, "勒那摩提", "僧朗", "世親"), // 婆藪般豆菩薩造  元魏 勒那摩提共僧朗等譯
                "T1521", new BookInfo("十住毘婆沙論", new String[]{"後秦"}, "鳩摩羅什", "龍樹"), // 聖者龍樹造  後秦 鳩摩羅什譯
                "T1522", new BookInfo("十地經論", new String[]{"古印度", "後魏"}, "菩提流支", "世親"), // 天親菩薩造  後魏 菩提流支等譯
                "T1523", new BookInfo("大寶積經論", new String[]{"後魏"}, "菩提流支"), // 後魏 菩提流支譯
                "T1524", new BookInfo("無量壽經優波提舍", new String[]{"元魏"}, "菩提流支", "世親"), // 婆藪槃豆菩薩造  元魏 菩提流支譯
                "T1525", new BookInfo("彌勒菩薩所問經論", new String[]{"後魏"}, "菩提流支"), // 後魏 菩提流支譯
                "T1526", new BookInfo("寶髻經四法憂波提舍", new String[]{"古印度", "東魏"}, "毗目智仙", "世親"), // 天親菩薩造  元魏 毘目智仙譯
                "T1527", new BookInfo("涅槃論", new String[]{"元魏"}, "達摩菩提", "世親"), // 婆藪槃豆作  元魏 達磨菩提譯
                "T1528", new BookInfo("涅槃經本有今無偈論", new String[]{"古印度", "陳"}, "真諦", "世親"), // 天親菩薩造  陳 真諦譯
                "T1529", new BookInfo("遺教經論", new String[]{"古印度", "陳"}, "真諦", "世親"), // 天親菩薩造  陳 真諦譯
                "T1530", new BookInfo("佛地經論", new String[]{"唐"}, "玄奘", "親光"), // 親光菩薩等造  唐 玄奘譯
                "T1531", new BookInfo("文殊師利菩薩問菩提經論", new String[]{"古印度", "東魏"}, "菩提流支", "世親"), // 天親菩薩造  元魏 菩提流支譯
                "T1532", new BookInfo("勝思惟梵天所問經論", new String[]{"古印度", "後魏"}, "菩提流支", "世親"), // 天親菩薩造  後魏 菩提流支譯
                "T1533", new BookInfo("轉法輪經憂波提舍", new String[]{"古印度", "東魏"}, "毗目智仙", "世親"), // 天親菩薩造  元魏 毘目智仙譯
                "T1534", new BookInfo("三具足經憂波提舍", new String[]{"東魏"}, "毗目智仙"), // 元魏 毘目智仙譯
                "T1535", new BookInfo("大乘四法經釋", null), //
                "T1536", new BookInfo("阿毘達磨集異門足論", new String[]{"唐"}, "玄奘", "舍利弗"), // 尊者舍利子說  唐 玄奘譯
                "T1537", new BookInfo("阿毘達磨法蘊足論", new String[]{"唐"}, "玄奘", "目犍連"), // 尊者大目乾連造  唐 玄奘譯
                "T1538", new BookInfo("施設論", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T1539", new BookInfo("阿毘達磨識身足論", new String[]{"唐"}, "玄奘", "提婆設摩"), // 提婆設摩造  唐 玄奘譯
                "T1540", new BookInfo("阿毘達磨界身足論", new String[]{"唐"}, "玄奘", "世友"), // 尊者世友造  唐 玄奘譯
                "T1541", new BookInfo("眾事分阿毘曇論", new String[]{"劉宋"}, "求那跋陀羅", "菩提耶舍", "世友"), // 尊者世友造  宋 求那跋陀羅共菩提耶舍譯
                "T1542", new BookInfo("阿毘達磨品類足論", new String[]{"唐"}, "玄奘", "世友"), // 尊者世友造  唐 玄奘譯
                "T1543", new BookInfo("阿毘曇八犍度論", new String[]{"符秦"}, "僧伽提婆", "竺佛念", "迦栴延子"), // 迦栴延子造  符秦 僧伽提婆共竺佛念譯
                "T1544", new BookInfo("阿毘達磨發智論", new String[]{"唐"}, "玄奘", "迦栴延子"), // 迦多衍尼子造  唐 玄奘譯
                "T1545", new BookInfo("阿毘達磨大毘婆沙論", new String[]{"唐"}, "玄奘"), // 五百大阿羅漢等造  唐 玄奘譯
                "T1546", new BookInfo("阿毘曇毘婆沙論", new String[]{"北涼"}, "浮陀跋摩", "道泰", "迦栴延子"), // 迦旃延子造  五百羅漢釋  北涼 浮陀跋摩共道泰等譯
                "T1547", new BookInfo("鞞婆沙論", new String[]{"符秦"}, "僧伽跋澄", "尸陀槃尼"), // 尸陀槃尼撰  符秦 僧伽跋澄譯
                "T1548", new BookInfo("舍利弗阿毘曇論", new String[]{"姚秦"}, "曇摩耶舍", "曇摩崛多"), // 姚秦 曇摩耶舍共曇摩崛多等譯
                "T1549", new BookInfo("尊婆須蜜菩薩所集論", new String[]{"符秦"}, "僧伽跋澄", "尊婆須蜜"), // 尊婆須蜜造  符秦 僧伽跋澄等譯
                "T1550", new BookInfo("阿毘曇心論", new String[]{"晉"}, "僧伽提婆", "慧遠", "法勝"), // 尊者法勝造  晉 僧迦提婆共慧遠等譯
                "T1551", new BookInfo("阿毘曇心論經", new String[]{"高齊"}, "那連提黎耶舍", "法勝", "優波扇多"), // 法勝論  優波扇多釋  高齊 那連提耶舍譯
                "T1552", new BookInfo("雜阿毘曇心論", new String[]{"劉宋"}, "僧伽跋摩", "法救"), // 尊者法救造  宋 僧伽跋摩等譯
                "T1553", new BookInfo("阿毘曇甘露味論", null, "瞿沙"), // 尊者瞿沙造  失譯
                "T1554", new BookInfo("入阿毘達磨論", new String[]{"唐"}, "玄奘", "塞建地羅"), // 塞建陀羅造  唐 玄奘譯
                "T1555", new BookInfo("五事毘婆沙論", new String[]{"唐"}, "玄奘", "法救"), // 尊者法救造  唐 玄奘譯
                "T1556", new BookInfo("薩婆多宗五事論", new String[]{"唐"}, "法成"), // 唐 法成譯
                "T1557", new BookInfo("阿毘曇五法行經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T1558", new BookInfo("阿毘達磨俱舍論", new String[]{"唐"}, "玄奘", "世親"), // 尊者世親造  唐 玄奘譯
                "T1559", new BookInfo("阿毘達磨俱舍釋論", new String[]{"陳"}, "真諦", "世親"), // 婆藪盤豆造  陳 真諦譯
                "T1560", new BookInfo("阿毘達磨俱舍論本頌", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 世親菩薩造  唐 玄奘譯
                "T1561", new BookInfo("俱舍論實義疏", null, "安慧"), // 尊者安惠造
                "T1562", new BookInfo("阿毘達磨順正理論", new String[]{"唐"}, "玄奘", "眾賢"), // 尊者眾賢造  唐 玄奘譯
                "T1563", new BookInfo("阿毘達磨藏顯宗論", new String[]{"唐"}, "玄奘", "眾賢"), // 尊者眾賢造  唐 玄奘譯
                "T1564", new BookInfo("中論", new String[]{"古印度", "姚秦"}, "鳩摩羅什", "龍樹", "青目"), // 龍樹菩薩造  梵志青目釋  姚秦 鳩摩羅什譯
                "T1565", new BookInfo("順中論", new String[]{"古印度", "東魏"}, "般若流支", "龍樹", "無著"), // 龍樹菩薩造  無著菩薩釋  元魏 瞿曇般若流支譯
                "T1566", new BookInfo("般若燈論釋", new String[]{"古印度", "唐"}, "波羅頗迦羅蜜多羅", "清辨", "龍樹"), // 偈本龍樹菩薩  釋論分別明菩薩  唐 波羅頗蜜多羅譯
                "T1567", new BookInfo("大乘中觀釋論", new String[]{"宋"}, "惟淨", "安慧"), // 安慧菩薩造  宋 惟淨等譯
                "T1568", new BookInfo("十二門論", new String[]{"古印度", "姚秦"}, "鳩摩羅什", "龍樹"), // 龍樹菩薩造  姚秦 鳩摩羅什譯
                "T1569", new BookInfo("百論", new String[]{"姚秦"}, "鳩摩羅什", "婆藪開士", "迦那提婆"), // 提婆菩薩造  婆藪開士釋  姚秦 鳩摩羅什譯
                "T1570", new BookInfo("廣百論本", new String[]{"古印度", "唐"}, "玄奘", "聖天"), // 聖天菩薩造  唐 玄奘譯
                "T1571", new BookInfo("大乘廣百論釋論", new String[]{"古印度", "唐"}, "玄奘", "聖天", "護法"), // 聖天菩薩本  護法菩薩釋  唐 玄奘譯
                "T1572", new BookInfo("百字論", new String[]{"後魏"}, "菩提流支", "迦那提婆"), // 提婆菩薩造  後魏 菩提流支譯
                "T1573", new BookInfo("壹輸盧迦論", new String[]{"東魏"}, "般若流支", "龍樹"), // 龍樹菩薩造  後魏 瞿曇般若留支譯
                "T1574", new BookInfo("大乘破有論", new String[]{"宋"}, "施護", "龍樹"), // 龍樹菩薩造  宋 施護譯
                "T1575", new BookInfo("六十頌如理論", new String[]{"宋"}, "施護", "龍樹"), // 龍樹菩薩造  宋 施護譯
                "T1576", new BookInfo("大乘二十頌論", new String[]{"宋"}, "施護", "龍樹"), // 龍樹菩薩造  宋 施護譯
                "T1577", new BookInfo("大丈夫論", new String[]{"北涼"}, "道泰", "提婆羅"), // 提婆羅菩薩造  北涼 道泰譯
                "T1578", new BookInfo("大乘掌珍論", new String[]{"唐"}, "玄奘", "清辯"), // 清辯菩薩造  唐 玄奘譯
                "T1579", new BookInfo("瑜伽師地論", new String[]{"唐"}, "玄奘", "彌勒菩薩"), // 彌勒菩薩說  唐 玄奘譯
                "T1580", new BookInfo("瑜伽師地論釋", new String[]{"唐"}, "玄奘", "最勝子"), // 最勝子等造  唐 玄奘譯
                "T1581", new BookInfo("菩薩地持經", new String[]{"北涼"}, "曇無讖"), // 北涼 曇無讖譯
                "T1582", new BookInfo("菩薩善戒經", new String[]{"劉宋"}, "求那跋摩"), // 劉宋 求那跋摩譯
                "T1583", new BookInfo("菩薩善戒經", new String[]{"劉宋"}, "求那跋摩"), // 劉宋 求那跋摩譯
                "T1584", new BookInfo("決定藏論", new String[]{"梁"}, "真諦"), // 梁 真諦譯
                "T1585", new BookInfo("成唯識論", new String[]{"唐"}, "玄奘", "護法"), // 護法等菩薩造  唐 玄奘譯
                "T1586", new BookInfo("唯識三十論頌", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 世親菩薩造  唐 玄奘譯
                "T1587", new BookInfo("轉識論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1588", new BookInfo("唯識論", new String[]{"古印度", "東魏"}, "般若流支", "世親"), // 天親菩薩造  後魏 瞿曇般若流支譯
                "T1589", new BookInfo("大乘唯識論", new String[]{"古印度", "陳"}, "真諦", "世親"), // 天親菩薩造  陳 真諦譯
                "T1590", new BookInfo("唯識二十論", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 世親菩薩造  唐 玄奘譯
                "T1591", new BookInfo("成唯識寶生論", new String[]{"唐"}, "義淨", "護法"), // 護法菩薩造  唐 義淨譯
                "T1592", new BookInfo("攝大乘論", new String[]{"後魏"}, "佛陀扇多", "無著"), // 阿僧伽作  後魏 佛陀扇多譯
                "T1593", new BookInfo("攝大乘論", new String[]{"古印度", "陳"}, "真諦", "無著"), // 無著菩薩造  陳 真諦譯
                "T1594", new BookInfo("攝大乘論本", new String[]{"古印度", "唐"}, "玄奘", "無著"), // 無著菩薩造  唐 玄奘譯
                "T1595", new BookInfo("攝大乘論釋", new String[]{"古印度", "陳"}, "世親", "真諦"), // 世親菩薩釋  陳 真諦譯
                "T1596", new BookInfo("攝大乘論釋論", new String[]{"古印度", "隋"}, "世親", "達摩笈多", "行矩"), // 世親菩薩造  隋 笈多共行矩等譯
                "T1597", new BookInfo("攝大乘論釋", new String[]{"古印度", "唐"}, "世親", "玄奘"), // 世親菩薩造  唐 玄奘譯
                "T1598", new BookInfo("攝大乘論釋", new String[]{"唐"}, "無性", "玄奘"), // 無性菩薩造  唐 玄奘譯
                "T1599", new BookInfo("中邊分別論", new String[]{"古印度", "陳"}, "真諦", "世親"), // 天親菩薩造  陳 真諦譯
                "T1600", new BookInfo("辯中邊論", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 世親菩薩造  唐 玄奘譯
                "T1601", new BookInfo("辯中邊論頌", new String[]{"唐"}, "玄奘", "彌勒菩薩"), // 彌勒菩薩說  唐 玄奘譯
                "T1602", new BookInfo("顯揚聖教論", new String[]{"古印度", "唐"}, "玄奘", "無著"), // 無著菩薩造  唐 玄奘譯
                "T1603", new BookInfo("顯揚聖教論頌", new String[]{"古印度", "唐"}, "玄奘", "無著"), // 無著菩薩造  唐 玄奘譯
                "T1604", new BookInfo("大乘莊嚴經論", new String[]{"古印度", "唐"}, "波羅頗迦羅蜜多羅", "無著"), // 無著菩薩造  唐 波羅頗蜜多羅譯
                "T1605", new BookInfo("大乘阿毘達磨集論", new String[]{"古印度", "唐"}, "玄奘", "無著"), // 無著菩薩造  唐 玄奘譯
                "T1606", new BookInfo("大乘阿毘達磨雜集論", new String[]{"唐"}, "玄奘", "安慧"), // 安慧菩薩糅  唐 玄奘譯
                "T1607", new BookInfo("六門教授習定論", new String[]{"古印度", "唐"}, "義淨", "無著", "世親"), // 無著本  世親釋  唐 義淨譯
                "T1608", new BookInfo("業成就論", new String[]{"古印度", "東魏"}, "毗目智仙", "世親"), // 天親菩薩造  元魏 毘目智仙譯
                "T1609", new BookInfo("大乘成業論", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 世親菩薩造  唐 玄奘譯
                "T1610", new BookInfo("佛性論", new String[]{"古印度", "陳"}, "真諦", "世親"), // 天親菩薩造  陳 真諦譯
                "T1611", new BookInfo("究竟一乘寶性論", new String[]{"後魏"}, "勒那摩提"), // 後魏 勒那摩提譯
                "T1612", new BookInfo("大乘五蘊論", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 世親菩薩造  唐 玄奘譯
                "T1613", new BookInfo("大乘廣五蘊論", new String[]{"唐"}, "地婆訶羅", "安慧"), // 安慧菩薩造  唐 地婆訶羅譯
                "T1614", new BookInfo("大乘百法明門論", new String[]{"古印度", "唐"}, "玄奘", "世親"), // 天親菩薩造  唐 玄奘譯
                "T1615", new BookInfo("王法正理論", new String[]{"唐"}, "玄奘", "彌勒菩薩"), // 彌勒菩薩造  唐 玄奘譯
                "T1616", new BookInfo("十八空論", new String[]{"陳"}, "真諦", "龍樹"), // 龍樹菩薩造  陳 真諦譯
                "T1617", new BookInfo("三無性論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1618", new BookInfo("顯識論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1619", new BookInfo("無相思塵論", new String[]{"陳"}, "真諦", "陳那"), // 陳那菩薩造  陳 真諦譯
                "T1620", new BookInfo("解捲論", new String[]{"陳"}, "真諦", "陳那"), // 陳那菩薩造  陳 真諦譯
                "T1621", new BookInfo("掌中論", new String[]{"唐"}, "義淨", "陳那"), // 陳那菩薩造  唐 義淨譯
                "T1622", new BookInfo("取因假設論", new String[]{"唐"}, "義淨", "陳那"), // 陳那菩薩造  唐 義淨譯
                "T1623", new BookInfo("觀總相論頌", new String[]{"唐"}, "義淨", "陳那"), // 陳那菩薩造  唐 義淨譯
                "T1624", new BookInfo("觀所緣緣論", new String[]{"唐"}, "玄奘", "陳那"), // 陳那菩薩造  唐 玄奘譯
                "T1625", new BookInfo("觀所緣論釋", new String[]{"唐"}, "義淨", "護法"), // 護法菩薩造  唐 義淨譯
                "T1626", new BookInfo("大乘法界無差別論", new String[]{"唐"}, "提雲般若", "堅慧"), // 堅慧菩薩造  唐 提雲般若等譯
                "T1627", new BookInfo("大乘法界無差別論", new String[]{"唐"}, "提雲般若", "堅慧"), // 堅慧菩薩造  唐 提雲般若譯
                "T1628", new BookInfo("因明正理門論本", new String[]{"唐"}, "玄奘", "陳那"), // 大域龍菩薩造  唐 玄奘譯
                "T1629", new BookInfo("因明正理門論", new String[]{"唐"}, "義淨", "陳那"), // 大域龍菩薩造  唐 義淨譯
                "T1630", new BookInfo("因明入正理論", new String[]{"唐"}, "玄奘", "商羯羅主"), // 南羯羅主菩薩造  唐 玄奘譯
                "T1631", new BookInfo("迴諍論", new String[]{"東魏"}, "毗目智仙", "般若流支", "龍樹"), // 龍樹菩薩造  後魏 毘目智仙共瞿曇流支譯
                "T1632", new BookInfo("方便心論", new String[]{"後魏"}, "吉迦夜"), // 後魏 吉迦夜譯
                "T1633", new BookInfo("如實論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1634", new BookInfo("入大乘論", new String[]{"北涼"}, "道泰", "堅意"), // 堅意菩薩造  北涼 道泰等譯
                "T1635", new BookInfo("大乘寶要義論", new String[]{"宋"}, "法護"), // 宋 法護等譯
                "T1636", new BookInfo("大乘集菩薩學論", new String[]{"宋"}, "法護", "法稱"), // 法稱菩薩造  宋 法護等譯
                "T1637", new BookInfo("集大乘相論", new String[]{"宋"}, "施護", "覺吉祥智"), // 覺吉祥智菩薩造  宋 施護譯
                "T1638", new BookInfo("集諸法寶最上義論", new String[]{"宋"}, "施護", "善寂"), // 善寂菩薩造  宋 施護譯
                "T1639", new BookInfo("提婆菩薩破楞伽經中外道小乘四宗論", new String[]{"後魏"}, "菩提流支", "迦那提婆"), // 提波菩薩造  後魏 菩提流支譯
                "T1640", new BookInfo("提婆菩薩釋楞伽經中外道小乘涅槃論", new String[]{"後魏"}, "菩提流支", "迦那提婆"), // 提波菩薩造  後魏 菩提流支譯
                "T1641", new BookInfo("隨相論", new String[]{"陳"}, "真諦", "瞿那末底"), // 德慧法師造  陳 真諦譯
                "T1642", new BookInfo("金剛針論", new String[]{"宋"}, "法天", "法稱"), // 法稱菩薩造  宋 法天譯
                "T1643", new BookInfo("尼乾子問無我義經", new String[]{"宋"}, "日稱", "馬鳴"), // 馬鳴菩薩集  宋 日稱譯
                "T1644", new BookInfo("佛說立世阿毘曇論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1645", new BookInfo("彰所知論", new String[]{"元"}, "沙囉巴", "發合思巴"), // 發合思巴造  元 沙羅巴譯
                "T1646", new BookInfo("成實論", new String[]{"姚秦"}, "鳩摩羅什", "訶梨跋摩"), // 訶梨跋摩造  姚秦 鳩摩羅什譯
                "T1647", new BookInfo("四諦論", new String[]{"陳"}, "真諦", "婆藪跋摩"), // 婆藪跋摩造  陳 真諦譯
                "T1648", new BookInfo("解脫道論", new String[]{"梁"}, "僧伽婆羅", "優波底沙"), // 優波底沙造  梁 僧伽婆羅譯
                "T1649", new BookInfo("三彌底部論", null, "失譯"), // 失譯
                "T1650", new BookInfo("辟支佛因緣論", null, "失譯"), // 失譯
                "T1651", new BookInfo("十二因緣論", new String[]{"後魏"}, "菩提流支", "淨意"), // 淨意菩薩造  後魏 菩提流支譯
                "T1652", new BookInfo("緣生論", new String[]{"隋"}, "達摩笈多", "鬱楞迦"), // 欝楞迦造  隋 達磨笈多譯
                "T1653", new BookInfo("大乘緣生論", new String[]{"唐"}, "不空", "鬱楞迦"), // 欝楞迦造  唐 不空譯
                "T1654", new BookInfo("因緣心論頌因緣心論釋", null, "龍樹"), // 猛龍菩薩造
                "T1655", new BookInfo("止觀門論頌", new String[]{"古印度", "唐"}, "義淨", "世親"), // 世親菩薩造  唐 義淨譯
                "T1656", new BookInfo("寶行王正論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T1657", new BookInfo("手杖論", new String[]{"唐"}, "義淨", "迦稱"), // 釋迦稱造  唐 義淨譯
                "T1658", new BookInfo("諸教決定名義論", new String[]{"宋"}, "施護", "彌勒菩薩"), // 慈氏菩薩造  宋 施護譯
                "T1659", new BookInfo("發菩提心經論", new String[]{"古印度", "後秦"}, "鳩摩羅什", "世親"), // 天親菩薩造  後秦 鳩摩羅什譯
                "T1660", new BookInfo("菩提資糧論", new String[]{"隋"}, "達摩笈多", "龍樹", "自在"), // 龍樹本  自在比丘釋  隋 達磨笈多譯
                "T1661", new BookInfo("菩提心離相論", new String[]{"宋"}, "施護", "龍樹"), // 龍樹菩薩造  宋 施護譯
                "T1662", new BookInfo("菩提行經", new String[]{"宋"}, "天息災", "龍樹"), // 龍樹菩薩集頌  宋 天息災譯
                "T1663", new BookInfo("菩提心觀釋", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1664", new BookInfo("廣釋菩提心論", new String[]{"宋"}, "施護", "蓮華戒"), // 蓮華戒菩薩造  宋 施護譯
                "T1665", new BookInfo("金剛頂瑜伽中發阿耨多羅三藐三菩提心論", new String[]{"唐"}, "不空"), // 唐 不空譯
                "T1666", new BookInfo("大乘起信論", new String[]{"梁"}, "真諦", "馬鳴"), // 馬鳴菩薩造  梁 真諦譯
                "T1667", new BookInfo("大乘起信論", new String[]{"唐"}, "實叉難陀", "馬鳴"), // 馬鳴菩薩造  唐 實叉難陀譯
                "T1668", new BookInfo("釋摩訶衍論", new String[]{"姚秦"}, "筏提摩多", "龍樹"), // 龍樹菩薩造  姚秦 筏提摩多譯
                "T1669", new BookInfo("大宗地玄文本論", new String[]{"陳"}, "真諦", "馬鳴"), // 馬鳴菩薩造  陳 真諦譯
                "T1670A", new BookInfo("那先比丘經", null, "失譯"), // 失譯
                "T1670B", new BookInfo("那先比丘經", null, "失譯"), // 失譯
                "T1671", new BookInfo("福蓋正行所集經", new String[]{"宋"}, "日稱", "龍樹"), // 龍樹菩薩集  宋 日稱等譯
                "T1672", new BookInfo("龍樹菩薩為禪陀迦王說法要偈", new String[]{"劉宋"}, "求那跋摩"), // 宋 求那跋摩譯
                "T1673", new BookInfo("勸發諸王要偈", new String[]{"劉宋"}, "僧伽跋摩", "龍樹"), // 龍樹菩薩撰  宋 僧伽跋摩譯
                "T1674", new BookInfo("龍樹菩薩勸誡王頌", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "T1675", new BookInfo("讚法界頌", new String[]{"宋"}, "施護", "龍樹"), // 龍樹菩薩造  宋 施護譯
                "T1676", new BookInfo("廣大發願頌", new String[]{"宋"}, "施護", "龍樹"), // 龍樹菩薩造  宋 施護等譯
                "T1677", new BookInfo("三身梵讚", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1678", new BookInfo("佛三身讚", new String[]{"宋"}, "天息災"), // 西土賢聖撰  宋 法賢譯
                "T1679", new BookInfo("佛一百八名讚", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1680", new BookInfo("一百五十讚佛頌", new String[]{"唐"}, "義淨", "摩咥里制吒"), // 摩咥里制吒造  唐 義淨譯
                "T1681", new BookInfo("佛吉祥德讚", new String[]{"宋"}, "施護", "寂友"), // 寂友尊者造  宋 施護譯
                "T1682", new BookInfo("七佛讚唄伽他", new String[]{"宋"}, "法天"), // 宋 法天譯
                "T1683", new BookInfo("犍稚梵讚", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1684", new BookInfo("八大靈塔梵讚", new String[]{"宋"}, "天息災", "曷利沙伐彈那"), // 西天戒日王製  宋 法賢譯
                "T1685", new BookInfo("佛說八大靈塔名號經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1686", new BookInfo("賢聖集伽陀一百頌", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1687", new BookInfo("事師法五十頌", new String[]{"宋"}, "日稱", "馬鳴"), // 馬鳴菩薩集  宋 日稱等譯
                "T1688", new BookInfo("密跡力士大權神王經偈頌", new String[]{"元"}, "管主八"), // 元 管主八撰
                "T1689", new BookInfo("請賓頭盧法", new String[]{"劉宋"}, "慧簡"), // 劉宋 慧簡譯
                "T1690", new BookInfo("賓頭盧突羅闍為優陀延王說法經", new String[]{"劉宋"}, "求那跋陀羅"), // 劉宋 求那跋陀羅譯
                "T1691", new BookInfo("迦葉仙人說醫女人經", new String[]{"宋"}, "天息災"), // 宋 法賢譯
                "T1692", new BookInfo("勝軍化世百喻伽他經", new String[]{"宋"}, "天息災"), // 宋 天息災譯
                "T1693", new BookInfo("人本欲生經註", new String[]{"東晉"}, "道安"), // 東晉 道安撰
                "T1694", new BookInfo("陰持入經註", new String[]{"吳"}, "陳慧"), // 吳 陳慧撰
                "T1695", new BookInfo("大般若波羅蜜多經般若理趣分述讚", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1696", new BookInfo("大品經遊意", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1697", new BookInfo("大慧度經宗要", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1698", new BookInfo("金剛般若經疏", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1699", new BookInfo("金剛般若疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1700", new BookInfo("金剛般若經贊述", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1701", new BookInfo("金剛般若經疏論纂要", new String[]{"唐"}, "宗密", "長水子璿"), // 唐 宗密述  宋 子璿治定
                "T1702", new BookInfo("金剛經纂要刊定記", new String[]{"宋"}, "長水子璿"), // 宋 子璿錄
                "T1703", new BookInfo("金剛般若波羅蜜經註解", new String[]{"明"}, "宗泐", "如玘"), // 明 宗泐．如玘同註
                "T1704", new BookInfo("金剛般若波羅蜜經略疏", new String[]{"唐"}, "智儼"), // 唐 智儼述
                "T1705", new BookInfo("仁王護國般若經疏", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說  灌頂記
                "T1706", new BookInfo("仁王護國般若波羅蜜經疏神寶記", new String[]{"宋"}, "善月"), // 宋 善月述
                "T1707", new BookInfo("仁王般若經疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1708", new BookInfo("仁王經疏", new String[]{"唐"}, "圓測"), // 唐 圓測撰
                "T1709", new BookInfo("仁王護國般若波羅蜜多經疏", new String[]{"唐"}, "良賁"), // 唐 良賁述
                "T1710", new BookInfo("般若波羅蜜多心經幽贊", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1711", new BookInfo("般若波羅蜜多心經贊", new String[]{"唐"}, "圓測"), // 唐 圓測撰
                "T1712", new BookInfo("般若波羅蜜多心經略疏", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1713", new BookInfo("般若心經略疏連珠記", new String[]{"宋"}, "師會"), // 宋 師會述
                "T1714", new BookInfo("般若波羅蜜多心經註解", new String[]{"明"}, "宗泐", "如玘"), // 明 宗泐．如玘同註
                "T1715", new BookInfo("法華經義記", new String[]{"梁"}, "法雲"), // 梁 法雲撰
                "T1716", new BookInfo("妙法蓮華經玄義", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1717", new BookInfo("法華玄義釋籤", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1718", new BookInfo("妙法蓮華經文句", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1719", new BookInfo("法華文句記", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1720", new BookInfo("法華玄論", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1721", new BookInfo("法華義疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1722", new BookInfo("法華遊意", new String[]{"隋"}, "吉藏"), // 隋 吉藏造
                "T1723", new BookInfo("妙法蓮華經玄贊", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1724", new BookInfo("法華玄贊義決", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "T1725", new BookInfo("法華宗要", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1726", new BookInfo("觀音玄義", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說．灌頂記
                "T1727", new BookInfo("觀音玄義記", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "T1728", new BookInfo("觀音義疏", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說．灌頂記
                "T1729", new BookInfo("觀音義疏記", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "T1730", new BookInfo("金剛三昧經論", new String[]{"新羅"}, "元曉"), // 新羅 元曉述
                "T1731", new BookInfo("華嚴遊意", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1732", new BookInfo("大方廣佛華嚴經搜玄分齊通智方軌", new String[]{"唐"}, "智儼"), // 唐 智儼述
                "T1733", new BookInfo("華嚴經探玄記", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1734", new BookInfo("花嚴經文義綱目", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1735", new BookInfo("大方廣佛華嚴經疏", new String[]{"唐"}, "澄觀"), // 唐 澄觀撰
                "T1736", new BookInfo("大方廣佛華嚴經隨疏演義鈔", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "T1737", new BookInfo("大華嚴經略策", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "T1738", new BookInfo("新譯華嚴經七處九會頌釋章", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "T1739", new BookInfo("新華嚴經論", new String[]{"唐"}, "李通玄"), // 唐 李通玄撰
                "T1740", new BookInfo("大方廣佛華嚴經中卷卷大意略敘", new String[]{"唐"}, "李通玄"), // 唐 李通玄造
                "T1741", new BookInfo("略釋新華嚴經修行次第決疑論", new String[]{"唐"}, "李通玄"), // 唐 李通玄撰
                "T1742", new BookInfo("大方廣佛華嚴經願行觀門骨目", new String[]{"唐"}, "湛然"), // 唐 湛然撰
                "T1743", new BookInfo("皇帝降誕日於麟德殿講大方廣佛華嚴經玄義一部", new String[]{"唐"}, "靜居"), // 唐 靜居撰
                "T1744", new BookInfo("勝鬘寶窟", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1745", new BookInfo("無量壽經義疏", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "T1746", new BookInfo("無量壽經義疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1747", new BookInfo("兩卷無量壽經宗要", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1748", new BookInfo("無量壽經連義述文贊", new String[]{"新羅"}, "憬興"), // 新羅 璟興撰
                "T1749", new BookInfo("觀無量壽經義疏", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "T1750", new BookInfo("觀無量壽佛經疏", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1751", new BookInfo("觀無量壽佛經疏妙宗鈔", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "T1752", new BookInfo("觀無量壽經義疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1753", new BookInfo("觀無量壽佛經疏", new String[]{"唐"}, "善導"), // 唐 善導集記
                "T1754", new BookInfo("觀無量壽佛經義疏", new String[]{"宋"}, "元照"), // 宋 元照述
                "T1755", new BookInfo("阿彌陀經義記", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1756", new BookInfo("阿彌陀經義述", new String[]{"唐"}, "慧淨"), // 唐 慧淨述
                "T1757", new BookInfo("阿彌陀經疏", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1758", new BookInfo("阿彌陀經通贊疏", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1759", new BookInfo("阿彌陀經疏", new String[]{"新羅"}, "元曉"), // 新羅 元曉述
                "T1760", new BookInfo("阿彌陀經疏", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "T1761", new BookInfo("阿彌陀經義疏", new String[]{"宋"}, "元照"), // 宋 元照述
                "T1762", new BookInfo("阿彌陀經要解", new String[]{"明"}, "智旭"), // 明 智旭解
                "T1763", new BookInfo("大般涅槃經集解", new String[]{"梁"}, "釋寶亮"), // 梁 寶亮等集
                "T1764", new BookInfo("大般涅槃經義記", new String[]{"隋"}, "慧遠"), // 隋 慧遠述
                "T1765", new BookInfo("大般涅槃經玄義", new String[]{"隋"}, "灌頂"), // 隋 灌頂撰
                "T1766", new BookInfo("涅槃玄義發源機要", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "T1767", new BookInfo("大般涅槃經疏", new String[]{"隋"}, "灌頂"), // 隋 灌頂撰
                "T1768", new BookInfo("涅槃經遊意", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1769", new BookInfo("涅槃宗要", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1770", new BookInfo("本願藥師經古迹", new String[]{"新羅"}, "太賢"), // 新羅 太賢撰
                "T1771", new BookInfo("彌勒經遊意", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1772", new BookInfo("觀彌勒上生兜率天經贊", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1773", new BookInfo("彌勒上生經宗要", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1774", new BookInfo("三彌勒經疏", new String[]{"新羅"}, "憬興"), // 新羅 憬興撰
                "T1775", new BookInfo("注維摩詰經", new String[]{"後秦"}, "僧肇"), // 後秦 僧肇撰
                "T1776", new BookInfo("維摩義記", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "T1777", new BookInfo("維摩經玄疏", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "T1778", new BookInfo("維摩經略疏", new String[]{"隋", "唐"}, "湛然", "智顗"), // 隋 智顗說　唐 湛然略
                "T1779", new BookInfo("維摩經略疏垂裕記", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "T1780", new BookInfo("淨名玄論", new String[]{"隋"}, "吉藏"), // 隋 吉藏造
                "T1781", new BookInfo("維摩經義疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1782", new BookInfo("說無垢稱經疏", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1783", new BookInfo("金光明經玄義", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說  灌頂錄
                "T1784", new BookInfo("金光明經玄義拾遺記", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "T1785", new BookInfo("金光明經文句", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說  灌頂錄
                "T1786", new BookInfo("金光明經文句記", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "T1787", new BookInfo("金光明經疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1788", new BookInfo("金光明最勝王經疏", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "T1789", new BookInfo("楞伽阿跋多羅寶經註解", new String[]{"明"}, "宗泐", "如玘"), // 明 宗泐．如玘同註
                "T1790", new BookInfo("入楞伽心玄義", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1791", new BookInfo("注大乘入楞伽經", new String[]{"宋"}, "寶臣"), // 宋 寶臣述
                "T1792", new BookInfo("佛說盂蘭盆經疏", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "T1793", new BookInfo("溫室經義記", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "T1794", new BookInfo("註四十二章經", new String[]{"宋"}, "趙德昌"), // 宋 真宗皇帝註
                "T1795", new BookInfo("大方廣圓覺修多羅了義經略疏", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "T1796", new BookInfo("大毘盧遮那成佛經疏", new String[]{"唐"}, "一行"), // 唐 一行記
                "T1797", new BookInfo("大毘盧遮那經供養次第法疏", new String[]{"唐"}, "不可思議"), // 唐 不可思議撰
                "T1798", new BookInfo("金剛頂經大瑜伽祕密心地法門義訣", new String[]{"唐"}, "不空"), // 唐 不空撰
                "T1799", new BookInfo("首楞嚴義疏注經", new String[]{"宋"}, "長水子璿"), // 宋 子璿集
                "T1800", new BookInfo("請觀音經疏", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說  灌頂記
                "T1801", new BookInfo("請觀音經疏闡義鈔", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "T1802", new BookInfo("十一面神呪心經義疏", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "T1803", new BookInfo("佛頂尊勝陀羅尼經教跡義記", new String[]{"唐"}, "法崇"), // 唐 法崇述
                "T1804", new BookInfo("四分律刪繁補闕行事鈔", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T1805", new BookInfo("四分律行事鈔資持記", new String[]{"宋"}, "元照"), // 宋 元照撰
                "T1806", new BookInfo("四分律比丘含注戒本", new String[]{"唐"}, "道宣"), // 唐 道宣述
                "T1807", new BookInfo("四分比丘戒本疏", new String[]{"唐"}, "定賓"), // 唐 定賓撰
                "T1808", new BookInfo("四分律刪補隨機羯磨", new String[]{"唐"}, "道宣"), // 唐 道宣集
                "T1809", new BookInfo("僧羯磨", new String[]{"唐"}, "懷素"), // 唐 懷素集
                "T1810", new BookInfo("尼羯磨", new String[]{"唐"}, "懷素"), // 唐 懷素集
                "T1811", new BookInfo("菩薩戒義疏", new String[]{"隋"}, "智顗", "灌頂"), // 隋 智顗說  灌頂記
                "T1812", new BookInfo("天台菩薩戒疏", new String[]{"唐"}, "明曠"), // 唐 明曠刪補
                "T1813", new BookInfo("梵網經菩薩戒本疏", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1814", new BookInfo("菩薩戒本疏", new String[]{"新羅"}, "義寂"), // 新羅 義寂述
                "T1815", new BookInfo("梵網經古迹記", new String[]{"新羅"}, "太賢"), // 新羅 太賢集
                "T1816", new BookInfo("金剛般若論會釋", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1817", new BookInfo("略明般若末後一頌讚述", new String[]{"唐"}, "義淨"), // 唐 義淨述
                "T1818", new BookInfo("法華論疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1819", new BookInfo("無量壽經優婆提舍願生偈註", new String[]{"北魏"}, "曇鸞"), // 北魏 曇鸞註解
                "T1820", new BookInfo("佛遺教經論疏節要", new String[]{"宋"}, "淨源", "袾宏"), // 宋 淨源節要  明 袾宏補註
                "T1821", new BookInfo("俱舍論記", new String[]{"唐"}, "普光"), // 唐 普光述
                "T1822", new BookInfo("俱舍論疏", new String[]{"唐"}, "法寶"), // 唐 法寶撰
                "T1823", new BookInfo("俱舍論頌疏論本", new String[]{"唐"}, "圓暉"), // 唐 圓暉述
                "T1824", new BookInfo("中觀論疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1825", new BookInfo("十二門論疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1826", new BookInfo("十二門論宗致義記", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1827", new BookInfo("百論疏", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1828", new BookInfo("瑜伽論記", new String[]{"唐"}, "遁倫"), // 唐 遁倫集撰
                "T1829", new BookInfo("瑜伽師地論略纂", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1830", new BookInfo("成唯識論述記", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1831", new BookInfo("成唯識論掌中樞要", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1832", new BookInfo("成唯識論了義燈", new String[]{"唐"}, "慧沼"), // 唐 惠沼述
                "T1833", new BookInfo("成唯識論演祕", new String[]{"唐"}, "智周"), // 唐 智周撰
                "T1834", new BookInfo("唯識二十論述記", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1835", new BookInfo("辯中邊論述記", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1836", new BookInfo("大乘百法明門論解", new String[]{"唐"}, "窺基", "普泰"), // 唐 窺基註解、明 普泰增修
                "T1837", new BookInfo("大乘百法明門論疏", new String[]{"唐"}, "普光"), // 唐 大乘光撰
                "T1838", new BookInfo("大乘法界無差別論疏", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1839", new BookInfo("理門論述記", new String[]{"唐"}, "神泰"), // 唐 神泰撰
                "T1840", new BookInfo("因明入正理論疏", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1841", new BookInfo("因明義斷", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "T1842", new BookInfo("因明入正理論義纂要", new String[]{"唐"}, "慧沼"), // 唐 慧沼集
                "T1843", new BookInfo("大乘起信論義疏", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "T1844", new BookInfo("起信論疏", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1845", new BookInfo("大乘起信論別記", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1846", new BookInfo("大乘起信論義記", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1847", new BookInfo("大乘起信論義記別記", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1848", new BookInfo("起信論疏筆削記", new String[]{"宋"}, "長水子璿"), // 宋 子璿錄
                "T1849", new BookInfo("大乘起信論內義略探記", new String[]{"新羅"}, "太賢"), // 新羅 太賢作
                "T1850", new BookInfo("大乘起信論裂網疏", new String[]{"明"}, "智旭"), // 明 智旭述
                "T1851", new BookInfo("大乘義章", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "T1852", new BookInfo("三論玄義", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1853", new BookInfo("大乘玄論", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1854", new BookInfo("二諦義", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "T1855", new BookInfo("三論遊意義", new String[]{"隋"}, "碩法師"), // 隋 磧法師撰
                "T1856", new BookInfo("鳩摩羅什法師大義", new String[]{"東晉"}, "慧遠", "鳩摩羅什"), // 東晉 慧遠問．羅什答
                "T1857", new BookInfo("寶藏論", new String[]{"後秦"}, "僧肇"), // 後秦 僧肇著
                "T1858", new BookInfo("肇論", new String[]{"後秦"}, "僧肇"), // 後秦 僧肇作
                "T1859", new BookInfo("肇論疏", new String[]{"唐"}, "元康"), // 唐 元康撰
                "T1860", new BookInfo("肇論新疏", new String[]{"元"}, "文才"), // 元 文才述
                "T1861", new BookInfo("大乘法苑義林章", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "T1862", new BookInfo("勸發菩提心集", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "T1863", new BookInfo("能顯中邊慧日論", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "T1864", new BookInfo("大乘入道次第", new String[]{"唐"}, "智周"), // 唐 智周撰
                "T1865", new BookInfo("八識規矩補註", new String[]{"明"}, "普泰"), // 明 普泰補註
                "T1866", new BookInfo("華嚴一乘教義分齊章", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1867", new BookInfo("華嚴五教止觀", new String[]{"隋"}, "法順"), // 隋 杜順說
                "T1868", new BookInfo("華嚴一乘十玄門", new String[]{"唐"}, "智儼", "法順"), // 隋 杜順說．唐 智儼撰
                "T1869", new BookInfo("華嚴五十要問答", new String[]{"唐"}, "智儼"), // 唐 智儼集
                "T1870", new BookInfo("華嚴經內章門等雜孔目章", new String[]{"唐"}, "智儼"), // 唐 智儼集
                "T1871", new BookInfo("華嚴經旨歸", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1872", new BookInfo("華嚴策林", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1873", new BookInfo("華嚴經問答", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1874", new BookInfo("華嚴經明法品內立三寶章", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1875", new BookInfo("華嚴經義海百門", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1876", new BookInfo("修華嚴奧旨妄盡還源觀", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1877", new BookInfo("華嚴遊心法界記", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1878", new BookInfo("華嚴發菩提心章", new String[]{"唐"}, "法藏"), // 唐 法藏述
                "T1879a", new BookInfo("華嚴經關脈義記", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "T1879b", new BookInfo("華嚴關脈義記", null), //
                "T1880", new BookInfo("金師子章雲間類解", new String[]{"宋"}, "法藏", "淨源"), // 唐 法藏撰．宋 淨源述
                "T1881", new BookInfo("華嚴經金師子章註", new String[]{"宋"}, "法藏", "承遷"), // 唐 法藏撰．宋 承遷註
                "T1882", new BookInfo("三聖圓融觀門", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "T1883", new BookInfo("華嚴法界玄鏡", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "T1884", new BookInfo("註華嚴法界觀門", new String[]{"唐"}, "宗密"), // 唐 宗密註
                "T1885", new BookInfo("註華嚴經題法界觀門頌", new String[]{"宋"}, "本嵩", "琮湛"), // 宋 本嵩述．琮湛註
                "T1886", new BookInfo("原人論", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "T1887A", new BookInfo("華嚴一乘法界圖", new String[]{"新羅"}, "義湘"), // 新羅 義湘撰
                "T1887B", new BookInfo("法界圖記叢髓錄", null), //
                "T1888", new BookInfo("解迷顯智成悲十明論", new String[]{"唐"}, "李通玄"), // 唐 李通玄撰
                "T1889", new BookInfo("海印三昧論", new String[]{"新羅"}, "明皛"), // 新羅 明皛述
                "T1890", new BookInfo("華嚴一乘成佛妙義", new String[]{"新羅"}, "見登之"), // 新羅 見登之集
                "T1891", new BookInfo("文殊指南圖讚", new String[]{"宋"}, "惟白"), // 宋 惟白述
                "T1892", new BookInfo("關中創立戒壇圖經", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T1893", new BookInfo("淨心誡觀法", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T1894", new BookInfo("釋門章服儀", new String[]{"唐"}, "道宣"), // 唐 道宣述
                "T1895", new BookInfo("量處輕重儀", new String[]{"唐"}, "道宣"), // 唐 道宣緝
                "T1896", new BookInfo("釋門歸敬儀", new String[]{"唐"}, "道宣"), // 唐 道宣述
                "T1897", new BookInfo("教誡新學比丘行護律儀", new String[]{"唐"}, "道宣"), // 唐 道宣述
                "T1898", new BookInfo("律相感通傳", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T1899", new BookInfo("中天竺舍衛國祇洹寺圖經", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T1900", new BookInfo("佛制比丘六物圖", new String[]{"宋"}, "元照"), // 宋 元照撰
                "T1901", new BookInfo("護命放生軌儀法", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T1902", new BookInfo("受用三水要行法", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T1903", new BookInfo("說罪要行法", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T1904", new BookInfo("根本說一切有部出家授近圓羯磨儀範", new String[]{"元"}, "拔合思巴"), // 元 拔合思巴集
                "T1905", new BookInfo("根本說一切有部苾芻習學略法", new String[]{"元"}, "拔合思巴"), // 元 拔合思巴集
                "T1906", new BookInfo("菩薩戒本宗要", new String[]{"新羅"}, "太賢"), // 新羅 大賢撰
                "T1907", new BookInfo("菩薩戒本持犯要記", new String[]{"新羅"}, "元曉"), // 新羅 元曉述
                "T1908", new BookInfo("大乘六情懺悔", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1909", new BookInfo("慈悲道場懺法", new String[]{"梁"}, "諸大法師"), // 梁 諸大法師集撰
                "T1910", new BookInfo("慈悲水懺法", null), //
                "T1911", new BookInfo("摩訶止觀", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1912", new BookInfo("止觀輔行傳弘決", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1913", new BookInfo("止觀義例", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1914", new BookInfo("止觀大意", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1915", new BookInfo("修習止觀坐禪法要", new String[]{"隋"}, "智顗"), // 隋 智顗述
                "T1916", new BookInfo("釋禪波羅蜜次第法門", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1917", new BookInfo("六妙法門", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1918", new BookInfo("四念處", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1919", new BookInfo("天台智者大師禪門口訣", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1920", new BookInfo("觀心論", new String[]{"隋"}, "智顗"), // 隋 智顗述
                "T1921", new BookInfo("觀心論疏", new String[]{"隋"}, "灌頂"), // 隋 灌頂撰
                "T1922", new BookInfo("釋摩訶般若波羅蜜經覺意三昧", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1923", new BookInfo("諸法無諍三昧法門", new String[]{"陳"}, "慧思"), // 陳 慧思撰
                "T1924", new BookInfo("大乘止觀法門", new String[]{"陳"}, "慧思"), // 陳 慧思說
                "T1925", new BookInfo("法界次第初門", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "T1926", new BookInfo("法華經安樂行義", new String[]{"陳"}, "慧思"), // 陳 慧思說
                "T1927", new BookInfo("十不二門", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1928", new BookInfo("十不二門指要鈔", new String[]{"宋"}, "知禮"), // 宋 知禮述
                "T1929", new BookInfo("四教義", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "T1930", new BookInfo("天台八教大意", new String[]{"隋"}, "灌頂"), // 隋 灌頂撰
                "T1931", new BookInfo("天台四教儀", new String[]{"高麗"}, "諦觀"), // 高麗 諦觀錄
                "T1932", new BookInfo("金剛錍", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "T1933", new BookInfo("南嶽思大禪師立誓願文", new String[]{"陳"}, "慧思"), // 陳 慧思撰
                "T1934", new BookInfo("國清百錄", new String[]{"隋"}, "灌頂"), // 隋 灌頂纂
                "T1935", new BookInfo("法智遺編觀心二百問", new String[]{"宋"}, "繼忠"), // 宋 繼忠集
                "T1936", new BookInfo("四明十義書", new String[]{"宋"}, "知禮"), // 宋 知禮撰
                "T1937", new BookInfo("四明尊者教行錄", new String[]{"宋"}, "宗曉"), // 宋 宗曉編
                "T1938", new BookInfo("天台傳佛心印記", new String[]{"元"}, "懷則"), // 元 懷則述
                "T1939", new BookInfo("教觀綱宗", new String[]{"明"}, "智旭"), // 明 智旭述
                "T1940", new BookInfo("方等三昧行法", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1941", new BookInfo("法華三昧懺儀", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "T1942", new BookInfo("法華三昧行事運想補助儀", new String[]{"唐"}, "湛然"), // 唐 湛然撰
                "T1943", new BookInfo("略法華三昧補助儀", null), //
                "T1944", new BookInfo("禮法華經儀式", null), //
                "T1945", new BookInfo("金光明懺法補助儀", new String[]{"宋"}, "遵式"), // 宋 遵式集
                "T1946", new BookInfo("金光明最勝懺儀", new String[]{"宋"}, "知禮"), // 宋 知禮集
                "T1947", new BookInfo("釋迦如來涅槃禮讚文", new String[]{"宋"}, "仁岳"), // 宋 仁岳撰
                "T1948", new BookInfo("天台智者大師齋忌禮讚文", new String[]{"宋"}, "遵式"), // 宋 遵式述
                "T1949", new BookInfo("請觀世音菩薩消伏毒害陀羅尼三昧儀", new String[]{"宋"}, "遵式"), // 宋 遵式集
                "T1950", new BookInfo("千手眼大悲心呪行法", new String[]{"宋"}, "知禮"), // 宋 知禮集
                "T1951", new BookInfo("熾盛光道場念誦儀", new String[]{"宋"}, "遵式"), // 宋 遵式撰
                "T1952", new BookInfo("觀自在菩薩如意輪呪課法", null), //
                "T1953", new BookInfo("菩提心義", null), //
                "T1954", new BookInfo("明佛法根本碑", new String[]{"唐"}, "智慧輪"), // 唐 智慧輪述
                "T1955", new BookInfo("顯密圓通成佛心要集", new String[]{"遼"}, "道[辰*殳]"), // 遼 道[厄*殳]集
                "T1956", new BookInfo("密呪圓因往生集", new String[]{"夏"}, "智廣"), // 夏 智廣等集
                "T1957", new BookInfo("略論安樂淨土義", new String[]{"後魏"}, "曇鸞"), // 後魏 曇鸞撰
                "T1958", new BookInfo("安樂集", new String[]{"唐"}, "道綽"), // 唐 道綽撰
                "T1959", new BookInfo("觀念阿彌陀佛相海三昧功德法門", new String[]{"唐"}, "善導"), // 唐 善導集記
                "T1960", new BookInfo("釋淨土群疑論", new String[]{"唐"}, "懷感"), // 唐 懷感撰
                "T1961", new BookInfo("淨土十疑論", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "T1962", new BookInfo("五方便念佛門", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "T1963", new BookInfo("淨土論", new String[]{"唐"}, "迦才"), // 唐 迦才撰
                "T1964", new BookInfo("西方要決釋疑通規", new String[]{"唐"}, "窺基"), // 唐 基撰
                "T1965", new BookInfo("遊心安樂道", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T1966", new BookInfo("念佛鏡", new String[]{"唐"}, "道鏡", "善道"), // 唐 道鏡、善道共集
                "T1967", new BookInfo("念佛三昧寶王論", new String[]{"唐"}, "飛錫"), // 唐 飛錫撰
                "T1968", new BookInfo("往生淨土決疑行願二門", new String[]{"宋"}, "遵式"), // 宋 遵式撰
                "T1969A", new BookInfo("樂邦文類", new String[]{"宋"}, "宗曉"), // 宋 宗曉編
                "T1969B", new BookInfo("樂邦遺稿", new String[]{"宋"}, "宗曉"), // 宋 宗曉編
                "T1970", new BookInfo("龍舒增廣淨土文", new String[]{"宋"}, "王日休"), // 宋 王日休撰
                "T1971", new BookInfo("淨土境觀要門", new String[]{"元"}, "懷則"), // 元 懷則述
                "T1972", new BookInfo("淨土或問", new String[]{"元"}, "惟則"), // 元 天如則著
                "T1973", new BookInfo("廬山蓮宗寶鑑", new String[]{"元"}, "普度"), // 元 普度編
                "T1974", new BookInfo("寶王三昧念佛直指", new String[]{"明"}, "妙協"), // 明 妙叶集
                "T1975", new BookInfo("淨土生無生論", new String[]{"明"}, "傳燈"), // 明 傳燈撰
                "T1976", new BookInfo("西方合論", new String[]{"明"}, "袁宏道"), // 明 袁宏道撰
                "T1977", new BookInfo("淨土疑辨", new String[]{"明"}, "袾宏"), // 明 袾宏撰
                "T1978", new BookInfo("讚阿彌陀佛偈", new String[]{"後魏"}, "曇鸞"), // 後魏 曇鸞撰
                "T1979", new BookInfo("轉經行道願往生淨土法事讚", new String[]{"唐"}, "善導"), // 唐 善導集記
                "T1980", new BookInfo("往生禮讚偈", new String[]{"唐"}, "善導"), // 唐 善導集記
                "T1981", new BookInfo("依觀經等明般舟三昧行道往生讚", new String[]{"唐"}, "善導"), // 唐 善導撰
                "T1982", new BookInfo("集諸經禮懺儀", new String[]{"唐"}, "智昇"), // 唐 智昇撰
                "T1983", new BookInfo("淨土五會念佛略法事儀讚", new String[]{"唐"}, "法照"), // 唐 法照述
                "T1984", new BookInfo("往生淨土懺願儀", new String[]{"宋"}, "遵式"), // 宋 遵式撰
                "T1985", new BookInfo("鎮州臨濟慧照禪師語錄", new String[]{"唐"}, "慧然"), // 唐 慧然集
                "T1986A", new BookInfo("筠州洞山悟本禪師語錄", new String[]{"日本"}, "慧印"), // 日本 慧印校
                "T1986B", new BookInfo("瑞州洞山良价禪師語錄", new String[]{"明"}, "圓信", "郭凝之"), // 明 語風圓信．郭凝之編
                "T1987A", new BookInfo("撫州曹山元證禪師語錄", new String[]{"日本"}, "慧印"), // 日本 慧印校
                "T1987B", new BookInfo("撫州曹山本寂禪師語錄", new String[]{"日本"}, "玄契"), // 日本 玄契編
                "T1988", new BookInfo("雲門匡真禪師廣錄", new String[]{"宋"}, "守堅"), // 宋 守堅集
                "T1989", new BookInfo("潭州溈山靈祐禪師語錄", new String[]{"明"}, "圓信", "郭凝之"), // 明 語風圓信．郭凝之編
                "T1990", new BookInfo("袁州仰山慧寂禪師語錄", new String[]{"明"}, "圓信", "郭凝之"), // 明 語風圓信．郭凝之編
                "T1991", new BookInfo("金陵清涼院文益禪師語錄", new String[]{"明"}, "圓信", "郭凝之"), // 明 語風圓信．郭凝之編
                "T1992", new BookInfo("汾陽無德禪師語錄", new String[]{"宋"}, "楚圓"), // 宋 楚圓集
                "T1993", new BookInfo("黃龍慧南禪師語錄", new String[]{"宋"}, "九頂慧泉"), // 宋 惠泉集
                "T1994A", new BookInfo("楊岐方會和尚語錄", new String[]{"宋"}, "仁勇"), // 宋 仁勇等編
                "T1994B", new BookInfo("楊岐方會和尚後錄", null), //
                "T1995", new BookInfo("法演禪師語錄", new String[]{"宋"}, "才良"), // 宋 才良等編
                "T1996", new BookInfo("明覺禪師語錄", new String[]{"宋"}, "惟蓋"), // 宋 惟蓋竺編
                "T1997", new BookInfo("圓悟佛果禪師語錄", new String[]{"宋"}, "紹隆"), // 宋 紹隆等編
                "T1998A", new BookInfo("大慧普覺禪師語錄", new String[]{"宋"}, "蘊聞"), // 宋 蘊聞編
                "T1998B", new BookInfo("大慧普覺禪師宗門武庫", new String[]{"宋"}, "道謙"), // 宋 道謙編
                "T1999", new BookInfo("密菴和尚語錄", new String[]{"宋"}, "崇岳", "了悟"), // 宋 崇岳．了悟等編
                "T2000", new BookInfo("虛堂和尚語錄", new String[]{"宋"}, "妙源") // 宋 妙源編
        );
    }

    private static void addT2000() {
        add(
                "T2001", new BookInfo("宏智禪師廣錄", new String[]{"宋"}, "宗法"), // 宋 集成等編
                "T2002A", new BookInfo("如淨和尚語錄", new String[]{"宋"}, "文素"), // 宋 文素編
                "T2002B", new BookInfo("天童山景德寺如淨禪師續語錄", new String[]{"宋"}, "義遠"), // 宋 義遠編
                "T2003", new BookInfo("佛果圜悟禪師碧巖錄", new String[]{"宋"}, "重顯", "克勤"), // 宋 重顯頌古．克勤評唱
                "T2004", new BookInfo("萬松老人評唱天童覺和尚頌古從容庵錄", new String[]{"宋"}, "正覺", "行秀"), // 宋 正覺頌古．元 行秀評唱
                "T2005", new BookInfo("無門關", new String[]{"宋"}, "宗紹"), // 宋 宗紹編
                "T2006", new BookInfo("人天眼目", new String[]{"宋"}, "智昭"), // 宋 智昭集
                "T2007", new BookInfo("南宗頓教最上大乘摩訶般若波羅蜜經六祖惠能大師於韶州大梵寺施法壇經", new String[]{"唐"}, "法海"), // 唐 法海集
                "T2008", new BookInfo("六祖大師法寶壇經", new String[]{"元"}, "宗寶"), // 元 宗寶編
                "T2009", new BookInfo("少室六門", null), //
                "T2010", new BookInfo("信心銘", new String[]{"隋"}, "鑑智僧璨"), // 隋 僧璨作
                "T2011", new BookInfo("最上乘論", new String[]{"唐"}, "弘忍"), // 唐 弘忍述
                "T2012A", new BookInfo("黃檗山斷際禪師傳心法要", new String[]{"唐"}, "裴休"), // 唐 裴休集
                "T2012B", new BookInfo("黃檗斷際禪師宛陵錄", new String[]{"唐"}, "裴休"), // 唐 裴休集
                "T2013", new BookInfo("禪宗永嘉集", new String[]{"唐"}, "永嘉玄覺"), // 唐 玄覺撰
                "T2014", new BookInfo("永嘉證道歌", new String[]{"唐"}, "永嘉玄覺"), // 唐 玄覺撰
                "T2015", new BookInfo("禪源諸詮集都序", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "T2016", new BookInfo("宗鏡錄", new String[]{"宋"}, "延壽"), // 宋 延壽集
                "T2017", new BookInfo("萬善同歸集", new String[]{"宋"}, "延壽"), // 宋 延壽述
                "T2018", new BookInfo("永明智覺禪師唯心訣", new String[]{"宋"}, "延壽"), // 宋 延壽撰
                "T2019A", new BookInfo("真心直說", new String[]{"高麗"}, "普照"), // 高麗 知訥撰
                "T2019B", new BookInfo("誡初心學人文", new String[]{"高麗"}, "普照"), // 高麗 知訥撰
                "T2020", new BookInfo("高麗國普照禪師修心訣", new String[]{"高麗"}, "普照"), // 高麗 知訥撰
                "T2021", new BookInfo("禪宗決疑集", new String[]{"元"}, "智徹"), // 元 智徹述
                "T2022", new BookInfo("禪林寶訓", new String[]{"宋"}, "淨善"), // 宋 淨善重集
                "T2023", new BookInfo("緇門警訓", new String[]{"明"}, "如巹"), // 明 如巹續集
                "T2024", new BookInfo("禪關策進", new String[]{"明"}, "袾宏"), // 明 袾宏輯
                "T2025", new BookInfo("勅修百丈清規", new String[]{"元"}, "德輝"), // 元 德煇重編
                "T2026", new BookInfo("撰集三藏及雜藏傳", null, "失譯"), // 失譯
                "T2027", new BookInfo("迦葉結經", new String[]{"東漢"}, "安清"), // 後漢 安世高譯
                "T2028", new BookInfo("迦丁比丘說當來變經", null, "失譯"), // 失譯
                "T2029", new BookInfo("佛使比丘迦旃延說法沒盡偈百二十章", null, "失譯"), // 失譯
                "T2030", new BookInfo("大阿羅漢難提蜜多羅所說法住記", new String[]{"唐"}, "玄奘"), // 唐 玄奘譯
                "T2031", new BookInfo("異部宗輪論", new String[]{"唐"}, "玄奘", "世友"), // 世友菩薩造  唐 玄奘譯
                "T2032", new BookInfo("十八部論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T2033", new BookInfo("部執異論", new String[]{"陳"}, "真諦", "天友"), // 天友菩薩造  陳 真諦譯
                "T2034", new BookInfo("歷代三寶紀", new String[]{"隋"}, "費長房"), // 隋 費長房撰
                "T2035", new BookInfo("佛祖統紀", new String[]{"宋"}, "志磐"), // 宋 志磐撰
                "T2036", new BookInfo("佛祖歷代通載", new String[]{"元"}, "念常"), // 元 念常集
                "T2037", new BookInfo("釋氏稽古略", new String[]{"元"}, "覺岸"), // 元 覺岸編
                "T2038", new BookInfo("釋鑑稽古略續集", new String[]{"明"}, "幻輪"), // 明 幻輪編
                "T2039", new BookInfo("三國遺事", new String[]{"高麗"}, "一然"), // 高麗 一然撰
                "T2040", new BookInfo("釋迦譜", new String[]{"梁"}, "僧祐"), // 梁 僧祐撰
                "T2041", new BookInfo("釋迦氏譜", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2042", new BookInfo("阿育王傳", new String[]{"西晉"}, "安法欽"), // 西晉 安法欽譯
                "T2043", new BookInfo("阿育王經", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯
                "T2044", new BookInfo("天尊說阿育王譬喻經", null, "失譯"), // 失譯
                "T2045", new BookInfo("阿育王息壞目因緣經", new String[]{"符秦"}, "曇摩難提"), // 符秦 曇摩難提譯
                "T2046", new BookInfo("馬鳴菩薩傳", new String[]{"後秦"}, "鳩摩羅什"), // 後秦 鳩摩羅什譯
                "T2047a", new BookInfo("龍樹菩薩傳", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T2047b", new BookInfo("龍樹菩薩傳", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T2048", new BookInfo("提婆菩薩傳", new String[]{"姚秦"}, "鳩摩羅什"), // 姚秦 鳩摩羅什譯
                "T2049", new BookInfo("婆藪槃豆法師傳", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T2050", new BookInfo("隋天台智者大師別傳", new String[]{"隋"}, "灌頂"), // 隋 灌頂撰
                "T2051", new BookInfo("唐護法沙門法琳別傳", new String[]{"唐"}, "彥悰"), // 唐 彥琮撰
                "T2052", new BookInfo("大唐故三藏玄奘法師行狀", new String[]{"唐"}, "冥詳"), // 唐 冥詳撰
                "T2053", new BookInfo("大唐大慈恩寺三藏法師傳", new String[]{"唐"}, "慧立", "彥悰"), // 唐 慧立本、彥悰箋
                "T2054", new BookInfo("唐大薦福寺故寺主翻經大德法藏和尚傳", new String[]{"新羅"}, "崔致遠"), // 新羅 崔致遠撰
                "T2055", new BookInfo("玄宗朝翻經三藏善無畏贈鴻臚卿行狀", new String[]{"唐"}, "李華"), // 唐 李華撰
                "T2056", new BookInfo("大唐故大德贈司空大辨正廣智不空三藏行狀", new String[]{"唐"}, "趙遷"), // 唐 趙遷撰
                "T2057", new BookInfo("大唐青龍寺三朝供奉大德行狀", null), //
                "T2058", new BookInfo("付法藏因緣傳", new String[]{"元魏"}, "吉迦夜", "曇曜"), // 元魏 吉迦夜共曇曜譯
                "T2059", new BookInfo("高僧傳", new String[]{"梁"}, "慧皎"), // 梁 慧皎撰
                "T2060", new BookInfo("續高僧傳", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2061", new BookInfo("宋高僧傳", new String[]{"宋"}, "贊寧"), // 宋 贊寧等撰
                "T2062", new BookInfo("大明高僧傳", new String[]{"明"}, "如惺"), // 明 如惺撰
                "T2063", new BookInfo("比丘尼傳", new String[]{"梁"}, "寶唱"), // 梁 寶唱撰
                "T2064", new BookInfo("神僧傳", null), //
                "T2065", new BookInfo("海東高僧傳", new String[]{"高麗"}, "覺訓"), // 高麗 覺訓撰
                "T2066", new BookInfo("大唐西域求法高僧傳", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T2067", new BookInfo("弘贊法華傳", new String[]{"唐"}, "慧詳"), // 唐 惠詳撰
                "T2068", new BookInfo("法華傳記", new String[]{"唐"}, "僧祥"), // 唐 僧詳撰
                "T2069", new BookInfo("天台九祖傳", new String[]{"宋"}, "士衡"), // 宋 士衡編
                "T2070", new BookInfo("往生西方淨土瑞應傳", null), //
                "T2071", new BookInfo("淨土往生傳", new String[]{"宋"}, "戒珠"), // 宋 戒珠敘
                "T2072", new BookInfo("往生集", new String[]{"明"}, "袾宏"), // 明 袾宏輯
                "T2073", new BookInfo("華嚴經傳記", new String[]{"唐"}, "法藏"), // 唐 法藏集
                "T2074", new BookInfo("大方廣佛華嚴經感應傳", new String[]{"唐"}, "慧英", "胡幽貞"), // 唐 惠英撰．胡幽貞纂
                "T2075", new BookInfo("曆代法寶記", null), //
                "T2076", new BookInfo("景德傳燈錄", new String[]{"宋"}, "道原"), // 宋 道原纂
                "T2077", new BookInfo("續傳燈錄", new String[]{"明"}, "居頂"), // 明 居頂輯
                "T2078", new BookInfo("傳法正宗記", new String[]{"宋"}, "契嵩"), // 宋 契嵩編
                "T2079", new BookInfo("傳法正宗定祖圖", new String[]{"宋"}, "契嵩"), // 宋 契嵩撰
                "T2080", new BookInfo("傳法正宗論", new String[]{"宋"}, "契嵩"), // 宋 契嵩編
                "T2081", new BookInfo("兩部大法相承師資付法記", new String[]{"唐"}, "海雲"), // 唐 海雲記
                "T2082", new BookInfo("冥報記", new String[]{"唐"}, "唐臨"), // 唐 唐臨撰
                "T2083", new BookInfo("釋門自鏡錄", new String[]{"唐"}, "懷信"), // 唐 懷信述
                "T2084", new BookInfo("三寶感應要略錄", new String[]{"宋"}, "非濁"), // 宋 非濁集
                "T2085", new BookInfo("高僧法顯傳", new String[]{"東晉"}, "法顯"), // 東晉 法顯記
                "T2086", new BookInfo("北魏僧惠生使西域記", null), //
                "T2087", new BookInfo("大唐西域記", new String[]{"唐"}, "玄奘", "辯機"), // 唐 玄奘譯、辯機撰
                "T2088", new BookInfo("釋迦方志", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2089", new BookInfo("遊方記抄", new String[]{"新羅"}, "慧超", "圓照"), // 新羅慧超唐圓照等撰
                "T2090", new BookInfo("釋迦牟尼如來像法滅盡之記", new String[]{"唐"}, "法成"), // 唐 法成譯
                "T2091", new BookInfo("燉煌錄", null), //
                "T2092", new BookInfo("洛陽伽藍記", new String[]{"東魏"}, "楊衒之"), // 元魏 楊衒之撰
                "T2093", new BookInfo("寺塔記", new String[]{"唐"}, "段成式"), // 唐 段成式撰
                "T2094", new BookInfo("梁京寺記", null), //
                "T2095", new BookInfo("廬山記", new String[]{"宋"}, "陳舜俞"), // 宋 陳舜俞撰
                "T2096", new BookInfo("天台山記", new String[]{"唐"}, "徐靈府"), // 唐 徐靈府撰
                "T2097", new BookInfo("南嶽總勝集", new String[]{"宋"}, "陳田夫"), // 宋 陳田夫撰
                "T2098", new BookInfo("古清涼傳", new String[]{"唐"}, "慧祥"), // 唐 慧祥撰
                "T2099", new BookInfo("廣清涼傳", new String[]{"宋"}, "延一"), // 宋 延一編
                "T2100", new BookInfo("續清涼傳", new String[]{"宋"}, "張商英"), // 宋 張商英述
                "T2101", new BookInfo("補陀洛迦山傳", new String[]{"元"}, "盛熙明"), // 元 盛熙明述
                "T2102", new BookInfo("弘明集", new String[]{"梁"}, "僧祐"), // 梁 僧祐撰
                "T2103", new BookInfo("廣弘明集", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2104", new BookInfo("集古今佛道論衡", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2105", new BookInfo("續集古今佛道論衡", new String[]{"唐"}, "智昇"), // 唐 智昇撰
                "T2106", new BookInfo("集神州三寶感通錄", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2107", new BookInfo("道宣律師感通錄", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2108", new BookInfo("集沙門不應拜俗等事", new String[]{"唐"}, "彥悰"), // 唐 彥悰纂錄
                "T2109", new BookInfo("破邪論", new String[]{"唐"}, "法琳"), // 唐 法琳撰
                "T2110", new BookInfo("辯正論", new String[]{"唐"}, "法琳"), // 唐 法琳撰
                "T2111", new BookInfo("十門辯惑論", new String[]{"唐"}, "復禮"), // 唐 復禮撰
                "T2112", new BookInfo("甄正論", new String[]{"唐"}, "玄嶷"), // 唐 玄嶷撰
                "T2113", new BookInfo("北山錄", new String[]{"唐"}, "神清", "慧寶"), // 唐 神清撰．慧寶注
                "T2114", new BookInfo("護法論", new String[]{"宋"}, "張商英"), // 宋 張商英述
                "T2115", new BookInfo("鐔津文集", new String[]{"宋"}, "契嵩"), // 宋 契嵩撰
                "T2116", new BookInfo("辯偽錄", new String[]{"元"}, "祥邁"), // 元 祥邁撰
                "T2117", new BookInfo("三教平心論", new String[]{"元"}, "劉謐"), // 元 劉謐撰
                "T2118", new BookInfo("折疑論", null, "師子"), // 師子比丘述註
                "T2119", new BookInfo("寺沙門玄奘上表記", null), //
                "T2120", new BookInfo("代宗朝贈司空大辨正廣智三藏和上表制集", new String[]{"唐"}, "圓照"), // 唐 圓照集
                "T2121", new BookInfo("經律異相", new String[]{"梁"}, "寶唱"), // 梁 寶唱等集
                "T2122", new BookInfo("法苑珠林", new String[]{"唐"}, "道世"), // 唐 道世撰
                "T2123", new BookInfo("諸經要集", new String[]{"唐"}, "道世"), // 唐 道世集
                "T2124", new BookInfo("法門名義集", new String[]{"唐"}, "李師政"), // 唐 李師政撰
                "T2125", new BookInfo("南海寄歸內法傳", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T2126", new BookInfo("大宋僧史略", new String[]{"宋"}, "贊寧"), // 宋 贊寧撰
                "T2127", new BookInfo("釋氏要覽", new String[]{"宋"}, "道誠"), // 宋 道誠集
                "T2128", new BookInfo("一切經音義", new String[]{"唐"}, "慧琳"), // 唐 慧琳撰
                "T2129", new BookInfo("續一切經音義", new String[]{"宋"}, "希麟"), // 宋 希麟集
                "T2130", new BookInfo("翻梵語", null), //
                "T2131", new BookInfo("翻譯名義集", new String[]{"宋"}, "法雲"), // 宋 法雲編
                "T2132", new BookInfo("悉曇字記", new String[]{"唐"}, "智廣"), // 唐 智廣撰
                "T2133A", new BookInfo("梵語千字文", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T2133B", new BookInfo("梵語千字文", new String[]{"唐"}, "義淨"), // 唐 義淨撰
                "T2134", new BookInfo("唐梵文字", new String[]{"唐"}, "全真"), // 唐 全真集
                "T2135", new BookInfo("梵語雜名", new String[]{"唐"}, "禮言"), // 唐 禮言集
                "T2136", new BookInfo("唐梵兩語雙對集", new String[]{"唐"}, "僧怛多櫱多", "波羅瞿那彌捨沙"), // 唐 僧怛多蘖多．波羅瞿那彌捨沙集
                "T2137", new BookInfo("金七十論", new String[]{"陳"}, "真諦"), // 陳 真諦譯
                "T2138", new BookInfo("勝宗十句義論", new String[]{"唐"}, "玄奘", "慧月"), // 慧月造  唐 玄奘譯
                "T2139", new BookInfo("老子化胡經", null), //
                "T2140", new BookInfo("摩尼教下部讚", null), //
                "T2141A", new BookInfo("摩尼光佛教法儀略", new String[]{"唐"}, "拂多誕"), // 唐 拂多誕譯
                "T2141B", new BookInfo("波斯教殘經", null), //
                "T2142", new BookInfo("序聽迷詩所經", null), //
                "T2143", new BookInfo("景教三威蒙度讚", null), //
                "T2144", new BookInfo("大秦景教流行中國碑頌", new String[]{"唐"}, "景淨"), // 唐 景淨述
                "T2145", new BookInfo("出三藏記集", new String[]{"梁"}, "僧祐"), // 梁 僧祐撰
                "T2146", new BookInfo("眾經目錄", new String[]{"隋"}, "法經"), // 隋 法經等撰
                "T2147", new BookInfo("眾經目錄", new String[]{"隋"}, "彥琮"), // 隋 彥琮撰
                "T2148", new BookInfo("眾經目錄", new String[]{"唐"}, "靜泰"), // 唐 靜泰撰
                "T2149", new BookInfo("大唐內典錄", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2150", new BookInfo("續大唐內典錄", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "T2151", new BookInfo("古今譯經圖紀", new String[]{"唐"}, "釋靖邁"), // 唐 靖邁撰
                "T2152", new BookInfo("續古今譯經圖紀", new String[]{"唐"}, "智昇"), // 唐 智昇撰
                "T2153", new BookInfo("大周刊定眾經目錄", new String[]{"唐"}, "明佺"), // 唐 明佺等撰
                "T2154", new BookInfo("開元釋教錄", new String[]{"唐"}, "智昇"), // 唐 智昇撰
                "T2155", new BookInfo("開元釋教錄略出", new String[]{"唐"}, "智昇"), // 唐 智昇撰
                "T2156", new BookInfo("大唐貞元續開元釋教錄", new String[]{"唐"}, "圓照"), // 唐 圓照集
                "T2157", new BookInfo("貞元新定釋教目錄", new String[]{"唐"}, "圓照"), // 唐 圓照撰
                "T2158", new BookInfo("續貞元釋教錄", new String[]{"南唐"}, "恆安"), // 南唐 恒安集
                "T2159", new BookInfo("傳教大師將來台州錄", new String[]{"日本"}, "最澄"), // 日本 最澄撰
                "T2160", new BookInfo("傳教大師將來越州錄", new String[]{"日本"}, "最澄"), // 日本 最澄撰
                "T2161", new BookInfo("御請來目錄", new String[]{"日本"}, "空海"), // 日本 空海撰
                "T2162", new BookInfo("根本大和尚真跡策子等目錄", null), //
                "T2163", new BookInfo("常曉和尚請來目錄", new String[]{"日本"}, "常曉"), // 日本 常曉撰
                "T2164", new BookInfo("靈巖寺和尚請來法門道具等目錄", new String[]{"日本"}, "圓行"), // 日本 圓行撰
                "T2165", new BookInfo("日本國承和五年入唐求法目錄", new String[]{"日本"}, "圓仁"), // 日本 圓仁撰
                "T2166", new BookInfo("慈覺大師在唐送進錄", new String[]{"日本"}, "圓仁"), // 日本 圓仁撰
                "T2167", new BookInfo("入唐新求聖教目錄", new String[]{"日本"}, "圓仁"), // 日本 圓仁撰
                "T2168A", new BookInfo("惠運禪師將來教法目錄", new String[]{"日本"}, "慧運"), // 日本 惠運撰
                "T2168B", new BookInfo("惠運律師書目錄", new String[]{"日本"}, "慧運"), // 日本 惠運撰
                "T2169", new BookInfo("開元寺求得經疏記等目錄", new String[]{"日本"}, "圓珍"), // 日本 圓珍撰
                "T2170", new BookInfo("福州溫州台州求得經律論疏記外書等目錄", new String[]{"日本"}, "圓珍"), // 日本 圓珍撰
                "T2171", new BookInfo("青龍寺求法目錄", new String[]{"日本"}, "圓珍"), // 日本 圓珍撰
                "T2172", new BookInfo("日本比丘圓珍入唐求法目錄", new String[]{"日本"}, "圓珍"), // 日本 圓珍撰
                "T2173", new BookInfo("智證大師請來目錄", new String[]{"日本"}, "圓珍"), // 日本 圓珍撰
                "T2174A", new BookInfo("新書寫請來法門等目錄", new String[]{"日本"}, "宗叡"), // 日本 宗叡撰
                "T2174B", new BookInfo("禪林寺宗叡僧正目錄", null), //
                "T2175", new BookInfo("錄外經等目錄", null), //
                "T2176", new BookInfo("諸阿闍梨真言密教部類總錄", new String[]{"日本"}, "安然"), // 日本 安然集
                "T2177", new BookInfo("華嚴宗章疏并因明錄", new String[]{"日本"}, "圓超"), // 日本 圓超錄
                "T2178", new BookInfo("天台宗章疏", new String[]{"日本"}, "玄日"), // 日本 玄日錄
                "T2179", new BookInfo("三論宗章疏", new String[]{"日本"}, "安遠"), // 日本 安遠錄
                "T2180", new BookInfo("法相宗章疏", new String[]{"日本"}, "平祚"), // 日本 平祚錄
                "T2181", new BookInfo("注進法相宗章疏", new String[]{"日本"}, "藏俊"), // 日本 藏俊撰
                "T2182", new BookInfo("律宗章疏", new String[]{"日本"}, "榮穩"), // 日本 榮穩錄
                "T2183", new BookInfo("東域傳燈目錄", new String[]{"日本"}, "永超"), // 日本 永超集
                "T2184", new BookInfo("新編諸宗教藏總錄", new String[]{"高麗"}, "義天"), // 高麗 義天錄
                "T2732", new BookInfo("梁朝傅大士頌金剛經", null), //
                "T2733", new BookInfo("御注金剛般若波羅蜜經宣演", new String[]{"唐"}, "道氤"), // 唐 道氤撰
                "T2734", new BookInfo("金剛暎卷上", new String[]{"唐"}, "寶達"), // 唐 寶達集
                "T2735", new BookInfo("金剛般若經旨贊", new String[]{"唐"}, "曇曠"), // 唐 曇曠撰
                "T2736", new BookInfo("金剛般若經依天親菩薩論贊略釋秦本義記卷上", new String[]{"唐"}, "知恩"), // 唐 知恩撰
                "T2737", new BookInfo("金剛經疏", null), //
                "T2738", new BookInfo("金剛經疏", null), //
                "T2739", new BookInfo("金剛般若經挾註", null), //
                "T2740", new BookInfo("金剛般若義記", null), //
                "T2741", new BookInfo("金剛般若經疏", null), //
                "T2742", new BookInfo("金剛般若波羅蜜經傳外傳卷下", null), //
                "T2743", new BookInfo("持誦金剛經靈驗功德記", null), //
                "T2744", new BookInfo("仁王般若實相論卷第二", null), //
                "T2745", new BookInfo("仁王經疏", null), //
                "T2746", new BookInfo("般若波羅蜜多心經還源述", null), //
                "T2747", new BookInfo("挾註波羅蜜多心經", null), //
                "T2748", new BookInfo("法華義記卷第三", null), //
                "T2749", new BookInfo("法華經疏", null), //
                "T2750", new BookInfo("法華經疏", null), //
                "T2751", new BookInfo("法華經疏", null), //
                "T2752", new BookInfo("法華問答", null), //
                "T2753", new BookInfo("華嚴經章", null), //
                "T2754", new BookInfo("華嚴略疏卷第三", null), //
                "T2755", new BookInfo("華嚴經疏", null), //
                "T2756", new BookInfo("華嚴經義記卷第一", new String[]{"後魏"}, "慧光"), // 後魏 慧光撰
                "T2757", new BookInfo("華嚴經疏卷第三", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "T2758", new BookInfo("十地義記卷第一", null), //
                "T2759", new BookInfo("無量壽經義記卷下", null), //
                "T2760", new BookInfo("無量壽觀經義記", null), //
                "T2761", new BookInfo("勝鬘經記", null), //
                "T2762", new BookInfo("勝鬘經疏", null, "昭法師"), // 昭法師撰
                "T2763", new BookInfo("挾注勝鬘經", null), //
                "T2764A", new BookInfo("涅槃經義記", null), //
                "T2764B", new BookInfo("大涅槃經義記卷第四", null), //
                "T2765", new BookInfo("涅槃經疏", null), //
                "T2766", new BookInfo("藥師經疏", null), //
                "T2767", new BookInfo("藥師經疏", null), //
                "T2768", new BookInfo("維摩義記", null), //
                "T2769", new BookInfo("維摩經義記卷第四", null), //
                "T2770", new BookInfo("維摩經疏", null), //
                "T2771", new BookInfo("維摩經疏", null), //
                "T2772", new BookInfo("維摩經疏卷第三．第六", null), //
                "T2773", new BookInfo("維摩經抄", null), //
                "T2774", new BookInfo("維摩經疏", null), //
                "T2775", new BookInfo("維摩疏釋前小序抄", null), //
                "T2776", new BookInfo("釋肇序", new String[]{"唐"}, "體請"), // 唐 體請記
                "T2777", new BookInfo("淨名經集解關中疏", new String[]{"唐"}, "道液"), // 唐 道掖撰
                "T2778", new BookInfo("淨名經關中釋抄", new String[]{"唐"}, "道液"), // 唐 道掖撰
                "T2779", new BookInfo("佛說楞伽經禪門悉談章", null), //
                "T2780", new BookInfo("溫室經疏", new String[]{"唐"}, "慧淨"), // 唐 慧淨撰
                "T2781", new BookInfo("盂蘭盆經讚述", new String[]{"唐"}, "慧淨"), // 唐 慧淨撰
                "T2782", new BookInfo("大乘稻芉經隨聽疏", new String[]{"唐"}, "法成"), // 唐 法成撰
                "T2783", new BookInfo("大乘稻芉經隨聽疏決", null), //
                "T2784", new BookInfo("大乘四法經釋抄", null), //
                "T2785", new BookInfo("大乘四法經論廣釋開決記", null), //
                "T2786", new BookInfo("天請問經疏", null), //
                "T2787", new BookInfo("四分戒本疏卷第一．第二．第三", null), //
                "T2788", new BookInfo("律戒本疏", null), //
                "T2789", new BookInfo("律戒本疏", null), //
                "T2790", new BookInfo("律雜抄", null), //
                "T2791", new BookInfo("宗四分比丘隨門要略行儀", null), //
                "T2792", new BookInfo("毘尼心", null), //
                "T2793", new BookInfo("三部律抄", null), //
                "T2794", new BookInfo("律抄", null), //
                "T2795", new BookInfo("四部律并論要用抄", null), //
                "T2796", new BookInfo("律抄第三卷手決", null), //
                "T2797", new BookInfo("梵網經述記卷第一", null), //
                "T2798", new BookInfo("本業瓔珞經疏", null), //
                "T2799", new BookInfo("十地論義疏卷第一．第三", new String[]{"北周"}, "法上"), // 北周 法上撰
                "T2800", new BookInfo("廣百論疏卷第一", new String[]{"唐"}, "文軌"), // 唐 文軌撰
                "T2801", new BookInfo("瑜伽師地論分門記", new String[]{"唐"}, "法成", "智慧山"), // 唐 法成撰．智慧山記
                "T2802", new BookInfo("瑜伽論手記", new String[]{"唐"}, "法成", "福慧"), // 唐 法成述．福慧記
                "T2803", new BookInfo("地持義記卷第四", null), //
                "T2804", new BookInfo("唯識三十論要釋", null), //
                "T2805", new BookInfo("攝大乘講疏卷第五．第七", null), //
                "T2806", new BookInfo("攝大乘論抄", null), //
                "T2807", new BookInfo("攝大乘論章卷第一", null), //
                "T2808", new BookInfo("攝論章卷第一", null), //
                "T2809", new BookInfo("攝大乘義章卷第四", null), //
                "T2810", new BookInfo("大乘百法明門論開宗義記", new String[]{"唐"}, "曇曠"), // 唐 曇曠撰
                "T2811", new BookInfo("大乘百法明門論開宗義記序釋", null), //
                "T2812", new BookInfo("大乘百法明門論開宗義決", new String[]{"唐"}, "曇曠"), // 唐 曇曠撰
                "T2813", new BookInfo("大乘起信論略述", new String[]{"唐"}, "曇曠"), // 唐 曇曠撰
                "T2814", new BookInfo("大乘起信論廣釋卷第三．四．五", new String[]{"唐"}, "曇曠"), // 唐 曇曠撰
                "T2815", new BookInfo("起信論註", null), //
                "T2816", new BookInfo("因緣心釋論開決記", null), //
                "T2817", new BookInfo("大乘經纂要義", null), //
                "T2818", new BookInfo("大乘二十二問本", null), //
                "T2819", new BookInfo("諸經要抄", null), //
                "T2820", new BookInfo("菩薩藏修道眾經抄卷第十二", null), //
                "T2821", new BookInfo("諸經要略文", null), //
                "T2822", new BookInfo("大乘要語", null), //
                "T2823", new BookInfo("大乘入道次第開決", new String[]{"唐"}, "曇曠"), // 唐 曇曠撰
                "T2824", new BookInfo("天台分門圖", null), //
                "T2825", new BookInfo("真言要決卷第一．第三", null), //
                "T2826", new BookInfo("略諸經論念佛法門往生淨土集卷上", new String[]{"唐"}, "慧日"), // 唐 慧日撰
                "T2827", new BookInfo("淨土五會念佛誦經觀行儀卷中．下", new String[]{"唐"}, "法照"), // 唐 法照撰
                "T2828", new BookInfo("大乘淨土讚", null), //
                "T2829", new BookInfo("持齋念佛懺悔禮文", null), //
                "T2830A", new BookInfo("道安法師念佛讚", null), //
                "T2830B", new BookInfo("道安法師念佛讚文", null), //
                "T2831", new BookInfo("無心論", null), //
                "T2832", new BookInfo("南天竺國菩提達摩禪師觀門", null), //
                "T2833", new BookInfo("觀心論", null), //
                "T2834", new BookInfo("大乘無生方便門", null), //
                "T2835", new BookInfo("大乘開心顯性頓悟真宗論", new String[]{"唐"}, "慧光"), // 唐 慧光釋
                "T2836", new BookInfo("大乘北宗論", new String[]{"唐"}, "慧光"), // 唐 慧光釋
                "T2837", new BookInfo("楞伽師資記", new String[]{"唐"}, "淨覺"), // 唐 淨覺集
                "T2838", new BookInfo("傳法寶紀", new String[]{"唐"}, "杜朏"), // 唐 杜朏撰
                "T2839", new BookInfo("讚禪門詩", null), //
                "T2840", new BookInfo("三界圖", null), //
                "T2841", new BookInfo("大佛略懺", null), //
                "T2842", new BookInfo("印沙佛文", null), //
                "T2843", new BookInfo("大悲啟請", null), //
                "T2844", new BookInfo("文殊師利菩薩無相十禮", null), //
                "T2845", new BookInfo("押座文類", null), //
                "T2846", new BookInfo("祈願文", null), //
                "T2847", new BookInfo("祈願文", null), //
                "T2848", new BookInfo("迴向文", null), //
                "T2849", new BookInfo("大乘四齋日", null), //
                "T2850", new BookInfo("地藏菩薩十齋日", null), //
                "T2851", new BookInfo("和菩薩戒文", null), //
                "T2852", new BookInfo("入布薩堂說偈文等", null), //
                "T2853", new BookInfo("布薩文等", null), //
                "T2854", new BookInfo("禮懺文", null), //
                "T2855", new BookInfo("禮懺文", null), //
                "T2856", new BookInfo("禮懺文", null), //
                "T2857", new BookInfo("索法號義辯諷誦文", null), //
                "T2858", new BookInfo("大目乾連冥間救母變文并圖", null), //
                "T2859", new BookInfo("惠遠外傳", null), //
                "T2860", new BookInfo("府君存惠傳", null), //
                "T2861", new BookInfo("泉州千佛新著諸祖師頌", null), //
                "T2862", new BookInfo("大蕃沙洲釋門教法和尚洪辯修功德記", null), //
                "T2863", new BookInfo("王梵志詩集", null), //
                "T2864", new BookInfo("進旨", null), //
                "T2865", new BookInfo("護身命經", null, "道真"), // 界　比丘道真
                "T2866", new BookInfo("護身命經", null), //
                "T2867", new BookInfo("慈仁問八十種好經", null), //
                "T2868", new BookInfo("決罪福經", null), //
                "T2869", new BookInfo("妙好寶車經", null), //
                "T2870", new BookInfo("像法決疑經", null), //
                "T2871", new BookInfo("大通方廣懺悔滅罪莊嚴成佛經", null), //
                "T2872", new BookInfo("妙法蓮華經度量天地品第二十九", null), //
                "T2873", new BookInfo("首羅比丘經", null), //
                "T2874", new BookInfo("小法滅盡經", null), //
                "T2875", new BookInfo("大方廣華嚴十惡品經", null), //
                "T2876", new BookInfo("天公經", null), //
                "T2877", new BookInfo("如來在金棺囑累清淨莊嚴敬福經", null), //
                "T2878", new BookInfo("救疾經", null), //
                "T2879", new BookInfo("普賢菩薩說證明經", null), //
                "T2880", new BookInfo("究竟大悲經卷第二．三．四", null), //
                "T2881", new BookInfo("善惡因果經", null), //
                "T2882", new BookInfo("呪魅經", null), //
                "T2883", new BookInfo("法王經", null), //
                "T2884", new BookInfo("大威儀請問", null), //
                "T2885", new BookInfo("佛性海藏智慧解脫破心相經", null), //
                "T2886", new BookInfo("佛為心王菩薩說投陀經卷上", null, "惠辨"), // 五陰山室寺惠辨禪師註
                "T2887", new BookInfo("父母恩重經", null), //
                "T2888", new BookInfo("延壽命經", null), //
                "T2889", new BookInfo("續命經", null), //
                "T2890", new BookInfo("如來成道經", null), //
                "T2891", new BookInfo("山海慧菩薩經", null), //
                "T2892", new BookInfo("現報當受經", null), //
                "T2893", new BookInfo("大辯邪正經", null), //
                "T2894", new BookInfo("三廚經", null, "菩提達磨", "闍那崛多"), // 西國婆羅門達多羅及闍那崛多等奉詔譯
                "T2895", new BookInfo("要行捨身經", null), //
                "T2896", new BookInfo("示所犯者瑜伽法鏡經", null), //
                "T2897", new BookInfo("天地八陽神呪經", new String[]{"唐"}, "義淨"), // 唐 三藏法師義淨奉詔譯
                "T2898", new BookInfo("高王觀世音經", null), //
                "T2899", new BookInfo("妙法蓮華經馬明菩薩品第三十", null), //
                "T2900", new BookInfo("齋法清淨經", null), //
                "T2901", new BookInfo("法句經", null), //
                "T2902", new BookInfo("法句經疏", null), //
                "T2903", new BookInfo("無量大慈教經", null), //
                "T2904", new BookInfo("七千佛神符經", null), //
                "T2905", new BookInfo("現在十方千五百佛名並雜佛同號", null), //
                "T2906", new BookInfo("三萬佛同根本神祕之印並法龍種上尊王佛法", null), //
                "T2907", new BookInfo("普賢菩薩行願王經", null), //
                "T2908", new BookInfo("大方廣佛華嚴經普賢菩薩行願王品", null), //
                "T2909", new BookInfo("地藏菩薩經", null), //
                "T2910", new BookInfo("金有陀羅尼經", null), //
                "T2911", new BookInfo("讚僧功德經", null), //
                "T2912", new BookInfo("無常三啟經", null), //
                "T2913", new BookInfo("七女觀經", null), //
                "T2914", new BookInfo("觀經", null), //
                "T2915", new BookInfo("救諸眾生一切苦難經", null), //
                "T2916", new BookInfo("勸善經", null), //
                "T2917A", new BookInfo("新菩薩經", null), //
                "T2917B", new BookInfo("新菩薩經", null), //
                "T2918", new BookInfo("釋家觀化還愚經", null), //
                "T2919", new BookInfo("佛母經", null), //
                "T2920", new BookInfo("僧伽和尚欲入涅槃說六度經", null), //
                "TX0001", new BookInfo("第一編　佛法總學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0002", new BookInfo("第二編　五乘共學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0003", new BookInfo("第三編　三乘共學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0004", new BookInfo("第四編　大乘通學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0005", new BookInfo("第五編　法性空慧學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0006", new BookInfo("第六編　法相唯識學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0007", new BookInfo("第七編　法界圓覺學", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0008", new BookInfo("第八編　律釋", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0009", new BookInfo("第九編　制議", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0010", new BookInfo("第十編　學行", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0011", new BookInfo("第十一編　宗依論", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0012", new BookInfo("第十二編　宗體論", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0013", new BookInfo("第十三編　宗用論", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0014", new BookInfo("第十四編　支論", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0015", new BookInfo("第十五編　時論", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0016", new BookInfo("第十六編　書評", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0017", new BookInfo("第十七編　酬對", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0018", new BookInfo("第十八編　講演", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0019", new BookInfo("第十九編　文叢", new String[]{"民國"}, "釋太虛"), // 民國 釋太虛著
                "TX0020", new BookInfo("第二十編　詩存", new String[]{"民國"}, "釋太虛")  // 民國 釋太虛著
        );
    }

    private static void addU() {
        add(
                "U1368", new BookInfo("大乘百法明門論疏", new String[]{"唐"}, "義忠"), // 唐 義忠述
                "U1418", new BookInfo("華嚴經疏科", new String[]{"唐", "宋"}, "澄觀", "淨源") // 唐 澄觀述　宋 淨源重刊
        );
    }

    private static void addX() {
        add(
                "X0001", new BookInfo("圓覺經佚文", null), //
                "X0005", new BookInfo("無量壽經會譯", new String[]{"清"}, "魏源"), // 清 魏源會譯
                "X0006", new BookInfo("阿彌陀經異本", null), //
                "X0008", new BookInfo("楞伽阿跋多羅寶經會譯", new String[]{"明"}, "員珂"), // 明 員珂會譯
                "X0010", new BookInfo("大明仁孝皇后夢感佛說第一希有大功德經", null), //
                "X0011", new BookInfo("佛說無量壽佛名號利益大事因緣經", new String[]{"曹魏"}, "康僧鎧"), // 曹魏 康僧鎧譯
                "X0012", new BookInfo("觀世音菩薩往生淨土本緣經", new String[]{"西晉"}, "失譯"), // 失譯 附西晉錄
                "X0013", new BookInfo("念佛超脫輪迴捷徑經", null), //
                "X0014", new BookInfo("十往生阿彌陀佛國經", new String[]{"周"}, "失譯"), // 失譯 出周錄
                "X0015", new BookInfo("淨度三昧經", null), //
                "X0017", new BookInfo("佛說長壽滅罪護諸童子陀羅尼經", new String[]{"唐"}, "佛陀波利"), // 唐 佛陀波利譯
                "X0019", new BookInfo("佛說斷溫經", null), //
                "X0020", new BookInfo("佛說地藏菩薩發心因緣十王經", new String[]{"唐"}, "藏川"), // 唐 藏川述
                "X0021", new BookInfo("佛說預修十王生七經", new String[]{"唐"}, "藏川"), // 唐 藏川述
                "X0023", new BookInfo("大藏正教血盆經", null), //
                "X0024", new BookInfo("壽生經", null), //
                "X0025", new BookInfo("化珠保命真經", null), //
                "X0026", new BookInfo("大梵天王問佛決疑經", null), //
                "X0027", new BookInfo("大梵天王問佛決疑經", null), //
                "X0028", new BookInfo("造像量度經", new String[]{"清"}, "工布查布"), // 清 工布查布譯
                "X0034", new BookInfo("觀世音菩薩救苦經", null), //
                "X0057", new BookInfo("十二禮", null, "龍樹菩薩", "禪那崛多別"), // 龍樹菩薩造　禪那崛多別譯
                "X0181", new BookInfo("大聖妙吉祥菩薩最勝威德祕密八字陀羅尼修行念誦儀軌次第法", null, "義雲法金剛", "菩提仙"), // 義雲法金剛．菩提仙同譯
                "X0182", new BookInfo("正了知王藥叉眷屬法", new String[]{"唐"}, "義淨"), // 唐 義淨譯
                "X0183", new BookInfo("二十八夜叉大軍王名號", new String[]{"梁"}, "僧伽婆羅"), // 梁 僧伽婆羅譯抄之
                "X0184", new BookInfo("二十八藥叉大將名號", new String[]{"唐"}, "不空"), // 唐 不空譯抄之
                "X0185", new BookInfo("權現金色迦那婆底九目天法", new String[]{"唐"}, "菩提留支"), // 唐 菩提留支譯
                "X0188", new BookInfo("祕密要術法", new String[]{"唐"}, "阿謨伽"), // 唐 阿謨伽譯
                "X0190", new BookInfo("阿迦陀密一印千類千轉三使者成就經法", new String[]{"唐"}, "不空"), // 唐 不空譯
                "X0191", new BookInfo("七俱胝准提陀羅尼念誦儀軌", new String[]{"唐"}, "不空"), // 唐 不空譯
                "X0192", new BookInfo("佛說如意虗空藏菩薩陀羅尼經", new String[]{"唐"}, "菩提留支"), // 唐 菩提留支譯
                "X0193", new BookInfo("佛說却溫黃神咒經", null), //
                "X0201", new BookInfo("五大牛玉雨寶陀羅尼儀軌", null, "縛日羅枳惹曩"), // 縛日羅枳惹曩譯
                "X0202", new BookInfo("佛說大如意寶珠輪牛王守護神咒經", null, "阿謨伽三藏"), // 阿謨伽三藏譯
                "X0203", new BookInfo("作世水宅心陀羅尼", null), //
                "X0204", new BookInfo("妙法蓮華三昧祕密三摩耶經", new String[]{"唐"}, "不空"), // 唐 不空譯
                "X0205", new BookInfo("佛說阿彌陀佛根本祕密神咒經", new String[]{"曹魏"}, "菩提流支"), // 曹魏 菩提流支譯
                "X0206", new BookInfo("馬鳴菩薩成就悉地念誦", new String[]{"唐"}, "不空"), // 唐 不空譯
                "X0207", new BookInfo("十六大羅漢因果識見頌", new String[]{"唐"}, "闍那多迦"), // 唐 闍那多迦譯
                "X0208", new BookInfo("華嚴經論〔卷十〕", new String[]{"後魏"}, "靈辨"), // 後魏 靈辨造
                "X0211", new BookInfo("華嚴經文義記〔卷六〕", new String[]{"唐"}, "靈裕"), // 唐 靈裕集記
                "X0218", new BookInfo("華嚴經入法界品十八問答", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "X0220", new BookInfo("華嚴經綸貫", new String[]{"宋"}, "復菴"), // 宋 復菴述
                "X0221", new BookInfo("續華嚴經略疏刊定記", new String[]{"唐"}, "慧苑"), // 唐 慧苑述
                "X0223", new BookInfo("華嚴經合論", new String[]{"唐"}, "李通玄", "志寧"), // 唐 李通玄造論　志寧釐經合論
                "X0225", new BookInfo("華嚴經合論簡要", new String[]{"明"}, "李贄"), // 明 李贄簡要
                "X0226", new BookInfo("華嚴經合論纂要", new String[]{"明"}, "方澤"), // 明 方澤纂
                "X0227", new BookInfo("華嚴經行願品疏", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "X0228", new BookInfo("華嚴經行願品疏科", new String[]{"唐"}, "宗密"), // 唐 宗密撰集
                "X0229", new BookInfo("華嚴經行願品疏鈔", new String[]{"唐"}, "澄觀", "宗密"), // 唐 澄觀別行疏　宗密隨疏鈔
                "X0230", new BookInfo("華嚴經普賢行願品疏科", new String[]{"宋"}, "遵式"), // 宋 遵式治定
                "X0231", new BookInfo("華嚴經疏科文", new String[]{"唐"}, "澄觀"), // 唐 澄觀排定
                "X0232", new BookInfo("華嚴經疏鈔玄談", new String[]{"唐"}, "澄觀"), // 唐 澄觀撰述
                "X0234", new BookInfo("華嚴經疏注", new String[]{"唐", "宋"}, "澄觀", "淨源"), // 唐 澄觀述　宋 淨源錄疏注經
                "X0235", new BookInfo("華嚴經談玄抉擇", new String[]{"遼"}, "鮮演"), // 遼 鮮演述
                "X0236", new BookInfo("華嚴懸談會玄記", new String[]{"元"}, "普瑞"), // 元 普瑞集
                "X0237", new BookInfo("華嚴經文義要決問答", new String[]{"新羅"}, "表員"), // 新羅 表員集
                "X0238", new BookInfo("華嚴經要解", new String[]{"宋"}, "戒環"), // 宋 戒環集
                "X0239", new BookInfo("華嚴經吞海集", new String[]{"宋"}, "道通"), // 宋 道通述
                "X0240", new BookInfo("華嚴綱要", new String[]{"唐", "明"}, "澄觀", "德清"), // 唐 澄觀疏義　明 德清提挈
                "X0241", new BookInfo("華嚴經綱目貫攝", new String[]{"清"}, "永光"), // 清 永光錄集
                "X0242", new BookInfo("華嚴經三十九品大意", new String[]{"清"}, "永光"), // 清 永光敬錄
                "X0243", new BookInfo("圓覺經大疏", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "X0244", new BookInfo("圓覺經大疏鈔科", new String[]{"唐"}, "宗密"), // 唐 宗密製
                "X0245", new BookInfo("圓覺經大疏釋義鈔", new String[]{"唐"}, "宗密"), // 唐 宗密撰
                "X0246", new BookInfo("圓覺經略疏科", new String[]{"唐"}, "宗密"), // 唐 宗密製
                "X0248", new BookInfo("圓覺經略疏鈔", new String[]{"唐"}, "宗密"), // 唐 宗密(於大疏略出)
                "X0249", new BookInfo("圓覺經鈔辨疑誤", new String[]{"宋"}, "觀復"), // 宋 觀復撰
                "X0250", new BookInfo("圓覺經疏鈔隨文要解", new String[]{"元"}, "清遠"), // 元 清遠述
                "X0251", new BookInfo("御註圓覺經", new String[]{"宋"}, "宋孝宗"), // 宋 孝宗帝註
                "X0252", new BookInfo("圓覺經類解", new String[]{"宋"}, "行霆"), // 宋 行霆解
                "X0253", new BookInfo("圓覺經夾頌集解講義", new String[]{"宋"}, "周琪"), // 宋 周琪述
                "X0254", new BookInfo("圓覺經心鏡", new String[]{"宋"}, "智聰"), // 宋 智聰述
                "X0255", new BookInfo("圓覺經序注", new String[]{"宋"}, "如山"), // 宋 如山註序
                "X0256", new BookInfo("圓覺經略疏序注", new String[]{"宋"}, "如山"), // 宋 如山注
                "X0257", new BookInfo("圓覺經集註", new String[]{"宋"}, "元粹"), // 宋 元粹述
                "X0258", new BookInfo("圓覺經直解", new String[]{"明"}, "德清"), // 明 德清解
                "X0259", new BookInfo("圓覺經近釋", new String[]{"明"}, "通潤"), // 明 通潤述
                "X0260", new BookInfo("圓覺經要解", new String[]{"明"}, "寂正"), // 明 寂正要解
                "X0261", new BookInfo("圓覺經精解評林", new String[]{"明"}, "焦竑"), // 明 焦竑纂
                "X0262", new BookInfo("圓覺經句釋正白", new String[]{"清"}, "弘麗"), // 清 弘麗著
                "X0263", new BookInfo("圓覺經析義疏", new String[]{"清"}, "通理"), // 清 通理述
                "X0264", new BookInfo("大寶積經述", new String[]{"唐"}, "徐鍔"), // 唐 徐鍔撰
                "X0265", new BookInfo("楞嚴經義疏注經科", new String[]{"宋"}, "子璿"), // 宋 子璿述
                "X0267", new BookInfo("楞嚴經義疏釋要鈔", new String[]{"宋"}, "懷遠"), // 宋 懷遠錄
                "X0268", new BookInfo("楞嚴經集註", new String[]{"宋"}, "思坦"), // 宋 思坦集註
                "X0269", new BookInfo("楞嚴經熏聞記", new String[]{"宋"}, "仁岳"), // 宋 仁岳述
                "X0270", new BookInfo("楞嚴經要解", new String[]{"宋"}, "戒環"), // 宋 戒環解
                "X0271", new BookInfo("楞嚴經箋", new String[]{"宋"}, "惟慤", "可度"), // 宋 惟慤科　可度箋
                "X0272", new BookInfo("楞嚴經合論", new String[]{"宋"}, "德洪", "正受"), // 宋 德洪造論　正受會合
                "X0273", new BookInfo("楞嚴經正脉疏科", new String[]{"明"}, "真鑑"), // 明 真鑑作
                "X0274", new BookInfo("楞嚴經正脉疏懸示", new String[]{"明"}, "真鑑"), // 明 真鑑述
                "X0275", new BookInfo("楞嚴經正脉疏", new String[]{"明"}, "真鑑"), // 明 真鑑述
                "X0276", new BookInfo("楞嚴經摸象記", new String[]{"明"}, "袾宏"), // 明 袾宏述
                "X0277", new BookInfo("楞嚴經懸鏡", new String[]{"明"}, "德清"), // 明 德清述
                "X0278", new BookInfo("楞嚴經通議略科", new String[]{"明"}, "德清"), // 明 德清排訂
                "X0279", new BookInfo("楞嚴經通議", new String[]{"明"}, "德清"), // 明 德清述
                "X0280", new BookInfo("楞嚴經臆說", new String[]{"明"}, "圓澄"), // 明 圓澄註
                "X0281", new BookInfo("楞嚴經圓通疏", new String[]{"元", "明"}, "惟則", "傳燈"), // 元 惟則會解　明 傳燈疏
                "X0282", new BookInfo("楞嚴經玄義", new String[]{"明"}, "傳燈"), // 明 傳燈述
                "X0283", new BookInfo("楞嚴經秘錄", new String[]{"明"}, "一松", "靈述"), // 明 一松說　靈述記
                "X0284", new BookInfo("楞嚴經玄義", new String[]{"明"}, "智旭", "道昉"), // 明 智旭撰述　道昉參訂
                "X0285", new BookInfo("楞嚴經文句", new String[]{"明"}, "智旭", "道昉"), // 明 智旭撰述　道昉參訂
                "X0286", new BookInfo("楞嚴經如說", new String[]{"明"}, "鍾惺"), // 明 鍾惺撰
                "X0287", new BookInfo("楞嚴經疏解蒙鈔", new String[]{"明"}, "錢謙益"), // 明 錢謙益鈔
                "X0288", new BookInfo("楞嚴經證疏廣解", new String[]{"明"}, "凌弘憲"), // 明 凌弘憲點釋
                "X0289", new BookInfo("楞嚴經合轍", new String[]{"明"}, "通潤"), // 明 通潤述
                "X0290", new BookInfo("楞嚴經直指科文", null), //
                "X0291", new BookInfo("楞嚴經直指", new String[]{"明"}, "圅昰"), // 明 圅昰疏
                "X0292", new BookInfo("楞嚴經擊節", new String[]{"明"}, "大韶"), // 明 大韶撰
                "X0293", new BookInfo("楞嚴經懸談", new String[]{"明"}, "觀衡"), // 明 觀衡撰
                "X0294", new BookInfo("楞嚴經說約", new String[]{"明"}, "陸西星"), // 明 陸西星述
                "X0295", new BookInfo("楞嚴經述旨", new String[]{"明"}, "陸西星"), // 明 陸西星述
                "X0296", new BookInfo("楞嚴經截流", new String[]{"明"}, "傳如"), // 明 傳如述
                "X0297", new BookInfo("楞嚴經圓通疏前茅", new String[]{"明"}, "傳燈"), // 明 傳燈述
                "X0298", new BookInfo("楞嚴經直解", new String[]{"明"}, "廣莫"), // 明 廣莫直解
                "X0299", new BookInfo("楞嚴經講錄", new String[]{"明"}, "乘旹"), // 明 乘旹講錄
                "X0300", new BookInfo("楞嚴經纂註", new String[]{"明"}, "真界"), // 明 真界纂註
                "X0301", new BookInfo("楞嚴經精解評林", new String[]{"明"}, "焦竑"), // 明 焦竑纂
                "X0302", new BookInfo("楞嚴經略疏", new String[]{"明"}, "元賢"), // 明 元賢述
                "X0303", new BookInfo("楞嚴經貫攝", new String[]{"清"}, "劉道開"), // 清 劉道開纂述
                "X0304", new BookInfo("楞嚴經觀心定解科", new String[]{"清"}, "靈耀"), // 清 靈耀述
                "X0305", new BookInfo("楞嚴經觀心定解大綱", new String[]{"清"}, "靈耀"), // 清 靈耀述
                "X0306", new BookInfo("楞嚴經觀心定解", new String[]{"清"}, "靈耀"), // 清 靈耀述
                "X0307", new BookInfo("楞嚴經指掌疏懸示", new String[]{"清"}, "通理"), // 清 通理述
                "X0308", new BookInfo("楞嚴經指掌疏", new String[]{"清"}, "通理"), // 清 通理述
                "X0309", new BookInfo("楞嚴經指掌疏事義", new String[]{"清"}, "通理"), // 清 通理述
                "X0310", new BookInfo("楞嚴經勢至圓通章科解", new String[]{"明"}, "正相"), // 明 正相解
                "X0311", new BookInfo("楞嚴經勢至圓通章疏鈔", new String[]{"清"}, "續法"), // 清 續法集
                "X0312", new BookInfo("楞嚴經勢至圓通章解", new String[]{"清"}, "行策"), // 清 行策撰
                "X0313", new BookInfo("楞嚴經序指味疏", new String[]{"清"}, "諦閑"), // 清 諦閑述
                "X0314", new BookInfo("楞嚴經寶鏡疏科文", new String[]{"清"}, "溥畹"), // 清 溥畹撰
                "X0315", new BookInfo("楞嚴經寶鏡疏懸談", new String[]{"清"}, "溥畹"), // 清 溥畹述
                "X0316", new BookInfo("楞嚴經寶鏡疏", new String[]{"清"}, "溥畹"), // 清 溥畹述
                "X0317", new BookInfo("楞嚴經正見", new String[]{"清"}, "濟時"), // 清 濟時述
                "X0318", new BookInfo("楞嚴經宗通", new String[]{"明"}, "曾鳳儀"), // 明 曾鳳儀宗通
                "X0321", new BookInfo("楞伽經註", new String[]{"唐"}, "智嚴"), // 唐 智嚴註
                "X0322", new BookInfo("楞伽經疏", null), //
                "X0323", new BookInfo("楞伽經通義", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0324", new BookInfo("楞伽經集註", new String[]{"宋"}, "正受"), // 宋 正受集記
                "X0325", new BookInfo("楞伽經纂", new String[]{"宋"}, "楊彥國"), // 宋 楊彥國纂
                "X0326", new BookInfo("觀楞伽經記", new String[]{"明"}, "德清"), // 明 德清筆記
                "X0327", new BookInfo("楞伽補遺", new String[]{"明"}, "德清"), // 明 德清撰
                "X0328", new BookInfo("楞伽經玄義", new String[]{"明"}, "智旭"), // 明 智旭撰述
                "X0329", new BookInfo("楞伽經義疏", new String[]{"明"}, "智旭"), // 明 智旭疏義
                "X0330", new BookInfo("楞伽經宗通", new String[]{"明"}, "曾鳳儀"), // 明 曾鳳儀宗通
                "X0331", new BookInfo("楞伽經合轍", new String[]{"明"}, "通潤"), // 明 通潤述
                "X0332", new BookInfo("楞伽經參訂疏", new String[]{"明"}, "廣莫"), // 明 廣莫參訂
                "X0333", new BookInfo("楞伽經精解評林", new String[]{"明"}, "焦竑"), // 明 焦竑纂
                "X0334", new BookInfo("楞伽經心印", new String[]{"清"}, "圅昰"), // 清 圅昰疏
                "X0338", new BookInfo("維摩經文疏", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "X0340", new BookInfo("維摩經疏記", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "X0343", new BookInfo("維摩經略疏", new String[]{"胡"}, "吉藏"), // 胡 吉藏撰
                "X0345", new BookInfo("維摩經疏記鈔", new String[]{"唐"}, "道暹"), // 唐 道暹私記
                "X0347", new BookInfo("維摩經評註", new String[]{"明"}, "楊起元"), // 明 楊起元評註
                "X0348", new BookInfo("維摩經無我疏", new String[]{"明"}, "傳燈"), // 明 傳燈著
                "X0349", new BookInfo("維摩經疏科", new String[]{"明"}), // 明
                "X0351", new BookInfo("勝鬘經義記", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "X0352", new BookInfo("勝鬘經述記", new String[]{"唐"}, "大乘基", "義令"), // 唐 大乘基說　義令記
                "X0353", new BookInfo("勝鬘經疏義私鈔", new String[]{"唐", "日本"}, "聖德太子", "明空"), // 日本 聖德太子疏　唐 明空私鈔
                "X0355", new BookInfo("金光明經玄義科", new String[]{"明"}, "明得"), // 明 明得排定
                "X0356", new BookInfo("金光明經玄義拾遺記會本", new String[]{"隋", "唐", "宋", "明"}, "智顗", "灌頂", "知禮", "明得"), // 隋 智顗說　唐 灌頂錄　宋 知禮述　明 明得會
                "X0357", new BookInfo("金光明經文句科", new String[]{"明"}, "明得"), // 明 明得排定
                "X0358", new BookInfo("金光明經文句文句記會本", new String[]{"隋", "唐", "宋", "明"}, "智顗", "灌頂", "知禮", "明得"), // 隋 智顗說　唐 灌頂錄　宋 知禮述　明 明得會
                "X0359", new BookInfo("金光明經玄義順正記", new String[]{"宋"}, "從義"), // 宋 從義撰
                "X0360", new BookInfo("金光明經文句新記", new String[]{"宋"}, "從義"), // 宋 從義撰
                "X0361", new BookInfo("金光明經照解", new String[]{"宋"}, "宗曉"), // 宋 宗曉述
                "X0362", new BookInfo("金光明經科註", new String[]{"明"}, "受汰"), // 明 受汰集
                "X0364", new BookInfo("思益梵天所問經簡註", new String[]{"明"}, "圓澄"), // 明 圓澄註
                "X0365", new BookInfo("大乘本生心地觀經淺註懸示", new String[]{"清"}, "來舟"), // 清 來舟述
                "X0366", new BookInfo("大乘本生心地觀經淺註科文", null), //
                "X0367", new BookInfo("大乘本生心地觀經淺註", new String[]{"清"}, "來舟"), // 清 來舟集
                "X0368", new BookInfo("大乘密嚴經疏", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "X0369", new BookInfo("解深密經疏", new String[]{"唐"}, "圓測"), // 唐 圓測撰
                "X0370", new BookInfo("占察善惡業報經玄義", new String[]{"明"}, "智旭"), // 明 智旭撰
                "X0371", new BookInfo("占察善惡業報經義疏", new String[]{"明"}, "智旭"), // 明 智旭撰
                "X0372", new BookInfo("盂蘭盆經疏新記", new String[]{"唐", "宋"}, "宗密", "元照"), // 唐 宗密疏　宋 元照記
                "X0373", new BookInfo("盂蘭盆經疏會古通今記", new String[]{"宋"}, "普觀"), // 宋 普觀述
                "X0374", new BookInfo("盂蘭盆經疏孝衡鈔科", new String[]{"宋"}, "遇榮"), // 宋 遇榮集定
                "X0375", new BookInfo("盂蘭盆經疏孝衡鈔", new String[]{"宋"}, "遇榮"), // 宋 遇榮鈔
                "X0376", new BookInfo("盂蘭盆經疏鈔餘義", new String[]{"宋"}, "日新"), // 宋 日新錄
                "X0377", new BookInfo("盂蘭盆經新疏", new String[]{"明"}, "智旭"), // 明 智旭疏
                "X0378", new BookInfo("盂蘭盆經疏折中疏", new String[]{"清"}, "靈耀"), // 清 靈耀撰
                "X0379", new BookInfo("盂蘭盆經略疏", new String[]{"清"}, "元奇"), // 清 元奇書
                "X0381", new BookInfo("藥師經直解", new String[]{"清"}, "靈耀"), // 清 靈耀撰
                "X0382", new BookInfo("地藏本願經科文", new String[]{"清"}, "岳玄"), // 清 岳玄排
                "X0383", new BookInfo("地藏本願經綸貫", new String[]{"清"}, "靈椉"), // 清 靈椉撰
                "X0384", new BookInfo("地藏本願經科註", new String[]{"清"}, "靈椉"), // 清 靈椉輯
                "X0388", new BookInfo("彌勒上生經述贊", null), //
                "X0389", new BookInfo("彌勒下生經述贊", null), //
                "X0393", new BookInfo("彌勒上生經瑞應鈔科", new String[]{"宋"}, "守千"), // 宋 守千集
                "X0394", new BookInfo("彌勒上生經瑞應鈔", new String[]{"宋"}, "守千"), // 宋 守千集
                "X0397", new BookInfo("無量壽經記", new String[]{"唐"}, "玄一"), // 唐 玄一集
                "X0400", new BookInfo("無量壽經起信論", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X0401", new BookInfo("摩訶阿彌陀經衷論", new String[]{"清"}, "王耕心"), // 清 王耕心衷論
                "X0405", new BookInfo("釋觀無量壽佛經記", new String[]{"唐"}, "法聰"), // 唐 法聰撰
                "X0406", new BookInfo("觀無量壽經疏妙宗鈔科", new String[]{"宋", "明"}, "知禮", "真覺"), // 宋 知禮排定　明 真覺重排
                "X0407", new BookInfo("觀無量壽佛經疏妙宗鈔", new String[]{"隋", "宋", "日本"}, "智顗", "知禮", "實觀"), // 隋 智顗說　宋 知禮述　日本 實觀分會
                "X0408", new BookInfo("觀無量壽佛經融心解", new String[]{"宋"}, "知禮"), // 宋 知禮撰
                "X0410", new BookInfo("觀無量壽經扶新論", new String[]{"宋"}, "戒度"), // 宋 戒度述
                "X0411", new BookInfo("觀無量壽經義疏正觀記", new String[]{"宋"}, "戒度"), // 宋 戒度述
                "X0412", new BookInfo("觀無量壽佛經圖頌", new String[]{"明"}, "傳燈"), // 明 傳燈述
                "X0413", new BookInfo("觀無量壽經直指疏", new String[]{"清"}, "續法"), // 清 續法集
                "X0414", new BookInfo("觀無量壽佛經約論", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X0420", new BookInfo("阿彌陀經義疏聞持記", new String[]{"宋"}, "元照", "戒度"), // 宋 元照述　戒度記
                "X0421", new BookInfo("阿彌陀經句解", new String[]{"元"}, "性澄"), // 元 性澄句解
                "X0422", new BookInfo("阿彌陀經略解", new String[]{"明"}, "大佑"), // 明 大佑述
                "X0423", new BookInfo("阿彌陀經略解圓中鈔", new String[]{"明"}, "大佑", "傳燈"), // 明 大佑述　傳燈鈔
                "X0424", new BookInfo("阿彌陀經疏鈔", new String[]{"明"}, "袾宏"), // 明 袾宏述
                "X0425", new BookInfo("阿彌陀經疏鈔事義", new String[]{"明"}, "袾宏"), // 明 袾宏述
                "X0426", new BookInfo("阿彌陀經疏鈔問辯", new String[]{"明"}, "袾宏"), // 明 袾宏述
                "X0427", new BookInfo("阿彌陀經疏鈔演義", new String[]{"明"}, "古德法師", "慈航智願"), // 明 古德法師演義　慈航智願定本
                "X0428", new BookInfo("阿彌陀經疏鈔擷", new String[]{"明", "清"}, "袾宏", "徐槐廷"), // 明 袾宏疏鈔　清 徐槐廷擷
                "X0429", new BookInfo("阿彌陀經已決", new String[]{"明"}, "大慧"), // 明 大慧釋
                "X0430", new BookInfo("阿彌陀經要解便蒙鈔", new String[]{"明", "清"}, "智旭", "達默", "達林"), // 明 智旭要解　清 達默造鈔　達林參訂
                "X0431", new BookInfo("阿彌陀經略註", new String[]{"清"}, "續法"), // 清 續法錄註
                "X0432", new BookInfo("阿彌陀經註", new String[]{"清"}, "鄭澄德", "鄭澄源"), // 清 鄭澄德．鄭澄源註
                "X0433", new BookInfo("阿彌陀經約論", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X0434", new BookInfo("阿彌陀經直解正行", new String[]{"清"}, "了根"), // 清 了根纂註
                "X0435", new BookInfo("阿彌陀經摘要易解", new String[]{"清"}, "真嵩"), // 清 真嵩述
                "X0438", new BookInfo("大日經義釋", new String[]{"唐"}, "一行"), // 唐 一行述記
                "X0439", new BookInfo("大日經義釋演密鈔", new String[]{"遼"}, "覺苑"), // 遼 覺苑撰
                "X0445", new BookInfo("佛頂尊勝陀羅尼經釋", new String[]{"清"}, "續法"), // 清 續法釋
                "X0446", new BookInfo("七俱胝佛母所說準提陀羅尼經會釋", new String[]{"清"}, "弘贊"), // 清 弘贊會釋
                "X0447", new BookInfo("觀自在菩薩如意心陀羅尼經略疏", new String[]{"清"}, "續法"), // 清 續法述
                "X0448", new BookInfo("大般若經關法", new String[]{"宋"}, "大隱", "永隆"), // 宋 大隱．永隆排定
                "X0449", new BookInfo("大般若經綱要", new String[]{"清"}, "葛䵻"), // 清 葛䵻提綱
                "X0451", new BookInfo("大品經義疏", new String[]{"胡"}, "吉藏"), // 胡 吉藏撰
                "X0454", new BookInfo("金剛經註", new String[]{"東晉"}, "僧肇"), // 東晉 僧肇注
                "X0456", new BookInfo("金剛經註疏", new String[]{"唐"}, "慧淨"), // 唐 慧淨註
                "X0459", new BookInfo("金剛經解義", new String[]{"唐"}, "慧能"), // 唐 慧能解義
                "X0460", new BookInfo("金剛經口訣", new String[]{"唐"}, "慧能"), // 唐 慧能說
                "X0461", new BookInfo("金剛經註", new String[]{"宋"}, "道川"), // 宋 道川頌並著語
                "X0462", new BookInfo("金剛經會解", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0463", new BookInfo("金剛經采微科", new String[]{"宋"}, "曇應"), // 宋 曇應排
                "X0464", new BookInfo("金剛經采微", new String[]{"宋"}, "曇應"), // 宋 曇應述
                "X0465", new BookInfo("金剛經采微餘釋", new String[]{"宋"}, "曇應"), // 宋 曇應述
                "X0466", new BookInfo("金剛疏科釋", new String[]{"元"}, "徐行善"), // 元 徐行善科
                "X0467", new BookInfo("銷釋金剛經科儀會要註解", new String[]{"宋", "明"}, "宗鏡", "覺連"), // 宋 宗鏡述　明 覺連重集
                "X0468", new BookInfo("金剛經註解", new String[]{"明"}, "洪蓮"), // 明 洪蓮編
                "X0469", new BookInfo("金剛經補註", new String[]{"明"}, "韓巖", "程衷懋"), // 明 韓巖集解　程衷懋補註
                "X0470", new BookInfo("金剛經註解鐵鋑錎", new String[]{"明"}, "屠垠"), // 明 屠根註
                "X0471", new BookInfo("金剛經宗通", new String[]{"明"}, "曾鳳儀"), // 明 曾鳳儀宗通
                "X0472", new BookInfo("金剛經偈釋", new String[]{"明"}, "曾鳳儀"), // 明 曾鳳儀釋
                "X0473", new BookInfo("金剛經釋", new String[]{"明"}, "真可"), // 明 真可撰
                "X0474", new BookInfo("金剛經決疑", new String[]{"明"}, "德清"), // 明 德清撰
                "X0475", new BookInfo("金剛經鎞", new String[]{"明"}, "廣伸"), // 明 廣伸述
                "X0476", new BookInfo("金剛經統論", new String[]{"明"}, "林兆恩"), // 明 林兆恩撰
                "X0477", new BookInfo("金剛經正眼", new String[]{"明"}, "大韻"), // 明 大韻筆記
                "X0478", new BookInfo("金剛經筆記", new String[]{"明"}, "如觀"), // 明 如觀註
                "X0479", new BookInfo("金剛經破空論", new String[]{"明"}, "智旭"), // 明 智旭造論
                "X0480", new BookInfo("金剛經觀心釋", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0481", new BookInfo("金剛經略談", new String[]{"明"}, "觀衡"), // 明 觀衡撰
                "X0482", new BookInfo("金剛經略疏", new String[]{"明"}, "元賢"), // 明 元賢述
                "X0483", new BookInfo("金剛經音釋直解", new String[]{"明"}, "圓杲"), // 明 圓杲解註
                "X0484", new BookInfo("金剛經大意", new String[]{"清"}, "王起隆"), // 清 王起隆述
                "X0485", new BookInfo("金剛經如是解", new String[]{"清"}, "無是道人"), // 清 無是道人註解
                "X0486", new BookInfo("金剛經會解了義", new String[]{"清"}, "徐昌治"), // 清 徐昌治纂
                "X0487", new BookInfo("金剛新眼疏經偈合釋", new String[]{"清"}, "通理"), // 清 通理述
                "X0488", new BookInfo("金剛經郢說", new String[]{"清"}, "徐發"), // 清 徐發詮次
                "X0489", new BookInfo("金剛經註正訛", new String[]{"清"}, "仲之屏"), // 清 仲之屏彙纂
                "X0490", new BookInfo("金剛經淺解", new String[]{"清"}, "翁春", "王錫琯"), // 清 翁春．王錫琯解釋
                "X0491", new BookInfo("金剛經疏記科會", new String[]{"唐", "宋", "清"}, "宗密", "子璿", "大璸"), // 唐 宗密疏　宋 子璿記　清 大璸科會
                "X0492", new BookInfo("金剛經疏記會編", new String[]{"清"}, "行策"), // 清 行策會編
                "X0493", new BookInfo("金剛經部旨", new String[]{"清"}, "靈耀"), // 清 靈耀撰
                "X0494", new BookInfo("金剛經註釋", new String[]{"清"}, "溥仁", "子真"), // 清 溥仁乩書　子真乩訂
                "X0495", new BookInfo("金剛經演古", new String[]{"清"}, "寂燄"), // 清 寂燄述
                "X0496", new BookInfo("金剛經直說", new String[]{"清"}, "迹刪鷲"), // 清 迹刪鷲述
                "X0497", new BookInfo("金剛經石注", new String[]{"清"}, "石成金"), // 清 石成金撰集
                "X0498", new BookInfo("金剛經正解", new String[]{"清"}, "龔穊綵"), // 清 龔穊綵註
                "X0499", new BookInfo("金剛經法眼懸判疏鈔", new String[]{"清"}, "性起"), // 清 性起述
                "X0500", new BookInfo("金剛經法眼註疏", new String[]{"清"}, "性起"), // 清 性起述
                "X0501", new BookInfo("金剛經如是經義", new String[]{"清"}, "行敏"), // 清 行敏述
                "X0502", new BookInfo("金剛經註講", new String[]{"清"}, "行敏"), // 清 行敏述
                "X0503", new BookInfo("金剛經注解", new String[]{"清"}, "孚佑帝君"), // 清 孚佑帝君註解
                "X0504", new BookInfo("金剛經彙纂", new String[]{"清"}, "孫念劬"), // 清 孫念劬纂
                "X0505", new BookInfo("金剛經心印疏", new String[]{"清"}, "溥畹"), // 清 溥畹述
                "X0506", new BookInfo("金剛經注", new String[]{"清"}, "俞樾"), // 清 俞樾註
                "X0507", new BookInfo("金剛經訂義", new String[]{"清"}, "俞樾"), // 清 俞樾著
                "X0508", new BookInfo("金剛經闡說", new String[]{"清"}, "存吾"), // 清 存吾闡說
                "X0509", new BookInfo("金剛經解義", new String[]{"清"}, "徐槐廷"), // 清 徐槐廷述
                "X0510", new BookInfo("金剛經易解", new String[]{"清"}, "謝承謨"), // 清 謝承謨註釋
                "X0513", new BookInfo("仁王經合疏", new String[]{"隋", "明"}, "智顗", "灌頂", "道霈"), // 隋 智顗說　灌頂記　明 道霈合
                "X0514", new BookInfo("仁王經疏會本", new String[]{"隋", "清"}, "智顗", "灌頂", "成蓮"), // 隋 智顗說　灌頂記　清 成蓮合
                "X0515", new BookInfo("仁王經科疏科文", new String[]{"明"}, "真貴"), // 明 真貴述
                "X0516", new BookInfo("仁王經科疏懸談", new String[]{"明"}, "真貴"), // 明 真貴述
                "X0517", new BookInfo("仁王經科疏", new String[]{"明"}, "真貴"), // 明 真貴述
                "X0519", new BookInfo("仁王經疏法衡鈔", new String[]{"唐"}, "遇榮"), // 唐 遇榮集
                "X0520", new BookInfo("仁王經疏", new String[]{"宋"}, "淨源"), // 宋 淨源撰集
                "X0521", new BookInfo("般若心經疏", new String[]{"唐"}, "慧淨"), // 唐 慧淨作
                "X0522", new BookInfo("般若心經疏", new String[]{"唐"}, "靖邁"), // 唐 靖邁撰
                "X0524", new BookInfo("般若心經幽贊添改科", new String[]{"宋"}, "守千"), // 宋 守千添改
                "X0525", new BookInfo("般若心經幽贊崆峒記", new String[]{"宋"}, "守千"), // 宋 守千集
                "X0526", new BookInfo("般若心經註", new String[]{"中天竺"}, "提婆"), // 中天竺 提婆註
                "X0528", new BookInfo("般若心經略疏", new String[]{"唐"}, "明曠"), // 唐 明曠述
                "X0529", new BookInfo("般若心經疏", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "X0530", new BookInfo("般若心經疏詒謀鈔", new String[]{"宋"}, "智圓"), // 宋 智圓撰
                "X0531", new BookInfo("般若心經略疏顯正記", new String[]{"唐", "宋"}, "法藏", "仲希"), // 唐 法藏疏　宋 仲希說
                "X0532", new BookInfo("般若心經略疏小鈔", new String[]{"明"}, "錢謙益"), // 明 錢謙益集
                "X0533", new BookInfo("般若心經三注", new String[]{"唐", "宋"}, "慧忠", "道楷", "懷深"), // 唐 慧忠著　宋 道楷．懷琛述
                "X0534", new BookInfo("般若心經注", new String[]{"宋"}, "道隆"), // 宋 道隆述
                "X0535", new BookInfo("般若心經解義節要", new String[]{"明"}, "宋濂"), // 明 宋濂文句
                "X0536", new BookInfo("般若心經注解", new String[]{"明"}, "真可"), // 明 真可撰
                "X0537", new BookInfo("般若心經直談", new String[]{"明"}, "真可"), // 明 真可撰
                "X0538", new BookInfo("般若心經要論", new String[]{"明"}, "真可"), // 明 真可說
                "X0539", new BookInfo("般若心經說", new String[]{"明"}, "真可"), // 明 真可說
                "X0540", new BookInfo("般若心經釋義", new String[]{"明"}, "謝觀光"), // 明 謝觀光釋
                "X0541", new BookInfo("般若心經釋疑", new String[]{"明"}, "謝觀光"), // 明 謝觀光釋
                "X0542", new BookInfo("般若心經直說", new String[]{"明"}, "德清"), // 明 德清述
                "X0543", new BookInfo("般若心經提綱", new String[]{"明"}, "李贄"), // 明 李贄撰
                "X0544", new BookInfo("般若心經釋略", new String[]{"明"}, "林兆恩"), // 明 林兆恩撰
                "X0545", new BookInfo("般若心經概論", new String[]{"明"}, "林兆恩"), // 明 林兆恩撰
                "X0546", new BookInfo("般若心經說", new String[]{"明"}, "洪恩"), // 明 洪恩述
                "X0547", new BookInfo("般若心經註解", new String[]{"明"}, "諸萬里"), // 明 諸萬里註
                "X0548", new BookInfo("般若心經斲輪解", new String[]{"明"}, "通容"), // 明 通容述
                "X0549", new BookInfo("般若心經正眼", new String[]{"明"}, "大文"), // 明 大文述
                "X0550", new BookInfo("般若心經開度", new String[]{"明"}, "弘麗"), // 明 弘麗著
                "X0551", new BookInfo("般若心經發隱", new String[]{"明"}, "正相"), // 明 正相解
                "X0552", new BookInfo("般若心經際決", new String[]{"明"}, "大慧"), // 明 大慧釋
                "X0553", new BookInfo("般若心經添足", new String[]{"明"}, "弘贊"), // 明 弘贊述
                "X0554", new BookInfo("般若心經貫義", new String[]{"明"}, "弘贊"), // 明 弘贊述
                "X0555", new BookInfo("般若心經釋要", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0556", new BookInfo("般若心經小談", new String[]{"明"}, "觀衡"), // 明 觀衡述
                "X0557", new BookInfo("般若心經一貫疏", new String[]{"明"}, "益證"), // 明 益證疏
                "X0558", new BookInfo("般若心經指掌", new String[]{"明"}, "元賢"), // 明 元賢述
                "X0559", new BookInfo("般若心經事觀解", new String[]{"清"}, "續法"), // 清 續法述
                "X0560", new BookInfo("般若心經理性解", new String[]{"清"}, "續法"), // 清 續法述
                "X0561", new BookInfo("般若心經大意", new String[]{"清"}, "王起隆"), // 清 王起隆述
                "X0562", new BookInfo("般若心經解", new String[]{"清"}, "徐昌治"), // 清 徐昌治解
                "X0563", new BookInfo("般若心經請益說", new String[]{"清"}, "道霈"), // 清 道霈說
                "X0564", new BookInfo("般若心經註疏", new String[]{"清"}, "仲之屏"), // 清 仲之屏纂註
                "X0565", new BookInfo("般若心經論", new String[]{"清"}, "圅昰"), // 清 圅昰撰
                "X0566", new BookInfo("般若心經彙纂", new String[]{"清"}, "孫念劬"), // 清 孫念劬纂
                "X0567", new BookInfo("般若心經如是經義", new String[]{"清"}, "行敏"), // 清 行敏述
                "X0568", new BookInfo("般若心經註講", new String[]{"清"}, "行敏"), // 清 行敏述
                "X0569", new BookInfo("般若心經句解易知", new String[]{"清"}, "王澤泩"), // 清 王澤泩註解
                "X0570", new BookInfo("般若心經解義", new String[]{"清"}, "徐槐廷"), // 清 徐槐廷解義
                "X0571", new BookInfo("般若心經註解", new String[]{"清"}, "敬止"), // 清 敬止撰
                "X0572", new BookInfo("般若心經易解", new String[]{"清"}, "謝承謨"), // 清 謝承謨註釋
                "X0573", new BookInfo("般若心經註解", new String[]{"唐"}, "大顛祖師"), // 唐 大顛祖師註解
                "X0574", new BookInfo("般若心經註解", new String[]{"明"}, "何道全"), // 明 何道全註
                "X0575", new BookInfo("般若心經註解", null), //
                "X0576", new BookInfo("般若心經註解", new String[]{"清"}, "孚佑帝君"), // 清 孚佑帝君註解
                "X0577", new BookInfo("法華經疏", new String[]{"宋"}, "竺道生"), // 宋 竺道生撰
                "X0582", new BookInfo("法華統略", new String[]{"胡"}, "吉藏"), // 胡 吉藏撰
                "X0583", new BookInfo("法華經大意", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "X0584", new BookInfo("法華三大部科文", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "X0585", new BookInfo("法華經三大部讀教記", new String[]{"宋"}, "法照"), // 宋 法照撰
                "X0586", new BookInfo("法華經三大部補注", new String[]{"宋"}, "從義"), // 宋 從義撰
                "X0587", new BookInfo("大部妙玄格言", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0588", new BookInfo("法華經玄籤備撿", new String[]{"宋"}, "有嚴"), // 宋 有嚴述
                "X0589", new BookInfo("法華經玄義節要", new String[]{"明"}, "智旭"), // 明 智旭節
                "X0590", new BookInfo("法華經玄義輯略", new String[]{"明"}, "傳燈"), // 明 傳燈錄
                "X0591", new BookInfo("法華經釋籤緣起序指明", new String[]{"清"}, "靈耀"), // 清 靈耀述
                "X0592", new BookInfo("法華經玄籤證釋", new String[]{"清"}, "智銓"), // 清 智銓述
                "X0593", new BookInfo("法華經文句輔正記", new String[]{"唐"}, "道暹"), // 唐 道暹述
                "X0594", new BookInfo("法華經疏義纘", new String[]{"唐"}, "智度"), // 唐 智度述
                "X0595", new BookInfo("妙經文句私志諸品要義", new String[]{"唐"}, "智雲"), // 唐 智雲述
                "X0596", new BookInfo("妙經文句私志記", new String[]{"唐"}, "智雲"), // 唐 智雲撰
                "X0597", new BookInfo("法華經文句記箋難", new String[]{"宋"}, "有嚴"), // 宋 有嚴箋
                "X0598", new BookInfo("法華經文句格言", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0599", new BookInfo("法華經文句纂要", new String[]{"清"}, "道霈"), // 清 道霈纂要
                "X0600", new BookInfo("法華經入疏", new String[]{"宋"}, "道威"), // 宋 道威入注
                "X0601", new BookInfo("法華經要解科", null), //
                "X0602", new BookInfo("法華經要解", new String[]{"宋"}, "戒環"), // 宋 戒環解
                "X0603", new BookInfo("法華經合論", new String[]{"宋"}, "慧洪", "張商英"), // 宋 慧洪造　張商英撰
                "X0604", new BookInfo("法華經句解", new String[]{"宋"}, "聞達"), // 宋 聞達解
                "X0605", new BookInfo("法華經科註", new String[]{"宋", "明"}, "守倫", "法濟"), // 宋 守倫註　明 法濟參訂
                "X0606", new BookInfo("法華經科註", new String[]{"元"}, "徐行善"), // 元 徐行善科註
                "X0607", new BookInfo("法華經科註", new String[]{"明"}, "一如"), // 明 一如集註
                "X0608", new BookInfo("法華經知音", new String[]{"明"}, "如愚"), // 明 如愚著
                "X0609", new BookInfo("法華經大意", new String[]{"明"}, "無相"), // 明 無相說
                "X0610", new BookInfo("法華經擊節", new String[]{"明"}, "德清"), // 明 德清述
                "X0611", new BookInfo("法華經通義", new String[]{"明"}, "德清"), // 明 德清述
                "X0612", new BookInfo("法華經精解評林", new String[]{"明"}, "焦竑"), // 明 焦竑纂
                "X0613", new BookInfo("法華經意語", new String[]{"明"}, "圓澄", "明海"), // 明 圓澄說　明海重訂
                "X0614", new BookInfo("法華經大窾", new String[]{"明"}, "通潤"), // 明 通潤箋
                "X0615", new BookInfo("法華經綸貫", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0616", new BookInfo("法華經會義", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0617", new BookInfo("法華經卓解", new String[]{"清"}, "徐昌治"), // 清 徐昌治著
                "X0618", new BookInfo("法華經大成科", new String[]{"清"}, "際慶"), // 清 際慶排錄
                "X0619", new BookInfo("法華經大成", new String[]{"清"}, "大義"), // 清 大義集
                "X0620", new BookInfo("法華經大成音義", new String[]{"清"}, "淨昇"), // 清 淨昇集
                "X0621", new BookInfo("法華經授手〔卷首〕", new String[]{"清"}, "智祥"), // 清 智祥集
                "X0622", new BookInfo("法華經授手科", new String[]{"清"}, "智祥"), // 清 智祥排
                "X0623", new BookInfo("法華經授手", new String[]{"清"}, "智祥"), // 清 智祥集
                "X0624", new BookInfo("法華經演義科", new String[]{"清"}, "廣和"), // 清 廣和標科
                "X0625", new BookInfo("法華經演義", new String[]{"清"}, "一松", "廣和"), // 清 一松講錄　廣和編定
                "X0626", new BookInfo("法華經科拾懸談卷首", new String[]{"清"}, "佛閑", "智一"), // 清 佛閑立科　智一拾遺
                "X0627", new BookInfo("法華經科拾科", new String[]{"清"}, "佛閑", "智一"), // 清 佛閑立科　智一重訂
                "X0628", new BookInfo("法華經科拾", new String[]{"清"}, "佛閑", "智一"), // 清 佛閑立科　智一拾遺
                "X0629", new BookInfo("法華經指掌疏科文", new String[]{"清"}, "通理"), // 清 通理述
                "X0630", new BookInfo("法華經指掌疏懸示", new String[]{"清"}, "通理"), // 清 通理述
                "X0631", new BookInfo("法華經指掌疏", new String[]{"清"}, "通理"), // 清 通理述
                "X0632", new BookInfo("法華經指掌疏事義", new String[]{"清"}, "通理"), // 清 通理述
                "X0633", new BookInfo("法華經為為章", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "X0636", new BookInfo("法華經玄贊攝釋", new String[]{"唐"}, "智周"), // 唐 智周撰
                "X0637", new BookInfo("法華經玄贊決擇記", new String[]{"唐"}, "崇俊", "法清"), // 唐 崇俊撰　法清集疏
                "X0638", new BookInfo("法華經玄贊要集", new String[]{"唐"}, "栖復"), // 唐 栖復集
                "X0639", new BookInfo("法華經玄贊釋", null), //
                "X0640", new BookInfo("觀音經玄義記會本科", null), //
                "X0641", new BookInfo("觀音經玄義記條箇", null), //
                "X0642", new BookInfo("觀音經玄義記會本", new String[]{"隋", "宋"}, "智顗", "知禮"), // 隋 智顗說　宋 知禮述
                "X0643", new BookInfo("觀音經義疏記會本科", null), //
                "X0644", new BookInfo("觀音經義疏記條箇", null), //
                "X0645", new BookInfo("觀音經義疏記會本", new String[]{"隋", "宋"}, "智顗", "知禮"), // 隋 智顗說　宋 知禮述
                "X0646", new BookInfo("觀音經普門品重頌", new String[]{"宋"}, "遵式"), // 宋 遵式述
                "X0647", new BookInfo("觀音經普門品膚說", new String[]{"清"}, "靈耀"), // 清 靈耀說
                "X0648", new BookInfo("高王觀音經註釋", new String[]{"清"}, "周上智"), // 清 周上智錄出
                "X0649", new BookInfo("普賢觀經義疏科", null), //
                "X0650", new BookInfo("普賢觀經義疏", new String[]{"宋", "日本"}, "本如", "處咸", "亮潤"), // 宋 本如述　處咸續解　日本 亮潤分會
                "X0651", new BookInfo("金剛三昧經注解", new String[]{"明"}, "圓澄"), // 明 圓澄註
                "X0652", new BookInfo("金剛三昧經通宗記", new String[]{"清"}, "𧧌震"), // 清 𧧌震述
                "X0656", new BookInfo("涅槃經玄義文句", new String[]{"隋", "唐", "日本"}, "灌頂", "道暹", "守篤"), // 隋 灌頂撰　唐 道暹撰　日本 守篤分會
                "X0657", new BookInfo("涅槃經治定疏科", new String[]{"宋"}, "智圓"), // 宋 智圓撰
                "X0658", new BookInfo("涅槃經會疏條箇", null), //
                "X0659", new BookInfo("涅槃經會疏", new String[]{"隋", "唐", "日本"}, "灌頂", "湛然", "本純"), // 隋 灌頂撰　唐 湛然再治　日本 本純分會
                "X0660", new BookInfo("涅槃經疏私記", new String[]{"唐"}, "行滿"), // 唐 行滿集
                "X0661", new BookInfo("涅槃經疏私記", new String[]{"唐"}, "道暹"), // 唐 道暹述
                "X0662", new BookInfo("涅槃經疏三德指歸", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "X0663", new BookInfo("科南本涅槃經", new String[]{"元"}, "師正", "可度"), // 元 師正排科　可度重訂
                "X0664", new BookInfo("涅槃經會疏解", new String[]{"元", "明"}, "師正", "圓澄"), // 元 師正分科　明 圓澄會疏
                "X0665", new BookInfo("遺教經補註", new String[]{"宋", "明"}, "守遂", "了童"), // 宋 守遂註　明 了童補註
                "X0666", new BookInfo("遺教經解", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0669", new BookInfo("四十二章經註", new String[]{"宋", "明"}, "守遂", "了童"), // 宋 守遂註　明 了童補註
                "X0670", new BookInfo("四十二章經解", new String[]{"明"}, "智旭"), // 明 智旭著
                "X0671", new BookInfo("四十二章經疏鈔", new String[]{"清"}, "續法"), // 清 續法述
                "X0672", new BookInfo("八大人覺經略解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0673", new BookInfo("八大人覺經疏", new String[]{"清"}, "續法"), // 清 續法述
                "X0674", new BookInfo("閱經十二種", new String[]{"清"}, "淨挺"), // 清 淨挺著
                "X0675", new BookInfo("佛祖三經指南", new String[]{"明"}, "道霈"), // 明 道霈述
                "X0676", new BookInfo("梵網菩薩戒經義疏", new String[]{"隋", "唐"}, "智顗", "灌頂"), // 隋 智顗說　唐 灌頂記
                "X0678", new BookInfo("梵網菩薩戒經疏註", new String[]{"宋"}, "與咸"), // 宋 與咸(入疏箋經加註釋疏)
                "X0679", new BookInfo("梵網菩薩戒經義疏發隱", new String[]{"明"}, "袾宏"), // 明 袾宏發隱
                "X0680", new BookInfo("梵網菩薩戒經義疏發隱事義", new String[]{"明"}, "袾宏"), // 明 袾宏述
                "X0681", new BookInfo("梵網菩薩戒經義疏發隱問辯", new String[]{"明"}, "袾宏"), // 明 袾宏述
                "X0682", new BookInfo("梵網經記", new String[]{"唐"}, "傳奧"), // 唐 傳奧述
                "X0683", new BookInfo("梵網經菩薩戒本私記", new String[]{"新羅"}, "元曉"), // 新羅 元曉造
                "X0686", new BookInfo("梵網經菩薩戒本述記", new String[]{"唐"}, "勝莊"), // 唐 勝莊撰
                "X0687", new BookInfo("梵網經菩薩戒本疏", new String[]{"唐"}, "知周"), // 唐 知周撰
                "X0690", new BookInfo("梵網經菩薩戒疏", new String[]{"唐"}, "法銑"), // 唐 法銑撰
                "X0691", new BookInfo("梵網經菩薩戒注", new String[]{"宋"}, "慧因"), // 宋 慧因註
                "X0692", new BookInfo("菩薩戒疏隨見錄", new String[]{"明"}, "今釋"), // 明 今釋造
                "X0693", new BookInfo("梵網經玄義", new String[]{"明"}, "智旭", "道昉"), // 明 智旭述　道昉訂
                "X0694", new BookInfo("梵網經合註", new String[]{"明"}, "智旭", "道昉"), // 明 智旭註　道昉訂
                "X0695", new BookInfo("梵網經菩薩戒略疏", new String[]{"明"}, "弘贊"), // 明 弘贊述
                "X0696", new BookInfo("半月誦菩薩戒儀式註", new String[]{"明"}, "弘贊"), // 明 弘贊注
                "X0697", new BookInfo("梵網經直解", new String[]{"明"}, "寂光"), // 明 寂光直解
                "X0698", new BookInfo("梵網經直解事義", null), //
                "X0699", new BookInfo("梵網經順硃", new String[]{"清"}, "德玉"), // 清 德玉順硃
                "X0700", new BookInfo("梵網經菩薩戒初津", new String[]{"清"}, "書玉"), // 清 書玉述
                "X0702", new BookInfo("菩薩戒本箋要", new String[]{"明"}, "智旭"), // 明 智旭箋
                "X0703", new BookInfo("菩薩戒羯磨文釋", new String[]{"明"}, "智旭"), // 明 智旭釋
                "X0704", new BookInfo("地持論義記", new String[]{"隋"}, "慧遠"), // 隋 慧遠述
                "X0705", new BookInfo("瓔珞本業經疏", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "X0706", new BookInfo("十善業道經節要", new String[]{"清"}, "蕅益"), // 清 蕅益編訂
                "X0707", new BookInfo("新刪定四分僧戒本", new String[]{"唐"}, "道宣"), // 唐 道宣刪定
                "X0708", new BookInfo("毗尼珍敬錄", new String[]{"明"}, "廣承", "智旭"), // 明 廣承輯錄　智旭會補
                "X0709", new BookInfo("毗尼止持會集", new String[]{"清"}, "讀體"), // 清 讀體集
                "X0712", new BookInfo("四分律含注戒本疏發揮記", new String[]{"宋"}, "允堪"), // 宋 允堪述
                "X0713", new BookInfo("四分律含注戒本疏科", new String[]{"宋"}, "元照"), // 宋 元照錄
                "X0714", new BookInfo("四分律含注戒本疏行宗記", new String[]{"唐", "宋", "日本"}, "道宣", "元照", "即靜"), // 唐 道宣撰　宋 元照述　日本 即靜分會
                "X0715", new BookInfo("釋四分戒本序", new String[]{"宋"}, "道言"), // 宋 道言述
                "X0716", new BookInfo("四分戒本緣起事義", new String[]{"明"}, "廣莫"), // 明 廣莫輯錄
                "X0717", new BookInfo("四分戒本如釋", new String[]{"明"}, "弘贊"), // 明 弘贊繹
                "X0718", new BookInfo("四分戒本約義", new String[]{"明"}, "元賢"), // 明 元賢述
                "X0719", new BookInfo("重治毗尼事義集要", new String[]{"明"}, "智旭"), // 明 智旭輯繹
                "X0720", new BookInfo("毗尼關要", new String[]{"清"}, "德基"), // 清 德基輯
                "X0721", new BookInfo("毗尼關要事義", new String[]{"清"}, "德基"), // 清 德基輯
                "X0722", new BookInfo("四分刪定比丘尼戒本", new String[]{"宋"}, "元照"), // 宋 元照重定
                "X0723", new BookInfo("四分比丘尼鈔科", new String[]{"宋"}, "允堪"), // 宋 允堪述
                "X0724", new BookInfo("四分比丘尼鈔", new String[]{"唐"}, "道宣"), // 唐 道宣述
                "X0725", new BookInfo("式叉摩那尼戒本", new String[]{"明"}, "弘贊"), // 明 弘贊輯
                "X0726", new BookInfo("四分律隨機羯磨疏正源記", new String[]{"宋"}, "允堪"), // 宋 允堪述
                "X0727", new BookInfo("四分律刪補隨機羯磨疏科", new String[]{"宋"}, "元照"), // 宋 元照錄
                "X0728", new BookInfo("四分律刪補隨機羯磨疏濟緣記", new String[]{"唐", "宋", "日本"}, "道宣", "元照", "禪能"), // 唐 道宣疏　宋 元照述　日本 禪能合會
                "X0729", new BookInfo("羯磨經序解", new String[]{"宋"}, "則安"), // 宋 則安述
                "X0730", new BookInfo("毗尼作持續釋", new String[]{"唐", "清"}, "道宣", "讀體"), // 唐 道宣撰集　清 讀體續釋
                "X0731", new BookInfo("四分律疏", new String[]{"唐"}, "法礪"), // 唐 法礪撰述
                "X0732", new BookInfo("四分律搜玄錄", new String[]{"唐"}, "志鴻"), // 唐 志鴻撰述
                "X0733", new BookInfo("四分律疏飾宗義記", new String[]{"唐"}, "定賓"), // 唐 定賓作
                "X0734", new BookInfo("四分律疏", new String[]{"唐"}, "智首"), // 唐 智首撰
                "X0735", new BookInfo("四分律開宗記", new String[]{"唐"}, "懷素"), // 唐 懷素撰
                "X0736", new BookInfo("四分律行事鈔批", new String[]{"唐"}, "大覺"), // 唐 大覺撰
                "X0737", new BookInfo("四分律行事鈔簡正記", new String[]{"後唐"}, "景霄"), // 後唐 景霄纂
                "X0738", new BookInfo("四分律行事鈔科", new String[]{"宋"}, "元照"), // 宋 元照錄
                "X0740", new BookInfo("資持記序解并五例講義", new String[]{"宋"}, "則安"), // 宋 則安述
                "X0741", new BookInfo("行事鈔諸家記標目", new String[]{"宋", "日本"}, "慧顯", "戒月"), // 宋 慧顯集　日本 戒月改錄
                "X0742", new BookInfo("資持記立題拾義", new String[]{"宋"}, "道標"), // 宋 道標出
                "X0743", new BookInfo("毗尼討要", new String[]{"唐"}, "玄惲"), // 唐 玄惲纂
                "X0744", new BookInfo("四分律名義標釋", new String[]{"明"}, "弘贊"), // 明 弘贊輯
                "X0745", new BookInfo("四分律藏大小持戒犍度略釋", new String[]{"明"}, "智旭"), // 明 智旭釋
                "X0746", new BookInfo("四分律拾毗尼義鈔科", new String[]{"宋"}, "元照"), // 宋 元照錄
                "X0747", new BookInfo("四分律拾毗尼義鈔", new String[]{"唐"}, "道宣"), // 唐 道宣撰
                "X0748", new BookInfo("四分律拾毗尼義鈔輔要記", new String[]{"宋"}, "允堪"), // 宋 允堪述
                "X0749", new BookInfo("佛說齋經科註", new String[]{"明"}, "智旭"), // 明 智旭科註
                "X0750", new BookInfo("佛說目連五百問經略解", new String[]{"明"}, "性祇"), // 明 性祇述
                "X0751", new BookInfo("佛說目連五百問戒律中輕重事經釋", new String[]{"明"}, "永海"), // 明 永海述
                "X0753", new BookInfo("十地經論義記", new String[]{"隋"}, "慧遠"), // 隋 慧遠撰
                "X0754", new BookInfo("起信論一心二門大意", new String[]{"陳"}, "智愷"), // 陳 智愷作
                "X0755", new BookInfo("起信論義疏", new String[]{"隋"}, "曇延"), // 隋 曇延撰
                "X0757", new BookInfo("起信論疏記", new String[]{"新羅"}, "元曉"), // 新羅 元曉疏並別記
                "X0759", new BookInfo("起信論同異集", new String[]{"唐"}, "見登"), // 唐 見登集
                "X0762", new BookInfo("起信論纂註", new String[]{"明"}, "真界"), // 明 真界纂註
                "X0763", new BookInfo("起信論捷要", new String[]{"明"}, "正遠"), // 明 正遠註
                "X0764", new BookInfo("起信論續疏", new String[]{"明"}, "通潤"), // 明 通潤述疏
                "X0765", new BookInfo("大乘起信論疏略", new String[]{"唐", "明"}, "法藏", "德清"), // 唐 法藏造疏　明 德清纂略
                "X0766", new BookInfo("起信論直解", new String[]{"明"}, "德清"), // 明 德清述
                "X0767", new BookInfo("起信論疏記會閱卷首", null), //
                "X0768", new BookInfo("起信論疏記會閱", new String[]{"清"}, "續法"), // 清 續法會編
                "X0770", new BookInfo("釋摩訶衍論記", new String[]{"唐"}, "聖法"), // 唐 聖法鈔
                "X0771", new BookInfo("釋摩訶衍論疏", new String[]{"唐"}, "法敏"), // 唐 法敏集
                "X0772", new BookInfo("釋摩訶衍論贊玄疏", new String[]{"宋"}, "法悟"), // 宋 法悟撰
                "X0773", new BookInfo("釋摩訶衍論科", new String[]{"宋"}, "普觀"), // 宋 普觀治定
                "X0774", new BookInfo("釋摩訶衍論記", new String[]{"宋"}, "普觀"), // 宋 普觀述
                "X0775", new BookInfo("釋摩訶衍論通玄鈔", new String[]{"遼"}, "志福"), // 遼 志福撰
                "X0776", new BookInfo("大宗地玄文本論略註", new String[]{"清"}, "楊文會"), // 清 楊文會略註
                "X0777", new BookInfo("金剛頂菩提心論略記", new String[]{"唐"}, "遍滿"), // 唐 遍滿撰
                "X0784", new BookInfo("大乘四論玄義", new String[]{"唐"}, "均正"), // 唐 均正撰
                "X0786", new BookInfo("大乘法界無差別論疏領要鈔科", new String[]{"宋"}, "普觀"), // 宋 普觀錄
                "X0787", new BookInfo("大乘法界無差別論疏領要鈔", new String[]{"宋"}, "普觀"), // 宋 普觀述
                "X0788", new BookInfo("掌珍論疏", null), //
                "X0790", new BookInfo("法華經論述記", new String[]{"唐"}), // 唐
                "X0791", new BookInfo("大智度論疏", new String[]{"南北朝"}, "慧影"), // 南北朝 慧影抄撰
                "X0794", new BookInfo("瑜伽論劫章頌", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "X0796", new BookInfo("雜集論述記", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "X0797", new BookInfo("中邊分別論疏", new String[]{"新羅"}, "元曉"), // 新羅 元曉撰
                "X0799", new BookInfo("百法論顯幽鈔", new String[]{"宋"}, "從芳"), // 宋 從芳述
                "X0802", new BookInfo("百法明門論論義", new String[]{"明"}, "德清"), // 明 德清述
                "X0803", new BookInfo("百法明門論纂", new String[]{"明"}, "廣益"), // 明 廣益纂釋
                "X0804", new BookInfo("百法明門論贅言", new String[]{"唐", "明"}, "窺基", "明昱"), // 唐 窺基解　明 明昱贅言
                "X0805", new BookInfo("百法明門論直解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0806", new BookInfo("成唯識論料簡", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "X0808", new BookInfo("成唯識論別抄", new String[]{"唐"}, "窺基"), // 唐 窺基撰
                "X0810", new BookInfo("成唯識論掌中樞要記", new String[]{"唐"}, "智周"), // 唐 智周述
                "X0812", new BookInfo("成唯識論了義燈記", new String[]{"唐"}, "智周"), // 唐 智周撰
                "X0814", new BookInfo("成唯識論義蘊", new String[]{"唐"}, "道邑"), // 唐 道邑撰
                "X0815", new BookInfo("成唯識論疏義演", new String[]{"唐"}, "如理"), // 唐 如理集
                "X0816", new BookInfo("成唯識論演秘釋", new String[]{"唐"}, "如理"), // 唐 如理撰
                "X0817", new BookInfo("註成唯識論", null), //
                "X0818", new BookInfo("成唯識論學記", new String[]{"新羅"}, "太賢"), // 新羅 太賢集
                "X0819", new BookInfo("成唯識論疏抄", new String[]{"唐"}, "靈泰"), // 唐 靈泰撰
                "X0820", new BookInfo("成唯識論俗詮", new String[]{"明"}, "明昱"), // 明 明昱俗詮
                "X0821", new BookInfo("成唯識論集解", new String[]{"明"}, "通潤"), // 明 通潤集解
                "X0822", new BookInfo("成唯識論證義", new String[]{"明"}, "王肯堂"), // 明 王肯堂證義
                "X0823", new BookInfo("成唯識論自攷", new String[]{"明"}, "大惠"), // 明 大惠錄
                "X0824", new BookInfo("成唯識論觀心法要", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0825", new BookInfo("成唯識論音響補遺科", new String[]{"清"}, "智素"), // 清 智素科
                "X0826", new BookInfo("成唯識論音響補遺", new String[]{"清"}, "智素"), // 清 智素補遺
                "X0827", new BookInfo("唯識三十論約意", new String[]{"明"}, "明昱"), // 明 明昱約意
                "X0828", new BookInfo("唯識三十論直解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0830", new BookInfo("觀所緣緣論會釋", new String[]{"明"}, "明昱"), // 明 明昱會釋
                "X0831", new BookInfo("觀所緣緣論直解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0832", new BookInfo("觀所緣緣論釋記", new String[]{"明"}, "明昱"), // 明 明昱錄記
                "X0833", new BookInfo("觀所緣緣論釋直解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0836", new BookInfo("俱舍論疏", new String[]{"唐"}, "神泰"), // 唐 神泰述
                "X0837", new BookInfo("俱舍論法宗原", new String[]{"唐"}, "普光"), // 唐 普光撰
                "X0838", new BookInfo("俱舍論頌疏序記", new String[]{"唐"}, "法盈"), // 唐 法盈修
                "X0839", new BookInfo("俱舍論頌疏義鈔", new String[]{"唐"}, "慧暉"), // 唐 慧暉述
                "X0841", new BookInfo("俱舍論頌疏記", new String[]{"唐"}, "遁麟"), // 唐 遁麟述
                "X0842", new BookInfo("俱舍論頌疏", null, "某補"), // 某補作
                "X0843", new BookInfo("順正理論述文記", new String[]{"唐"}, "元瑜"), // 唐 元瑜述
                "X0844", new BookInfo("異部宗輪論疏述記", new String[]{"唐"}, "窺基"), // 唐 窺基記
                "X0845", new BookInfo("遺教經論住法記", new String[]{"宋"}, "元照"), // 宋 元照述
                "X0846", new BookInfo("遺教經論記", new String[]{"宋"}, "觀復"), // 宋 觀復述
                "X0847", new BookInfo("因明入正理門論述記", new String[]{"唐"}, "神泰"), // 唐 神泰述
                "X0848", new BookInfo("因明入正理論疏", new String[]{"唐"}, "文軌"), // 唐 文軌述
                "X0852", new BookInfo("因明入正理論續疏", new String[]{"唐"}, "慧沼"), // 唐 慧沼述
                "X0853", new BookInfo("因明入正理論疏前記", new String[]{"唐"}, "智周"), // 唐 智周撰
                "X0854", new BookInfo("因明入正理論疏後記", new String[]{"唐"}, "智周"), // 唐 智周撰
                "X0855", new BookInfo("因明入正理論疏抄", new String[]{"唐"}, "智周"), // 唐 智周撰
                "X0856", new BookInfo("因明入正理論解", new String[]{"明"}, "真界"), // 明 真界集解
                "X0857", new BookInfo("因明入正理論集解", new String[]{"明"}, "王肯堂"), // 明 王肯堂集釋
                "X0858", new BookInfo("因明入正理論直疏", new String[]{"明"}, "明昱"), // 明 明昱疏
                "X0859", new BookInfo("因明入正理論直解", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0860", new BookInfo("判比量論", new String[]{"新羅"}, "元曉"), // 新羅 元曉述
                "X0861", new BookInfo("三支比量義鈔", new String[]{"唐", "宋", "明"}, "玄奘", "延壽", "明昱"), // 唐 玄奘立　宋 延壽造　明 明昱鈔
                "X0862", new BookInfo("真唯識量略解", new String[]{"明"}, "智旭"), // 明 智旭略解
                "X0866", new BookInfo("肇論疏", new String[]{"晉"}, "惠達"), // 晉 惠達撰
                "X0868", new BookInfo("肇論疏科", new String[]{"宋"}, "遵式"), // 宋 遵式排定
                "X0869", new BookInfo("夾科肇論序注", new String[]{"宋"}, "曉月"), // 宋 曉月注
                "X0870", new BookInfo("注肇論疏", new String[]{"宋"}, "遵式"), // 宋 遵式述
                "X0872", new BookInfo("肇論新疏游刃", new String[]{"宋"}, "文才"), // 宋 文才述
                "X0873", new BookInfo("肇論略註", new String[]{"明"}, "德清"), // 明 德清述
                "X0876", new BookInfo("三論略章", new String[]{"隋"}, "吉藏"), // 隋 吉藏撰
                "X0878", new BookInfo("物不遷正量證", new String[]{"明"}, "道衡"), // 明 道衡述
                "X0879", new BookInfo("物不遷正量論", new String[]{"明"}, "鎮澄"), // 明 鎮澄著
                "X0880", new BookInfo("物不遷論辯解", new String[]{"明"}, "真界"), // 明 真界解
                "X0882", new BookInfo("大乘法苑義林章補闕", new String[]{"唐"}, "慧沼"), // 唐 慧沼撰
                "X0883", new BookInfo("大乘法苑義林章決擇記", new String[]{"唐"}, "智周"), // 唐 智周撰
                "X0884", new BookInfo("表無表章栖翫記", new String[]{"宋"}, "守千"), // 宋 守千述
                "X0888", new BookInfo("唯識開蒙問答", new String[]{"元"}, "雲峯"), // 元 雲峯集
                "X0890", new BookInfo("八識規矩補註證義", new String[]{"明"}, "明昱"), // 明 明昱證義
                "X0891", new BookInfo("八識規矩略說", new String[]{"明"}, "正誨"), // 明 正誨略說
                "X0892", new BookInfo("八識規矩頌解", new String[]{"明"}, "真可"), // 明 真可述
                "X0893", new BookInfo("八識規矩通說", new String[]{"明"}, "德清"), // 明 德清述
                "X0894", new BookInfo("八識規矩纂釋", new String[]{"明"}, "廣益"), // 明 廣益纂釋
                "X0895", new BookInfo("八識規矩直解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0896", new BookInfo("八識規矩淺說", new String[]{"清"}, "行舟"), // 清 行舟說
                "X0897", new BookInfo("八識規矩頌注", new String[]{"清"}, "行舟"), // 清 行舟註
                "X0898", new BookInfo("八識規矩論義", new String[]{"清"}, "性起", "善漳"), // 清 性起論釋　善漳等錄
                "X0899", new BookInfo("相宗八要", new String[]{"明"}, "洪恩"), // 明 洪恩輯
                "X0900", new BookInfo("相宗八要解", new String[]{"明"}, "明昱"), // 明 明昱著
                "X0901", new BookInfo("相宗八要直解", new String[]{"明"}, "智旭"), // 明 智旭解
                "X0902", new BookInfo("一乘佛性究竟論", new String[]{"唐"}, "法寶"), // 唐 法寶述
                "X0903", new BookInfo("隨自意三昧", new String[]{"隋"}, "慧思"), // 隋 慧思撰
                "X0904", new BookInfo("大乘止觀法門宗圓記", new String[]{"宋"}, "了然"), // 宋 了然述
                "X0905", new BookInfo("大乘止觀法門釋要", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0907", new BookInfo("禪門章", new String[]{"隋"}, "智顗"), // 隋 智顗說
                "X0908", new BookInfo("禪門要略", new String[]{"隋"}, "智顗"), // 隋 智顗出
                "X0909", new BookInfo("三觀義", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "X0911", new BookInfo("觀心食法", new String[]{"隋"}, "智顗"), // 隋 智顗述
                "X0912", new BookInfo("觀心誦經法記", new String[]{"隋", "唐"}, "智顗", "湛然"), // 隋 智顗說　唐 湛然述
                "X0913", new BookInfo("天台智者大師發願文", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "X0914", new BookInfo("普賢菩薩發願文", new String[]{"隋"}, "智顗"), // 隋 智顗撰
                "X0915", new BookInfo("刪定止觀", new String[]{"唐"}, "梁肅"), // 唐 梁肅述
                "X0916", new BookInfo("天台智者大師傳論", new String[]{"唐"}, "梁肅"), // 唐 梁肅述
                "X0917", new BookInfo("止觀科節", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "X0918", new BookInfo("止觀記中異義", new String[]{"唐"}, "道邃", "乾淑"), // 唐 道邃說　乾淑集
                "X0919", new BookInfo("止觀輔行搜要記", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "X0920", new BookInfo("止觀輔行助覽", new String[]{"宋"}, "有嚴"), // 宋 有嚴注
                "X0921", new BookInfo("摩訶止觀義例纂要", new String[]{"宋"}, "從義"), // 宋 從義撰
                "X0922", new BookInfo("摩訶止觀義例科", new String[]{"宋"}, "從義"), // 宋 從義排
                "X0923", new BookInfo("摩訶止觀義例隨釋", new String[]{"宋"}, "處元"), // 宋 處元述
                "X0924", new BookInfo("摩訶止觀貫義科", new String[]{"明", "清"}, "天溪", "靈耀"), // 明 天溪說　清 靈耀補定
                "X0925", new BookInfo("十不二門義", new String[]{"唐"}, "道邃"), // 唐 道邃錄出
                "X0926", new BookInfo("法華十妙不二門示珠指", new String[]{"宋"}, "源清"), // 宋 源清述
                "X0927", new BookInfo("註法華本迹十不二門", new String[]{"宋"}, "宗翌"), // 宋 宗翌述
                "X0928", new BookInfo("十不二門文心解", new String[]{"宋"}, "仁岳"), // 宋 仁岳述
                "X0929", new BookInfo("法華玄記十不二門顯妙", new String[]{"宋"}, "處謙"), // 宋 處謙述
                "X0930", new BookInfo("十不二門樞要", new String[]{"宋"}, "了然"), // 宋 了然述
                "X0931", new BookInfo("十不二門指要鈔詳解", new String[]{"宋", "明"}, "可度", "正謐"), // 宋 可度詳解　明 正謐分會
                "X0932", new BookInfo("金剛錍論私記", new String[]{"唐", "日本"}, "明曠", "辯才"), // 唐 明曠記　日本 辯才會
                "X0933", new BookInfo("金剛錍科", new String[]{"宋"}, "淨岳"), // 宋 仁岳撰
                "X0934", new BookInfo("金剛錍科", new String[]{"宋"}, "智圓"), // 宋 智圓集
                "X0935", new BookInfo("金剛錍顯性錄", new String[]{"宋"}, "智圓"), // 宋 智圓集
                "X0936", new BookInfo("金剛錍論義解", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0937", new BookInfo("金剛錍論釋文", new String[]{"宋", "明"}, "時舉", "海眼"), // 宋 時舉釋　明 海眼會
                "X0938", new BookInfo("始終心要注", new String[]{"宋"}, "從義"), // 宋 從義注
                "X0939", new BookInfo("法華五百問論", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "X0940", new BookInfo("學天台宗法門大意", new String[]{"唐"}, "行滿"), // 唐 行滿述
                "X0941", new BookInfo("六即義", new String[]{"唐"}, "行滿"), // 唐 行滿述
                "X0942", new BookInfo("天台宗未決（附釋疑）", new String[]{"日本", "唐"}, "最澄", "圓澄", "義真", "光定", "德圓", "道邃", "廣修", "維蠲", "宗頴"), // 日本 最澄．圓澄．義真．光定．德圓 問　唐 道邃．廣修．維蠲．宗頴 答
                "X0943", new BookInfo("法華龍女成佛權實義", new String[]{"宋"}, "源清"), // 宋 源清述
                "X0944", new BookInfo("寶雲振祖集", new String[]{"宋"}, "宗曉"), // 宋 宗曉編
                "X0946", new BookInfo("螺溪振祖集", new String[]{"宋"}, "元悟"), // 宋 元悟編
                "X0948", new BookInfo("四明仁岳異說叢書", new String[]{"宋"}, "繼忠"), // 宋 繼忠集
                "X0949", new BookInfo("閑居編", new String[]{"宋"}, "智圓"), // 宋 智圓著
                "X0950", new BookInfo("金園集", new String[]{"宋"}, "遵式", "慧觀"), // 宋 遵式述　慧觀重編
                "X0951", new BookInfo("天竺別集", new String[]{"宋"}, "遵式", "慧觀"), // 宋 遵式述　慧觀重編
                "X0952", new BookInfo("重編天台諸文類集", new String[]{"宋"}, "如吉"), // 宋 如吉編
                "X0953", new BookInfo("別傳心法議", new String[]{"宋"}, "戒珠"), // 宋 戒珠撰
                "X0954", new BookInfo("三千有門頌略解", new String[]{"明"}, "真覺"), // 明 真覺略解
                "X0955", new BookInfo("復宗集", new String[]{"宋"}, "與咸"), // 宋 與咸述
                "X0956", new BookInfo("山家義苑", new String[]{"宋"}, "可觀", "智增"), // 宋 可觀述　智增證
                "X0957", new BookInfo("竹菴艸錄", new String[]{"宋"}, "可觀"), // 宋 可觀撰
                "X0958", new BookInfo("圓頓宗眼", new String[]{"宋"}, "法登"), // 宋 法登述
                "X0959", new BookInfo("議中興教觀", new String[]{"宋"}, "法登"), // 宋 法登述
                "X0960", new BookInfo("三教出興頌註", new String[]{"宋"}, "宗曉"), // 宋 宗曉注
                "X0961", new BookInfo("施食通覽", new String[]{"宋"}, "宗曉"), // 宋 宗曉編
                "X0962", new BookInfo("不可剎那無此君", new String[]{"宋"}, "義銛"), // 宋 義銛述
                "X0963", new BookInfo("北峯教義", new String[]{"宋"}, "宗印"), // 宋 宗印撰
                "X0964", new BookInfo("台宗十類因革論", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0965", new BookInfo("山家緒餘集", new String[]{"宋"}, "善月"), // 宋 善月述
                "X0966", new BookInfo("台宗精英集", new String[]{"宋"}, "普容"), // 宋 普容集
                "X0967", new BookInfo("教觀撮要論", new String[]{"宋"}), // 宋
                "X0968", new BookInfo("增修教苑清規", new String[]{"元"}, "自慶"), // 元 自慶編述
                "X0969", new BookInfo("天台傳佛心印記註", new String[]{"明"}, "傳燈"), // 明 傳燈註
                "X0970", new BookInfo("性善惡論", new String[]{"明"}, "傳燈"), // 明 傳燈註
                "X0971", new BookInfo("書", new String[]{"明"}, "克勤"), // 明 克勤著
                "X0972", new BookInfo("法界安立圖", new String[]{"明"}, "仁潮"), // 明 仁潮錄
                "X0974", new BookInfo("教觀綱宗釋義", new String[]{"明"}, "智旭"), // 明 智旭述
                "X0975", new BookInfo("隨緣集", new String[]{"清"}, "靈耀"), // 清 靈耀著
                "X0976", new BookInfo("四教儀集解", new String[]{"宋"}, "從義"), // 宋 從義撰
                "X0977", new BookInfo("四教儀備釋", new String[]{"元"}, "元粹"), // 元 元粹述
                "X0978", new BookInfo("四教儀集註科", new String[]{"元"}, "蒙潤"), // 元 蒙潤排定
                "X0979", new BookInfo("四教儀集註節義", new String[]{"清"}, "靈耀"), // 清 靈耀節
                "X0980", new BookInfo("四教儀註彙補輔宏記", new String[]{"清"}, "性權"), // 清 性權記
                "X0985", new BookInfo("華嚴融會一乘義章明宗記", new String[]{"宋"}, "師會"), // 宋 師會述
                "X0991", new BookInfo("華嚴經普賢觀行法門", new String[]{"唐"}, "法藏"), // 唐 法藏撰
                "X0993", new BookInfo("華嚴還源觀科", new String[]{"宋"}, "淨源"), // 宋 淨源刊正
                "X0994", new BookInfo("華嚴妄盡還源觀疏鈔補解", new String[]{"宋"}, "淨源"), // 宋 淨源述
                "X0995", new BookInfo("華嚴一乘教義分齊章義苑疏", new String[]{"宋"}, "道亭"), // 宋 道亭述
                "X0996", new BookInfo("華嚴一乘教義分齊章焚薪", new String[]{"宋"}, "師會"), // 宋 師會錄
                "X0997", new BookInfo("華嚴一乘教義分齊章科", new String[]{"宋"}, "師會"), // 宋 師會述
                "X0998", new BookInfo("華嚴一乘教義分齊章復古記", new String[]{"宋"}, "師會", "善熹"), // 宋 師會．善熹述
                "X0999", new BookInfo("五教章集成記", new String[]{"宋"}, "希迪"), // 宋 希迪述
                "X1000", new BookInfo("評復古記", new String[]{"宋"}, "希迪"), // 宋 希迪錄
                "X1004", new BookInfo("五蘊觀", new String[]{"唐"}, "澄觀"), // 唐 澄觀述
                "X1005", new BookInfo("華嚴心要法門註", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "X1007", new BookInfo("註華嚴法界觀科文", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "X1008", new BookInfo("註華嚴法界觀科文", new String[]{"唐"}, "宗豫"), // 唐 宗豫述
                "X1010", new BookInfo("勸發菩提心文", new String[]{"唐"}, "裴休"), // 唐 裴休述
                "X1013", new BookInfo("華嚴法相槃節", new String[]{"宋"}, "道通"), // 宋 道通述
                "X1014", new BookInfo("法界觀披雲集", new String[]{"宋"}, "道通"), // 宋 道通述
                "X1015", new BookInfo("圓宗文類", new String[]{"高麗"}, "義天"), // 高麗 義天集
                "X1016", new BookInfo("註華嚴同教一乘策", new String[]{"宋"}, "師會", "希迪"), // 宋 師會述　希迪註
                "X1017", new BookInfo("註同教問答", new String[]{"宋"}, "師會", "善熹"), // 宋 師會述　善熹註
                "X1018", new BookInfo("評金剛錍", new String[]{"宋"}, "善熹"), // 宋 善熹述
                "X1019", new BookInfo("辨非集", new String[]{"宋"}, "善熹"), // 宋 善熹述
                "X1020", new BookInfo("斥謬", new String[]{"宋"}, "善熹"), // 宋 善熹書
                "X1022", new BookInfo("五相智識頌", new String[]{"宋"}, "佚名"), // 宋 佚名撰
                "X1023", new BookInfo("華嚴大意", new String[]{"明"}, "善堅"), // 明 善堅撰
                "X1024", new BookInfo("賢首五教儀", new String[]{"清"}, "續法"), // 清 續法集錄
                "X1025", new BookInfo("賢首五教儀開蒙", new String[]{"清"}, "續法"), // 清 續法集
                "X1026", new BookInfo("賢首五教斷證三覺揀濫圖", new String[]{"清"}, "續法"), // 清 續法集
                "X1027", new BookInfo("法界宗蓮花章", new String[]{"清"}, "續法"), // 清 續法集
                "X1028", new BookInfo("華嚴鏡燈章", new String[]{"清"}, "續法"), // 清 續法集
                "X1029", new BookInfo("一乘決疑論", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X1030", new BookInfo("華嚴念佛三昧論", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X1031", new BookInfo("華嚴原人論發微錄", new String[]{"宋"}, "淨源"), // 宋 淨源述
                "X1032", new BookInfo("華嚴原人論解", new String[]{"元"}, "圓覺"), // 元 圓覺解
                "X1033", new BookInfo("華嚴原人論合解", new String[]{"元", "明"}, "圓覺", "楊嘉祚"), // 元 圓覺解　明 楊嘉祚刪合
                "X1043", new BookInfo("看命一掌金", new String[]{"唐"}, "一行"), // 唐 一行著
                "X1048", new BookInfo("持咒仙人飛鉢儀軌", new String[]{"唐"}, "不空"), // 唐 不空拔出
                "X1052", new BookInfo("成就夢想法", new String[]{"唐"}, "不空"), // 唐 不空述
                "X1054", new BookInfo("多利心菩薩念誦法", new String[]{"南天竺"}, "跋折羅菩提"), // 南天竺 跋折羅菩提集撰
                "X1069", new BookInfo("釋迦牟尼如來拔除苦惱現大神變飛空大鉢法", new String[]{"唐"}, "般若"), // 唐 般若傳
                "X1073", new BookInfo("金胎兩界師資相承", new String[]{"唐"}, "海雲"), // 唐 海雲集
                "X1074", new BookInfo("胎金兩界血脈", new String[]{"唐"}, "造玄"), // 唐 造玄增補
                "X1077", new BookInfo("準提淨業", new String[]{"明"}, "謝于教"), // 明 謝于教著
                "X1078", new BookInfo("準提心要", new String[]{"明"}, "施堯挺"), // 明 施堯挺撰
                "X1079", new BookInfo("持誦準提真言法要", new String[]{"清"}, "弘贊"), // 清 弘贊輯
                "X1080", new BookInfo("瑜伽集要施食儀軌", new String[]{"明"}, "袾宏"), // 明 袾宏重訂
                "X1081", new BookInfo("修設瑜伽集要施食壇儀", new String[]{"明"}, "袾宏"), // 明 袾宏補註
                "X1082", new BookInfo("於密滲施食旨槩", new String[]{"清"}, "法藏"), // 清 法藏著
                "X1083", new BookInfo("修習瑜伽集要施食壇儀", new String[]{"清"}, "法藏"), // 清 法藏著
                "X1084", new BookInfo("瑜伽燄口註集纂要儀軌", new String[]{"清"}, "寂暹"), // 清 寂暹纂
                "X1085", new BookInfo("受菩薩戒儀", new String[]{"陳"}, "慧思"), // 陳 慧思撰
                "X1086", new BookInfo("授菩薩戒儀", new String[]{"唐"}, "湛然"), // 唐 湛然述
                "X1087", new BookInfo("略授三歸五八戒並菩薩戒", new String[]{"唐"}, "澄照"), // 唐 澄照讚
                "X1088", new BookInfo("受菩薩戒法", new String[]{"宋"}, "延壽"), // 宋 延壽撰
                "X1094", new BookInfo("釋門歸敬儀護法記", new String[]{"宋"}, "彥起"), // 宋 彥起撰
                "X1095", new BookInfo("釋門歸敬儀通真記", new String[]{"宋", "日本"}, "了然", "慧光"), // 宋 了然述　日本 慧光合
                "X1096", new BookInfo("淨心誡觀法發真鈔", new String[]{"宋", "日本"}, "允堪", "慧光"), // 宋 允堪述　日本 慧光合
                "X1097", new BookInfo("釋門章服儀應法記", new String[]{"宋", "日本"}, "元照", "良信"), // 宋 元照述　日本 良信合
                "X1098", new BookInfo("衣鉢名義章", new String[]{"宋"}, "允堪"), // 宋 允堪述
                "X1099", new BookInfo("新受戒比丘六念五觀法", new String[]{"宋"}, "允堪"), // 宋 允堪撰錄
                "X1100", new BookInfo("道具賦", new String[]{"宋"}, "元照"), // 宋 元照撰
                "X1102", new BookInfo("佛制六物圖辯訛", new String[]{"宋"}, "妙生"), // 宋 妙生述
                "X1103", new BookInfo("三衣顯正圖", new String[]{"宋"}, "妙生"), // 宋 妙生述
                "X1104", new BookInfo("芝園遺編", new String[]{"宋"}, "元照", "道詢"), // 宋 元照錄　道詢集
                "X1105", new BookInfo("芝園集", new String[]{"宋"}, "元照"), // 宋 元照作
                "X1106", new BookInfo("補續芝園集", new String[]{"宋"}, "元照"), // 宋 元照撰
                "X1107", new BookInfo("律宗新學名句", new String[]{"宋"}, "惟顯"), // 宋 惟顯編
                "X1108", new BookInfo("律宗問答", new String[]{"日本", "宋"}, "俊芿", "了然", "智瑞", "妙音"), // 日本 俊艿問　宋 了然．智瑞．妙音答
                "X1109", new BookInfo("終南家業", new String[]{"宋"}, "守一", "行枝"), // 宋 守一述　行枝編
                "X1110", new BookInfo("律宗會元", new String[]{"宋"}, "守一"), // 宋 守一集
                "X1111", new BookInfo("蓬折直辨", new String[]{"宋"}, "妙蓮"), // 宋 妙蓮撰
                "X1112", new BookInfo("蓬折箴", new String[]{"宋"}, "妙蓮"), // 宋 妙蓮撰
                "X1113", new BookInfo("律苑事規", new String[]{"元"}, "省悟", "嗣良"), // 元 省悟編述　嗣良參訂
                "X1114", new BookInfo("毗尼日用錄", new String[]{"明"}, "性祇"), // 明 性祇述
                "X1115", new BookInfo("毗尼日用切要", new String[]{"清"}, "讀體"), // 清 讀體彙集
                "X1116", new BookInfo("毗尼日用切要香乳記", new String[]{"清"}, "書玉"), // 清 書玉箋記
                "X1117", new BookInfo("沙門日用", new String[]{"清"}, "弘贊"), // 清 弘贊編
                "X1118", new BookInfo("沙彌律儀要略增註", new String[]{"清"}, "弘贊"), // 清 弘贊註
                "X1119", new BookInfo("沙彌律儀要略述義", new String[]{"清"}, "書玉"), // 清 書玉科釋
                "X1120", new BookInfo("沙彌律儀毗尼日用合參", new String[]{"清"}, "戒顯", "濟岳"), // 清 戒顯訂閱　濟岳彙箋
                "X1121", new BookInfo("沙彌十戒威儀錄要", new String[]{"明"}, "智旭"), // 明 智旭重輯
                "X1122", new BookInfo("沙彌尼律儀要略", new String[]{"清"}, "讀體"), // 清 讀體輯集
                "X1123", new BookInfo("在家律要廣集", new String[]{"明", "清"}, "智旭", "儀潤", "陳熙願"), // 明 智旭集　清 儀潤．陳熙願增訂
                "X1124", new BookInfo("律要後集", new String[]{"明"}, "智旭"), // 明 智旭集
                "X1125", new BookInfo("律學發軔", new String[]{"明"}, "元賢"), // 明 元賢述
                "X1126", new BookInfo("弘戒法儀", new String[]{"明"}, "法藏"), // 明 法藏輯
                "X1127", new BookInfo("傳授三壇弘戒法儀", new String[]{"明", "清"}, "法藏", "超遠"), // 明 法藏撰集　清 超遠檢錄
                "X1128", new BookInfo("傳戒正範", new String[]{"清"}, "讀體"), // 清 讀體撰
                "X1129", new BookInfo("歸戒要集", new String[]{"清"}, "弘贊"), // 清 弘贊輯
                "X1130", new BookInfo("八關齋法", new String[]{"清"}, "弘贊"), // 清 弘贊輯
                "X1131", new BookInfo("比丘受戒錄", new String[]{"清"}, "弘贊"), // 清 弘贊述
                "X1132", new BookInfo("比丘尼受戒錄", new String[]{"清"}, "弘贊"), // 清 弘贊述
                "X1133", new BookInfo("沙彌學戒儀軌頌註", new String[]{"清"}, "弘贊"), // 清 弘贊述並註
                "X1134", new BookInfo("二部僧授戒儀式", new String[]{"清"}, "書玉"), // 清 書玉述
                "X1135", new BookInfo("羯磨儀式", new String[]{"清"}, "書玉"), // 清 書玉述
                "X1136", new BookInfo("經律戒相布薩軌儀", new String[]{"明"}, "如馨"), // 明 如馨纂要
                "X1137", new BookInfo("梵網經懺悔行法", new String[]{"明"}, "智旭"), // 明 智旭述
                "X1138", new BookInfo("戒殺四十八問", new String[]{"清"}, "周思仁"), // 清 周思仁述
                "X1139", new BookInfo("體仁要術", new String[]{"清"}, "彭紹升"), // 清 彭紹升著
                "X1145", new BookInfo("西方要決科註", null), //
                "X1149", new BookInfo("注十疑論", new String[]{"宋"}, "澄彧"), // 宋 澄彧註
                "X1154", new BookInfo("淨土指歸集", new String[]{"明"}, "大佑"), // 明 大佑集
                "X1155", new BookInfo("淨土簡要錄", new String[]{"明"}, "道衍"), // 明 道衍編
                "X1156", new BookInfo("歸元直指集", new String[]{"明"}, "宗本"), // 明 宗本集
                "X1157", new BookInfo("淨土決", new String[]{"明"}, "李贄"), // 明 李贄集
                "X1158", new BookInfo("答四十八問", new String[]{"明"}, "袾宏"), // 明 袾宏著
                "X1160", new BookInfo("西方願文", new String[]{"明"}, "袾宏"), // 明 袾宏著並釋
                "X1161", new BookInfo("西方發願文註", new String[]{"清"}, "實賢"), // 清 實賢註
                "X1162", new BookInfo("淨土資糧全集", new String[]{"明"}, "袾宏", "莊廣還"), // 明 袾宏校正　莊廣還輯
                "X1163", new BookInfo("西方直指", new String[]{"明"}, "一念"), // 明 一念編
                "X1164", new BookInfo("淨土十要", new String[]{"明"}, "成時"), // 明 成時(評點節要)
                "X1165", new BookInfo("西方合論標註", new String[]{"明"}, "明教"), // 明 明教標註
                "X1166", new BookInfo("淨慈要語", new String[]{"明"}, "元賢"), // 明 元賢述
                "X1167", new BookInfo("淨土生無生論註", new String[]{"明"}, "正寂"), // 明 正寂註
                "X1168", new BookInfo("淨土生無生論親聞記", new String[]{"明"}, "受教"), // 明 受教記
                "X1169", new BookInfo("淨土生無生論會集", new String[]{"清"}, "達默"), // 清 達默集
                "X1170", new BookInfo("雲棲淨土彙語", new String[]{"清"}, "虞執西", "嚴培西"), // 清 虞執西．嚴培西同錄
                "X1171", new BookInfo("淨土旨訣", new String[]{"清"}, "道霑"), // 清 道霑撰
                "X1172", new BookInfo("淨土晨鐘", new String[]{"清"}, "周克復"), // 清 周克復纂
                "X1173", new BookInfo("西歸直指", new String[]{"清"}, "周夢顏"), // 清 周夢顏彙集
                "X1174", new BookInfo("淨土警語", new String[]{"清"}, "行策"), // 清 行策著
                "X1175", new BookInfo("起一心精進念佛七期規式", new String[]{"清"}, "行策"), // 清 行策定
                "X1176", new BookInfo("淨土全書", new String[]{"清"}, "俞行敏"), // 清 俞行敏重輯
                "X1177", new BookInfo("角虎集", new String[]{"清"}, "濟能"), // 清 濟能纂輯
                "X1178", new BookInfo("東海若解", new String[]{"清"}, "實賢"), // 清 實賢解
                "X1179", new BookInfo("省菴法師語錄", new String[]{"清"}, "彭際清"), // 清 彭際清重訂
                "X1180", new BookInfo("重訂西方公據", new String[]{"清"}, "彭際清"), // 清 彭際清集
                "X1181", new BookInfo("念佛警策", new String[]{"清"}, "彭際清"), // 清 彭際清纂
                "X1182", new BookInfo("徹悟禪師語錄", new String[]{"清"}, "了亮"), // 清 了亮等集
                "X1183", new BookInfo("淨業知津", new String[]{"清"}, "悟開"), // 清 悟開述
                "X1184", new BookInfo("念佛百問", new String[]{"清"}, "悟開"), // 清 悟開著
                "X1185", new BookInfo("徑中徑又徑", new String[]{"清"}, "張師誠"), // 清 張師誠著
                "X1186", new BookInfo("勸修淨土切要", new String[]{"清"}, "真益願"), // 清 真益願纂述
                "X1187", new BookInfo("淨土隨學", new String[]{"清"}, "古崑"), // 清 古崑編
                "X1188", new BookInfo("淨土必求", new String[]{"清"}, "古崑"), // 清 古崑集
                "X1189", new BookInfo("淨土承恩集", new String[]{"清"}, "芳慧"), // 清 芳慧編
                "X1190", new BookInfo("念佛三昧", null, "金聖歎"), // 瑞聖歎註
                "X1191", new BookInfo("西方確指", new String[]{"清"}, "覺明菩薩", "常攝"), // 清 覺明菩薩說　常攝集
                "X1192", new BookInfo("清珠集", new String[]{"清"}, "治兆"), // 清 治兆輯
                "X1193", new BookInfo("蓮邦消息", new String[]{"清"}, "妙空子"), // 清 妙空子述
                "X1194", new BookInfo("淨土極信錄", new String[]{"清"}, "戒香"), // 清 戒香述
                "X1195", new BookInfo("念佛起緣彌陀觀偈直解", new String[]{"清"}, "張淵"), // 清 張淵述
                "X1196", new BookInfo("淨土證心集", new String[]{"清"}, "卍蓮"), // 清 卍蓮述
                "X1197", new BookInfo("蓮宗必讀", new String[]{"清"}, "古崑"), // 清 古崑集
                "X1198", new BookInfo("淨土神珠", new String[]{"清"}, "古崑"), // 清 古崑集
                "X1199", new BookInfo("淨業痛策", new String[]{"清"}, "照瑩"), // 清 照瑩集
                "X1200", new BookInfo("時時好念佛", new String[]{"清"}, "果能"), // 清 果能述
                "X1201", new BookInfo("啟信雜說", new String[]{"清"}, "周思仁"), // 清 周思仁輯
                "X1202", new BookInfo("淨土紺珠", new String[]{"清"}, "德真"), // 清 德真輯
                "X1203", new BookInfo("修西輯要", new String[]{"清"}, "信菴"), // 清 信菴輯
                "X1204", new BookInfo("蓮修起信錄", new String[]{"清"}, "程兆鸞"), // 清 程兆鸞錄存
                "X1205", new BookInfo("報恩論", new String[]{"清"}, "沈善登"), // 清 沈善登述
                "X1206", new BookInfo("持名四十八法", new String[]{"清"}, "鄭韋庵"), // 清 鄭韋庵述
                "X1207", new BookInfo("蓮邦詩選", new String[]{"明"}, "廣貴"), // 明 廣貴輯
                "X1208", new BookInfo("唯心集", new String[]{"清"}, "乘戒"), // 清 乘戒著
                "X1209", new BookInfo("影響集", new String[]{"清"}, "量海"), // 清 尼量海著
                "X1210", new BookInfo("二林唱和詩", new String[]{"清"}, "彭紹升"), // 清 彭紹升集
                "X1211", new BookInfo("觀河集節鈔", new String[]{"清"}, "彭紹升"), // 清 彭紹升著　弟子節鈔
                "X1212", new BookInfo("測海集節鈔", new String[]{"清"}, "彭紹升"), // 清 彭紹升著　弟子節鈔
                "X1213", new BookInfo("瓊樓吟稿節鈔", new String[]{"清"}, "陶善"), // 清 陶善著　弟子節鈔
                "X1214", new BookInfo("蓮修必讀", new String[]{"清"}, "觀如"), // 清 觀如輯
                "X1215", new BookInfo("普能嵩禪師淨土詩", new String[]{"清"}, "德潤"), // 清 德潤錄
                "X1216", new BookInfo("淨土救生船詩", new String[]{"清"}, "寬量"), // 清 寬量集
                "X1217", new BookInfo("菩提達磨大師略辨大乘入道四行觀", new String[]{"梁"}, "菩提達磨"), // 梁 菩提達磨說
                "X1218", new BookInfo("達磨大師血脉論", new String[]{"梁"}, "菩提達磨"), // 梁 菩提達磨述
                "X1219", new BookInfo("達磨大師悟性論", new String[]{"梁"}, "菩提達磨"), // 梁 菩提達磨述
                "X1220", new BookInfo("達磨大師破相論", new String[]{"梁"}, "菩提達磨"), // 梁 菩提達磨述
                "X1222", new BookInfo("修禪要訣", new String[]{"北天竺", "唐"}, "覺愛", "明恂", "慧智"), // 北天竺 覺愛略說　唐 明恂隨錄　慧智傳譯
                "X1223", new BookInfo("頓悟入道要門論", new String[]{"唐"}, "慧海"), // 唐 慧海撰
                "X1224", new BookInfo("諸方門人參問語錄", new String[]{"唐"}, "慧海"), // 唐 慧海撰
                "X1225", new BookInfo("中華傳心地禪門師資承襲圖", new String[]{"唐"}, "裴休", "宗密"), // 唐 裴休問　宗密答
                "X1226", new BookInfo("宗門十規論", new String[]{"唐"}, "文益"), // 唐 文益撰
                "X1229", new BookInfo("定慧相資歌", new String[]{"宋"}, "延壽"), // 宋 延壽撰
                "X1230", new BookInfo("警世", new String[]{"宋"}, "延壽"), // 宋 延壽撰
                "X1231", new BookInfo("心賦注", new String[]{"宋"}, "延壽"), // 宋 延壽述
                "X1232", new BookInfo("智覺禪師自行錄", new String[]{"宋"}, "文冲"), // 宋 文冲(重校編集)
                "X1233", new BookInfo("祇園正儀", new String[]{"宋"}, "道楷"), // 宋 道楷撰
                "X1234", new BookInfo("臨濟宗旨", new String[]{"宋"}, "慧洪"), // 宋 慧洪撰
                "X1235", new BookInfo("智證傳", new String[]{"宋"}, "慧洪", "覺慈"), // 宋 慧洪撰　覺慈編
                "X1236", new BookInfo("(重編)曹洞五位顯訣", new String[]{"宋"}, "慧霞", "廣輝"), // 宋 慧霞編　廣輝釋
                "X1237", new BookInfo("寶鏡三昧本義", new String[]{"清"}, "行策"), // 清 行策述
                "X1238", new BookInfo("寶鏡三昧原宗辨謬說", new String[]{"清"}, "淨訥"), // 清 淨訥述
                "X1239", new BookInfo("溈山警策註", new String[]{"宋"}, "守遂"), // 宋 守遂註
                "X1240", new BookInfo("溈山警策句釋記", new String[]{"明"}, "弘贊", "開詗"), // 明 弘贊註　開詗記
                "X1241", new BookInfo("證道歌註", new String[]{"宋"}, "彥琪"), // 宋 彥琪註
                "X1242", new BookInfo("永嘉禪宗集註", new String[]{"明"}, "傳燈"), // 明 傳燈重編並註
                "X1244", new BookInfo("百丈清規證義記", new String[]{"清"}, "儀潤"), // 清 儀潤證義
                "X1245", new BookInfo("(重雕補註)禪苑清規", new String[]{"宋"}, "宗賾"), // 宋 宗賾集
                "X1246", new BookInfo("入眾日用", new String[]{"宋"}, "宗壽"), // 宋 宗壽集
                "X1247", new BookInfo("入眾須知", null), //
                "X1248", new BookInfo("幻住庵清規", new String[]{"元"}, "明本"), // 元 明本著
                "X1249", new BookInfo("叢林校定清規總要", new String[]{"宋"}, "惟勉"), // 宋 惟勉編次
                "X1250", new BookInfo("禪林備用清規", new String[]{"元"}, "弌咸"), // 元 弋咸編
                "X1251", new BookInfo("叢林兩序須知", new String[]{"明"}, "通容"), // 明 通容述
                "X1252", new BookInfo("禪林疏語考證", new String[]{"明"}, "元賢"), // 明 元賢集
                "X1253", new BookInfo("初學記", new String[]{"元"}, "清覺", "道安"), // 元 清覺述　道安注
                "X1254", new BookInfo("正行集", new String[]{"元"}, "清覺"), // 元 清覺述
                "X1255", new BookInfo("禪家龜鑑", new String[]{"朝鮮"}, "退隱"), // 朝鮮 退隱述
                "X1256", new BookInfo("宗門玄鑑圖", new String[]{"明"}, "虗一"), // 明 虗一撰
                "X1257", new BookInfo("博山禪警語", new String[]{"明"}, "元來", "成正"), // 明 元來說　成正集
                "X1258", new BookInfo("禪宗直指", new String[]{"明"}, "石成金"), // 明 石成金著
                "X1259", new BookInfo("禪門鍛鍊說", new String[]{"明"}, "戒顯"), // 明 戒顯著
                "X1260", new BookInfo("列祖提綱錄", new String[]{"清"}, "行悅"), // 清 行悅集
                "X1261", new BookInfo("祖庭事苑", new String[]{"宋"}, "善卿"), // 宋 善卿編正
                "X1262", new BookInfo("禪林寶訓音義", new String[]{"明"}, "大建"), // 明 大建較
                "X1263", new BookInfo("禪林寶訓合註", new String[]{"清"}, "張文嘉", "張文憲"), // 清 張文嘉較定　張文憲參閱
                "X1264", new BookInfo("禪林寶訓拈頌", new String[]{"清"}, "行盛", "超記"), // 清 行盛著　超記錄
                "X1265", new BookInfo("禪林寶訓順硃", new String[]{"清"}, "德玉"), // 清 德玉順硃
                "X1266", new BookInfo("禪林寶訓筆說", new String[]{"清"}, "智祥"), // 清 智祥述
                "X1268", new BookInfo("叢林公論", new String[]{"宋"}, "惠彬"), // 宋 惠彬述
                "X1269", new BookInfo("十牛圖頌", new String[]{"宋"}, "師遠"), // 宋 師遠述
                "X1270", new BookInfo("十牛圖頌", new String[]{"明"}, "胡文煥"), // 明 胡文煥著
                "X1271", new BookInfo("十牛圖和頌", null), //
                "X1276", new BookInfo("禪門寶藏錄", new String[]{"高麗"}, "天頙"), // 高麗 天頙撰
                "X1277", new BookInfo("高峰龍泉院因師集賢語錄", new String[]{"元"}, "如瑛"), // 元 如瑛編
                "X1278", new BookInfo("禪宗雜毒海", new String[]{"清"}, "性音"), // 清 性音重編
                "X1279", new BookInfo("五宗原", new String[]{"明"}, "法藏"), // 明 法藏著
                "X1280", new BookInfo("闢妄救略說", new String[]{"明"}, "圓悟", "真啟"), // 明 圓悟著　真啟編
                "X1281", new BookInfo("御製揀魔辨異錄", new String[]{"清"}, "清世宗皇帝"), // 清 世宗皇帝製
                "X1282", new BookInfo("五家宗旨纂要", new String[]{"清"}, "性統"), // 清 性統編
                "X1283", new BookInfo("宗範", new String[]{"清"}, "錢伊庵"), // 清 錢伊庵編緝
                "X1285", new BookInfo("慨古錄", new String[]{"明"}, "圓澄"), // 明 圓澄著
                "X1286", new BookInfo("祖庭鉗鎚錄", new String[]{"明"}, "通容"), // 明 通容輯著
                "X1287", new BookInfo("千松筆記", new String[]{"明"}, "大韶"), // 明 大韶著
                "X1288", new BookInfo("萬法歸心錄", new String[]{"清"}, "超溟"), // 清 超溟著
                "X1289", new BookInfo("禪宗指掌", new String[]{"清"}, "行海"), // 清 行海述
                "X1290", new BookInfo("觀心玄樞", new String[]{"宋"}, "延壽"), // 宋 延壽撰
                "X1291", new BookInfo("證道歌頌", new String[]{"宋"}, "法泉"), // 宋 法泉繼頌
                "X1292", new BookInfo("證道歌註", new String[]{"宋"}, "知訥"), // 宋 知訥述
                "X1293", new BookInfo("證道歌註", new String[]{"元"}, "永盛", "德弘"), // 元 永盛述　德弘編
                "X1294", new BookInfo("溈山警策註", new String[]{"明"}, "大香"), // 明 大香註
                "X1295", new BookInfo("禪宗頌古聯珠通集", new String[]{"宋", "元"}, "法應", "普會"), // 宋 法應集　元 普會續集
                "X1296", new BookInfo("宗門拈古彙集", new String[]{"清"}, "淨符"), // 清 淨符彙集
                "X1297", new BookInfo("宗鑑法林", new String[]{"清"}, "集雲堂"), // 清 集雲堂編
                "X1298", new BookInfo("禪門諸祖師偈頌", new String[]{"宋"}, "子昇", "如祐"), // 宋 子昇錄　如祐錄
                "X1299", new BookInfo("禪林類聚", new String[]{"元"}, "道泰"), // 元 道泰集
                "X1301", new BookInfo("佛果擊節錄", new String[]{"宋"}, "重顯", "克勤"), // 宋 重顯拈古　克勤擊節
                "X1302", new BookInfo("焭絕老人天奇直註雪竇顯和尚頌古", new String[]{"明"}, "本瑞", "道霖", "性福"), // 明 本瑞直註　道霖．性福編集
                "X1303", new BookInfo("林泉老人評唱投子青和尚頌古空谷集", new String[]{"宋", "元"}, "義青", "從倫"), // 宋 義青頌古　元 從倫評唱
                "X1304", new BookInfo("林泉老人評唱丹霞淳禪師頌古虗堂集", new String[]{"宋", "元"}, "子淳", "從倫"), // 宋 子淳頌古　元 從倫評唱
                "X1306", new BookInfo("焭絕老人天奇直註天童覺和尚頌古", new String[]{"明"}, "本瑞", "性福"), // 明 本瑞直註　性福編集
                "X1307", new BookInfo("萬松老人評唱天童覺和尚拈古請益錄", new String[]{"宋", "元"}, "正覺", "行秀"), // 宋 正覺拈古　元 行秀評唱
                "X1308", new BookInfo("徑石滴乳集", new String[]{"清"}, "真在", "機雲"), // 清 真在編　機雲重續
                "X1309", new BookInfo("正法眼藏", new String[]{"宋"}, "宗杲"), // 宋 宗杲集並著語
                "X1310", new BookInfo("拈八方珠玉集", new String[]{"宋"}, "祖慶"), // 宋 祖慶重編
                "X1312", new BookInfo("通玄百問", new String[]{"元"}, "圓通", "行秀"), // 元 圓通設問　行秀仰答
                "X1313", new BookInfo("青州百問", new String[]{"元"}, "一辯", "覺和尚"), // 元 一辯問　覺答
                "X1314", new BookInfo("古尊宿語錄目錄", new String[]{"日本"}, "道忠"), // 日本 道忠編
                "X1315", new BookInfo("古尊宿語錄", new String[]{"宋"}, "賾藏主"), // 宋 賾藏主集
                "X1316", new BookInfo("古尊宿語要目錄", new String[]{"日本"}, "道忠"), // 日本 道忠編
                "X1317", new BookInfo("續古尊宿語要目錄", new String[]{"日本"}, "道忠"), // 日本 道忠編
                "X1318", new BookInfo("續古尊宿語要", new String[]{"宋"}, "師明"), // 宋 師明集
                "X1319", new BookInfo("御選語錄", new String[]{"清"}, "清世宗皇帝"), // 清 世宗皇帝御選
                "X1320", new BookInfo("四家語錄（序．引．跋）", null), //
                "X1321", new BookInfo("馬祖道一禪師廣錄（四家語錄卷一）", null), //
                "X1322", new BookInfo("百丈懷海禪師語錄（四家語錄卷二）", null), //
                "X1323", new BookInfo("百丈懷海禪師廣錄（四家語錄卷三）", null), //
                "X1326", new BookInfo("五家語錄（序）", new String[]{"明"}, "圓信", "郭凝之"), // 明 圓信．郭凝之 編集
                "X1333", new BookInfo("雪峰義存禪師語錄（真覺禪師語錄）", new String[]{"明"}, "林弘衍"), // 明 林弘衍編次
                "X1335", new BookInfo("善慧大士語錄", new String[]{"唐"}, "樓頴"), // 唐 樓頴錄
                "X1336", new BookInfo("龐居士語錄", new String[]{"唐"}, "于頔"), // 唐 于頔編集
                "X1338", new BookInfo("石霜楚圓禪師語錄", null, "慧南"), // (小師)慧南重編
                "X1339", new BookInfo("瑯琊慧覺禪師語錄（序）", null, "用孫"), // (參學)用孫序
                "X1340", new BookInfo("黃龍四家錄（序）", new String[]{"宋"}, "秀人錢密"), // 宋 秀人錢密序
                "X1342", new BookInfo("雲菴克文禪師語錄（敘．疏．附錄）", null), //
                "X1343", new BookInfo("寶覺祖心禪師語錄（黃龍四家錄第二）", null, "子和", "仲介"), // (侍者)子和錄　(門人)仲介重編
                "X1344", new BookInfo("死心悟新禪師語錄（黃龍四家錄第三）", null), //
                "X1345", new BookInfo("超宗慧方禪師語錄（黃龍四家錄第四）", null), //
                "X1346", new BookInfo("雪峰慧空禪師語錄", null, "慧弼"), // (嗣法)慧弼編
                "X1347", new BookInfo("長靈守卓禪師語錄", null, "介諶"), // (嗣法)介諶編
                "X1348", new BookInfo("雪菴從瑾禪師頌古", null), //
                "X1350", new BookInfo("保寧仁勇禪師語錄", null, "道勝", "圓淨"), // (參學門人)道勝．圓淨 錄
                "X1351", new BookInfo("白雲守端禪師語錄", null), //
                "X1352", new BookInfo("白雲守端禪師廣錄", null, "處凝", "智本", "智華", "法演", "海譚"), // (參學小師)處凝．智本．智華．法演 編集、海譚錄
                "X1353", new BookInfo("開福道寧禪師語錄", null, "善果"), // (嗣法小師)善果集
                "X1354", new BookInfo("月林師觀禪師語錄", null, "法寶", "法璹", "慶會", "法清", "有宗", "惟珪", "道果", "慧開", "德秀"), // (侍者)法寶．法璹．慶會．法清．有宗．惟珪．道果．慧開．德秀 編
                "X1355", new BookInfo("無門慧開禪師語錄", null, "普敬", "普通", "了心", "普禮", "法孜", "普巖", "普覺", "光祖", "一見"), // (侍者)普敬．普通．了心．普禮．法孜．普巖．普覺．光祖．一見 錄
                "X1356", new BookInfo("普菴印肅禪師語錄", null), //
                "X1357", new BookInfo("佛果克勤禪師心要", null, "子文"), // (嗣法)子文編
                "X1358", new BookInfo("虎丘紹隆禪師語錄", null, "嗣端"), // (參學)嗣端 等編
                "X1359", new BookInfo("應菴曇華禪師語錄", null, "守詮"), // (嗣法)守詮 等編
                "X1360", new BookInfo("瞎堂慧遠禪師廣錄", null, "齊己", "如本", "祖淳", "法慧"), // (參學)齊己．如本．祖淳．法慧 編
                "X1361", new BookInfo("濟顛道濟禪師語錄", new String[]{"宋"}, "沈孟柈"), // 宋 沈孟柈敘述
                "X1362", new BookInfo("普覺宗杲禪師語錄", null, "法宏", "道謙"), // (參學)法宏．道謙 編
                "X1363", new BookInfo("西山亮禪師語錄", null, "覺心", "志清"), // (侍者)覺心．志清 編
                "X1364", new BookInfo("率菴梵琮禪師語錄", null, "了見", "文郁", "本空"), // (小師)了見、(侍者)文郁．本空 編
                "X1365", new BookInfo("北磵居簡禪師語錄", null, "大觀"), // (參學)大觀編
                "X1366", new BookInfo("物初大觀禪師語錄", null, "德溥"), // (門人)德溥 等編校
                "X1367", new BookInfo("笑隱大訢禪師語錄", null, "延俊", "慧曇", "中孚", "崇裕"), // (門人)延俊．慧曇．中孚．崇裕 等編
                "X1368", new BookInfo("偃溪廣聞禪師語錄", null, "元清", "淨志", "普暉", "元偉", "光從", "道鑑", "道隆", "惟實", "妙高"), // (侍者門人)元清．淨志．普暉．元偉．光從．道鑑．道隆．惟實．妙高 編
                "X1369", new BookInfo("大川普濟禪師語錄", null, "元愷"), // (門人)元愷編
                "X1370", new BookInfo("淮海原肇禪師語錄", null, "實仁", "宗文", "法奇", "守愿", "行佑", "了元", "善之", "淨證", "法從", "紹熏", "普璋", "文煥", "淨伏", "慧行", "文謙", "正因", "法恩", "德紀", "可能", "持志", "覺孫", "惟康", "宗和", "如止", "有智", "慧雲", "若舟"), // (侍者門人)實仁．宗文．法奇．守愿．行佑．了元．善之．淨證．法從．紹熏．普璋．文煥．淨伏．慧行．文謙．正因．法恩．德紀．可能．持志．覺孫．惟康．宗和．如止．有智．慧雲．若舟 編
                "X1371", new BookInfo("介石智朋禪師語錄", null, "正賢", "宗坦", "延輝", "淨球", "智瑾", "志諶", "祖誾"), // (參學侍者)正賢．宗坦．延輝．淨球．智瑾．志諶．祖誾 編
                "X1372", new BookInfo("無文道燦禪師語錄", null, "惟康"), // (小師)惟康編
                "X1374", new BookInfo("龍源介清禪師語錄", null, "士洵", "德高", "懷珠"), // (侍者)士洵．德高．懷珠 編
                "X1375", new BookInfo("曹源道生禪師語錄", null, "道冲"), // (侍者)道冲編
                "X1376", new BookInfo("痴絕道冲禪師語錄", null, "智沂", "悟開", "行彌", "紹甄", "智圓", "元省", "元樞"), // (嗣法門人)智沂．悟開．行彌．紹甄．智圓．元省．元樞 編
                "X1377", new BookInfo("松源崇嶽禪師語錄", null, "善開", "光睦", "普巖", "師肇", "道巖", "了能"), // (參學)善開．光睦．普巖．師肇．道巖．了能 等錄
                "X1378", new BookInfo("無明慧性禪師語錄", null, "妙儼", "圓澄", "妙全", "道隆", "圓照", "法洪", "唯道"), // (侍者)妙儼．圓澄．妙全．道隆．圓照．法洪．唯道 編
                "X1379", new BookInfo("運菴普巖禪師語錄", null, "元靖", "智能", "惟衍"), // (侍者)元靖．智能．惟衍 編
                "X1381", new BookInfo("破菴祖先禪師語錄", null, "圓照"), // (參學)圓照等編
                "X1382", new BookInfo("無準師範禪師語錄", null, "宗會", "智折", "覺圓", "如海", "妙倫", "惟一", "了禪", "了心", "普明", "了南", "紹曇", "了覺", "師坦", "妙因", "至慧"), // (侍者)宗會．智折．覺圓．如海．妙倫．惟一．了禪．了心．普明．了南．紹曇．了覺．師坦．妙因．至慧 編
                "X1383", new BookInfo("無準和尚奏對語錄", null, "了南", "了垠"), // (侍者)了南．了垠 編
                "X1384", new BookInfo("絕岸可湘禪師語錄", null, "妙恩", "正從", "自永", "守靜", "慈證", "宗永"), // (嗣法門人)妙恩．正從．自永．守靜．慈證．宗永 等編
                "X1385", new BookInfo("樵隱悟逸禪師語錄", null, "正定"), // (侍者)正定編
                "X1386", new BookInfo("石田法薰禪師語錄", null, "了覺", "師坦"), // (門人)了覺．師坦 等編
                "X1387", new BookInfo("劍關子益禪師語錄", null, "善珙", "德修", "慧澄", "銳彰", "心寧", "慧恭"), // (侍者)善珙．德修．慧澄．銳彰．心寧．慧恭 編
                "X1388", new BookInfo("環溪惟一禪師語錄", null, "覺此"), // (參學)覺此編
                "X1389", new BookInfo("希叟紹曇禪師語錄", null, "自悟", "了舜", "妙恩", "普和", "惠洇", "希革", "彌紹", "道信", "宗壽", "道亨"), // (侍者)自悟．了舜．妙恩．普和．惠洇．希革．彌紹．道信．宗壽．道亨 編
                "X1390", new BookInfo("希叟紹曇禪師廣錄", null, "法澄", "了舜", "普和", "希革", "惠洇", "彌紹", "道亨", "宗壽"), // (侍者)法澄．了舜．普和．希革．惠洇．彌紹．道亨．宗壽 編
                "X1391", new BookInfo("西巖了慧禪師語錄", null, "修義", "景元", "宗清", "繼燖", "宗應"), // (門人侍者)修義．景元．宗清．繼燖．宗應 編
                "X1392", new BookInfo("月磵禪師語錄", null, "妙寅", "法嚴", "德圓", "覺靜", "永仁", "宗煥"), // (嗣法)妙寅、(侍者)法嚴．德圓．覺靜．永仁．宗煥 等編
                "X1393", new BookInfo("平石如砥禪師語錄", null, "文才", "子昶", "了因", "彌安", "元勗", "師楷", "文斌", "汝均", "處林", "雲岑"), // (嗣法門人)文才．子昶．了因．彌安．元勗．師楷．文斌．汝均．處林．雲岑 等編
                "X1394", new BookInfo("斷橋妙倫禪師語錄", null, "文寶", "善靖"), // (侍者)文寶．善靖 編
                "X1395", new BookInfo("方山文寶禪師語錄", null, "先覩", "祖燈", "機雲"), // (嗣法)先覩．祖燈 等錄　(法孫)機雲編
                "X1396", new BookInfo("無見先覩禪師語錄", null, "智度"), // (嗣法門人)智度等編
                "X1397", new BookInfo("雪巖祖欽禪師語錄", null, "昭如", "希陵"), // (嗣法門人)昭如．希陵 等編
                "X1398", new BookInfo("海印昭如禪師語錄", null, "行純", "道彰", "從心"), // (門人)行純．道彰．從心 集
                "X1399", new BookInfo("石屋清洪禪師語錄", null, "至柔"), // (參學門人)至柔等編
                "X1400", new BookInfo("高峰原妙禪師語錄", null, "參學門人"), // (參學門人)編
                "X1401", new BookInfo("高峰原妙禪師禪要", null, "持正", "洪喬祖"), // (侍者)持正錄　(參學)洪喬祖編
                "X1402", new BookInfo("天目明本禪師雜錄", null), //
                "X1403", new BookInfo("天如惟則禪師語錄", null, "善遇"), // (小師)善遇編
                "X1404", new BookInfo("兀菴普寧禪師語錄", null, "淨韻", "清澤", "道昭", "景用", "禪了"), // (侍者)淨韻．清澤．道昭．景用．禪了 編
                "X1405", new BookInfo("石溪心月禪師語錄", null, "住顯", "宗煥", "祖定", "宗茙", "光玉", "仁安", "應儼", "永珍", "祖森"), // (侍者)住顯．宗煥．祖定．宗茙．光玉．仁安．應儼．永珍．祖森 編
                "X1406", new BookInfo("石溪心月禪師雜錄", null), //
                "X1407", new BookInfo("虛舟普度禪師語錄", null, "淨伏", "行佑", "德珍", "瓊林"), // (嗣法)淨伏、(門人)行佑．德珍．瓊林 等編
                "X1408", new BookInfo("即休契了禪師拾遺集", new String[]{"日本"}, "及藏主"), // 日本 及藏主集錄
                "X1409", new BookInfo("月江正印禪師語錄", null, "居簡", "妙心", "大機", "慧忠", "可橖", "祖安", "具德", "宗滿", "自然", "慧觀", "壽椿", "德粹", "思敬", "良圭", "景行", "本真", "紹宗", "文闡", "寶生", "文藻", "自成"), // (門人)居簡．妙心．大機．慧忠．可橖．祖安．具德．宗滿．自然．慧觀．壽椿．德粹．思敬．良圭．景行．本真．紹宗．文闡．寶生．文藻．自成 編
                "X1410", new BookInfo("曇芳守忠禪師語錄", null, "繼祖"), // (嗣法)繼祖等編
                "X1411", new BookInfo("橫川行珙禪師語錄", null, "本光"), // (門人)本光等編
                "X1412", new BookInfo("古林清茂禪師語錄", null, "元浩", "清欲", "應槐"), // (小師)元浩．清欲．應槐 編
                "X1413", new BookInfo("古林清茂禪師拾遺偈頌", new String[]{"日本"}, "海壽"), // 日本 海壽編次
                "X1414", new BookInfo("了菴清欲禪師語錄", null, "一志", "元皓", "可興", "文康", "祖運", "志道", "祖杲", "得度", "文煥", "克明", "宗成", "宗胤", "起宗", "汝現", "元寶", "慧朗", "景毅", "大圓", "海壽", "祖灊"), // (參學)一志．元皓．可興．文康．祖運．志道．祖杲．得度．文煥．克明．宗成．宗胤．起宗．汝現．元寶．慧朗．景毅．大圓．海壽．祖灊 等編
                "X1415", new BookInfo("穆菴文康禪師語錄", null, "清逸", "智辯", "寶日"), // (嗣法參學)清逸．智辯．寶日 等編
                "X1416", new BookInfo("恕中無慍禪師語錄", null, "宗黼", "道瑄", "宗亘", "居頂", "惟寂", "宗寄", "慧浩", "清歲"), // (嗣法參學)宗黼．道瑄．宗亘．居頂．惟寂．宗寄．慧浩．清歲 等編
                "X1417", new BookInfo("了堂惟一禪師語錄", null, "宗義", "有端", "思齊", "思靜", "妙淨", "無我", "文暐", "雲澹", "思謙", "普莊", "宗遠", "思廉", "文度", "文朗"), // (門人)宗義．有端．思齊．思靜．妙淨．無我．文暐．雲澹．思謙．普莊．宗遠．思廉．文度．文朗 等編
                "X1418", new BookInfo("呆菴普莊禪師語錄", null, "慧啟", "智粵", "智勝", "德琇", "曇頓", "道哲"), // (門人)慧啟．智粵．智勝．德琇．曇頓．道哲 等編
                "X1419", new BookInfo("元叟行端禪師語錄", null, "法林", "曇噩", "祖銘", "梵琦"), // (門人)法林．曇噩．祖銘．梵琦 等編
                "X1420", new BookInfo("楚石梵琦禪師語錄", null, "祖光", "文玹", "曇紹", "祖灊", "景瓛", "良彥", "應訢", "明遠", "胤丘", "文晟", "正隆", "善成", "文斌", "中端", "正參"), // (門人)祖光．文玹．曇紹．祖灊．景瓛．良彥．應訢．明遠．胤丘．文晟．正隆．善成．文斌．中端．正參 等編
                "X1421", new BookInfo("愚菴智及禪師語錄", null, "觀通", "溥震", "正除", "希顏", "忻悟", "寶盈", "至寶", "慧鏡", "護位", "道彝"), // (門人)觀通．溥震．正除．希顏．忻悟．寶盈．至寶．慧鏡．護位．道彝 等編
                "X1422", new BookInfo("南石文琇禪師語錄", null, "宗謐", "妙門", "復初", "廷璨", "良玓"), // (門人)宗謐．妙門．復初．廷璨．良玓 等編
                "X1423", new BookInfo("投子義青禪師語錄", null, "自覺"), // (傳法)自覺重編
                "X1424", new BookInfo("投子義青禪師語錄", null, "道楷"), // (嗣法)道楷編
                "X1425", new BookInfo("丹霞子淳禪師語錄", null, "慶預"), // (嗣法小師)慶預校勘
                "X1426", new BookInfo("真歇清了禪師語錄", null, "德初", "義初"), // (侍者)德初．義初 等編
                "X1428", new BookInfo("淨慈慧暉禪師語錄", null, "明總", "了廣"), // (弟子)明總下語寄言、了廣編
                "X1431", new BookInfo("雲外雲岫禪師語錄", null, "士慘"), // (小師)士慘編
                "X1432", new BookInfo("無明慧經禪師語錄", null, "元賢"), // (嗣法)元賢重編
                "X1433", new BookInfo("晦臺元鏡禪師語錄", null, "道盛"), // (嗣法)道盛集
                "X1434", new BookInfo("見如元謐禪師語錄", null, "道璞"), // (門人)道璞集
                "X1435", new BookInfo("無異元來禪師廣錄", null, "弘瀚", "弘裕"), // (法孫)弘瀚彙編、弘裕同集
                "X1436", new BookInfo("博山無異大禪語錄集要", null, "成正"), // (首座)成正錄
                "X1437", new BookInfo("永覺元賢禪師廣錄", null, "道霈"), // (嗣法)道霈重編
                "X1438", new BookInfo("為霖道霈禪師秉拂語錄", null, "太靖"), // (書記)太靖錄
                "X1439", new BookInfo("為霖道霈禪師餐香錄", null, "太泉"), // (書記)太泉錄
                "X1440", new BookInfo("為霖道霈禪師還山錄", null, "興燈", "心亮", "法雲", "性朗"), // (侍者)興燈．心亮．法雲．性朗 錄
                "X1441", new BookInfo("為霖禪師雲山法會錄", null, "謝大材", "潘道靖", "黃大廣"), // (弟子)謝大材．潘道靖．黃大廣 同錄
                "X1442", new BookInfo("為霖禪師旅泊菴稿", null, "太泉", "等純", "興燈", "心亮", "淨煥"), // (弟子)太泉．等純．興燈．心亮．淨煥 錄
                "X1443", new BookInfo("宗寶道獨禪師語錄", null, "今釋"), // (法孫)今釋重編
                "X1444", new BookInfo("湛然圓澄禪師語錄", null, "明凡", "丁元公", "祁駿隹"), // (門人)明凡錄　丁元公．祁駿隹 編
                "X1445", new BookInfo("玄沙師備禪師廣錄", null, "智嚴"), // (參學)智嚴集
                "X1446", new BookInfo("玄沙師備禪師語錄", new String[]{"明"}, "林弘衍"), // 明 林弘衍編次
                "X1447", new BookInfo("薦福承古禪師語錄", null, "文智"), // (門人)文智編
                "X1448", new BookInfo("法昌倚遇禪師語錄", null, "宗密"), // (小師)宗密錄
                "X1449", new BookInfo("吳山淨端禪師語錄", null, "師皎"), // (法孫)師皎重編
                "X1450", new BookInfo("慧林宗本禪師別錄", null, "慧辯"), // (嗣法)慧辯錄
                "X1451", new BookInfo("慈受懷深禪師廣錄", null, "善清", "善隨", "宗先", "普紹"), // (侍者)善清．善隨．宗先．普紹 編
                "X1452", new BookInfo("紫柏尊者全集", new String[]{"明"}, "德清"), // 明 德清閱
                "X1453", new BookInfo("紫柏尊者別集", new String[]{"明"}, "錢謙益"), // 明 錢謙益纂閱
                "X1454", new BookInfo("雲谷和尚語錄", null, "宗敬", "道傑", "惟能", "宗㞧", "祖祿"), // (參學)宗敬．道傑．惟能．宗㞧．祖祿 編
                "X1455", new BookInfo("聖箭堂述古", new String[]{"清"}, "道霈"), // 清 道霈述
                "X1456", new BookInfo("憨山老人夢遊集", null, "福善", "通炯"), // (侍者)福善日錄 (門人)通炯編輯
                "X1457", new BookInfo("雲門麥浪懷禪師宗門設難", new String[]{"明"}, "許元釗"), // 明 許元釗錄
                "X1458", new BookInfo("宗門寶積錄（序．凡例．目錄）", new String[]{"清"}, "本晳"), // 清 本晳輯
                "X1464", new BookInfo("三時繫念佛事", new String[]{"宋"}, "延壽"), // 宋 延壽述
                "X1465", new BookInfo("三時繫念儀範", new String[]{"宋"}, "延壽"), // 宋 延壽述
                "X1466", new BookInfo("無量壽佛讚註", new String[]{"宋"}, "元照", "戒度"), // 宋 元照撰　戒度注
                "X1467", new BookInfo("禮念彌陀道場懺法", new String[]{"元"}, "王子成"), // 元 王子成集
                "X1468", new BookInfo("西歸行儀", new String[]{"清"}, "古崑"), // 清 古崑錄輯
                "X1469", new BookInfo("華嚴經海印道場九會請佛儀", null), //
                "X1470", new BookInfo("華嚴經海印道場懺儀", new String[]{"唐", "宋", "明"}, "一行慧覺", "普瑞", "讀徹", "木增", "正止"), // 唐 一行慧覺依經錄　宋 普瑞補註　明 讀徹參閱　明 木增訂正　明 正止治定
                "X1471", new BookInfo("華嚴清涼國師禮讚文", new String[]{"宋"}, "智肱"), // 宋 智肱述
                "X1472", new BookInfo("華嚴普賢行願修證儀", new String[]{"宋"}, "淨源"), // 宋 淨源集
                "X1473", new BookInfo("華嚴普賢行願修證儀", new String[]{"宋"}, "淨源"), // 宋 淨源集
                "X1474", new BookInfo("華嚴道場起止大略", new String[]{"明"}), // 明
                "X1475", new BookInfo("圓覺經道場修證儀", new String[]{"唐"}, "宗密"), // 唐 宗密述
                "X1476", new BookInfo("圓覺經道場略本修證儀", new String[]{"宋"}, "淨源"), // 宋 淨源錄
                "X1477", new BookInfo("首楞嚴壇場修證儀", new String[]{"宋"}, "淨源"), // 宋 淨源編敘
                "X1478", new BookInfo("依楞嚴究竟事懺", new String[]{"明"}, "禪修"), // 明 禪修述
                "X1479", new BookInfo("佛母孔雀尊經科式", new String[]{"明"}), // 明
                "X1480", new BookInfo("千手千眼大悲心咒行法", new String[]{"宋", "清"}, "知禮", "讀體"), // 宋 知禮始集　清 讀體重纂
                "X1481", new BookInfo("准提三昧行法", new String[]{"明"}, "受登"), // 明 受登集
                "X1482", new BookInfo("准提焚修悉地懺悔玄文", new String[]{"清"}, "夏道人"), // 清 夏道人集
                "X1483", new BookInfo("藥師三昧行法", new String[]{"明"}, "受登"), // 明 受登集
                "X1484", new BookInfo("慈悲藥師寶懺", new String[]{"清"}), // 清
                "X1485", new BookInfo("占察善惡業報經行法", new String[]{"明"}, "智旭"), // 明 智旭集
                "X1486", new BookInfo("讚禮地藏菩薩懺願儀", new String[]{"明"}, "智旭"), // 明 智旭述
                "X1487", new BookInfo("慈悲地藏菩薩懺法", new String[]{"清"}), // 清
                "X1488", new BookInfo("得遇龍華修證懺儀", new String[]{"明"}, "如惺"), // 明 如惺撰
                "X1489", new BookInfo("吳中石佛相好懺儀", new String[]{"明"}, "傳燈"), // 明 傳燈集
                "X1490", new BookInfo("舍利懺法", new String[]{"清"}, "繼僧"), // 清 繼僧著
                "X1491", new BookInfo("禮舍利塔儀式", new String[]{"清"}, "弘贊"), // 清 弘贊編
                "X1492", new BookInfo("禮佛儀式", new String[]{"清"}, "弘贊"), // 清 弘贊編
                "X1493", new BookInfo("供諸天科儀", new String[]{"清"}, "弘贊"), // 清 弘贊集
                "X1494", new BookInfo("金剛經科儀", new String[]{"清"}, "建基"), // 清 建基錄
                "X1495", new BookInfo("慈悲道場水懺法隨聞錄", new String[]{"清"}, "智證"), // 清 智證錄
                "X1496", new BookInfo("慈悲道場水懺法科註", new String[]{"清"}, "西宗"), // 清 西宗集註
                "X1497", new BookInfo("法界聖凡水陸勝會修齋儀軌", new String[]{"宋", "明"}, "志磐", "袾宏"), // 宋 志磐謹撰　明 袾宏重訂
                "X1498", new BookInfo("法界聖凡水陸大齋普利道場性相通論", new String[]{"清"}, "咫觀"), // 清 咫觀述
                "X1499", new BookInfo("法界聖凡水陸大齋法輪寶懺", new String[]{"清"}, "咫觀"), // 清 咫觀記
                "X1500", new BookInfo("蘭盆獻供儀", new String[]{"宋"}, "元照"), // 宋 元照重集
                "X1501", new BookInfo("釋迦如來降生禮讚文", new String[]{"宋"}, "仁岳"), // 宋 仁岳撰
                "X1504", new BookInfo("南山祖師禮讚文", new String[]{"宋"}, "智圓"), // 宋 智圓述
                "X1505", new BookInfo("南山祖師禮讚文", new String[]{"宋"}, "仁岳"), // 宋 仁岳述
                "X1506", new BookInfo("南山祖師禮讚文", new String[]{"宋"}, "允堪"), // 宋 允堪述
                "X1507", new BookInfo("大智律師禮讚文", new String[]{"宋"}, "則安"), // 宋 則安述
                "X1508", new BookInfo("釋迦如來成道記", new String[]{"唐"}, "王勃"), // 唐 王勃撰
                "X1509", new BookInfo("釋迦如來成道記註", new String[]{"唐"}, "道誠"), // 唐 道誠註
                "X1510", new BookInfo("釋迦如來行蹟頌", new String[]{"元"}, "無寄"), // 元 無寄撰集
                "X1511", new BookInfo("釋迦如來應化錄", new String[]{"明"}, "寶成"), // 明 寶成編集
                "X1512", new BookInfo("隆興編年通論", new String[]{"宋"}, "祖琇"), // 宋 祖琇撰
                "X1513", new BookInfo("釋門正統", new String[]{"宋"}, "宗鑑"), // 宋 宗鑑集
                "X1515", new BookInfo("續佛祖統紀", null), //
                "X1516", new BookInfo("釋氏通鑑", new String[]{"宋"}, "本覺"), // 宋 本覺編集
                "X1517", new BookInfo("歷朝釋氏資鑑", new String[]{"元"}, "熙仲"), // 元 熙仲集
                "X1521", new BookInfo("(古今圖書集成)釋教部彙考", null), //
                "X1522", new BookInfo("新修科分六學僧傳", new String[]{"元"}, "曇噩"), // 元 曇噩述
                "X1523", new BookInfo("名僧傳抄", new String[]{"梁"}, "寶唱"), // 梁 寶唱撰
                "X1524", new BookInfo("補續高僧傳", new String[]{"明"}, "明河"), // 明 明河撰
                "X1526", new BookInfo("武林西湖高僧事略", new String[]{"宋"}, "元敬", "元復"), // 宋 元敬．元復同述
                "X1527", new BookInfo("續武林西湖高僧事略", new String[]{"明"}, "袾宏"), // 明 袾宏輯
                "X1530", new BookInfo("法界宗五祖略記", new String[]{"清"}, "續法"), // 清 續法輯
                "X1532", new BookInfo("華嚴經感應略記", new String[]{"明"}, "袾宏"), // 明 袾宏輯錄
                "X1533", new BookInfo("華嚴感應緣起傳", new String[]{"清"}, "弘璧"), // 清 弘璧輯
                "X1534", new BookInfo("華嚴經持驗記", new String[]{"清"}, "周克復"), // 清 周克復纂
                "X1535", new BookInfo("智者大師別傳註", new String[]{"宋"}, "曇照"), // 宋 曇照註
                "X1539", new BookInfo("法華靈驗傳", new String[]{"明"}, "了圓"), // 明 了圓錄
                "X1540", new BookInfo("法華經顯應錄", new String[]{"宋"}, "宗曉"), // 宋 宗曉編
                "X1541", new BookInfo("法華經持驗記", new String[]{"清"}, "周克復"), // 清 周克復纂
                "X1542", new BookInfo("觀音經持驗記", new String[]{"清"}, "周克復"), // 清 周克復集
                "X1543", new BookInfo("東林十八高賢傳", null), //
                "X1546", new BookInfo("新修往生傳", new String[]{"宋"}, "王古"), // 宋 王古輯撰
                "X1547", new BookInfo("諸上善人詠", new String[]{"明"}, "道衍"), // 明 道衍撰
                "X1549", new BookInfo("淨土聖賢錄", new String[]{"清"}, "彭希涑"), // 清 彭希涑述
                "X1550", new BookInfo("淨土聖賢錄續編", new String[]{"清"}, "胡珽"), // 清 胡𤥻述
                "X1551", new BookInfo("西舫彙征", new String[]{"清"}, "瑞璋"), // 清 瑞璋輯
                "X1552", new BookInfo("修西聞見錄", new String[]{"清"}, "咫觀"), // 清 咫觀輯
                "X1553", new BookInfo("天聖廣燈錄", new String[]{"宋"}, "李遵勗"), // 宋 李遵勗勅編
                "X1554", new BookInfo("五家正宗贊", new String[]{"宋"}, "紹曇"), // 宋 紹曇記
                "X1555", new BookInfo("建中靖國續燈錄目錄", new String[]{"宋"}, "惟白"), // 宋 惟白集
                "X1556", new BookInfo("建中靖國續燈錄", new String[]{"宋"}, "惟白"), // 宋 惟白集
                "X1557", new BookInfo("聯燈會要", new String[]{"宋"}, "悟明"), // 宋 悟明集
                "X1558", new BookInfo("嘉泰普燈錄總目錄", new String[]{"宋"}, "正受"), // 宋 正受編
                "X1559", new BookInfo("嘉泰普燈錄", new String[]{"宋"}, "正受"), // 宋 正受編
                "X1560", new BookInfo("禪林僧寶傳", new String[]{"宋"}, "惠洪"), // 宋 惠洪撰
                "X1561", new BookInfo("僧寶正續傳", new String[]{"宋"}, "祖琇"), // 宋 祖琇撰
                "X1562", new BookInfo("南宋元明禪林僧寶傳", new String[]{"清"}, "自融", "性磊"), // 清 自融撰　性磊補輯
                "X1563", new BookInfo("大光明藏", new String[]{"宋"}, "寶曇"), // 宋 寶曇述
                "X1564", new BookInfo("五燈會元目錄", new String[]{"宋"}, "普濟"), // 宋 普濟集
                "X1565", new BookInfo("五燈會元", new String[]{"宋"}, "普濟"), // 宋 普濟集
                "X1566", new BookInfo("五燈會元續略", new String[]{"明"}, "淨柱"), // 明 淨柱輯
                "X1567", new BookInfo("五燈嚴統目錄", new String[]{"明"}, "通容"), // 明 通容集
                "X1568", new BookInfo("五燈嚴統", new String[]{"明"}, "通容"), // 明 通容集
                "X1569", new BookInfo("五燈嚴統解惑編", new String[]{"明"}, "通容"), // 明 通容述
                "X1570", new BookInfo("五燈全書目錄", new String[]{"清"}, "超永"), // 清 超永編輯
                "X1571", new BookInfo("五燈全書", new String[]{"清"}, "超永"), // 清 超永編輯
                "X1572", new BookInfo("續傳燈錄目錄", null), //
                "X1574", new BookInfo("增集續傳燈錄", new String[]{"明"}, "文琇"), // 明 文琇集
                "X1576", new BookInfo("雪堂行拾遺錄", new String[]{"宋"}, "道行"), // 宋 道行編
                "X1577", new BookInfo("羅湖野錄", new String[]{"宋"}, "曉瑩"), // 宋 曉瑩集
                "X1578", new BookInfo("指月錄", new String[]{"明"}, "瞿汝稷"), // 明 瞿汝稷集
                "X1579", new BookInfo("續指月錄", new String[]{"清"}, "聶先"), // 清 聶先編輯
                "X1580", new BookInfo("教外別傳", new String[]{"明"}, "黎眉"), // 明 黎眉等編
                "X1581", new BookInfo("皇明名僧輯略", new String[]{"明"}, "袾宏"), // 明 袾宏輯
                "X1582", new BookInfo("續燈正統目錄", new String[]{"清"}, "性統"), // 清 性統編集
                "X1583", new BookInfo("續燈正統", new String[]{"清"}, "性統"), // 清 性統編集
                "X1584", new BookInfo("續燈存稿目錄", null), //
                "X1585", new BookInfo("續燈存稿", new String[]{"明"}, "通問", "施沛"), // 明 通問編定　施沛彙集
                "X1586", new BookInfo("正源略集目錄", null), //
                "X1587", new BookInfo("正源略集", new String[]{"清"}, "際源", "了貞", "達珍"), // 清 際源．了貞輯　達珍編
                "X1588", new BookInfo("正源略集補遺", new String[]{"清"}, "達珍"), // 清 達珍編
                "X1589", new BookInfo("錦江禪燈目錄", new String[]{"清"}, "通醉"), // 清 通醉輯
                "X1590", new BookInfo("錦江禪燈", new String[]{"清"}, "通醉"), // 清 通醉輯
                "X1591", new BookInfo("黔南會燈錄", new String[]{"清"}, "如純"), // 清 如純輯
                "X1592", new BookInfo("揞黑豆集", new String[]{"清"}, "心圓", "火蓮"), // 清 心圓拈別　火蓮集梓
                "X1593", new BookInfo("禪宗正脉", new String[]{"明"}, "如巹"), // 明 如巹集
                "X1594", new BookInfo("佛祖綱目", new String[]{"明"}, "朱時恩"), // 明 朱時恩著
                "X1595", new BookInfo("佛祖正傳古今捷錄", new String[]{"清"}, "果性"), // 清 果性集
                "X1596", new BookInfo("南嶽單傳記", new String[]{"清"}, "弘儲"), // 清 弘儲表
                "X1597", new BookInfo("定應大師布袋和尚傳", null, "曇噩"), // 曇噩撰
                "X1598", new BookInfo("曹溪大師別傳", null), //
                "X1599", new BookInfo("永明道蹟", new String[]{"明"}, "大壑"), // 明 大壑輯
                "X1600", new BookInfo("宗統編年", new String[]{"清"}, "紀蔭"), // 清 紀蔭編纂
                "X1601", new BookInfo("禪燈世譜", new String[]{"明"}, "道忞", "吳侗"), // 明 道忞編修　吳侗集
                "X1602", new BookInfo("佛祖宗派世譜", new String[]{"清"}, "悟進"), // 清 悟進編輯
                "X1603", new BookInfo("緇門世譜", new String[]{"清"}, "明喜"), // 清 明喜撰輯
                "X1604", new BookInfo("法門鋤宄", new String[]{"清"}, "淨符"), // 清 淨符著
                "X1605", new BookInfo("繼燈錄", new String[]{"明"}, "元賢"), // 明 元賢輯
                "X1606", new BookInfo("建州弘釋錄", new String[]{"明"}, "元賢"), // 明 元賢集
                "X1607", new BookInfo("居士分燈錄", new String[]{"明"}, "朱時恩"), // 明 朱時恩輯
                "X1608", new BookInfo("八十八祖道影傳贊", new String[]{"明"}, "德清", "高承埏"), // 明 德清述　高承埏補
                "X1609", new BookInfo("普陀列祖錄", new String[]{"清"}, "通旭"), // 清 通旭集
                "X1610", new BookInfo("雲臥紀譚", new String[]{"宋"}, "曉瑩"), // 宋 曉瑩錄
                "X1611", new BookInfo("叢林盛事", new String[]{"宋"}, "道融"), // 宋 道融撰
                "X1612", new BookInfo("人天寶鑑", new String[]{"宋"}, "曇秀"), // 宋 曇秀輯
                "X1613", new BookInfo("枯崖漫錄", new String[]{"宋"}, "圓悟"), // 宋 圓悟錄
                "X1614", new BookInfo("禪苑蒙求瑤林", new String[]{"金", "元"}, "志明", "德諫"), // 金 志明撰　元 德諫注
                "X1615", new BookInfo("禪苑蒙求拾遺", null), //
                "X1616", new BookInfo("山菴雜錄", new String[]{"明"}, "無慍"), // 明 無溫錄
                "X1617", new BookInfo("正宗心印後續聯芳", new String[]{"明"}, "善燦"), // 明 善燦著
                "X1618", new BookInfo("祖庭指南", new String[]{"清"}, "徐昌治"), // 清 徐昌治編述
                "X1619", new BookInfo("先覺集", new String[]{"明"}, "陶明潛"), // 明 陶明潛輯
                "X1620", new BookInfo("先覺宗乘", new String[]{"清"}, "圓信", "郭凝之"), // 清 圓信較定　郭凝之彙編
                "X1621", new BookInfo("優婆夷志", new String[]{"清"}, "圓信", "郭凝之"), // 清 圓信較定　郭凝之彙編
                "X1622", new BookInfo("朝鮮禪教考", new String[]{"朝鮮"}, "朴永善"), // 朝鮮 朴永善輯
                "X1623", new BookInfo("釋氏蒙求", null, "靈操"), // 靈操撰
                "X1624", new BookInfo("林間錄", new String[]{"宋"}, "慧洪"), // 宋 慧洪集
                "X1625", new BookInfo("林間錄後集", new String[]{"宋"}, "慧洪"), // 宋 慧洪集
                "X1626", new BookInfo("高僧摘要", new String[]{"清"}, "徐昌治"), // 清 徐昌治編輯
                "X1627", new BookInfo("緇門崇行錄", new String[]{"明"}, "袾宏"), // 明 袾宏輯
                "X1628", new BookInfo("佛法金湯編", new String[]{"明"}, "心泰"), // 明 心泰編
                "X1629", new BookInfo("金剛般若經集驗記", new String[]{"唐"}, "孟獻忠"), // 唐 孟獻忠撰
                "X1630", new BookInfo("金剛經鳩異", new String[]{"唐"}, "段成式"), // 唐 段成式撰
                "X1631", new BookInfo("金剛經受持感應錄", null), //
                "X1632", new BookInfo("金剛經感應傳", null), //
                "X1633", new BookInfo("金剛經新異錄", new String[]{"明"}, "王起隆"), // 明 王起隆輯著
                "X1634", new BookInfo("金剛經靈驗傳", new String[]{"日本"}, "淨慧"), // 日本 淨慧集
                "X1635", new BookInfo("金剛經持驗記", new String[]{"清"}, "周克復"), // 清 周克復纂
                "X1636", new BookInfo("金剛經感應分類輯要", new String[]{"清"}, "王澤泩"), // 清 王澤泩編集
                "X1638", new BookInfo("地藏菩薩像靈驗記", new String[]{"宋"}, "常謹"), // 宋 常謹集
                "X1640", new BookInfo("心性罪福因緣集", new String[]{"宋"}, "智覺"), // 宋 智覺注
                "X1641", new BookInfo("見聞錄", new String[]{"明"}, "智旭"), // 明 智旭隨筆
                "X1642", new BookInfo("現果隨錄", new String[]{"明"}, "戒顯"), // 明 戒顯筆記
                "X1643", new BookInfo("兜率龜鏡集", new String[]{"清"}, "弘贊"), // 清 弘贊輯
                "X1644", new BookInfo("觀音慈林集", new String[]{"清"}, "弘贊"), // 清 弘贊輯
                "X1645", new BookInfo("六道集", new String[]{"清"}, "弘贊"), // 清 弘贊輯
                "X1646", new BookInfo("居士傳", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X1648", new BookInfo("冥報記輯書", new String[]{"日本"}, "佐佐木憲德"), // 日本 佐佐木憲德輯
                "X1649", new BookInfo("名公法喜志", new String[]{"明"}, "夏樹芳"), // 明 夏樹芳輯
                "X1651", new BookInfo("玄奘三藏師資傳叢書", new String[]{"日本"}, "佐伯定胤", "中野達慧"), // 日本 佐伯定胤．中野達慧共編
                "X1654", new BookInfo("惠果和尚行狀", null), //
                "X1655", new BookInfo("得依釋序文緣起", new String[]{"日本"}, "慧堅"), // 日本 慧堅撰
                "X1656", new BookInfo("伯亭大師傳記總帙", null), //
                "X1657", new BookInfo("善女人傳", new String[]{"清"}, "彭際清"), // 清 彭際清述
                "X1658", new BookInfo("重編諸天傳", new String[]{"宋"}, "行霆"), // 宋 行霆述
                "X1660", new BookInfo("(古今圖書集成)神異典二氏部彙考", null), //
                "X1661", new BookInfo("(古今圖書集成)神異典釋教部紀事", null), //
                "X1666", new BookInfo("佛祖心燈", null), //
                "X1667", new BookInfo("宗教律諸宗演派", new String[]{"清"}, "守一"), // 清 守一重編
                "X1668", new BookInfo("西藏剌麻溯源", new String[]{"清"}, "守一"), // 清 守一編輯
                "X1671", new BookInfo("東國僧尼錄", null) //
        );
    }

    private static void addY() {
        add(
                "Y0001", new BookInfo("般若經講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0002", new BookInfo("寶積經講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0003", new BookInfo("勝鬘經講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0004", new BookInfo("藥師經講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0005", new BookInfo("中觀論頌講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0006", new BookInfo("攝大乘論講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0007", new BookInfo("大乘起信論講記", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0008", new BookInfo("佛法概論", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0009", new BookInfo("中觀今論", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0010", new BookInfo("唯識學探源", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0011", new BookInfo("性空學探源", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0012", new BookInfo("成佛之道", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0013", new BookInfo("太虛大師年譜", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0014", new BookInfo("佛在人間", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0015", new BookInfo("學佛三要", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0016", new BookInfo("以佛法研究佛法", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0017", new BookInfo("淨土與禪", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0018", new BookInfo("青年的佛教", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0019", new BookInfo("我之宗教觀", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0020", new BookInfo("無諍之辯", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0021", new BookInfo("教制教典與教學", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0022", new BookInfo("佛教史地考論", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0023", new BookInfo("華雨香雲", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0024", new BookInfo("佛法是救世之光", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0025", new BookInfo("華雨集（一）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0026", new BookInfo("華雨集（二）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0027", new BookInfo("華雨集（三）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0028", new BookInfo("華雨集（四）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0029", new BookInfo("華雨集（五）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0030", new BookInfo("雜阿含經論會編（上）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0031", new BookInfo("印度之佛教", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0032", new BookInfo("印度佛教思想史", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0033", new BookInfo("原始佛教聖典之集成", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0034", new BookInfo("說一切有部為主的論書與論師之研究", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0035", new BookInfo("初期大乘佛教之起源與開展", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0036", new BookInfo("空之探究", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0037", new BookInfo("如來藏之研究", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0038", new BookInfo("中國禪宗史", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0039", new BookInfo("平凡的一生（重訂本）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0040", new BookInfo("成佛之道（增注本）", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0041", new BookInfo("永光集", new String[]{"民國"}, "釋印順"), // 民國 釋印順著
                "Y0042", new BookInfo("大乘廣五蘊論講記", new String[]{"民國"}, "釋印順") // 民國 釋印順著
        );
    }

    private static void addZ() {
        add(
                "ZS0001", new BookInfo("正史佛教資料類編", new String[]{"现代"}, "杜斗城"), // 杜斗城輯編
                "ZW0001", new BookInfo("天竺國菩提達摩禪師論", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0002", new BookInfo("禪策問答", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0003", new BookInfo("息諍論", new String[]{"南梁", "现代"}, "達摩禪師", "方廣錩"), // 達摩禪師作　方廣錩整理
                "ZW0004", new BookInfo("八種粗重犯墮", new String[]{"现代"}, "馬鳴菩薩", "方廣錩"), // 馬鳴菩薩造　方廣錩整理
                "ZW0005", new BookInfo("天請問經疏", new String[]{"现代"}, "文軌", "李際寧"), // 沙門文軌撰　李際寧整理
                "ZW0006", new BookInfo("《行事鈔》中分門圖錄", new String[]{"唐", "现代"}, "道宣", "蘇軍"), // 沙門道宣述　蘇軍整理
                "ZW0007", new BookInfo("《阿毗達磨俱舍論實義疏》", new String[]{"现代"}, "尊者安惠", "蘇軍"), // 尊者安惠造　蘇軍整理
                "ZW0008", new BookInfo("佛為心王菩薩說頭陀經（附註疏）", new String[]{"现代"}, "惠辯禪師", "方廣錩"), // 惠辯禪師註　方廣錩整理
                "ZW0009", new BookInfo("佛說孝順子修行成佛經", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0010", new BookInfo("最妙勝定經", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0011", new BookInfo("佛說水月光觀音菩薩經", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0012", new BookInfo("佛說金剛經纂", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0013", new BookInfo("大方廣華嚴十惡品經", new String[]{"现代"}, "徐紹強"), // 徐紹強整理
                "ZW0014a", new BookInfo("天公經", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0014b", new BookInfo("佛說天公經", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0014c", new BookInfo("天公經", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0015a", new BookInfo("大般涅槃摩耶夫人品經", new String[]{"现代"}, "大德安法師", "李際寧"), // 大德安法師譯　李際寧整理
                "ZW0015b", new BookInfo("大般涅槃經佛母品", new String[]{"现代"}, "李際寧"), // 李際寧整理
                "ZW0015c", new BookInfo("大般涅槃經佛母品", new String[]{"现代"}, "李際寧"), // 李際寧整理
                "ZW0015d", new BookInfo("大般涅槃經佛為摩耶夫人說偈品經", new String[]{"现代"}, "李際寧"), // 李際寧整理
                "ZW0016", new BookInfo("關於《禪藏》與敦煌禪籍的若干問題", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0017", new BookInfo("七祖法寶記下卷", new String[]{"现代"}, "華方田"), // 華方田整理
                "ZW0018a", new BookInfo("天竺國菩提達摩禪師論", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0018b", new BookInfo("天竺國菩提達摩禪師論", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0019", new BookInfo("淨名經集解關中疏卷上", new String[]{"现代"}, "沙門道液", "黎明"), // 沙門道液集　黎明整理
                "ZW0020", new BookInfo("法華經文外義", new String[]{"现代"}, "李際寧", "張曉娟"), // 李際寧．張曉娟整理
                "ZW0021", new BookInfo("諦義證得經", new String[]{"古印度", "现代"}, "烏瑪斯伐蒂", "方廣錩"), // 古印度 烏瑪斯伐蒂著　方廣錩譯註
                "ZW0022", new BookInfo("《瑜伽師地論》披尋記敘", new String[]{"现代"}, "韓清淨", "程恭讓"), // 韓清淨著　程恭讓整理
                "ZW0023", new BookInfo("菩薩總持法", new String[]{"现代"}, "上山大峻", "袁德領"), // 上山大峻．袁德領整理
                "ZW0024", new BookInfo("大乘起世論", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0025", new BookInfo("淨名經集解關中疏卷下", new String[]{"现代"}, "道液", "黎明"), // 沙門道液述　黎明整理
                "ZW0026", new BookInfo("因緣心論頌", new String[]{"现代"}, "龍猛菩薩", "華方田"), // 龍猛菩薩作　華方田整理
                "ZW0027", new BookInfo("因緣心論釋", new String[]{"现代"}, "龍猛菩薩", "華方田"), // 龍猛菩薩造　華方田整理
                "ZW0028", new BookInfo("因緣心釋論開決記", new String[]{"现代"}, "華方田"), // 華方田整理
                "ZW0029", new BookInfo("金剛般若經疏", new String[]{"现代"}, "華方田"), // 華方田整理
                "ZW0030", new BookInfo("瑜伽論卷第十四手記", new String[]{"现代"}, "徐紹強"), // 徐紹強整理
                "ZW0031a", new BookInfo("佛說觀佛三昧海經本行品第八", new String[]{"现代"}, "黃霞"), // 黃霞整理
                "ZW0031b", new BookInfo("佛說相好經", new String[]{"现代"}, "黃霞"), // 黃霞整理
                "ZW0031c", new BookInfo("佛說觀佛三昧海藏經本行品第八", new String[]{"现代"}, "黃霞"), // 黃霞整理
                "ZW0031d", new BookInfo("佛說相好經", new String[]{"现代"}, "黃霞"), // 黃霞整理
                "ZW0031e", new BookInfo("觀佛三昧海經本行品第八", new String[]{"现代"}, "黃霞"), // 黃霞整理
                "ZW0032", new BookInfo("《金藏》新資料考", null, "李際寧"), // 李際寧
                "ZW0033", new BookInfo("入菩薩行論廣解", null, "寂天菩薩", "傑操大師", "隆蓮法師"), // 寂天菩薩造頌　傑操大師註解　隆蓮法師譯
                "ZW0034", new BookInfo("大藏佛說守護大千國土經", new String[]{"现代"}, "陳明光"), // 陳明光整理
                "ZW0035", new BookInfo("六道輪迴圖偈頌", new String[]{"现代"}, "陳明光"), // 陳明光整理
                "ZW0036", new BookInfo("父母恩重經變經文偈頌", new String[]{"现代"}, "陳明光"), // 陳明光整理
                "ZW0037", new BookInfo("大方便佛報恩經變經文偈頌", new String[]{"现代"}, "陳明光"), // 陳明光整理
                "ZW0038", new BookInfo("三聖御制佛牙贊", new String[]{"北宋"}, "宋太宗", "宋真宗", "宋仁宗", "陳明光"), // 北宋 太宗．真宗．仁宗撰　陳明光整理
                "ZW0039", new BookInfo("觀經變像經文偈頌", new String[]{"现代"}, "陳明光"), // 陳明光整理
                "ZW0040", new BookInfo("地獄變經文偈頌", new String[]{"现代"}, "陳明光"), // 陳明光整理
                "ZW0041", new BookInfo("佛性問答", new String[]{"现代"}, "業露華"), // 業露華整理
                "ZW0042", new BookInfo("大乘無盡藏法", new String[]{"现代"}, "信行", "方廣錩"), // 信行撰　方廣錩整理
                "ZW0043a", new BookInfo("佛在金棺上囑累經", new String[]{"现代"}, "侯旭東"), // 侯旭東整理
                "ZW0043b", new BookInfo("如來在金棺囑累清淨莊嚴敬福經", new String[]{"现代"}, "侯旭東"), // 侯旭東整理
                "ZW0044", new BookInfo("傳善無畏所譯三部密教儀軌出處及年代考", null, "陳金華"), // 陳金華
                "ZW0045", new BookInfo("小誦", null, "鄧殿臣"), // 鄧殿臣譯
                "ZW0046", new BookInfo("即興自說", null, "鄧殿臣"), // 鄧殿臣譯
                "ZW0047", new BookInfo("大隧道本生", null, "鄧殿臣"), // 鄧殿臣譯
                "ZW0048", new BookInfo("大念處經", null, "鄧殿臣", "趙桐"), // 鄧殿臣．趙桐譯
                "ZW0049", new BookInfo("瑜伽師地開釋分門記", new String[]{"现代"}, "徐紹強"), // 徐紹強整理
                "ZW0050", new BookInfo("天台教典入藏考", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0051", new BookInfo("楞嚴解冤釋結道場儀", new String[]{"宋"}, "釋祖照", "趙文煥", "侯沖"), // 宋 釋祖照集　趙文煥．侯沖整理
                "ZW0052", new BookInfo("地藏慈悲救苦薦福利生道場儀", new String[]{"宋"}, "釋元照", "趙文煥", "侯沖"), // 宋 釋元照集　趙文煥．侯沖整理
                "ZW0053", new BookInfo("銷釋金剛經科儀", new String[]{"宋"}, "釋宗鏡", "侯沖"), // 宋 釋宗鏡述　侯沖整理
                "ZW0054", new BookInfo("廣施無遮道場儀", new String[]{"现代"}, "侯沖"), // 侯沖整理
                "ZW0055", new BookInfo("大黑天神道場儀", new String[]{"现代"}, "侯沖"), // 侯沖整理
                "ZW0056", new BookInfo("進新譯大方廣佛花嚴經表", new String[]{"现代"}, "弘景", "方廣錩"), // 弘景撰　方廣錩整理
                "ZW0057", new BookInfo("雲南阿吒力教經典及其在中國佛教研究中的價值", null, "侯沖"), // 侯沖
                "ZW0058", new BookInfo("注心要法門", new String[]{"唐"}, "宗密", "方廣錩"), // 唐 宗密注　方廣錩整理
                "ZW0059a", new BookInfo("姚和上金剛五禮一本", null, "姚和尚", "達照"), // 姚和尚撰　達照整理
                "ZW0059b", new BookInfo("金剛五禮", null, "姚和尚", "達照"), // 姚和尚撰　達照整理
                "ZW0060", new BookInfo("金剛禮", new String[]{"遼"}, "通理大師", "達照"), // 遼 通理大師集　達照整理
                "ZW0061", new BookInfo("護國司南抄", null, "玄鑒", "侯沖"), // 沙門玄鑒集　侯沖整理
                "ZW0062", new BookInfo("佛說消災延壽藥師灌頂章句儀", null, "若愚", "侯沖"), // 沙門若愚述　侯沖整理
                "ZW0063", new BookInfo("淨度三昧經", new String[]{"日本"}, "大內文雄", "齊藤隆信"), // 大內文雄．齊藤隆信整理
                "ZW0064a", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064b", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064c", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064d", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064e", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064f", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064g", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0064h", new BookInfo("地藏菩薩十齋日", new String[]{"现代"}, "張總"), // 張總整理
                "ZW0065", new BookInfo("寧夏西夏方塔出土漢文佛典敘錄", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0066", new BookInfo("日本佛教目錄學的形成——以《東域傳燈錄》為中心", null, "末木文美士"), // 末木文美士
                "ZW0067", new BookInfo("華嚴略疏卷第一", null, "悟緣"), // 悟緣　整理
                "ZW0068", new BookInfo("如來廣孝十種報恩道場儀", new String[]{"南宋"}, "思覺", "趙文煥", "侯沖"), // 南宋 思覺集　趙文煥．侯沖整理
                "ZW0069", new BookInfo("二曜金剛合璧", null, "通源"), // 通源整理
                "ZW0070", new BookInfo("敦煌寺院所藏大藏經概貌", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0071", new BookInfo("《慧琳音義》與唐代大藏經", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0072", new BookInfo("佛性觀修善法", null, "信行", "西本照真"), // 信行撰　西本照真整理
                "ZW0073a", new BookInfo("金剛經讚集", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073b", new BookInfo("金剛經讚集（擬）", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073c", new BookInfo("金剛經讚集（擬）", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073d", new BookInfo("金剛經注頌釋", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073e", new BookInfo("金剛經頌（擬）", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073f", new BookInfo("梁朝傅大士頌金剛經", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073g", new BookInfo("梁朝傅大士頌金剛經", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0073h", new BookInfo("梁朝傅大士夾頌金剛經", new String[]{"现代"}, "達照"), // 達照整理
                "ZW0074", new BookInfo("寶髻大王菩薩本緣", null, "任遠"), // 任遠譯
                "ZW0075", new BookInfo("寶髻本緣", null, "克什曼德拉", "任遠"), // 克什曼德拉原著　任遠譯
                "ZW0076", new BookInfo("三階教文獻綜述", null, "西本照真"), // 西本照真
                "ZW0077", new BookInfo("關於江泌女子僧法誦出經", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0078", new BookInfo("三自性論", new String[]{"印度"}, "世親", "金克木"), // 印度 世親著　金克木譯
                "ZW0079", new BookInfo("因相輪抉擇", new String[]{"印度"}, "陳那", "韓鏡清", "釋剛曉"), // 印度 陳那著　韓鏡清初譯　釋剛曉校訂註釋
                "ZW0080", new BookInfo("諸經佛名卷上", new String[]{"现代"}, "章光池"), // 章光池整理
                "ZW0081", new BookInfo("御注金剛般若經", new String[]{"唐"}, "李隆基", "衣川賢次"), // 唐 李隆基著　衣川賢次整理
                "ZW0082", new BookInfo("文殊師利所說般若波羅蜜經序偈釋", new String[]{"现代"}, "曹淩"), // 曹淩整理
                "ZW0083", new BookInfo("法華七禮文", new String[]{"现代"}, "汪娟"), // 汪娟整理
                "ZW0084", new BookInfo("照明菩薩經", new String[]{"现代"}, "林敏"), // 林敏整理
                "ZW0085", new BookInfo("佛說佛名經（二十卷本）", new String[]{"现代"}, "張麗", "張磊"), // 張麗．張磊整理
                "ZW0086", new BookInfo("敦煌本《壇經》校釋疏義（標題章、第一章、第二章）", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0087", new BookInfo("敦煌本《壇經》錄校三題", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0088", new BookInfo("明初的兩部南藏", new String[]{"日本"}, "野澤佳美"), // 日 立正大學教授 野澤佳美
                "ZW0089", new BookInfo("讚禮地藏菩薩懺悔發願法", null, "張曉麗"), // 張曉麗整理
                "ZW0090", new BookInfo("如來九觀（擬）", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0091", new BookInfo("金剛峻經金剛頂一切如來深妙秘密金剛界大三昧耶修行四十二種壇法經作用威儀法則　大毘盧遮那佛金剛心地法門密法戒壇法儀則", null, "侯沖"), // 侯沖整理
                "ZW0092", new BookInfo("金剛峻經金剛頂一切如來深妙秘密金剛界大三昧耶修行四十九種壇法經作用威儀法則　大毘盧遮那佛金剛心地法門密法戒壇法儀則", null, "侯沖"), // 侯沖整理
                "ZW0093", new BookInfo("佛說佛名經（二十卷本——卷第五～卷第七）", null, "張麗", "張磊"), // 張麗．張磊整理
                "ZW0094", new BookInfo("敦煌本《壇經》校釋疏義（第三章～第五章）", null, "張磊", "王侃", "李鐵華"), // 張磊．王侃．李鐵華執筆　研讀班集體討論
                "ZW0095", new BookInfo("日本的漢文大藏經收藏及其特色——以刻本大藏經為中心", new String[]{"日本"}, "梶浦晉"), // 日本 京都大學人文所 梶浦晉
                "ZW0096", new BookInfo("論《高麗再雕藏》中所見的《契丹藏》", new String[]{"韓國"}, "柳富鉉"), // 韓國 大真大學校教授 柳富鉉
                "ZW0097", new BookInfo("金剛般若經義疏卷二", new String[]{"现代"}, "方廣錩"), // 方廣錩整理
                "ZW0098", new BookInfo("圓通三慧大齋道場儀", new String[]{"宋"}, "侯溥", "侯沖"), // 宋 侯溥作　侯沖整理
                "ZW0099", new BookInfo("佛說佛名經（二十卷本——卷第八～卷第十）", null, "張麗", "張磊"), // 張麗．張磊整理
                "ZW0100", new BookInfo("敦煌本《壇經》校釋疏義（第六章～第八章）", null, "曹淩", "周芳", "曾曉紅"), // 曹淩．周芳．曾曉紅執筆　研讀班集體討論
                "ZW0101", new BookInfo("關於《佛說孝順子修行成佛經》的若干新資料", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZW0102", new BookInfo("關於宮內廳書陵部所藏福州版大藏經中的混合冊與印章", new String[]{"日本"}, "中村一紀"), // 日本 宮內廳書陵部 中村一紀
                "ZW0103", new BookInfo("漢文大藏經研究要重視文獻價值的判別", null, "熊國禎"), // 熊國禎
                "ZWa001", new BookInfo("緣起", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa002", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa003", new BookInfo("目錄", null), //
                "ZWa004", new BookInfo("錄文校勘體例", null), //
                "ZWa005", new BookInfo("徵稿啟事", null), //
                "ZWa006", new BookInfo("《藏外佛教文獻》編委會啟事", null), //
                "ZWa007", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa008", new BookInfo("目錄", null), //
                "ZWa009", new BookInfo("錄文校勘體例", null), //
                "ZWa010", new BookInfo("大藏經編纂及電腦化研討會論文特集", null), //
                "ZWa011", new BookInfo("徵稿啟事", null), //
                "ZWa012", new BookInfo("徵訂啟事", null), //
                "ZWa013", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa014", new BookInfo("目錄", null), //
                "ZWa015", new BookInfo("錄文校勘體例", null), //
                "ZWa016", new BookInfo("《藏外佛教文獻》第一輯、第二輯要目", null), //
                "ZWa017", new BookInfo("徵稿啟事", null), //
                "ZWa018", new BookInfo("編委會名單", null), //
                "ZWa019", new BookInfo("鳴謝", null), //
                "ZWa020", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa021", new BookInfo("目錄", null), //
                "ZWa022", new BookInfo("錄文校勘體例", null), //
                "ZWa023", new BookInfo("「中國社會科學院佛教研究中心成立暨佛教研究與新時期的文化建設研討會」紀要", null), //
                "ZWa024", new BookInfo("《藏外佛教文獻》第一～六輯要目", null), //
                "ZWa025", new BookInfo("徵稿啟事", null), //
                "ZWa026", new BookInfo("編委會名單", null), //
                "ZWa027", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa028", new BookInfo("目錄", null), //
                "ZWa029", new BookInfo("錄文校勘體例", null), //
                "ZWa030", new BookInfo("《藏外佛教文獻》第一～六輯要目", null), //
                "ZWa031", new BookInfo("徵稿啟事", null), //
                "ZWa032", new BookInfo("編委會名單", null), //
                "ZWa033", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa034", new BookInfo("目錄", null), //
                "ZWa035", new BookInfo("錄文校勘體例", null), //
                "ZWa036", new BookInfo("《藏外佛教文獻》第一～六輯要目", null), //
                "ZWa037", new BookInfo("徵稿啟事", null), //
                "ZWa038", new BookInfo("編委會名單", null), //
                "ZWa039", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa040", new BookInfo("目錄", null), //
                "ZWa041", new BookInfo("錄文校勘體例", null), //
                "ZWa042", new BookInfo("《藏外佛教文獻》要目", null), //
                "ZWa043", new BookInfo("徵稿啟事", null), //
                "ZWa044", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa045", new BookInfo("目錄", null), //
                "ZWa046", new BookInfo("錄文校勘體例", null), //
                "ZWa047", new BookInfo("《藏外佛教文獻》要目", null), //
                "ZWa048", new BookInfo("徵稿啟事", null), //
                "ZWa049", new BookInfo("鳴謝", null), //
                "ZWa050", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa051", new BookInfo("目錄", null), //
                "ZWa052", new BookInfo("錄文校勘體例", null), //
                "ZWa053", new BookInfo("談當前數字圖書館的幾個問題", null), //
                "ZWa054", new BookInfo("《藏外佛教文獻》要目", null), //
                "ZWa055", new BookInfo("徵稿啟事", null), //
                "ZWa056", new BookInfo("鳴謝", null), //
                "ZWa057", new BookInfo("目錄", null), //
                "ZWa058", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa059", new BookInfo("錄文校勘體例", null), //
                "ZWa060", new BookInfo("徵稿啟事", null), //
                "ZWa061", new BookInfo("《藏外佛教文獻》總目錄（第一輯～第十二輯）", null), //
                "ZWa062", new BookInfo("鳴謝", null), //
                "ZWa063", new BookInfo("目錄", null), //
                "ZWa064", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa065", new BookInfo("錄文校勘體例", null), //
                "ZWa066", new BookInfo("徵稿啟事", null), //
                "ZWa067", new BookInfo("《藏外佛教文獻》總目錄（第一輯～第十二輯）", null), //
                "ZWa068", new BookInfo("鳴謝", null), //
                "ZWa069", new BookInfo("目錄", null), //
                "ZWa070", new BookInfo("卷首語", new String[]{"现代"}, "方廣錩"), // 方廣錩
                "ZWa071", new BookInfo("錄文校勘體例", null), //
                "ZWa072", new BookInfo("徵稿啟事", null), //
                "ZWa073", new BookInfo("《藏外佛教文獻》總目錄（第一輯～第十二輯）", null)//
        );
    }

    public final String title;
    public final String[] periods, authors;

    public BookInfo(String title, String[] periods, String... authors) {
        this.title = title;
        this.periods = periods;
        this.authors = authors;
    }
}
