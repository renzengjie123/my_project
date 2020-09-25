package projecct.text;

import java.text.ParseException;

public class MyTest {

	/*
	 * public static JSONArray json = new JSONArray();
	 * 
	 * public static JSONArray sysData(){ json = (JSONArray) JSONArray.parse(data);
	 * return json; }
	 * 
	 * public static String data =
	 * "[{'employe_no':'10011','id':'4'},{'employe_no':'10013','id':'6'},{'employe_no':'10015','id':'8'},{'employe_no':'10016','id':'10'},{'employe_no':'10060','id':'32'},{'employe_no':'10069','id':'34'},{'employe_no':'10036','id':'40'},{'employe_no':'10039','id':'42'},{'employe_no':'10057','id':'44'},{'employe_no':'10001','id':'66'},{'employe_no':'10003','id':'68'},{'employe_no':'00004','id':'70'},{'employe_no':'10002','id':'72'},{'employe_no':'10005','id':'74'},{'employe_no':'00007','id':'76'},{'employe_no':'00020','id':'80'},{'employe_no':'10008','id':'90'},{'employe_no':'10017','id':'92'},{'employe_no':'10048','id':'94'},{'employe_no':'10062','id':'96'},{'employe_no':'10071','id':'98'},{'employe_no':'10038','id':'110'},{'employe_no':'00089','id':'118'},{'employe_no':'10073','id':'148'},{'employe_no':'10145','id':'166'},{'employe_no':'10116','id':'180'},{'employe_no':'10068','id':'182'},{'employe_no':'00173','id':'207'},{'employe_no':'10150','id':'211'},{'employe_no':'10131','id':'217'},{'employe_no':'10180','id':'244'},{'employe_no':'10197','id':'250'},{'employe_no':'10201','id':'260'},{'employe_no':'00160','id':'268'},{'employe_no':'00128','id':'276'},{'employe_no':'10188','id':'278'},{'employe_no':'10204','id':'282'},{'employe_no':'10205','id':'286'},{'employe_no':'10213','id':'314'},{'employe_no':'10229','id':'326'},{'employe_no':'10227','id':'334'},{'employe_no':'10139','id':'336'},{'employe_no':'10107','id':'338'},{'employe_no':'10243','id':'359'},{'employe_no':'10277','id':'361'},{'employe_no':'10255','id':'375'},{'employe_no':'00066','id':'379'},{'employe_no':'10301','id':'381'},{'employe_no':'10222','id':'397'},{'employe_no':'10252','id':'399'},{'employe_no':'10329','id':'401'},{'employe_no':'10265','id':'421'},{'employe_no':'10298','id':'469'},{'employe_no':'10303','id':'473'},{'employe_no':'10238','id':'507'},{'employe_no':'10341','id':'524'},{'employe_no':'03889','id':'529'},{'employe_no':'00262','id':'544'},{'employe_no':'10357','id':'546'},{'employe_no':'10382','id':'557'},{'employe_no':'00369','id':'564'},{'employe_no':'10396','id':'593'},{'employe_no':'10395','id':'595'},{'employe_no':'10403','id':'598'},{'employe_no':'10426','id':'609'},{'employe_no':'10442','id':'613'},{'employe_no':'00432','id':'617'},{'employe_no':'00421','id':'619'},{'employe_no':'10410','id':'623'},{'employe_no':'10332','id':'630'},{'employe_no':'00381','id':'636'},{'employe_no':'10483','id':'653'},{'employe_no':'10517','id':'692'},{'employe_no':'10547','id':'712'},{'employe_no':'10497','id':'718'},{'employe_no':'10398','id':'730'},{'employe_no':'10530','id':'751'},{'employe_no':'00597','id':'756'},{'employe_no':'10538','id':'769'},{'employe_no':'10607','id':'782'},{'employe_no':'00579','id':'790'},{'employe_no':'00592','id':'793'},{'employe_no':'10563','id':'795'},{'employe_no':'10622','id':'810'},{'employe_no':'10627','id':'814'},{'employe_no':'10648','id':'843'},{'employe_no':'10666','id':'865'},{'employe_no':'10615','id':'872'},{'employe_no':'00685','id':'883'},{'employe_no':'00500','id':'886'},{'employe_no':'00706','id':'889'},{'employe_no':'00673','id':'898'},{'employe_no':'10651','id':'904'},{'employe_no':'10029','id':'907'},{'employe_no':'10647','id':'912'},{'employe_no':'00721','id':'922'},{'employe_no':'00747','id':'947'},{'employe_no':'10730','id':'966'},{'employe_no':'00739','id':'971'},{'employe_no':'00773','id':'976'},{'employe_no':'10893','id':'1006'},{'employe_no':'00777','id':'1008'},{'employe_no':'10778','id':'1009'},{'employe_no':'10759','id':'1010'},{'employe_no':'10796','id':'1023'},{'employe_no':'00808','id':'1034'},{'employe_no':'10812','id':'1054'},{'employe_no':'10837','id':'1060'},{'employe_no':'00872','id':'1113'},{'employe_no':'10871','id':'1115'},{'employe_no':'10906','id':'1120'},{'employe_no':'10877','id':'1127'},{'employe_no':'05825','id':'1135'},{'employe_no':'10910','id':'1143'},{'employe_no':'10056','id':'1144'},{'employe_no':'00922','id':'1157'},{'employe_no':'10936','id':'1169'},{'employe_no':'10928','id':'1183'},{'employe_no':'00944','id':'1190'},{'employe_no':'10943','id':'1195'},{'employe_no':'10954','id':'1201'},{'employe_no':'10207','id':'1208'},{'employe_no':'10963','id':'1211'},{'employe_no':'10957','id':'1217'},{'employe_no':'01004','id':'1245'},{'employe_no':'01003','id':'1246'},{'employe_no':'00996','id':'1255'},{'employe_no':'11006','id':'1261'},{'employe_no':'10993','id':'1269'},{'employe_no':'11031','id':'1290'},{'employe_no':'11059','id':'1305'},{'employe_no':'01058','id':'1306'},{'employe_no':'11036','id':'1310'},{'employe_no':'11034','id':'1311'},{'employe_no':'11032','id':'1314'},{'employe_no':'11082','id':'1337'},{'employe_no':'01088','id':'1353'},{'employe_no':'11117','id':'1380'},{'employe_no':'11118','id':'1381'},{'employe_no':'01130','id':'1397'},{'employe_no':'11142','id':'1404'},{'employe_no':'11145','id':'1407'},{'employe_no':'11152','id':'1412'},{'employe_no':'11157','id':'1417'},{'employe_no':'01158','id':'1418'},{'employe_no':'11162','id':'1422'},{'employe_no':'10235','id':'1425'},{'employe_no':'10035','id':'1431'},{'employe_no':'10111','id':'1435'},{'employe_no':'00137','id':'1437'},{'employe_no':'11170','id':'1452'},{'employe_no':'11172','id':'1454'},{'employe_no':'11182','id':'1461'},{'employe_no':'11192','id':'1473'},{'employe_no':'11198','id':'1478'},{'employe_no':'11199','id':'1479'},{'employe_no':'11207','id':'1487'},{'employe_no':'11217','id':'1491'},{'employe_no':'01208','id':'1494'},{'employe_no':'11224','id':'1504'},{'employe_no':'11226','id':'1506'},{'employe_no':'01244','id':'1521'},{'employe_no':'11245','id':'1522'},{'employe_no':'11271','id':'1549'},{'employe_no':'11286','id':'1568'},{'employe_no':'11289','id':'1571'},{'employe_no':'11305','id':'1586'},{'employe_no':'11342','id':'1625'},{'employe_no':'11343','id':'1626'},{'employe_no':'11348','id':'1630'},{'employe_no':'11357','id':'1638'},{'employe_no':'11376','id':'1660'},{'employe_no':'11377','id':'1661'},{'employe_no':'11394','id':'1678'},{'employe_no':'11422','id':'1712'},{'employe_no':'11430','id':'1725'},{'employe_no':'01437','id':'1727'},{'employe_no':'11448','id':'1740'},{'employe_no':'01138','id':'1746'},{'employe_no':'11454','id':'1749'},{'employe_no':'11525','id':'1763'},{'employe_no':'11474','id':'1773'},{'employe_no':'11492','id':'1793'},{'employe_no':'11502','id':'1803'},{'employe_no':'11503','id':'1804'},{'employe_no':'11522','id':'1819'},{'employe_no':'01524','id':'1821'},{'employe_no':'990001','id':'1847'},{'employe_no':'990002','id':'1848'},{'employe_no':'990005','id':'1851'},{'employe_no':'990006','id':'1852'},{'employe_no':'11551','id':'1853'},{'employe_no':'11554','id':'1856'},{'employe_no':'11565','id':'1868'},{'employe_no':'11598','id':'1899'},{'employe_no':'11602','id':'1903'},{'employe_no':'11607','id':'1908'},{'employe_no':'11613','id':'1914'},{'employe_no':'11642','id':'1927'},{'employe_no':'01639','id':'1935'},{'employe_no':'11682','id':'1983'},{'employe_no':'11693','id':'1993'},{'employe_no':'11694','id':'1994'},{'employe_no':'11706','id':'2006'},{'employe_no':'01714','id':'2011'},{'employe_no':'11733','id':'2034'},{'employe_no':'11735','id':'2035'},{'employe_no':'11760','id':'2054'},{'employe_no':'990007','id':'2057'},{'employe_no':'990008','id':'2058'},{'employe_no':'11777','id':'2073'},{'employe_no':'11801','id':'2097'},{'employe_no':'01805','id':'2102'},{'employe_no':'01825','id':'2121'},{'employe_no':'990010','id':'2132'},{'employe_no':'11882','id':'2179'},{'employe_no':'11881','id':'2181'},{'employe_no':'11898','id':'2190'},{'employe_no':'11910','id':'2204'},{'employe_no':'11927','id':'2219'},{'employe_no':'11929','id':'2221'},{'employe_no':'11935','id':'2227'},{'employe_no':'11925','id':'2228'},{'employe_no':'11940','id':'2233'},{'employe_no':'11941','id':'2234'},{'employe_no':'01943','id':'2236'},{'employe_no':'11944','id':'2237'},{'employe_no':'11951','id':'2244'},{'employe_no':'11960','id':'2253'},{'employe_no':'11963','id':'2259'},{'employe_no':'01968','id':'2261'},{'employe_no':'11970','id':'2266'},{'employe_no':'01972','id':'2268'},{'employe_no':'11973','id':'2269'},{'employe_no':'11985','id':'2280'},{'employe_no':'11991','id':'2286'},{'employe_no':'11570','id':'2294'},{'employe_no':'12003','id':'2299'},{'employe_no':'12005','id':'2301'},{'employe_no':'02006','id':'2302'},{'employe_no':'12013','id':'2310'},{'employe_no':'12023','id':'2319'},{'employe_no':'12024','id':'2320'},{'employe_no':'12032','id':'2324'},{'employe_no':'12041','id':'2337'},{'employe_no':'02045','id':'2341'},{'employe_no':'12046','id':'2342'},{'employe_no':'12047','id':'2343'},{'employe_no':'12049','id':'2347'},{'employe_no':'12052','id':'2348'},{'employe_no':'02055','id':'2351'},{'employe_no':'02062','id':'2359'},{'employe_no':'12071','id':'2369'},{'employe_no':'12072','id':'2370'},{'employe_no':'12102','id':'2399'},{'employe_no':'05848','id':'2404'},{'employe_no':'90059','id':'2408'},{'employe_no':'02114','id':'2411'},{'employe_no':'02119','id':'2416'},{'employe_no':'02123','id':'2420'},{'employe_no':'02124','id':'2421'},{'employe_no':'12134','id':'2432'},{'employe_no':'12141','id':'2437'},{'employe_no':'02142','id':'2438'},{'employe_no':'12144','id':'2440'},{'employe_no':'02151','id':'2446'},{'employe_no':'12154','id':'2449'},{'employe_no':'02156','id':'2451'},{'employe_no':'02158','id':'2453'},{'employe_no':'02159','id':'2454'},{'employe_no':'02175','id':'2470'},{'employe_no':'02180','id':'2473'},{'employe_no':'12188','id':'2482'},{'employe_no':'02190','id':'2489'},{'employe_no':'12204','id':'2498'},{'employe_no':'02205','id':'2499'},{'employe_no':'12221','id':'2516'},{'employe_no':'12223','id':'2527'},{'employe_no':'12235','id':'2529'},{'employe_no':'12242','id':'2536'},{'employe_no':'12247','id':'2539'},{'employe_no':'12256','id':'2550'},{'employe_no':'12257','id':'2551'},{'employe_no':'02280','id':'2575'},{'employe_no':'02283','id':'2578'},{'employe_no':'12286','id':'2581'},{'employe_no':'02288','id':'2583'},{'employe_no':'12303','id':'2598'},{'employe_no':'02313','id':'2608'},{'employe_no':'02319','id':'2614'},{'employe_no':'12323','id':'2618'},{'employe_no':'02324','id':'2619'},{'employe_no':'12332','id':'2629'},{'employe_no':'02351','id':'2644'},{'employe_no':'12372','id':'2668'},{'employe_no':'02399','id':'2695'},{'employe_no':'02401','id':'2697'},{'employe_no':'02423','id':'2716'},{'employe_no':'12437','id':'2734'},{'employe_no':'12441','id':'2737'},{'employe_no':'12463','id':'2756'},{'employe_no':'12468','id':'2764'},{'employe_no':'02469','id':'2765'},{'employe_no':'12476','id':'2772'},{'employe_no':'02477','id':'2773'},{'employe_no':'12480','id':'2776'},{'employe_no':'12489','id':'2785'},{'employe_no':'02546','id':'2867'},{'employe_no':'02547','id':'2868'},{'employe_no':'02560','id':'2881'},{'employe_no':'12561','id':'2882'},{'employe_no':'12563','id':'2884'},{'employe_no':'12564','id':'2885'},{'employe_no':'12565','id':'2898'},{'employe_no':'02571','id':'2899'},{'employe_no':'12577','id':'2905'},{'employe_no':'12578','id':'2906'},{'employe_no':'02585','id':'2915'},{'employe_no':'02587','id':'2916'},{'employe_no':'12592','id':'2917'},{'employe_no':'12590','id':'2923'},{'employe_no':'12607','id':'2942'},{'employe_no':'12611','id':'2949'},{'employe_no':'02599','id':'2953'},{'employe_no':'12620','id':'2959'},{'employe_no':'12622','id':'2964'},{'employe_no':'12629','id':'2971'},{'employe_no':'12635','id':'2973'},{'employe_no':'02637','id':'2974'},{'employe_no':'02657','id':'2996'},{'employe_no':'02659','id':'2998'},{'employe_no':'12674','id':'3019'},{'employe_no':'12697','id':'3022'},{'employe_no':'12687','id':'3034'},{'employe_no':'12686','id':'3038'},{'employe_no':'12708','id':'3049'},{'employe_no':'02733','id':'3065'},{'employe_no':'12750','id':'3087'},{'employe_no':'12760','id':'3098'},{'employe_no':'12761','id':'3099'},{'employe_no':'12764','id':'3101'},{'employe_no':'02766','id':'3103'},{'employe_no':'02808','id':'3145'},{'employe_no':'02815','id':'3156'},{'employe_no':'02816','id':'3157'},{'employe_no':'02836','id':'3175'},{'employe_no':'12832','id':'3176'},{'employe_no':'02834','id':'3178'},{'employe_no':'02850','id':'3193'},{'employe_no':'02856','id':'3195'},{'employe_no':'12853','id':'3198'},{'employe_no':'12851','id':'3201'},{'employe_no':'02860','id':'3203'},{'employe_no':'02864','id':'3206'},{'employe_no':'02874','id':'3218'},{'employe_no':'12879','id':'3222'},{'employe_no':'12908','id':'3251'},{'employe_no':'12911','id':'3254'},{'employe_no':'02913','id':'3256'},{'employe_no':'12920','id':'3263'},{'employe_no':'12926','id':'3269'},{'employe_no':'02947','id':'3290'},{'employe_no':'12952','id':'3295'},{'employe_no':'02954','id':'3299'},{'employe_no':'12959','id':'3303'},{'employe_no':'12971','id':'3312'},{'employe_no':'02974','id':'3318'},{'employe_no':'02982','id':'3326'},{'employe_no':'12995','id':'3333'},{'employe_no':'02997','id':'3339'},{'employe_no':'03014','id':'3357'},{'employe_no':'03018','id':'3361'},{'employe_no':'03019','id':'3362'},{'employe_no':'03022','id':'3365'},{'employe_no':'13034','id':'3377'},{'employe_no':'03038','id':'3381'},{'employe_no':'13053','id':'3392'},{'employe_no':'13052','id':'3393'},{'employe_no':'13058','id':'3401'},{'employe_no':'13068','id':'3412'},{'employe_no':'13078','id':'3422'},{'employe_no':'13086','id':'3428'},{'employe_no':'03101','id':'3445'},{'employe_no':'13104','id':'3461'},{'employe_no':'13108','id':'3462'},{'employe_no':'13109','id':'3463'},{'employe_no':'13118','id':'3472'},{'employe_no':'03130','id':'3484'},{'employe_no':'03136','id':'3489'},{'employe_no':'03139','id':'3492'},{'employe_no':'03142','id':'3496'},{'employe_no':'03161','id':'3512'},{'employe_no':'13162','id':'3513'},{'employe_no':'13183','id':'3523'},{'employe_no':'03180','id':'3535'},{'employe_no':'13182','id':'3537'},{'employe_no':'13189','id':'3541'},{'employe_no':'13186','id':'3543'},{'employe_no':'13205','id':'3567'},{'employe_no':'03212','id':'3572'},{'employe_no':'13214','id':'3574'},{'employe_no':'13220','id':'3578'},{'employe_no':'13221','id':'3581'},{'employe_no':'13223','id':'3583'},{'employe_no':'13236','id':'3596'},{'employe_no':'13252','id':'3613'},{'employe_no':'03259','id':'3620'},{'employe_no':'13264','id':'3625'},{'employe_no':'13277','id':'3639'},{'employe_no':'13287','id':'3649'},{'employe_no':'13299','id':'3660'},{'employe_no':'13302','id':'3668'},{'employe_no':'13309','id':'3675'},{'employe_no':'13310','id':'3676'},{'employe_no':'13337','id':'3691'},{'employe_no':'13344','id':'3705'},{'employe_no':'13380','id':'3740'},{'employe_no':'03405','id':'3765'},{'employe_no':'03406','id':'3766'},{'employe_no':'03407','id':'3770'},{'employe_no':'03425','id':'3813'},{'employe_no':'13441','id':'3817'},{'employe_no':'13442','id':'3818'},{'employe_no':'03437','id':'3822'},{'employe_no':'13430','id':'3825'},{'employe_no':'90001','id':'3852'},{'employe_no':'03486','id':'3887'},{'employe_no':'03498','id':'3899'},{'employe_no':'03500','id':'3901'},{'employe_no':'13506','id':'3910'},{'employe_no':'03516','id':'3918'},{'employe_no':'03520','id':'3920'},{'employe_no':'03522','id':'3922'},{'employe_no':'03535','id':'3957'},{'employe_no':'13536','id':'3958'},{'employe_no':'03904','id':'3971'},{'employe_no':'03548','id':'3975'},{'employe_no':'03925','id':'3977'},{'employe_no':'13557','id':'3982'},{'employe_no':'13559','id':'3983'},{'employe_no':'13577','id':'4000'},{'employe_no':'13585','id':'4006'},{'employe_no':'13586','id':'4026'},{'employe_no':'03612','id':'4037'},{'employe_no':'13615','id':'4040'},{'employe_no':'03660','id':'4112'},{'employe_no':'03631','id':'4146'},{'employe_no':'03677','id':'4166'},{'employe_no':'03684','id':'4249'},{'employe_no':'03704','id':'4287'},{'employe_no':'03745','id':'4353'},{'employe_no':'03750','id':'4446'},{'employe_no':'03780','id':'4464'},{'employe_no':'03802','id':'4477'},{'employe_no':'03806','id':'4482'},{'employe_no':'03813','id':'4486'},{'employe_no':'03712','id':'4510'},{'employe_no':'03713','id':'4511'},{'employe_no':'03758','id':'4520'},{'employe_no':'03804','id':'4525'},{'employe_no':'03711','id':'4549'},{'employe_no':'03779','id':'4559'},{'employe_no':'03793','id':'4565'},{'employe_no':'03826','id':'4581'},{'employe_no':'03835','id':'4596'},{'employe_no':'03732','id':'4627'},{'employe_no':'03870','id':'4628'},{'employe_no':'03815','id':'4641'},{'employe_no':'03849','id':'4666'},{'employe_no':'03852','id':'4670'},{'employe_no':'988888','id':'988888'},{'employe_no':'03778','id':'988898'},{'employe_no':'03834','id':'988901'},{'employe_no':'03840','id':'988902'},{'employe_no':'03907','id':'988911'},{'employe_no':'03929','id':'988919'},{'employe_no':'03941','id':'988931'},{'employe_no':'03857','id':'988952'},{'employe_no':'03823','id':'988956'},{'employe_no':'990011','id':'988965'},{'employe_no':'03856','id':'988967'},{'employe_no':'03882','id':'988971'},{'employe_no':'03886','id':'988972'},{'employe_no':'03892','id':'988974'},{'employe_no':'03884','id':'988993'},{'employe_no':'03910','id':'988996'},{'employe_no':'03918','id':'989013'},{'employe_no':'03922','id':'989017'},{'employe_no':'03942','id':'989044'},{'employe_no':'03946','id':'989045'},{'employe_no':'03951','id':'989048'},{'employe_no':'03959','id':'989069'},{'employe_no':'03969','id':'989074'},{'employe_no':'90060','id':'989079'},{'employe_no':'03968','id':'989086'},{'employe_no':'03980','id':'989089'},{'employe_no':'03988','id':'989096'},{'employe_no':'03997','id':'989100'},{'employe_no':'04001','id':'989103'},{'employe_no':'04002','id':'989104'},{'employe_no':'03992','id':'989112'},{'employe_no':'04008','id':'989115'},{'employe_no':'04027','id':'989133'},{'employe_no':'04029','id':'989136'},{'employe_no':'04053','id':'989143'},{'employe_no':'04038','id':'989155'},{'employe_no':'04047','id':'989161'},{'employe_no':'04050','id':'989167'},{'employe_no':'05829','id':'989171'},{'employe_no':'04109','id':'989176'},{'employe_no':'04061','id':'989196'},{'employe_no':'04073','id':'989200'},{'employe_no':'04082','id':'989203'},{'employe_no':'05845','id':'989210'},{'employe_no':'04108','id':'989215'},{'employe_no':'04116','id':'989217'},{'employe_no':'04079','id':'989223'},{'employe_no':'04016','id':'989226'},{'employe_no':'04091','id':'989227'},{'employe_no':'14121','id':'989234'},{'employe_no':'04126','id':'989245'},{'employe_no':'04133','id':'989247'},{'employe_no':'04134','id':'989248'},{'employe_no':'04135','id':'989249'},{'employe_no':'04138','id':'989252'},{'employe_no':'04139','id':'989253'},{'employe_no':'04158','id':'989264'},{'employe_no':'04171','id':'989281'},{'employe_no':'04174','id':'989284'},{'employe_no':'04179','id':'989289'},{'employe_no':'04186','id':'989304'},{'employe_no':'04189','id':'989306'},{'employe_no':'04200','id':'989315'},{'employe_no':'04205','id':'989317'},{'employe_no':'04207','id':'989318'},{'employe_no':'04217','id':'989324'},{'employe_no':'04227','id':'989330'},{'employe_no':'04237','id':'989335'},{'employe_no':'04208','id':'989343'},{'employe_no':'04251','id':'989365'},{'employe_no':'04257','id':'989366'},{'employe_no':'04258','id':'989368'},{'employe_no':'04248','id':'989373'},{'employe_no':'04265','id':'989383'},{'employe_no':'90065','id':'989392'},{'employe_no':'04281','id':'989403'},{'employe_no':'04292','id':'989413'},{'employe_no':'001','id':'989422'},{'employe_no':'002','id':'989423'},{'employe_no':'003','id':'989424'},{'employe_no':'004','id':'989425'},{'employe_no':'005','id':'989426'},{'employe_no':'04319','id':'989445'},{'employe_no':'04324','id':'989454'},{'employe_no':'04342','id':'989468'},{'employe_no':'04352','id':'989478'},{'employe_no':'04351','id':'989484'},{'employe_no':'04360','id':'989487'},{'employe_no':'04361','id':'989488'},{'employe_no':'04363','id':'989490'},{'employe_no':'01686','id':'989507'},{'employe_no':'04390','id':'989512'},{'employe_no':'04393','id':'989514'},{'employe_no':'04374','id':'989522'},{'employe_no':'04415','id':'989532'},{'employe_no':'04404','id':'989545'},{'employe_no':'04423','id':'989554'},{'employe_no':'04431','id':'989559'},{'employe_no':'90071','id':'989565'},{'employe_no':'04460','id':'989596'},{'employe_no':'04464','id':'989599'},{'employe_no':'04472','id':'989604'},{'employe_no':'04447','id':'989609'},{'employe_no':'04477','id':'989616'},{'employe_no':'04483','id':'989625'},{'employe_no':'009','id':'989639'},{'employe_no':'04490','id':'989641'},{'employe_no':'04492','id':'989643'},{'employe_no':'04500','id':'989654'},{'employe_no':'04489','id':'989664'},{'employe_no':'04508','id':'989666'},{'employe_no':'04515','id':'989668'},{'employe_no':'04549','id':'989703'},{'employe_no':'04550','id':'989704'},{'employe_no':'04562','id':'989711'},{'employe_no':'04572','id':'989716'},{'employe_no':'04578','id':'989725'},{'employe_no':'04579','id':'989726'},{'employe_no':'04594','id':'989741'},{'employe_no':'04606','id':'989750'},{'employe_no':'04614','id':'989758'},{'employe_no':'04615','id':'989759'},{'employe_no':'04557','id':'989767'},{'employe_no':'04555','id':'989776'},{'employe_no':'04545','id':'989780'},{'employe_no':'04647','id':'989827'},{'employe_no':'04652','id':'989831'},{'employe_no':'04653','id':'989832'},{'employe_no':'04661','id':'989842'},{'employe_no':'04667','id':'989848'},{'employe_no':'04674','id':'989856'},{'employe_no':'04675','id':'989857'},{'employe_no':'04695','id':'989877'},{'employe_no':'04698','id':'989880'},{'employe_no':'04699','id':'989882'},{'employe_no':'04705','id':'989887'},{'employe_no':'04725','id':'989911'},{'employe_no':'04743','id':'989928'},{'employe_no':'04739','id':'989929'},{'employe_no':'04750','id':'989934'},{'employe_no':'04745','id':'989937'},{'employe_no':'04759','id':'989944'},{'employe_no':'04766','id':'989951'},{'employe_no':'04773','id':'989958'},{'employe_no':'04774','id':'989963'},{'employe_no':'04788','id':'989976'},{'employe_no':'04785','id':'989979'},{'employe_no':'90083','id':'989980'},{'employe_no':'04798','id':'989989'},{'employe_no':'04799','id':'989990'},{'employe_no':'04800','id':'989991'},{'employe_no':'04813','id':'990005'},{'employe_no':'04854','id':'990047'},{'employe_no':'90084','id':'990072'},{'employe_no':'04910','id':'990109'},{'employe_no':'04912','id':'990110'},{'employe_no':'04921','id':'990115'},{'employe_no':'04917','id':'990118'},{'employe_no':'04933','id':'990138'},{'employe_no':'04940','id':'990140'},{'employe_no':'04946','id':'990149'},{'employe_no':'04951','id':'990151'},{'employe_no':'04953','id':'990154'},{'employe_no':'04962','id':'990161'},{'employe_no':'14974','id':'990173'},{'employe_no':'2','id':'990191'},{'employe_no':'3','id':'990192'},{'employe_no':'4','id':'990193'},{'employe_no':'5','id':'990194'},{'employe_no':'7','id':'990198'},{'employe_no':'8','id':'990199'},{'employe_no':'9','id':'990200'},{'employe_no':'10','id':'990201'},{'employe_no':'11','id':'990202'},{'employe_no':'12','id':'990203'},{'employe_no':'13','id':'990204'},{'employe_no':'17','id':'990208'},{'employe_no':'19','id':'990210'},{'employe_no':'20','id':'990211'},{'employe_no':'21','id':'990212'},{'employe_no':'23','id':'990214'},{'employe_no':'24','id':'990215'},{'employe_no':'26','id':'990217'},{'employe_no':'27','id':'990218'},{'employe_no':'28','id':'990219'},{'employe_no':'50','id':'990220'},{'employe_no':'30','id':'990222'},{'employe_no':'31','id':'990223'},{'employe_no':'32','id':'990224'},{'employe_no':'53','id':'990225'},{'employe_no':'33','id':'990226'},{'employe_no':'34','id':'990227'},{'employe_no':'35','id':'990229'},{'employe_no':'56','id':'990230'},{'employe_no':'37','id':'990231'},{'employe_no':'38','id':'990232'},{'employe_no':'39','id':'990233'},{'employe_no':'40','id':'990234'},{'employe_no':'41','id':'990235'},{'employe_no':'43','id':'990236'},{'employe_no':'44','id':'990237'},{'employe_no':'45','id':'990238'},{'employe_no':'46','id':'990239'},{'employe_no':'04998','id':'990250'},{'employe_no':'05003','id':'990256'},{'employe_no':'05012','id':'990264'},{'employe_no':'05015','id':'990269'},{'employe_no':'05032','id':'990283'},{'employe_no':'05033','id':'990284'},{'employe_no':'05058','id':'990311'},{'employe_no':'05067','id':'990325'},{'employe_no':'05071','id':'990327'},{'employe_no':'05080','id':'990342'},{'employe_no':'05083','id':'990343'},{'employe_no':'05084','id':'990344'},{'employe_no':'05091','id':'990349'},{'employe_no':'05102','id':'990362'},{'employe_no':'05113','id':'990373'},{'employe_no':'63','id':'990377'},{'employe_no':'64','id':'990378'},{'employe_no':'65','id':'990379'},{'employe_no':'66','id':'990380'},{'employe_no':'68','id':'990382'},{'employe_no':'05154','id':'990434'},{'employe_no':'90093','id':'990443'},{'employe_no':'05160','id':'990445'},{'employe_no':'05192','id':'990478'},{'employe_no':'90095','id':'990482'},{'employe_no':'05195','id':'990483'},{'employe_no':'05197','id':'990495'},{'employe_no':'05199','id':'990502'},{'employe_no':'05202','id':'990504'},{'employe_no':'05204','id':'990506'},{'employe_no':'05207','id':'990514'},{'employe_no':'05209','id':'990522'},{'employe_no':'05212','id':'990526'},{'employe_no':'05223','id':'990558'},{'employe_no':'05224','id':'990559'},{'employe_no':'05240','id':'990596'},{'employe_no':'05225','id':'990597'},{'employe_no':'05227','id':'990598'},{'employe_no':'05245','id':'990600'},{'employe_no':'05250','id':'990604'},{'employe_no':'05251','id':'990607'},{'employe_no':'05256','id':'990612'},{'employe_no':'05269','id':'990616'},{'employe_no':'05249','id':'990618'},{'employe_no':'05259','id':'990619'},{'employe_no':'05261','id':'990621'},{'employe_no':'05264','id':'990622'},{'employe_no':'05265','id':'990623'},{'employe_no':'05287','id':'990714'},{'employe_no':'05303','id':'990724'},{'employe_no':'05316','id':'990737'},{'employe_no':'05321','id':'990742'},{'employe_no':'05324','id':'990745'},{'employe_no':'05330','id':'990751'},{'employe_no':'05337','id':'990757'},{'employe_no':'05338','id':'990760'},{'employe_no':'05344','id':'990766'},{'employe_no':'05352','id':'990773'},{'employe_no':'05366','id':'990787'},{'employe_no':'05372','id':'990794'},{'employe_no':'05375','id':'990796'},{'employe_no':'05378','id':'990798'},{'employe_no':'05387','id':'990807'},{'employe_no':'05386','id':'990808'},{'employe_no':'05395','id':'990816'},{'employe_no':'05402','id':'990824'},{'employe_no':'05415','id':'990836'},{'employe_no':'05420','id':'990843'},{'employe_no':'05425','id':'990846'},{'employe_no':'05430','id':'990852'},{'employe_no':'05436','id':'990857'},{'employe_no':'05446','id':'990867'},{'employe_no':'05470','id':'990891'},{'employe_no':'05472','id':'990894'},{'employe_no':'05476','id':'990902'},{'employe_no':'05477','id':'990903'},{'employe_no':'05480','id':'990905'},{'employe_no':'05492','id':'990913'},{'employe_no':'05505','id':'990926'},{'employe_no':'05507','id':'990929'},{'employe_no':'05518','id':'990938'},{'employe_no':'05520','id':'990943'},{'employe_no':'05523','id':'990944'},{'employe_no':'05524','id':'990945'},{'employe_no':'05525','id':'990946'},{'employe_no':'05544','id':'990956'},{'employe_no':'05535','id':'990959'},{'employe_no':'05558','id':'990980'},{'employe_no':'05560','id':'990982'},{'employe_no':'05577','id':'991002'},{'employe_no':'999997','id':'991004'},{'employe_no':'999998','id':'991005'},{'employe_no':'999999','id':'991006'},{'employe_no':'05586','id':'991011'},{'employe_no':'05596','id':'991021'},{'employe_no':'05598','id':'991024'},{'employe_no':'05604','id':'991030'},{'employe_no':'05623','id':'991151'},{'employe_no':'05624','id':'991152'},{'employe_no':'05625','id':'991153'},{'employe_no':'05626','id':'991154'},{'employe_no':'05627','id':'991155'},{'employe_no':'05637','id':'991194'},{'employe_no':'05641','id':'991387'},{'employe_no':'05640','id':'991388'},{'employe_no':'05642','id':'991389'},{'employe_no':'05643','id':'991390'},{'employe_no':'05645','id':'991392'},{'employe_no':'05646','id':'991393'},{'employe_no':'05650','id':'991394'},{'employe_no':'05652','id':'991399'},{'employe_no':'05654','id':'991401'},{'employe_no':'05659','id':'991402'},{'employe_no':'05657','id':'991403'},{'employe_no':'05664','id':'991405'},{'employe_no':'05660','id':'991408'},{'employe_no':'05661','id':'991412'},{'employe_no':'05665','id':'991415'},{'employe_no':'05667','id':'991418'},{'employe_no':'05668','id':'991419'},{'employe_no':'05673','id':'991423'},{'employe_no':'05678','id':'991429'},{'employe_no':'05679','id':'991430'},{'employe_no':'05680','id':'991431'},{'employe_no':'05682','id':'991433'},{'employe_no':'05687','id':'991438'},{'employe_no':'05688','id':'991439'},{'employe_no':'05689','id':'991440'},{'employe_no':'05690','id':'991443'},{'employe_no':'05695','id':'991445'},{'employe_no':'05698','id':'991447'},{'employe_no':'05697','id':'991449'},{'employe_no':'05699','id':'991453'},{'employe_no':'05704','id':'991454'},{'employe_no':'05707','id':'991457'},{'employe_no':'05709','id':'991458'},{'employe_no':'05703','id':'991459'},{'employe_no':'05713','id':'991463'},{'employe_no':'05714','id':'991464'},{'employe_no':'05716','id':'991466'},{'employe_no':'05719','id':'991470'},{'employe_no':'05726','id':'991473'},{'employe_no':'05725','id':'991474'},{'employe_no':'05718','id':'991475'},{'employe_no':'05727','id':'991477'},{'employe_no':'05729','id':'991478'},{'employe_no':'05730','id':'991479'},{'employe_no':'05731','id':'991480'},{'employe_no':'05734','id':'991482'},{'employe_no':'05733','id':'991483'},{'employe_no':'05735','id':'991484'},{'employe_no':'05736','id':'991485'},{'employe_no':'05738','id':'991487'},{'employe_no':'05740','id':'991489'},{'employe_no':'05749','id':'991497'},{'employe_no':'05752','id':'991501'},{'employe_no':'05754','id':'991502'},{'employe_no':'05753','id':'991503'},{'employe_no':'05756','id':'991505'},{'employe_no':'05758','id':'991506'},{'employe_no':'05759','id':'991507'},{'employe_no':'05761','id':'991509'},{'employe_no':'05762','id':'991510'},{'employe_no':'05763','id':'991511'},{'employe_no':'05764','id':'991512'},{'employe_no':'05766','id':'991514'},{'employe_no':'05768','id':'991516'},{'employe_no':'05771','id':'991519'},{'employe_no':'05757','id':'991521'},{'employe_no':'05775','id':'991523'},{'employe_no':'15777','id':'991525'},{'employe_no':'05778','id':'991526'},{'employe_no':'05779','id':'991527'},{'employe_no':'05780','id':'991528'},{'employe_no':'05781','id':'991529'},{'employe_no':'05783','id':'991532'},{'employe_no':'05784','id':'991533'},{'employe_no':'05785','id':'991534'},{'employe_no':'05787','id':'991537'},{'employe_no':'05791','id':'991538'},{'employe_no':'05790','id':'991540'},{'employe_no':'05793','id':'991541'},{'employe_no':'05796','id':'991545'},{'employe_no':'05797','id':'991546'},{'employe_no':'05799','id':'991548'},{'employe_no':'05800','id':'991549'},{'employe_no':'05801','id':'991550'},{'employe_no':'05803','id':'991551'},{'employe_no':'05802','id':'991552'},{'employe_no':'05804','id':'991553'},{'employe_no':'05808','id':'991554'},{'employe_no':'05805','id':'991555'},{'employe_no':'05806','id':'991556'},{'employe_no':'05807','id':'991557'},{'employe_no':'05809','id':'991558'},{'employe_no':'05810','id':'991559'},{'employe_no':'05812','id':'991561'},{'employe_no':'05706','id':'991563'},{'employe_no':'05814','id':'991565'},{'employe_no':'05816','id':'991566'},{'employe_no':'05815','id':'991567'},{'employe_no':'05817','id':'991568'},{'employe_no':'05818','id':'991569'},{'employe_no':'05820','id':'991570'},{'employe_no':'05821','id':'991571'},{'employe_no':'05822','id':'991572'},{'employe_no':'05819','id':'991573'},{'employe_no':'05824','id':'991574'},{'employe_no':'05826','id':'991576'},{'employe_no':'05827','id':'991577'},{'employe_no':'05831','id':'991580'},{'employe_no':'05832','id':'991581'},{'employe_no':'05833','id':'991582'},{'employe_no':'05834','id':'991583'},{'employe_no':'05835','id':'991584'},{'employe_no':'05836','id':'991585'},{'employe_no':'05837','id':'991587'},{'employe_no':'05838','id':'991588'},{'employe_no':'05839','id':'991589'},{'employe_no':'05841','id':'991590'},{'employe_no':'05840','id':'991591'},{'employe_no':'05842','id':'991592'},{'employe_no':'05847','id':'991593'},{'employe_no':'05849','id':'991594'},{'employe_no':'05843','id':'991595'},{'employe_no':'05850','id':'991596'},{'employe_no':'05844','id':'991597'},{'employe_no':'05851','id':'991599'},{'employe_no':'05852','id':'991600'},{'employe_no':'05853','id':'991601'},{'employe_no':'05854','id':'991602'}]";
	 * ;
	 */

	public static <E> void main(String[] args) throws ParseException {
		/*
		 * long currentTimeMillis = System.currentTimeMillis();
		 * System.out.println(System.currentTimeMillis()); List<Integer> list = new
		 * ArrayList<Integer>(); List<Integer> list2 = new ArrayList<Integer>(); for
		 * (int i = 0; i < 500; i++) { list.add(i); } for (int i = 300; i < 800; i++) {
		 * list2.add(i); }
		 * 
		 * for (int i = 0; i < list.size(); i++) { for (int j = 0; j < list2.size();
		 * j++) { if(list.get(i).equals(list2.get(j))) {
		 * System.out.println(list.get(i)); } } } long endTimeMillis =
		 * System.currentTimeMillis(); System.out.println('耗时: ' + (endTimeMillis -
		 * currentTimeMillis));
		 */

		/*
		 * Integer a = 3; Integer b = 3; Long c = 3L; System.out.println(a == b);
		 * System.out.println(a == c.longValue()); System.out.println(b ==
		 * c.longValue()); System.out.println(a.equals(b));
		 * System.out.println(a.equals(c.longValue())); System.out.println(b.equals(c));
		 */

		
		 //tring ste = "很好啊"; String str = "123asdf"; String st = "\r\n<script type=";
		 
		/*
		 * System.out.println(ste.length()); System.out.println(str.length());
		 * System.out.println(st.length());
		 */

		 //System.out.println(st.matches("^[\\u4e00-\\u9fa5_a-zA-Z0-9]+$")); 
		/*
		 * Long str = 1562303489L;
		 * 
		 * System.out.println(new Date().getTime()); System.out.println(new
		 * Date().getTime() - str); System.out.println((1562665119 -
		 * str)/(60*1000*60*24));
		 */

		/* List<String> list = ['','']; */

		// 团建excel title
		/*
		 * String[] teamBuildingCost = {'ID', '编号 ', '申请人', '城市', '公司', '申请人部门', '申请日期',
		 * '付款方式', '开户银行', '银行账号', '团建类型', '未核销金额', '发票金额', '应付金额', '团建日期', '团建人数',
		 * '人均/元', '报销原因', '进入时间', '停留时间', '状态'};
		 * 
		 * //津贴补助excel title String[] allowance = {'ID', '编号', '收款人户名', '城市', '申请人部门',
		 * '费用归属部门', '费用归属成本中心', '申请日期', '付款方式', '开户银行', '银行账号', '应付津贴金额', '报销原因',
		 * '进入时间', '停留时间', '状态'};
		 * 
		 * //业务差旅交通excel title String[] trafficCost = {'ID', '编号', '申请人', '城市', '申请人部门',
		 * '费用归属部门', '费用归属成本中心', '申请日期', '付款方式', '收款人户名', '开户银行', '银行账号', '未核销金额',
		 * '交通合计金额', '住宿合计金额', '招待合计金额', '应付金额', '派单费用总额', '报销原因', '进入时间', '停留时间',
		 * '状态'};
		 * 
		 * //其他费用excel title String[] otherCost = {'ID', '编号', '申请人', '城市', '申请人部门',
		 * '费用归属部门', '费用归属成本中心', '申请日期', '付款方式', '收款人户名', '开户银行', '银行账号', '未核销金额',
		 * '发票合计金额', '应付金额', '报销原因', '进入时间', '停留时间', '状态'}; List<String> list =
		 * Arrays.asList(teamBuildingCost); for (int i = 0; i < list.size(); i++) {
		 * System.out.println(list.get(i)); }
		 */

		/*
		 * Calendar instance = Calendar.getInstance(); String str = ''; int i =
		 * instance.get(Calendar.MONTH); int j = instance.get(Calendar.YEAR); str += j;
		 * if(i < 10) { str = str + '-0' + i; }else { str = str + '-' + i; }
		 * System.out.println(str);
		 */

		/*
		 * Byte num1 = 1; Byte num2 = 1; System.out.println(num1 == num2);
		 * System.out.println(num1.equals(num2));
		 */

		/*
		 * JSONArray jsonArray = new JSONArray(); JSONObject jsonObject = new
		 * JSONObject(); JSONObject jsonObject1 = new JSONObject(); jsonObject.put('id',
		 * 123); jsonObject1.put('name', '李四'); jsonArray.add(jsonObject);
		 * jsonArray.add(jsonObject1); System.out.println(jsonArray.toString());
		 * 
		 * String str =
		 * '{\'companyCode\':\'101\',\'reason\':\'\',\'reimburseDetailItem\':[{\'file\':
		 * \'http://test1.img.9now.net/te11002/application/20190618/143937_b10e5619a2.
		 * jpg\',\'reimburseDetailAmount\':\'100\',\'reimburseDesc\':\'0\',\'
		 * reimburseType\':1,\'reimburseEventDate\':\'2019-06-04\'}],\'applicantDept\':\
		 * '信息前端\',\'departmentId\':2729,\'departmentPath\':\'1951/2103/821/2519/2729\',
		 * \'applicantName\':\'张书豪\',\'cityId\':258,\'notVerification\':\'0\',\'
		 * groupBuildTime\':\'2019-06-17\',\'needDate\':\'2019-06-11\',\'
		 * groupBuildNumber\':\'10\',\'groupBuildType\':9,\'applicantId\':990824,\'
		 * perPersonAmount\':\'10.00\',\'groupBuildDetailItem\':[{\'groupDepartmentName\
		 * ':\'美味不用等\',\'id\':1,\'groupDeptNumber\':10,\'groupDeptAmount\':100}],\'
		 * dueAmountCn\':\'壹佰零拾零元零角零分\',\'applicantCompany\':\'美味不用等(上海)信息科技股份有限公司\',\'
		 * applyUserId\':\'990824\',\'_ACTIVITI_SKIP_EXPRESSION_ENABLED\':true,\'actRule
		 * \':{\'map\':{\'companyCode\':\'101\',\'reason\':\'\',\'reimburseDetailItem\':
		 * [{\'$ref\':\'$.reimburseDetailItem[0]\'}],\'applicantDept\':\'信息前端\',\'
		 * departmentId\':2729,\'departmentPath\':\'1951/2103/821/2519/2729\',\'
		 * applicantName\':\'张书豪\',\'cityId\':258,\'notVerification\':\'0\',\'
		 * applyUserId\':\'990824\',\'groupBuildTime\':\'2019-06-17\',\'isNanyangDesheng
		 * \':\'0\',\'_ACTIVITI_SKIP_EXPRESSION_ENABLED\':true,\'needDate\':\'2019-06-11
		 * \',\'groupBuildNumber\':\'10\',\'groupBuildType\':9,\'applicantId\':990824,\'
		 * perPersonAmount\':\'10.00\',\'needHRBP\':\'0\',\'groupBuildDetailItem\':[{\'
		 * $ref\':\'$.groupBuildDetailItem[0]\'}],\'dueAmountCn\':\'壹佰零拾零元零角零分\',\'
		 * applicantCompany\':\'美味不用等(上海)信息科技股份有限公司\'}}}'; JSONObject parse =
		 * JSON.parseObject(str); System.out.println(parse.get('companyCode'));
		 */

		/*
		 * Calendar instance = Calendar.getInstance(); String str = ''; int i =
		 * instance.get(Calendar.MONTH); int j = instance.get(Calendar.YEAR); str += j;
		 * if (i < 10) { str = str + '-0' + i; } else { str = str + '-' + i; }
		 * 
		 * System.out.println(str);
		 */

		/*
		 * List<Integer> ids = new ArrayList<Integer>(); List<Integer> noIds = new
		 * ArrayList<Integer>(); ids.add(1); ids.add(2); ids.add(3); ids.add(4);
		 * ids.add(5); ids.add(6); noIds.add(1); noIds.add(3); noIds.add(5);
		 */
		/*
		 * ids.stream().forEach( p -> { if (!list.contains(p)) { noIds.add(p); } } );
		 */
		// 内容写入到txt文件
		/*
		 * FileOutputStream fop = null; File file; String content = 'This is the text
		 * content';
		 * 
		 * try { file = new File('d:/newfile.txt'); fop = new FileOutputStream(file); //
		 * if file doesnt exists, then create it if (!file.exists()) {
		 * file.createNewFile(); } // get the content in bytes byte[] contentInBytes =
		 * content.getBytes(); fop.write(contentInBytes); fop.flush(); fop.close();
		 * System.out.println('Done'); } catch (IOException e) { e.printStackTrace(); }
		 * finally { try { if (fop != null) { fop.close(); } } catch (IOException e) {
		 * e.printStackTrace(); } }
		 */

		/*
		 * SimpleDateFormat sdf = new SimpleDateFormat('yyyy-MM-dd HH:mm:ss');
		 * //sdf.format(1562338885); System.out.println(sdf.format(1562338885));
		 */

		/*
		 * String str = '{'id':1,'name':'lz'}'; JSONObject userJson =
		 * JSONObject.parseObject(str); System.out.println(userJson);
		 */

		/*
		 * String cityNameString = '浦东新区'; if(cityNameString.endsWith('新区')) { String
		 * cityAreaName = cityNameString.substring(0,cityNameString.length() - 2);
		 * System.out.println(cityAreaName); }
		 */

		/*
		 * SimpleDateFormat simpleDateFormat = new SimpleDateFormat('yyyy-MM-dd
		 * HH:mm:ss'); System.out.println(simpleDateFormat.format(new Date()));
		 * 
		 * 
		 */
		/*
		 * String[] dto =
		 * {"12578","05858","05734","04217","12578","13577","04404","04217","05858",
		 * "12578","05734"};
		 */

		/*
		 * String date =
		 * "[{'employe_no':'10011','id':'4'},{'employe_no':'10013','id':'6'},{'employe_no':'10015','id':'8'},{'employe_no':'10016','id':'10'},{'employe_no':'10060','id':'32'},{'employe_no':'10069','id':'34'},{'employe_no':'10036','id':'40'},{'employe_no':'10039','id':'42'},{'employe_no':'10057','id':'44'},{'employe_no':'10001','id':'66'},{'employe_no':'10003','id':'68'},{'employe_no':'00004','id':'70'},{'employe_no':'10002','id':'72'},{'employe_no':'10005','id':'74'},{'employe_no':'00007','id':'76'},{'employe_no':'00020','id':'80'},{'employe_no':'10008','id':'90'},{'employe_no':'10017','id':'92'},{'employe_no':'10048','id':'94'},{'employe_no':'10062','id':'96'},{'employe_no':'10071','id':'98'},{'employe_no':'10038','id':'110'},{'employe_no':'00089','id':'118'},{'employe_no':'10073','id':'148'},{'employe_no':'10145','id':'166'},{'employe_no':'10116','id':'180'},{'employe_no':'10068','id':'182'},{'employe_no':'00173','id':'207'},{'employe_no':'10150','id':'211'},{'employe_no':'10131','id':'217'},{'employe_no':'10180','id':'244'},{'employe_no':'10197','id':'250'},{'employe_no':'10201','id':'260'},{'employe_no':'00160','id':'268'},{'employe_no':'00128','id':'276'},{'employe_no':'10188','id':'278'},{'employe_no':'10204','id':'282'},{'employe_no':'10205','id':'286'},{'employe_no':'10213','id':'314'},{'employe_no':'10229','id':'326'},{'employe_no':'10227','id':'334'},{'employe_no':'10139','id':'336'},{'employe_no':'10107','id':'338'},{'employe_no':'10243','id':'359'},{'employe_no':'10277','id':'361'},{'employe_no':'10255','id':'375'},{'employe_no':'00066','id':'379'},{'employe_no':'10301','id':'381'},{'employe_no':'10222','id':'397'},{'employe_no':'10252','id':'399'},{'employe_no':'10329','id':'401'},{'employe_no':'10265','id':'421'},{'employe_no':'10298','id':'469'},{'employe_no':'10303','id':'473'},{'employe_no':'10238','id':'507'},{'employe_no':'10341','id':'524'},{'employe_no':'03889','id':'529'},{'employe_no':'00262','id':'544'},{'employe_no':'10357','id':'546'},{'employe_no':'10382','id':'557'},{'employe_no':'00369','id':'564'},{'employe_no':'10396','id':'593'},{'employe_no':'10395','id':'595'},{'employe_no':'10403','id':'598'},{'employe_no':'10426','id':'609'},{'employe_no':'10442','id':'613'},{'employe_no':'00432','id':'617'},{'employe_no':'00421','id':'619'},{'employe_no':'10410','id':'623'},{'employe_no':'10332','id':'630'},{'employe_no':'00381','id':'636'},{'employe_no':'10483','id':'653'},{'employe_no':'10517','id':'692'},{'employe_no':'10547','id':'712'},{'employe_no':'10497','id':'718'},{'employe_no':'10398','id':'730'},{'employe_no':'10530','id':'751'},{'employe_no':'00597','id':'756'},{'employe_no':'10538','id':'769'},{'employe_no':'10607','id':'782'},{'employe_no':'00579','id':'790'},{'employe_no':'00592','id':'793'},{'employe_no':'10563','id':'795'},{'employe_no':'10622','id':'810'},{'employe_no':'10627','id':'814'},{'employe_no':'10648','id':'843'},{'employe_no':'10666','id':'865'},{'employe_no':'10615','id':'872'},{'employe_no':'00685','id':'883'},{'employe_no':'00500','id':'886'},{'employe_no':'00706','id':'889'},{'employe_no':'00673','id':'898'},{'employe_no':'10651','id':'904'},{'employe_no':'10029','id':'907'},{'employe_no':'10647','id':'912'},{'employe_no':'00721','id':'922'},{'employe_no':'00747','id':'947'},{'employe_no':'10730','id':'966'},{'employe_no':'00739','id':'971'},{'employe_no':'00773','id':'976'},{'employe_no':'10893','id':'1006'},{'employe_no':'00777','id':'1008'},{'employe_no':'10778','id':'1009'},{'employe_no':'10759','id':'1010'},{'employe_no':'10796','id':'1023'},{'employe_no':'00808','id':'1034'},{'employe_no':'10812','id':'1054'},{'employe_no':'10837','id':'1060'},{'employe_no':'00872','id':'1113'},{'employe_no':'10871','id':'1115'},{'employe_no':'10906','id':'1120'},{'employe_no':'10877','id':'1127'},{'employe_no':'05825','id':'1135'},{'employe_no':'10910','id':'1143'},{'employe_no':'10056','id':'1144'},{'employe_no':'00922','id':'1157'},{'employe_no':'10936','id':'1169'},{'employe_no':'10928','id':'1183'},{'employe_no':'00944','id':'1190'},{'employe_no':'10943','id':'1195'},{'employe_no':'10954','id':'1201'},{'employe_no':'10207','id':'1208'},{'employe_no':'10963','id':'1211'},{'employe_no':'10957','id':'1217'},{'employe_no':'01004','id':'1245'},{'employe_no':'01003','id':'1246'},{'employe_no':'00996','id':'1255'},{'employe_no':'11006','id':'1261'},{'employe_no':'10993','id':'1269'},{'employe_no':'11031','id':'1290'},{'employe_no':'11059','id':'1305'},{'employe_no':'01058','id':'1306'},{'employe_no':'11036','id':'1310'},{'employe_no':'11034','id':'1311'},{'employe_no':'11032','id':'1314'},{'employe_no':'11082','id':'1337'},{'employe_no':'01088','id':'1353'},{'employe_no':'11117','id':'1380'},{'employe_no':'11118','id':'1381'},{'employe_no':'01130','id':'1397'},{'employe_no':'11142','id':'1404'},{'employe_no':'11145','id':'1407'},{'employe_no':'11152','id':'1412'},{'employe_no':'11157','id':'1417'},{'employe_no':'01158','id':'1418'},{'employe_no':'11162','id':'1422'},{'employe_no':'10235','id':'1425'},{'employe_no':'10035','id':'1431'},{'employe_no':'10111','id':'1435'},{'employe_no':'00137','id':'1437'},{'employe_no':'11170','id':'1452'},{'employe_no':'11172','id':'1454'},{'employe_no':'11182','id':'1461'},{'employe_no':'11192','id':'1473'},{'employe_no':'11198','id':'1478'},{'employe_no':'11199','id':'1479'},{'employe_no':'11207','id':'1487'},{'employe_no':'11217','id':'1491'},{'employe_no':'01208','id':'1494'},{'employe_no':'11224','id':'1504'},{'employe_no':'11226','id':'1506'},{'employe_no':'01244','id':'1521'},{'employe_no':'11245','id':'1522'},{'employe_no':'11271','id':'1549'},{'employe_no':'11286','id':'1568'},{'employe_no':'11289','id':'1571'},{'employe_no':'11305','id':'1586'},{'employe_no':'11342','id':'1625'},{'employe_no':'11343','id':'1626'},{'employe_no':'11348','id':'1630'},{'employe_no':'11357','id':'1638'},{'employe_no':'11376','id':'1660'},{'employe_no':'11377','id':'1661'},{'employe_no':'11394','id':'1678'},{'employe_no':'11422','id':'1712'},{'employe_no':'11430','id':'1725'},{'employe_no':'01437','id':'1727'},{'employe_no':'11448','id':'1740'},{'employe_no':'01138','id':'1746'},{'employe_no':'11454','id':'1749'},{'employe_no':'11525','id':'1763'},{'employe_no':'X0001','id':'1770'},{'employe_no':'11474','id':'1773'},{'employe_no':'X0002','id':'1781'},{'employe_no':'X0003','id':'1782'},{'employe_no':'11492','id':'1793'},{'employe_no':'11502','id':'1803'},{'employe_no':'11503','id':'1804'},{'employe_no':'11522','id':'1819'},{'employe_no':'01524','id':'1821'},{'employe_no':'990001','id':'1847'},{'employe_no':'990002','id':'1848'},{'employe_no':'990005','id':'1851'},{'employe_no':'990006','id':'1852'},{'employe_no':'11551','id':'1853'},{'employe_no':'11554','id':'1856'},{'employe_no':'11565','id':'1868'},{'employe_no':'11598','id':'1899'},{'employe_no':'11602','id':'1903'},{'employe_no':'11607','id':'1908'},{'employe_no':'11613','id':'1914'},{'employe_no':'11642','id':'1927'},{'employe_no':'01639','id':'1935'},{'employe_no':'11682','id':'1983'},{'employe_no':'11693','id':'1993'},{'employe_no':'11694','id':'1994'},{'employe_no':'11706','id':'2006'},{'employe_no':'01714','id':'2011'},{'employe_no':'11733','id':'2034'},{'employe_no':'11735','id':'2035'},{'employe_no':'11760','id':'2054'},{'employe_no':'990007','id':'2057'},{'employe_no':'990008','id':'2058'},{'employe_no':'11777','id':'2073'},{'employe_no':'11801','id':'2097'},{'employe_no':'01805','id':'2102'},{'employe_no':'01825','id':'2121'},{'employe_no':'990010','id':'2132'},{'employe_no':'11882','id':'2179'},{'employe_no':'11881','id':'2181'},{'employe_no':'11898','id':'2190'},{'employe_no':'11910','id':'2204'},{'employe_no':'11927','id':'2219'},{'employe_no':'11929','id':'2221'},{'employe_no':'11935','id':'2227'},{'employe_no':'11925','id':'2228'},{'employe_no':'11940','id':'2233'},{'employe_no':'11941','id':'2234'},{'employe_no':'01943','id':'2236'},{'employe_no':'11944','id':'2237'},{'employe_no':'11951','id':'2244'},{'employe_no':'11960','id':'2253'},{'employe_no':'11963','id':'2259'},{'employe_no':'01968','id':'2261'},{'employe_no':'11970','id':'2266'},{'employe_no':'01972','id':'2268'},{'employe_no':'11973','id':'2269'},{'employe_no':'11985','id':'2280'},{'employe_no':'11991','id':'2286'},{'employe_no':'11570','id':'2294'},{'employe_no':'12003','id':'2299'},{'employe_no':'12005','id':'2301'},{'employe_no':'02006','id':'2302'},{'employe_no':'12013','id':'2310'},{'employe_no':'12023','id':'2319'},{'employe_no':'12024','id':'2320'},{'employe_no':'12032','id':'2324'},{'employe_no':'12041','id':'2337'},{'employe_no':'02045','id':'2341'},{'employe_no':'12046','id':'2342'},{'employe_no':'12047','id':'2343'},{'employe_no':'12049','id':'2347'},{'employe_no':'12052','id':'2348'},{'employe_no':'02055','id':'2351'},{'employe_no':'02062','id':'2359'},{'employe_no':'12071','id':'2369'},{'employe_no':'12072','id':'2370'},{'employe_no':'12102','id':'2399'},{'employe_no':'05848','id':'2404'},{'employe_no':'90059','id':'2408'},{'employe_no':'02114','id':'2411'},{'employe_no':'02119','id':'2416'},{'employe_no':'02123','id':'2420'},{'employe_no':'02124','id':'2421'},{'employe_no':'12134','id':'2432'},{'employe_no':'12141','id':'2437'},{'employe_no':'02142','id':'2438'},{'employe_no':'12144','id':'2440'},{'employe_no':'02151','id':'2446'},{'employe_no':'12154','id':'2449'},{'employe_no':'02156','id':'2451'},{'employe_no':'02158','id':'2453'},{'employe_no':'02159','id':'2454'},{'employe_no':'02175','id':'2470'},{'employe_no':'02180','id':'2473'},{'employe_no':'12188','id':'2482'},{'employe_no':'02190','id':'2489'},{'employe_no':'12204','id':'2498'},{'employe_no':'02205','id':'2499'},{'employe_no':'12221','id':'2516'},{'employe_no':'12223','id':'2527'},{'employe_no':'12235','id':'2529'},{'employe_no':'12242','id':'2536'},{'employe_no':'12247','id':'2539'},{'employe_no':'12256','id':'2550'},{'employe_no':'12257','id':'2551'},{'employe_no':'02280','id':'2575'},{'employe_no':'02283','id':'2578'},{'employe_no':'12286','id':'2581'},{'employe_no':'02288','id':'2583'},{'employe_no':'12303','id':'2598'},{'employe_no':'02313','id':'2608'},{'employe_no':'02319','id':'2614'},{'employe_no':'12323','id':'2618'},{'employe_no':'02324','id':'2619'},{'employe_no':'12332','id':'2629'},{'employe_no':'02351','id':'2644'},{'employe_no':'12372','id':'2668'},{'employe_no':'02399','id':'2695'},{'employe_no':'02401','id':'2697'},{'employe_no':'02423','id':'2716'},{'employe_no':'12437','id':'2734'},{'employe_no':'12441','id':'2737'},{'employe_no':'12463','id':'2756'},{'employe_no':'12468','id':'2764'},{'employe_no':'02469','id':'2765'},{'employe_no':'12476','id':'2772'},{'employe_no':'02477','id':'2773'},{'employe_no':'12480','id':'2776'},{'employe_no':'12489','id':'2785'},{'employe_no':'02546','id':'2867'},{'employe_no':'02547','id':'2868'},{'employe_no':'02560','id':'2881'},{'employe_no':'12561','id':'2882'},{'employe_no':'12563','id':'2884'},{'employe_no':'12564','id':'2885'},{'employe_no':'12565','id':'2898'},{'employe_no':'02571','id':'2899'},{'employe_no':'12577','id':'2905'},{'employe_no':'12578','id':'2906'},{'employe_no':'02585','id':'2915'},{'employe_no':'02587','id':'2916'},{'employe_no':'12592','id':'2917'},{'employe_no':'12590','id':'2923'},{'employe_no':'12607','id':'2942'},{'employe_no':'12611','id':'2949'},{'employe_no':'02599','id':'2953'},{'employe_no':'12620','id':'2959'},{'employe_no':'12622','id':'2964'},{'employe_no':'12629','id':'2971'},{'employe_no':'12635','id':'2973'},{'employe_no':'02637','id':'2974'},{'employe_no':'02657','id':'2996'},{'employe_no':'02659','id':'2998'},{'employe_no':'12674','id':'3019'},{'employe_no':'12697','id':'3022'},{'employe_no':'12687','id':'3034'},{'employe_no':'12686','id':'3038'},{'employe_no':'12708','id':'3049'},{'employe_no':'02733','id':'3065'},{'employe_no':'12750','id':'3087'},{'employe_no':'12760','id':'3098'},{'employe_no':'12761','id':'3099'},{'employe_no':'12764','id':'3101'},{'employe_no':'02766','id':'3103'},{'employe_no':'02808','id':'3145'},{'employe_no':'02815','id':'3156'},{'employe_no':'02816','id':'3157'},{'employe_no':'02836','id':'3175'},{'employe_no':'12832','id':'3176'},{'employe_no':'02834','id':'3178'},{'employe_no':'02850','id':'3193'},{'employe_no':'02856','id':'3195'},{'employe_no':'12853','id':'3198'},{'employe_no':'12851','id':'3201'},{'employe_no':'02860','id':'3203'},{'employe_no':'02864','id':'3206'},{'employe_no':'02874','id':'3218'},{'employe_no':'12879','id':'3222'},{'employe_no':'12908','id':'3251'},{'employe_no':'12911','id':'3254'},{'employe_no':'02913','id':'3256'},{'employe_no':'12920','id':'3263'},{'employe_no':'12926','id':'3269'},{'employe_no':'02947','id':'3290'},{'employe_no':'12952','id':'3295'},{'employe_no':'02954','id':'3299'},{'employe_no':'12959','id':'3303'},{'employe_no':'12971','id':'3312'},{'employe_no':'02974','id':'3318'},{'employe_no':'02982','id':'3326'},{'employe_no':'12995','id':'3333'},{'employe_no':'02997','id':'3339'},{'employe_no':'03014','id':'3357'},{'employe_no':'03018','id':'3361'},{'employe_no':'03019','id':'3362'},{'employe_no':'03022','id':'3365'},{'employe_no':'13034','id':'3377'},{'employe_no':'03038','id':'3381'},{'employe_no':'13053','id':'3392'},{'employe_no':'13052','id':'3393'},{'employe_no':'13058','id':'3401'},{'employe_no':'13068','id':'3412'},{'employe_no':'13078','id':'3422'},{'employe_no':'13086','id':'3428'},{'employe_no':'03101','id':'3445'},{'employe_no':'13104','id':'3461'},{'employe_no':'13108','id':'3462'},{'employe_no':'13109','id':'3463'},{'employe_no':'13118','id':'3472'},{'employe_no':'03130','id':'3484'},{'employe_no':'03136','id':'3489'},{'employe_no':'03139','id':'3492'},{'employe_no':'03142','id':'3496'},{'employe_no':'03161','id':'3512'},{'employe_no':'13162','id':'3513'},{'employe_no':'13183','id':'3523'},{'employe_no':'03180','id':'3535'},{'employe_no':'13182','id':'3537'},{'employe_no':'13189','id':'3541'},{'employe_no':'13186','id':'3543'},{'employe_no':'13205','id':'3567'},{'employe_no':'03212','id':'3572'},{'employe_no':'13214','id':'3574'},{'employe_no':'13220','id':'3578'},{'employe_no':'13221','id':'3581'},{'employe_no':'13223','id':'3583'},{'employe_no':'13236','id':'3596'},{'employe_no':'13252','id':'3613'},{'employe_no':'03259','id':'3620'},{'employe_no':'13264','id':'3625'},{'employe_no':'13277','id':'3639'},{'employe_no':'13287','id':'3649'},{'employe_no':'13299','id':'3660'},{'employe_no':'13302','id':'3668'},{'employe_no':'13309','id':'3675'},{'employe_no':'13310','id':'3676'},{'employe_no':'13337','id':'3691'},{'employe_no':'13344','id':'3705'},{'employe_no':'13380','id':'3740'},{'employe_no':'03405','id':'3765'},{'employe_no':'03406','id':'3766'},{'employe_no':'03407','id':'3770'},{'employe_no':'03425','id':'3813'},{'employe_no':'13441','id':'3817'},{'employe_no':'13442','id':'3818'},{'employe_no':'03437','id':'3822'},{'employe_no':'13430','id':'3825'},{'employe_no':'90001','id':'3852'},{'employe_no':'03486','id':'3887'},{'employe_no':'03498','id':'3899'},{'employe_no':'03500','id':'3901'},{'employe_no':'13506','id':'3910'},{'employe_no':'03516','id':'3918'},{'employe_no':'03520','id':'3920'},{'employe_no':'03522','id':'3922'},{'employe_no':'03535','id':'3957'},{'employe_no':'13536','id':'3958'},{'employe_no':'03904','id':'3971'},{'employe_no':'03548','id':'3975'},{'employe_no':'03925','id':'3977'},{'employe_no':'13557','id':'3982'},{'employe_no':'13559','id':'3983'},{'employe_no':'13577','id':'4000'},{'employe_no':'13585','id':'4006'},{'employe_no':'13586','id':'4026'},{'employe_no':'03612','id':'4037'},{'employe_no':'13615','id':'4040'},{'employe_no':'03660','id':'4112'},{'employe_no':'03631','id':'4146'},{'employe_no':'03677','id':'4166'},{'employe_no':'03684','id':'4249'},{'employe_no':'03704','id':'4287'},{'employe_no':'03745','id':'4353'},{'employe_no':'03750','id':'4446'},{'employe_no':'03780','id':'4464'},{'employe_no':'03802','id':'4477'},{'employe_no':'03806','id':'4482'},{'employe_no':'03813','id':'4486'},{'employe_no':'03712','id':'4510'},{'employe_no':'03713','id':'4511'},{'employe_no':'03758','id':'4520'},{'employe_no':'03804','id':'4525'},{'employe_no':'03711','id':'4549'},{'employe_no':'03779','id':'4559'},{'employe_no':'03793','id':'4565'},{'employe_no':'03826','id':'4581'},{'employe_no':'03835','id':'4596'},{'employe_no':'03732','id':'4627'},{'employe_no':'03870','id':'4628'},{'employe_no':'03815','id':'4641'},{'employe_no':'03849','id':'4666'},{'employe_no':'03852','id':'4670'},{'employe_no':'988888','id':'988888'},{'employe_no':'03778','id':'988898'},{'employe_no':'03834','id':'988901'},{'employe_no':'03840','id':'988902'},{'employe_no':'03907','id':'988911'},{'employe_no':'03929','id':'988919'},{'employe_no':'03941','id':'988931'},{'employe_no':'03857','id':'988952'},{'employe_no':'03823','id':'988956'},{'employe_no':'990011','id':'988965'},{'employe_no':'03856','id':'988967'},{'employe_no':'03882','id':'988971'},{'employe_no':'03886','id':'988972'},{'employe_no':'03892','id':'988974'},{'employe_no':'03884','id':'988993'},{'employe_no':'03910','id':'988996'},{'employe_no':'03918','id':'989013'},{'employe_no':'03922','id':'989017'},{'employe_no':'03942','id':'989044'},{'employe_no':'03946','id':'989045'},{'employe_no':'03951','id':'989048'},{'employe_no':'03959','id':'989069'},{'employe_no':'03969','id':'989074'},{'employe_no':'90060','id':'989079'},{'employe_no':'03968','id':'989086'},{'employe_no':'03980','id':'989089'},{'employe_no':'03988','id':'989096'},{'employe_no':'03997','id':'989100'},{'employe_no':'04001','id':'989103'},{'employe_no':'04002','id':'989104'},{'employe_no':'03992','id':'989112'},{'employe_no':'04008','id':'989115'},{'employe_no':'04027','id':'989133'},{'employe_no':'04029','id':'989136'},{'employe_no':'04053','id':'989143'},{'employe_no':'04038','id':'989155'},{'employe_no':'04047','id':'989161'},{'employe_no':'04050','id':'989167'},{'employe_no':'05829','id':'989171'},{'employe_no':'04109','id':'989176'},{'employe_no':'04061','id':'989196'},{'employe_no':'04073','id':'989200'},{'employe_no':'04082','id':'989203'},{'employe_no':'05845','id':'989210'},{'employe_no':'04108','id':'989215'},{'employe_no':'04116','id':'989217'},{'employe_no':'04079','id':'989223'},{'employe_no':'04016','id':'989226'},{'employe_no':'04091','id':'989227'},{'employe_no':'14121','id':'989234'},{'employe_no':'04126','id':'989245'},{'employe_no':'04133','id':'989247'},{'employe_no':'04134','id':'989248'},{'employe_no':'04135','id':'989249'},{'employe_no':'04138','id':'989252'},{'employe_no':'04139','id':'989253'},{'employe_no':'04158','id':'989264'},{'employe_no':'04171','id':'989281'},{'employe_no':'04174','id':'989284'},{'employe_no':'04179','id':'989289'},{'employe_no':'04186','id':'989304'},{'employe_no':'04189','id':'989306'},{'employe_no':'04200','id':'989315'},{'employe_no':'04205','id':'989317'},{'employe_no':'04207','id':'989318'},{'employe_no':'04217','id':'989324'},{'employe_no':'04227','id':'989330'},{'employe_no':'04237','id':'989335'},{'employe_no':'04208','id':'989343'},{'employe_no':'04251','id':'989365'},{'employe_no':'04257','id':'989366'},{'employe_no':'04258','id':'989368'},{'employe_no':'04248','id':'989373'},{'employe_no':'04265','id':'989383'},{'employe_no':'90065','id':'989392'},{'employe_no':'04281','id':'989403'},{'employe_no':'04292','id':'989413'},{'employe_no':'001','id':'989422'},{'employe_no':'002','id':'989423'},{'employe_no':'003','id':'989424'},{'employe_no':'004','id':'989425'},{'employe_no':'005','id':'989426'},{'employe_no':'04319','id':'989445'},{'employe_no':'04324','id':'989454'},{'employe_no':'04342','id':'989468'},{'employe_no':'04352','id':'989478'},{'employe_no':'04351','id':'989484'},{'employe_no':'04360','id':'989487'},{'employe_no':'04361','id':'989488'},{'employe_no':'04363','id':'989490'},{'employe_no':'01686','id':'989507'},{'employe_no':'04390','id':'989512'},{'employe_no':'04393','id':'989514'},{'employe_no':'04374','id':'989522'},{'employe_no':'04415','id':'989532'},{'employe_no':'04404','id':'989545'},{'employe_no':'04423','id':'989554'},{'employe_no':'04431','id':'989559'},{'employe_no':'90071','id':'989565'},{'employe_no':'04460','id':'989596'},{'employe_no':'04464','id':'989599'},{'employe_no':'04472','id':'989604'},{'employe_no':'04447','id':'989609'},{'employe_no':'04477','id':'989616'},{'employe_no':'04483','id':'989625'},{'employe_no':'009','id':'989639'},{'employe_no':'04490','id':'989641'},{'employe_no':'04492','id':'989643'},{'employe_no':'04500','id':'989654'},{'employe_no':'04489','id':'989664'},{'employe_no':'04508','id':'989666'},{'employe_no':'04515','id':'989668'},{'employe_no':'04549','id':'989703'},{'employe_no':'04550','id':'989704'},{'employe_no':'04562','id':'989711'},{'employe_no':'04572','id':'989716'},{'employe_no':'04578','id':'989725'},{'employe_no':'04579','id':'989726'},{'employe_no':'04594','id':'989741'},{'employe_no':'04606','id':'989750'},{'employe_no':'04614','id':'989758'},{'employe_no':'04615','id':'989759'},{'employe_no':'04557','id':'989767'},{'employe_no':'04555','id':'989776'},{'employe_no':'04545','id':'989780'},{'employe_no':'04647','id':'989827'},{'employe_no':'04652','id':'989831'},{'employe_no':'04653','id':'989832'},{'employe_no':'04661','id':'989842'},{'employe_no':'04667','id':'989848'},{'employe_no':'04674','id':'989856'},{'employe_no':'04675','id':'989857'},{'employe_no':'04695','id':'989877'},{'employe_no':'04698','id':'989880'},{'employe_no':'04699','id':'989882'},{'employe_no':'04705','id':'989887'},{'employe_no':'04725','id':'989911'},{'employe_no':'04743','id':'989928'},{'employe_no':'04739','id':'989929'},{'employe_no':'04750','id':'989934'},{'employe_no':'04745','id':'989937'},{'employe_no':'04759','id':'989944'},{'employe_no':'04766','id':'989951'},{'employe_no':'04773','id':'989958'},{'employe_no':'04774','id':'989963'},{'employe_no':'04788','id':'989976'},{'employe_no':'04785','id':'989979'},{'employe_no':'90083','id':'989980'},{'employe_no':'04798','id':'989989'},{'employe_no':'04799','id':'989990'},{'employe_no':'04800','id':'989991'},{'employe_no':'04813','id':'990005'},{'employe_no':'04854','id':'990047'},{'employe_no':'90084','id':'990072'},{'employe_no':'04910','id':'990109'},{'employe_no':'04912','id':'990110'},{'employe_no':'04921','id':'990115'},{'employe_no':'04917','id':'990118'},{'employe_no':'04933','id':'990138'},{'employe_no':'04940','id':'990140'},{'employe_no':'04946','id':'990149'},{'employe_no':'04951','id':'990151'},{'employe_no':'04953','id':'990154'},{'employe_no':'04962','id':'990161'},{'employe_no':'14974','id':'990173'},{'employe_no':'2','id':'990191'},{'employe_no':'3','id':'990192'},{'employe_no':'4','id':'990193'},{'employe_no':'5','id':'990194'},{'employe_no':'7','id':'990198'},{'employe_no':'8','id':'990199'},{'employe_no':'9','id':'990200'},{'employe_no':'10','id':'990201'},{'employe_no':'11','id':'990202'},{'employe_no':'12','id':'990203'},{'employe_no':'13','id':'990204'},{'employe_no':'17','id':'990208'},{'employe_no':'19','id':'990210'},{'employe_no':'20','id':'990211'},{'employe_no':'21','id':'990212'},{'employe_no':'23','id':'990214'},{'employe_no':'24','id':'990215'},{'employe_no':'26','id':'990217'},{'employe_no':'27','id':'990218'},{'employe_no':'28','id':'990219'},{'employe_no':'50','id':'990220'},{'employe_no':'30','id':'990222'},{'employe_no':'31','id':'990223'},{'employe_no':'32','id':'990224'},{'employe_no':'53','id':'990225'},{'employe_no':'33','id':'990226'},{'employe_no':'34','id':'990227'},{'employe_no':'35','id':'990229'},{'employe_no':'56','id':'990230'},{'employe_no':'37','id':'990231'},{'employe_no':'38','id':'990232'},{'employe_no':'39','id':'990233'},{'employe_no':'40','id':'990234'},{'employe_no':'41','id':'990235'},{'employe_no':'43','id':'990236'},{'employe_no':'44','id':'990237'},{'employe_no':'45','id':'990238'},{'employe_no':'46','id':'990239'},{'employe_no':'04998','id':'990250'},{'employe_no':'05003','id':'990256'},{'employe_no':'05012','id':'990264'},{'employe_no':'05015','id':'990269'},{'employe_no':'05032','id':'990283'},{'employe_no':'05033','id':'990284'},{'employe_no':'05058','id':'990311'},{'employe_no':'05067','id':'990325'},{'employe_no':'05071','id':'990327'},{'employe_no':'05080','id':'990342'},{'employe_no':'05083','id':'990343'},{'employe_no':'05084','id':'990344'},{'employe_no':'05091','id':'990349'},{'employe_no':'05102','id':'990362'},{'employe_no':'05113','id':'990373'},{'employe_no':'63','id':'990377'},{'employe_no':'64','id':'990378'},{'employe_no':'65','id':'990379'},{'employe_no':'66','id':'990380'},{'employe_no':'68','id':'990382'},{'employe_no':'05154','id':'990434'},{'employe_no':'90093','id':'990443'},{'employe_no':'05160','id':'990445'},{'employe_no':'05192','id':'990478'},{'employe_no':'90095','id':'990482'},{'employe_no':'05195','id':'990483'},{'employe_no':'05197','id':'990495'},{'employe_no':'05199','id':'990502'},{'employe_no':'05202','id':'990504'},{'employe_no':'05204','id':'990506'},{'employe_no':'05207','id':'990514'},{'employe_no':'05209','id':'990522'},{'employe_no':'05212','id':'990526'},{'employe_no':'05223','id':'990558'},{'employe_no':'05224','id':'990559'},{'employe_no':'05240','id':'990596'},{'employe_no':'05225','id':'990597'},{'employe_no':'05227','id':'990598'},{'employe_no':'05245','id':'990600'},{'employe_no':'05250','id':'990604'},{'employe_no':'05251','id':'990607'},{'employe_no':'05256','id':'990612'},{'employe_no':'05269','id':'990616'},{'employe_no':'05249','id':'990618'},{'employe_no':'05259','id':'990619'},{'employe_no':'05261','id':'990621'},{'employe_no':'05264','id':'990622'},{'employe_no':'05265','id':'990623'},{'employe_no':'05287','id':'990714'},{'employe_no':'05303','id':'990724'},{'employe_no':'05316','id':'990737'},{'employe_no':'05321','id':'990742'},{'employe_no':'05324','id':'990745'},{'employe_no':'05330','id':'990751'},{'employe_no':'05337','id':'990757'},{'employe_no':'05338','id':'990760'},{'employe_no':'05344','id':'990766'},{'employe_no':'05352','id':'990773'},{'employe_no':'05366','id':'990787'},{'employe_no':'05372','id':'990794'},{'employe_no':'05375','id':'990796'},{'employe_no':'05378','id':'990798'},{'employe_no':'05387','id':'990807'},{'employe_no':'05386','id':'990808'},{'employe_no':'05395','id':'990816'},{'employe_no':'05402','id':'990824'},{'employe_no':'05415','id':'990836'},{'employe_no':'05420','id':'990843'},{'employe_no':'05425','id':'990846'},{'employe_no':'05430','id':'990852'},{'employe_no':'05436','id':'990857'},{'employe_no':'05446','id':'990867'},{'employe_no':'05470','id':'990891'},{'employe_no':'05472','id':'990894'},{'employe_no':'05476','id':'990902'},{'employe_no':'05477','id':'990903'},{'employe_no':'05480','id':'990905'},{'employe_no':'05492','id':'990913'},{'employe_no':'05505','id':'990926'},{'employe_no':'05507','id':'990929'},{'employe_no':'05518','id':'990938'},{'employe_no':'05520','id':'990943'},{'employe_no':'05523','id':'990944'},{'employe_no':'05524','id':'990945'},{'employe_no':'05525','id':'990946'},{'employe_no':'05544','id':'990956'},{'employe_no':'05535','id':'990959'},{'employe_no':'05558','id':'990980'},{'employe_no':'05560','id':'990982'},{'employe_no':'05577','id':'991002'},{'employe_no':'999997','id':'991004'},{'employe_no':'999998','id':'991005'},{'employe_no':'999999','id':'991006'},{'employe_no':'05586','id':'991011'},{'employe_no':'05596','id':'991021'},{'employe_no':'05598','id':'991024'},{'employe_no':'05604','id':'991030'},{'employe_no':'05623','id':'991151'},{'employe_no':'05624','id':'991152'},{'employe_no':'05625','id':'991153'},{'employe_no':'05626','id':'991154'},{'employe_no':'05627','id':'991155'},{'employe_no':'05637','id':'991194'},{'employe_no':'05641','id':'991387'},{'employe_no':'05640','id':'991388'},{'employe_no':'05642','id':'991389'},{'employe_no':'05643','id':'991390'},{'employe_no':'05645','id':'991392'},{'employe_no':'05646','id':'991393'},{'employe_no':'05650','id':'991394'},{'employe_no':'05652','id':'991399'},{'employe_no':'05654','id':'991401'},{'employe_no':'05659','id':'991402'},{'employe_no':'05657','id':'991403'},{'employe_no':'05664','id':'991405'},{'employe_no':'05660','id':'991408'},{'employe_no':'05661','id':'991412'},{'employe_no':'05665','id':'991415'},{'employe_no':'05667','id':'991418'},{'employe_no':'05668','id':'991419'},{'employe_no':'05673','id':'991423'},{'employe_no':'05678','id':'991429'},{'employe_no':'05679','id':'991430'},{'employe_no':'05680','id':'991431'},{'employe_no':'05682','id':'991433'},{'employe_no':'05687','id':'991438'},{'employe_no':'05688','id':'991439'},{'employe_no':'05689','id':'991440'},{'employe_no':'05690','id':'991443'},{'employe_no':'05695','id':'991445'},{'employe_no':'05698','id':'991447'},{'employe_no':'05697','id':'991449'},{'employe_no':'05699','id':'991453'},{'employe_no':'05704','id':'991454'},{'employe_no':'05707','id':'991457'},{'employe_no':'05709','id':'991458'},{'employe_no':'05703','id':'991459'},{'employe_no':'05713','id':'991463'},{'employe_no':'05714','id':'991464'},{'employe_no':'05716','id':'991466'},{'employe_no':'05719','id':'991470'},{'employe_no':'05726','id':'991473'},{'employe_no':'05725','id':'991474'},{'employe_no':'05718','id':'991475'},{'employe_no':'05727','id':'991477'},{'employe_no':'05729','id':'991478'},{'employe_no':'05730','id':'991479'},{'employe_no':'05731','id':'991480'},{'employe_no':'05734','id':'991482'},{'employe_no':'05733','id':'991483'},{'employe_no':'05735','id':'991484'},{'employe_no':'05736','id':'991485'},{'employe_no':'05738','id':'991487'},{'employe_no':'05740','id':'991489'},{'employe_no':'05749','id':'991497'},{'employe_no':'05752','id':'991501'},{'employe_no':'05754','id':'991502'},{'employe_no':'05753','id':'991503'},{'employe_no':'05756','id':'991505'},{'employe_no':'05758','id':'991506'},{'employe_no':'05759','id':'991507'},{'employe_no':'05761','id':'991509'},{'employe_no':'05762','id':'991510'},{'employe_no':'05763','id':'991511'},{'employe_no':'05764','id':'991512'},{'employe_no':'05766','id':'991514'},{'employe_no':'05768','id':'991516'},{'employe_no':'05771','id':'991519'},{'employe_no':'05757','id':'991521'},{'employe_no':'05775','id':'991523'},{'employe_no':'15777','id':'991525'},{'employe_no':'05778','id':'991526'},{'employe_no':'05779','id':'991527'},{'employe_no':'05780','id':'991528'},{'employe_no':'05781','id':'991529'},{'employe_no':'05783','id':'991532'},{'employe_no':'05784','id':'991533'},{'employe_no':'05785','id':'991534'},{'employe_no':'05787','id':'991537'},{'employe_no':'05791','id':'991538'},{'employe_no':'05790','id':'991540'},{'employe_no':'05793','id':'991541'},{'employe_no':'05796','id':'991545'},{'employe_no':'05797','id':'991546'},{'employe_no':'05799','id':'991548'},{'employe_no':'05800','id':'991549'},{'employe_no':'05801','id':'991550'},{'employe_no':'05803','id':'991551'},{'employe_no':'05802','id':'991552'},{'employe_no':'05804','id':'991553'},{'employe_no':'05808','id':'991554'},{'employe_no':'05805','id':'991555'},{'employe_no':'05806','id':'991556'},{'employe_no':'05807','id':'991557'},{'employe_no':'05809','id':'991558'},{'employe_no':'05810','id':'991559'},{'employe_no':'05812','id':'991561'},{'employe_no':'05706','id':'991563'},{'employe_no':'05814','id':'991565'},{'employe_no':'05816','id':'991566'},{'employe_no':'05815','id':'991567'},{'employe_no':'05817','id':'991568'},{'employe_no':'05818','id':'991569'},{'employe_no':'05820','id':'991570'},{'employe_no':'05821','id':'991571'},{'employe_no':'05822','id':'991572'},{'employe_no':'05819','id':'991573'},{'employe_no':'05824','id':'991574'},{'employe_no':'05826','id':'991576'},{'employe_no':'05827','id':'991577'},{'employe_no':'05831','id':'991580'},{'employe_no':'05832','id':'991581'},{'employe_no':'05833','id':'991582'},{'employe_no':'05834','id':'991583'},{'employe_no':'05835','id':'991584'},{'employe_no':'05836','id':'991585'},{'employe_no':'05837','id':'991587'},{'employe_no':'05838','id':'991588'},{'employe_no':'05839','id':'991589'},{'employe_no':'05841','id':'991590'},{'employe_no':'05840','id':'991591'},{'employe_no':'05842','id':'991592'},{'employe_no':'05847','id':'991593'},{'employe_no':'05849','id':'991594'},{'employe_no':'05843','id':'991595'},{'employe_no':'05850','id':'991596'},{'employe_no':'05844','id':'991597'},{'employe_no':'05851','id':'991599'},{'employe_no':'05852','id':'991600'},{'employe_no':'05853','id':'991601'},{'employe_no':'05854','id':'991602'}]";
		 * ; JSONArray parse2 = (JSONArray)JSONArray.parse(date);
		 */
		// JSONObject parse = (JSONObject)JSONObject.parse(date);
		// JSONArray jsonArray = parse.getJSONArray("data");
		/*
		 * for (int i = 0; i < jsonArray.size(); i++) {
		 * System.out.println(jsonArray.getJSONObject(i)); }
		 */

		/*
		 * System.out.println(parse2.toJSONString());
		 */
		/*
		 * List<Integer> list = new ArrayList<Integer>(); for (int i = 0; i <
		 * dto.length; i++) { for (int j = 0; j < json.size(); j++) {
		 * if(dto[i].equals(json.getJSONObject(j).getString("employe_no"))) {
		 * list.add(json.getJSONObject(j).getInteger("id")); } } }
		 * 
		 * System.out.println(list);
		 */

		/*
		 * HashMap<String,Object> map = new HashMap(); HashMap<String,Object> map1 = new
		 * HashMap(); HashMap<String,Object> map2 = new HashMap();
		 * HashMap<String,Object> map3 = new HashMap(); map3.put("1", "1951/2103/821");
		 * 
		 * map2.put("ccId", 47); map2.put("ccName", "测试客户集"); map2.put("condCount", 1);
		 * map2.put("tagsBelong", map3); map1.put("47", map2);
		 * map.put("ccRuleCondition", map1);
		 * 
		 * HashMap<String,Object> object = (HashMap)map.get("ccRuleCondition");
		 * System.out.println(object); for (String keySet : object.keySet()) {
		 * object.get(keySet); } Set keySet = object.keySet();
		 */

		/*
		 * map.put("cmName", "cmName"); System.out.println(map); map.clear();
		 * System.out.println(map); map.put("cmId", "cmId"); System.out.println(map);
		 */

		/*
		 * String str = "fff((11))"; int indexOf = str.indexOf("("); int lastIndexOf =
		 * str.lastIndexOf("("); int indexOf2 = str.indexOf(")");
		 * 
		 * System.out.println(str.substring(0, indexOf));
		 * System.out.println(str.substring(lastIndexOf+ 1, indexOf2));
		 */

		/*
		 * HashMap<Long, String> map = new HashMap<Long, String>(); map.put(2L, "123");
		 * map.put(3L, "234"); map.put(2L, "456"); System.out.println(map);
		 */

		/*
		 * Long num = 123L; String str = "123";
		 * System.out.println(str.equals(num.toString()));
		 */

		/*
		 * String time = "2019-08-29 16:30:23"; SimpleDateFormat sdf = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//yyyy-mm-dd, 会出现时间不对, 因为小写的mm是代表: 秒
		 * Date utilDate = sdf.parse(time); Date date2 = new Date(); String format =
		 * sdf.format(time); System.out.println(utilDate);//查看utilDate的值 Date date = new
		 * java.sql.Date(utilDate.getTime());
		 * 
		 * System.out.println(date);
		 */
		/*
		 * String str = "您不是"; System.out.println(str.replace("您", "我"));
		 */

		/*
		 * byte a = '1'; byte b = '2'; System.out.println(b>a);
		 */

		/*
		 * String str = "1,2,3,4"; String[] split = str.split(","); for (int i = 0; i <
		 * split.length; i++) { System.out.println(split[i]); }
		 */

		/*
		 * String data = "[\r\n" + "        {\r\n" + "            'name': '丁杰',\r\n" +
		 * "            'employe_no': '11777',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '丁福在',\r\n" +
		 * "            'employe_no': '13430',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '万贤章',\r\n" +
		 * "            'employe_no': '05775',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '严凡',\r\n" +
		 * "            'employe_no': '03992',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '严永俊',\r\n" +
		 * "            'employe_no': '05781',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '付东明',\r\n" +
		 * "            'employe_no': '12564',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '付伟帆',\r\n" +
		 * "            'employe_no': '04550',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '付天朝',\r\n" +
		 * "            'employe_no': '12141',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '仵垠璞',\r\n" +
		 * "            'employe_no': '05772',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '何凯',\r\n" +
		 * "            'employe_no': '05764',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '何海锋',\r\n" +
		 * "            'employe_no': '04351',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '何魏',\r\n" +
		 * "            'employe_no': '02585',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '余伟',\r\n" +
		 * "            'employe_no': '01244',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '余勇翼',\r\n" +
		 * "            'employe_no': '03997',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '冉尚华',\r\n" +
		 * "            'employe_no': '04061',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '冯振威',\r\n" +
		 * "            'employe_no': '11032',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '冯科',\r\n" +
		 * "            'employe_no': '05816',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '况明敏',\r\n" +
		 * "            'employe_no': '05798',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '刘亚兰',\r\n" +
		 * "            'employe_no': '03212',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '刘凯(北京)',\r\n" +
		 * "            'employe_no': '11376',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '刘君',\r\n" +
		 * "            'employe_no': '10213',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '刘昌辉',\r\n" +
		 * "            'employe_no': '12154',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '刘玥',\r\n" +
		 * "            'employe_no': '04158',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '刘锦辉',\r\n" +
		 * "            'employe_no': '05824',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '卞旭',\r\n" +
		 * "            'employe_no': '05713',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '卢胜凯',\r\n" +
		 * "            'employe_no': '14974',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '卢艳楠',\r\n" +
		 * "            'employe_no': '03437',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '台文帅',\r\n" +
		 * "            'employe_no': '04555',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '叶童',\r\n" +
		 * "            'employe_no': '03405',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '叶茂林',\r\n" +
		 * "            'employe_no': '05762',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吕九州',\r\n" +
		 * "            'employe_no': '13034',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吕华龙',\r\n" +
		 * "            'employe_no': '12995',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吴乔南山',\r\n" +
		 * "            'employe_no': '03802',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吴勋',\r\n" +
		 * "            'employe_no': '13344',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吴武政',\r\n" +
		 * "            'employe_no': '04352',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吴海军',\r\n" +
		 * "            'employe_no': '11565',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '吴烯',\r\n" +
		 * "            'employe_no': '04227',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '周响铃',\r\n" +
		 * "            'employe_no': '05717',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '周邦',\r\n" +
		 * "            'employe_no': '12708',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '周韦杨',\r\n" +
		 * "            'employe_no': '05726',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '夏建兴',\r\n" +
		 * "            'employe_no': '10627',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '夏远鹏',\r\n" +
		 * "            'employe_no': '05808',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '姜凯页',\r\n" +
		 * "            'employe_no': '13189',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '孙捷',\r\n" +
		 * "            'employe_no': '12578',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '宋嘉轩',\r\n" +
		 * "            'employe_no': '03988',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '宋志丹',\r\n" +
		 * "            'employe_no': '04508',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '崔馨文',\r\n" +
		 * "            'employe_no': '02913',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '庄彦鹏',\r\n" +
		 * "            'employe_no': '05800',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '庞家奇',\r\n" +
		 * "            'employe_no': '05827',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '庞继辉',\r\n" +
		 * "            'employe_no': '13214',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '康静',\r\n" +
		 * "            'employe_no': '04217',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张丹丹',\r\n" +
		 * "            'employe_no': '00922',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张丽瑜',\r\n" +
		 * "            'employe_no': '04515',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张健(重庆)',\r\n" +
		 * "            'employe_no': '12865',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张健铭',\r\n" +
		 * "            'employe_no': '03806',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张成',\r\n" +
		 * "            'employe_no': '12242',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张曦彤',\r\n" +
		 * "            'employe_no': '04500',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张淅',\r\n" +
		 * "            'employe_no': '02836',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张渝波',\r\n" +
		 * "            'employe_no': '03942',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张源麟',\r\n" +
		 * "            'employe_no': '02864',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张登科',\r\n" +
		 * "            'employe_no': '12629',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张礼发',\r\n" +
		 * "            'employe_no': '10073',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张良',\r\n" +
		 * "            'employe_no': '11006',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张鹏',\r\n" +
		 * "            'employe_no': '11467',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张鹭',\r\n" +
		 * "            'employe_no': '04953',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '彭托',\r\n" +
		 * "            'employe_no': '05654',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '徐华',\r\n" +
		 * "            'employe_no': '03180',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '徐向阳',\r\n" +
		 * "            'employe_no': '04027',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '徐晨凌',\r\n" +
		 * "            'employe_no': '00739',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '招伟键',\r\n" +
		 * "            'employe_no': '03793',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '施文凯',\r\n" +
		 * "            'employe_no': '13068',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '施文斌',\r\n" +
		 * "            'employe_no': '05518',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '曹飞',\r\n" +
		 * "            'employe_no': '12303',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '曾文媛',\r\n" +
		 * "            'employe_no': '04647',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '曾玉宇',\r\n" +
		 * "            'employe_no': '05736',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '朱亚楠',\r\n" +
		 * "            'employe_no': '03535',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '朱华',\r\n" +
		 * "            'employe_no': '04698',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '朱文琦',\r\n" +
		 * "            'employe_no': '05853',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '朱立芹',\r\n" +
		 * "            'employe_no': '05840',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '朱诗文',\r\n" +
		 * "            'employe_no': '05799',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李二龙',\r\n" +
		 * "            'employe_no': '04179',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李军红',\r\n" +
		 * "            'employe_no': '04292',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李凱翀',\r\n" +
		 * "            'employe_no': '05420',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李力',\r\n" +
		 * "            'employe_no': '04695',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李密',\r\n" +
		 * "            'employe_no': '04431',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李正一',\r\n" +
		 * "            'employe_no': '05324',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李泉池',\r\n" +
		 * "            'employe_no': '05330',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李洁',\r\n" +
		 * "            'employe_no': '03516',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李烛',\r\n" +
		 * "            'employe_no': '05838',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李超凡',\r\n" +
		 * "            'employe_no': '05761',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '李飞',\r\n" +
		 * "            'employe_no': '05372',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨孝茜',\r\n" +
		 * "            'employe_no': '02205',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨康',\r\n" +
		 * "            'employe_no': '10837',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨政晖',\r\n" +
		 * "            'employe_no': '15777',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨晓龙',\r\n" +
		 * "            'employe_no': '13506',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨晶',\r\n" +
		 * "            'employe_no': '03520',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨琪',\r\n" +
		 * "            'employe_no': '04404',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨瑾涛',\r\n" +
		 * "            'employe_no': '05785',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨雅文',\r\n" +
		 * "            'employe_no': '03401',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '杨龙佳',\r\n" +
		 * "            'employe_no': '12441',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '林坤',\r\n" +
		 * "            'employe_no': '12204',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '林惠兰',\r\n" +
		 * "            'employe_no': '03486',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '林谋俊',\r\n" +
		 * "            'employe_no': '05337',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '林雄',\r\n" +
		 * "            'employe_no': '13577',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '梁世炯',\r\n" +
		 * "            'employe_no': '13287',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '樊琼',\r\n" +
		 * "            'employe_no': '03548',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '毛光伟',\r\n" +
		 * "            'employe_no': '10238',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '毛培杰',\r\n" +
		 * "            'employe_no': '04079',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '江莉',\r\n" +
		 * "            'employe_no': '02324',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '汤涛',\r\n" +
		 * "            'employe_no': '05653',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '汪攀峰',\r\n" +
		 * "            'employe_no': '12687',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '汪涛',\r\n" +
		 * "            'employe_no': '11733',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '潘珠连',\r\n" +
		 * "            'employe_no': '11308',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王丽君',\r\n" +
		 * "            'employe_no': '04962',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王克',\r\n" +
		 * "            'employe_no': '04652',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王利宏',\r\n" +
		 * "            'employe_no': '11199',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王存翔',\r\n" +
		 * "            'employe_no': '11207',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王心如',\r\n" +
		 * "            'employe_no': '05791',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王明',\r\n" +
		 * "            'employe_no': '05790',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王海健',\r\n" +
		 * "            'employe_no': '04813',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王秀',\r\n" +
		 * "            'employe_no': '05703',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王贤家',\r\n" +
		 * "            'employe_no': '10243',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王越(西安)',\r\n" +
		 * "            'employe_no': '12565',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王金龙',\r\n" +
		 * "            'employe_no': '10145',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '王钦宸',\r\n" +
		 * "            'employe_no': '05852',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '白鹤',\r\n" +
		 * "            'employe_no': '05240',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '皮高峰',\r\n" +
		 * "            'employe_no': '10648',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '秦艳艳',\r\n" +
		 * "            'employe_no': '04788',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '童瑶',\r\n" +
		 * "            'employe_no': '05754',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '符大程',\r\n" +
		 * "            'employe_no': '10277',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '罗天翔',\r\n" +
		 * "            'employe_no': '05083',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '罗海文',\r\n" +
		 * "            'employe_no': '05771',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '肖杰',\r\n" +
		 * "            'employe_no': '05778',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '胡德远',\r\n" +
		 * "            'employe_no': '12926',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '胡文浩',\r\n" +
		 * "            'employe_no': '12590',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '胡续杰',\r\n" +
		 * "            'employe_no': '11910',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '苏安福',\r\n" +
		 * "            'employe_no': '05366',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '苏建国',\r\n" +
		 * "            'employe_no': '10227',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '苏玉芳',\r\n" +
		 * "            'employe_no': '03407',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '葛小倩',\r\n" +
		 * "            'employe_no': '04171',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '董玉印',\r\n" +
		 * "            'employe_no': '11198',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '董立阳',\r\n" +
		 * "            'employe_no': '12697',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '董良',\r\n" +
		 * "            'employe_no': '03884',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '董霄霄',\r\n" +
		 * "            'employe_no': '02142',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '蒋鹏博',\r\n" +
		 * "            'employe_no': '05698',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '蓝天',\r\n" +
		 * "            'employe_no': '05706',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '蔡晓龙',\r\n" +
		 * "            'employe_no': '12212',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '蔡泽军',\r\n" +
		 * "            'employe_no': '05735',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '袁宏广',\r\n" +
		 * "            'employe_no': '05596',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '袁景曦',\r\n" +
		 * "            'employe_no': '11595',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '许佳文',\r\n" +
		 * "            'employe_no': '05449',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '谢洋洋',\r\n" +
		 * "            'employe_no': '05470',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '谭伟恒',\r\n" +
		 * "            'employe_no': '03835',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '费跃',\r\n" +
		 * "            'employe_no': '03660',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '赖斌科',\r\n" +
		 * "            'employe_no': '14121',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '赵东兴',\r\n" +
		 * "            'employe_no': '13615',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '赵玉芳',\r\n" +
		 * "            'employe_no': '02351',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '赵鑫磊',\r\n" +
		 * "            'employe_no': '05692',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '邓恩景',\r\n" +
		 * "            'employe_no': '11554',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '邓文',\r\n" +
		 * "            'employe_no': '10730',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '邹季豪',\r\n" +
		 * "            'employe_no': '05740',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '郑明华',\r\n" +
		 * "            'employe_no': '05797',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '郑棹屹',\r\n" +
		 * "            'employe_no': '03980',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '郝婷婷',\r\n" +
		 * "            'employe_no': '05734',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '郭奇良',\r\n" +
		 * "            'employe_no': '03780',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        \r\n" + "        {\r\n" +
		 * "            'name': '金鑫',\r\n" + "            'employe_no': '12959',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '钟晓椒',\r\n" + "            'employe_no': '03745',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '钟梓能',\r\n" + "            'employe_no': '13585',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '钟盛财',\r\n" + "            'employe_no': '10051',\r\n" +
		 * "            'is_valid': '1'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '钟盛财',\r\n" + "            'employe_no': '04766',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈丽文',\r\n" + "            'employe_no': '05755',\r\n" +
		 * "            'is_valid': '1'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈何易',\r\n" + "            'employe_no': '05749',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈佳茜',\r\n" + "            'employe_no': '03889',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈卓',\r\n" + "            'employe_no': '12760',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈善奎',\r\n" + "            'employe_no': '05733',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈建财',\r\n" + "            'employe_no': '12911',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈慧慧',\r\n" + "            'employe_no': '01437',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈成富',\r\n" + "            'employe_no': '12372',\r\n" +
		 * "            'is_valid': '0'\r\n" + "        },\r\n" + "        {\r\n" +
		 * "            'name': '陈敏(厦门)',\r\n" +
		 * "            'employe_no': '11448',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '陈林',\r\n" +
		 * "            'employe_no': '11245',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '陈永庆',\r\n" +
		 * "            'employe_no': '05818',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '陈海桥',\r\n" +
		 * "            'employe_no': '05236',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '陈玲娜',\r\n" +
		 * "            'employe_no': '03406',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '陈鹿',\r\n" +
		 * "            'employe_no': '05813',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '韩泽清',\r\n" +
		 * "            'employe_no': '13302',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '顿亚振',\r\n" +
		 * "            'employe_no': '11172',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '马磊',\r\n" +
		 * "            'employe_no': '12635',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '高帅',\r\n" +
		 * "            'employe_no': '11492',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '魏新雨',\r\n" +
		 * "            'employe_no': '05786',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '魏春雷',\r\n" +
		 * "            'employe_no': '05787',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '魏雪蓉',\r\n" +
		 * "            'employe_no': '00996',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '黄嘉明',\r\n" +
		 * "            'employe_no': '05702',\r\n" + "            'is_valid': '1'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '黄思雨',\r\n" +
		 * "            'employe_no': '05682',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '张永亮（青岛）',\r\n" +
		 * "            'employe_no': '12908',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        },\r\n" + "        {\r\n" + "            'name': '黎高梅',\r\n" +
		 * "            'employe_no': '02560',\r\n" + "            'is_valid': '0'\r\n"
		 * + "        }\r\n" + "    ]";
		 */

		// JSONArray array = (JSONArray) JSONArray.parse(data);
		// System.out.println("JSONArray数据量:" + array.size());
		/*
		 * for (int i = 0; i < array.size(); i++) { JSONObject jsonObject =
		 * array.getJSONObject(i); System.out.print(); }
		 */
		/*
		 * HashMap map = new HashMap(); String names =
		 * "蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,胡德远,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,黄思雨,蒋鹏博,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,陈建财,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,冯振威,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,肖杰,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,叶童,宋志丹,宋志丹,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,刘君,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,宋志丹,黎高梅,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,金鑫,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,黄思雨,邹季豪,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,蒋鹏博,董良,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,朱诗文,宋志丹,宋志丹,宋志丹,韩泽清,黎高梅,杨晶,汪攀峰,黄嘉明,余伟,董良,刘君,陈海桥,汪攀峰,徐华,陈玲娜,吴海军,董良,陈海桥,韩泽清,董良,肖杰,汪攀峰,肖杰,吴烯,董良,黄嘉明,黎高梅,招伟键,江莉,陈海桥,黎高梅,招伟键,严凡,董良,冯振威,叶童,杨琪,庞继辉,罗海文,林惠兰,周邦,杨晶,刘君,陈建财,曾玉宇,汪攀峰,罗海文,黎高梅,黎高梅,刘君,林惠兰,冯振威,招伟键,汪攀峰,冯振威,何魏,吴烯,梁世炯,陈敏(厦门),汪攀峰,朱华,卢艳楠,曾文媛,刘君,梁世炯,严凡,董良,陈成富,皮高峰,招伟键,王贤家,王贤家,卢艳楠,冯振威,招伟键,杨晶,董良,庞继辉,冯振威,汪攀峰,王贤家,蓝天,招伟键,董良,严凡,陈建财,陈玲娜,张成,王丽君,招伟键,吴烯,冯振威,冯振威,董良,蓝天,吴烯,招伟键,招伟键,刘君,王贤家,胡德远,招伟键,刘君,董良,陈卓,罗海文,蒋鹏博,陈何易,皮高峰,袁宏广,冯振威,蓝天,何魏,陈建财,陈何易,吴烯,王贤家,梁世炯,朱华,卢艳楠,汪攀峰,胡德远,王贤家,冯振威,严凡,林惠兰,严凡,陈海桥,招伟键,朱华,邹季豪,招伟键,董良,吴烯,林谋俊,刘君,宋志丹,黎高梅,招伟键,潘珠连,陈成富,冯振威,庞继辉,宋志丹,黄嘉明,黎高梅,吴烯,曾文媛,余伟,冯振威,朱华,曾文媛,胡德远,陈海桥,黎高梅,陈成富,吴烯,陈建财,黄嘉明,蒋鹏博,金鑫,董良,胡德远,陈建财,汪攀峰,黎高梅,严凡,冯振威,冯振威,江莉,江莉,董良,董良,杨龙佳,朱华,胡德远,罗海文,冯振威,黎高梅,江莉,曾文媛,袁宏广,董良,陈何易,冯振威,陈建财,叶童,张成,黎高梅,董良,董良,苏建国,汪攀峰,邹季豪,招伟键,吴海军,梁世炯,黄嘉明,严凡,梁世炯,余伟,陈玲娜,陈建财,陈海桥,黎高梅,江莉,卢艳楠,陈海桥,吴乔南山,冯振威,郭奇良,招伟键,王贤家,邹季豪,袁宏广,胡德远,卢艳楠,陈海桥,金鑫,王丽君,王丽君,陈海桥,董良,蓝天,严凡,吴乔南山,陈卓,冯振威,吴海军,杨晶,吴海军,吴烯,招伟键,冯振威,潘珠连,林惠兰,余伟,罗海文,曾玉宇,董良,陈建财,董良,黎高梅,黎高梅,余伟,汪攀峰,招伟键,陈何易,王贤家,邓文,曾文媛,冯振威,招伟键,陈何易,汪攀峰,邓文,蓝天,余勇翼,韩泽清,林谋俊,余勇翼,陈建财,陈建财,陈建财,童瑶,陈卓,曾文媛,陈卓,董良,邓文,严凡,江莉,林谋俊,林谋俊,黎高梅,冯振威,曾玉宇,郭奇良,叶童,董良,陈何易,张成,王贤家,招伟键,招伟键,董良,陈建财,邹季豪,何魏,陈海桥,招伟键,罗海文,刘君,冯振威,庞继辉,刘君,招伟键,招伟键,何魏,陈敏(厦门),王丽君,招伟键,徐华,梁世炯,卢艳楠,陈卓,董良,肖杰,江莉,陈卓,陈玲娜,董良,何魏,陈玲娜,郭奇良,招伟键,蒋鹏博,董良,胡德远,董良,余勇翼,董良,杨晶,张成,孙捷,邹季豪,招伟键,卢艳楠,蒋鹏博,陈建财,王丽君,招伟键,余伟,陈海桥,曾文媛,汪攀峰,董良,严凡,严凡,董良,江莉,江莉,胡德远,卢艳楠,董良,陈海桥,曾文媛,刘君,邹季豪,陈建财,冯振威,潘珠连,董良,童瑶,皮高峰,曾玉宇,董良,胡德远,朱华,冯振威,卢艳楠,黎高梅,陈成富,罗海文,朱华,金鑫,黄嘉明,钟盛财,余勇翼,冯振威,黎高梅,冯振威,杨晶,肖杰,江莉,江莉,汪攀峰,余伟,陈卓,董良,袁宏广,潘珠连,黎高梅,蓝天,余伟,董良,林惠兰,卢艳楠,冯振威,金鑫,陈玲娜,黎高梅,肖杰,胡德远,黎高梅,陈成富,曾玉宇,何魏,董良,陈建财,曾文媛,汪攀峰,林谋俊,曾玉宇,林谋俊,郭奇良,招伟键,余伟,胡德远,董良,梁世炯,严凡,黎高梅,黎高梅,王贤家,余勇翼,林惠兰,曾文媛,冯振威,吴烯,邓恩景,汪攀峰,卢艳楠,朱华,汪攀峰,冯振威,宋志丹,招伟键,周邦,董良,王丽君,卢艳楠,招伟键,陈成富,陈建财,陈建财,黎高梅,董良,余伟,陈永庆,董良,宋志丹,陈建财,刘君,严凡,皮高峰,陈建财,余勇翼,朱华,叶童,汪攀峰,朱华,陈建财,林惠兰,林惠兰,余伟,严凡,董良,董良,童瑶,陈卓,董良,袁宏广,招伟键,梁世炯,董良,周邦,邹季豪,董良,黎高梅,林惠兰,曾文媛,肖杰,招伟键,林谋俊,黎高梅,王贤家,余勇翼,胡德远,何魏,蓝天,曾玉宇,陈建财,何魏,王丽君,罗海文,黄思雨,招伟键,陈卓,吴烯,董良,曾文媛,何魏,王贤家,余伟,卢艳楠,陈何易,陈玲娜,余勇翼,宋志丹,招伟键,杨龙佳,刘君,金鑫,招伟键,朱华,董良,招伟键,招伟键,江莉,王贤家,余伟,董良,招伟键,余勇翼,梁世炯,宋志丹,陈建财,汪攀峰,张成,陈卓,卢艳楠,胡德远,吴海军,冯振威,林谋俊,陈玲娜,吴海军,朱华,刘君,陈玲娜,陈建财,胡德远,朱立芹,曾文媛,陈建财,杨晶,林惠兰,卢艳楠,曾玉宇,钟盛财,刘君,朱华,陈敏(厦门),何魏,蒋鹏博,招伟键,王贤家,陈玲娜,招伟键,曾文媛,冯振威,庞继辉,董良,冯振威,汪攀峰,招伟键,江莉,胡德远,吴海军,卢艳楠,宋志丹,杨晶,钟盛财,朱华,朱华,招伟键,严凡,余勇翼,朱华,朱华,董良,曾文媛,陈卓,汪攀峰,吴海军,陈海桥,冯振威,胡德远,蓝天,金鑫,冯振威,汪攀峰,陈建财,金鑫,刘君,罗海文,严凡,张成,冯振威,杨晶,梁世炯,林惠兰,蒋鹏博,朱立芹,招伟键,金鑫,江莉,叶童,江莉,吴烯,卢艳楠,招伟键,杨晶,罗海文,陈海桥,徐华,招伟键,朱立芹,曾文媛,宋志丹,王贤家,苏建国,余勇翼,周邦,朱立芹,曾玉宇,董良,林谋俊,陈海桥,董良,陈玲娜,严凡,卢艳楠,余勇翼,刘君,梁世炯,金鑫,吴乔南山,刘君,童瑶,朱立芹,钟盛财,吴烯,江莉,梁世炯,林谋俊,冯振威,梁世炯,陈建财,朱华,严凡,肖杰,卢艳楠,陈玲娜,董良,冯振威,胡德远,黎高梅,林惠兰,林惠兰,江莉,蓝天,汪攀峰,罗海文,卢艳楠,冯振威,朱华,朱华,汪攀峰,董良,汪攀峰,曾玉宇,曾文媛,招伟键,江莉,刘君,吴乔南山,梁世炯,梁世炯,余伟,曾文媛,董良,王贤家,董良,曾文媛,余伟,张成,吴烯,汪攀峰,林谋俊,朱华,庞继辉,朱华,江莉,王贤家";
		 * String[] split = names.split(",");
		 */
		// System.out.println("操作数据数长度为:" + split.length);
		/*
		 * int num = 0; for (int i = 0; i < split.length; i++) { split[i] =
		 * split[i].trim(); //map.put(split[i], "1"); } for (int i = 0; i <
		 * split.length; i++) { for (int j = 0; j < array.size(); j++) {
		 * if(split[i].equals(array.getJSONObject(j).getString("name"))) {
		 * System.out.println(array.getJSONObject(j).getString("employe_no")); num++;
		 * break; } } } //System.out.println(map); System.out.println("操作数据数为:" + num);
		 */

		/*
		 * String str = "'新贝乐意大利餐厅("; //str.matches("^'[chr(0xa1)-chr(0xff)]+($");
		 * System.out.println(str.matches("\'[\\x{4e00}-\\x{9fa5}]+\\($"));
		 */

		/*
		 * SimpleDateFormat simpleDateFormat = new
		 * SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); String format =
		 * simpleDateFormat.format(new Date());
		 */

		/*
		 * JSONObject jsonObject = new JSONObject(); System.out.println(jsonObject);
		 * System.out.println(jsonObject == null);
		 * System.out.println(jsonObject.isEmpty());
		 */

		/*
		 * JSONArray array = (JSONArray) JSONArray.parse(data);
		 * System.out.println("JSONArray数据量:" + array.size());
		 * 
		 * for (int i = 0; i < array.size(); i++) { JSONObject jsonObject =
		 * array.getJSONObject(i); System.out.println(jsonObject); }
		 */

		/*
		 * HashMap<String, List<String>> map = new HashMap<String, List<String>>();
		 * List<String> list = new ArrayList<String>();
		 * list.add("https://m.mwfile.cn/mm1013/image/20190730/193759_cfab45dff4.png");
		 * list.add("https://m.mwfile.cn/mm1013/image/20190730/193759_cfab45dff5.png");
		 * list.add("https://m.mwfile.cn/mm1013/image/20190730/193759_cfab45dff6.png");
		 * map.put("doorPics", list); // System.out.println(map.get("doorPics"));
		 * HashMap<String, String> map2 = new HashMap<String, String>(); String string =
		 * map.get("doorPics").toString(); System.out.println(string); string=
		 * string.replaceAll("\\[", "").replaceAll("\\]", "");
		 * System.out.println(string); map2.put("doorPics", string);
		 * System.out.println(map2.get("doorPics")); List<String> asList =
		 * Arrays.asList(map2.get("doorPics").split(",")); for (int i = 0; i <
		 * asList.size(); i++) { System.out.println(asList.get(i)); }
		 * 
		 * // System.out.println(asList);
		 * 
		 * String sheetname = "[abcdfs[sdfsd]"; sheetname = sheetname.replaceAll("\\[",
		 * "").replaceAll("\\]", ""); System.out.println(sheetname);
		 */
		
		
	}

}
