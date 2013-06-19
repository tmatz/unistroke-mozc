package org.mozc.android.inputmethod.japanese;
public class SymbolData {
  public static final String[] PARENTHESIS_VALUES = new String[]{
    "\u0028",  // ( 
    "\u0029",  // ) 
    "\u005b",  // [ 
    "\u005d",  // ] 
    "\u007b",  // { 
    "\u007d",  // } 
    "\uff08",  // （ 
    "\uff09",  // ） 
    "\u300c",  // 「 
    "\u300d",  // 」 
    "\u3010",  // 【 
    "\u3011",  // 】 
    "\u300e",  // 『 
    "\u300f",  // 』 
    "\uff3b",  // ［ 
    "\uff3d",  // ］ 
    "\u3008",  // 〈 
    "\u3009",  // 〉 
    "\u300a",  // 《 
    "\u300b",  // 》 
    "\u201c",  // “ 
    "\u201d",  // ” 
    "\u3014",  // 〔 
    "\u3015",  // 〕 
    "\uff5b",  // ｛ 
    "\uff5d",  // ｝ 
    "\u2018",  // ‘ 
    "\u2019",  // ’ 
    "\u301d",  // 〝 
    "\u301f",  // 〟 
    "\uff1c",  // ＜ 
    "\uff1e",  // ＞ 
    "\u250c",  // ┌ 
    "\u251c",  // ├ 
    "\u2514",  // └ 
    "\u251d",  // ┝ 
    "\u2510",  // ┐ 
    "\u2524",  // ┤ 
    "\u2518",  // ┘ 
    "\u2525",  // ┥ 
    "\u252c",  // ┬ 
    "\u253c",  // ┼ 
    "\u2534",  // ┴ 
    "\u2530",  // ┰ 
    "\u2501",  // ━ 
    "\u2502",  // │ 
    "\u2503",  // ┃ 
    "\u2538",  // ┸ 
    "\u250f",  // ┏ 
    "\u2523",  // ┣ 
    "\u2517",  // ┗ 
    "\u2520",  // ┠ 
    "\u2513",  // ┓ 
    "\u252b",  // ┫ 
    "\u251b",  // ┛ 
    "\u2528",  // ┨ 
    "\u2533",  // ┳ 
    "\u254b",  // ╋ 
    "\u253b",  // ┻ 
    "\u2542",  // ╂ 
    "\u252f",  // ┯ 
    "\u253f",  // ┿ 
    "\u2537",  // ┷ 
  };
  public static final String[] HALF_VALUES = new String[]{
    "\u002e",  // . 
    "\u002c",  // , 
    "\u0021",  // ! 
    "\u003f",  // ? 
    "\u0027",  // ' 
    "\u005c\u0022",  // " 
    "\u003a",  // : 
    "\u003b",  // ; 
    "\u002f",  // / 
    "\u005c\u005c",  // \ 
    "\u007e",  // ~ 
    "\u005f",  // _ 
    "\u002b",  // + 
    "\u002d",  // - 
    "\u002a",  // * 
    "\u003d",  // = 
    "\u0040",  // @ 
    "\u0023",  // # 
    "\u0025",  // % 
    "\u0026",  // & 
    "\u0028",  // ( 
    "\u0029",  // ) 
    "\u003c",  // < 
    "\u003e",  // > 
    "\u005e",  // ^ 
    "\u007c",  // | 
    "\u0024",  // $ 
    "\u0020",  //   
    "\uff0e",  // ． 
    "\uff0c",  // ， 
    "\uff01",  // ！ 
    "\uff1f",  // ？ 
    "\u2018",  // ‘ 
    "\u2019",  // ’ 
    "\uff1a",  // ： 
    "\uff1b",  // ； 
    "\uff0f",  // ／ 
    "\uff3c",  // ＼ 
    "\u2015",  // ― 
    "\uff3f",  // ＿ 
    "\uff0b",  // ＋ 
    "\u2212",  // − 
    "\uff0a",  // ＊ 
    "\uff1d",  // ＝ 
    "\uff20",  // ＠ 
    "\uff03",  // ＃ 
    "\uff05",  // ％ 
    "\uff06",  // ＆ 
    "\uff08",  // （ 
    "\uff09",  // ） 
    "\uff1c",  // ＜ 
    "\uff1e",  // ＞ 
    "\uff3e",  // ＾ 
    "\uff5c",  // ｜ 
    "\uff04",  // ＄ 
    "\uffe5",  // ￥ 
    "\u3000",  // 　 
  };
  public static final String[] MATH_VALUES = new String[]{
    "\uff0b",  // ＋ 
    "\u2212",  // − 
    "\u00d7",  // × 
    "\u00f7",  // ÷ 
    "\u00b1",  // ± 
    "\uff1d",  // ＝ 
    "\u2252",  // ≒ 
    "\u2260",  // ≠ 
    "\uff1c",  // ＜ 
    "\uff1e",  // ＞ 
    "\u2266",  // ≦ 
    "\u2267",  // ≧ 
    "\u226a",  // ≪ 
    "\u226b",  // ≫ 
    "\u2295",  // ⊕ 
    "\u2205",  // ∅ 
    "\u2282",  // ⊂ 
    "\u2283",  // ⊃ 
    "\u2286",  // ⊆ 
    "\u2287",  // ⊇ 
    "\u2229",  // ∩ 
    "\u222a",  // ∪ 
    "\u2227",  // ∧ 
    "\u2228",  // ∨ 
    "\u2208",  // ∈ 
    "\u2209",  // ∉ 
    "\u220b",  // ∋ 
    "\u220c",  // ∌ 
    "\u2211",  // ∑ 
    "\u221a",  // √ 
    "\u2200",  // ∀ 
    "\u2202",  // ∂ 
    "\u2203",  // ∃ 
    "\u2207",  // ∇ 
    "\u2312",  // ⌒ 
    "\u00ac",  // ¬ 
    "\u00b6",  // ¶ 
    "\u22a5",  // ⊥ 
    "\u22bf",  // ⊿ 
    "\u2016",  // ‖ 
    "\u221d",  // ∝ 
    "\u221e",  // ∞ 
    "\u221f",  // ∟ 
    "\u2220",  // ∠ 
    "\u223d",  // ∽ 
    "\u2261",  // ≡ 
    "\u2234",  // ∴ 
    "\u2235",  // ∵ 
    "\u00b9",  // ¹ 
    "\u00b2",  // ² 
    "\u00b3",  // ³ 
    "\u2074",  // ⁴ 
    "\u2081",  // ₁ 
    "\u2082",  // ₂ 
    "\u2083",  // ₃ 
    "\u2084",  // ₄ 
    "\u207f",  // ⁿ 
    "\u222b",  // ∫ 
    "\u222c",  // ∬ 
    "\u222e",  // ∮ 
    "\u20b0",  // ₰ 
    "\u20b1",  // ₱ 
    "\u20b2",  // ₲ 
    "\u20b3",  // ₳ 
    "\u20b4",  // ₴ 
    "\u20b5",  // ₵ 
    "\u2116",  // № 
    "\u00a7",  // § 
    "\u3349",  // ㍉ 
    "\u3322",  // ㌢ 
    "\u334d",  // ㍍ 
    "\u3314",  // ㌔ 
    "\u339c",  // ㎜ 
    "\u339d",  // ㎝ 
    "\u006d",  // m 
    "\u339e",  // ㎞ 
    "\u3318",  // ㌘ 
    "\u3314",  // ㌔ 
    "\u3327",  // ㌧ 
    "\u330d",  // ㌍ 
    "\u338e",  // ㎎ 
    "\u338f",  // ㎏ 
    "\u332b",  // ㌫ 
    "\u3351",  // ㍑ 
    "\u33a1",  // ㎡ 
    "\u33a5",  // ㎥ 
    "\u3336",  // ㌶ 
    "\u333b",  // ㌻ 
    "\u2103",  // ℃ 
    "\u334a",  // ㍊ 
    "\u3303",  // ㌃ 
    "\u3357",  // ㍗ 
    "\u337e",  // ㍾ 
    "\u337d",  // ㍽ 
    "\u337c",  // ㍼ 
    "\u337b",  // ㍻ 
    "\u3323",  // ㌣ 
    "\u3326",  // ㌦ 
    "\u00a3",  // £ 
    "\uffe5",  // ￥ 
    "\u00a2",  // ¢ 
    "\uff04",  // ＄ 
    "\u20ac",  // € 
    "\u20a0",  // ₠ 
    "\u20a1",  // ₡ 
    "\u20a2",  // ₢ 
    "\u20a3",  // ₣ 
    "\u20a4",  // ₤ 
    "\u20a5",  // ₥ 
    "\u20a6",  // ₦ 
    "\u20a7",  // ₧ 
    "\u20a8",  // ₨ 
    "\u20a9",  // ₩ 
    "\u20aa",  // ₪ 
    "\u20ab",  // ₫ 
    "\u20ad",  // ₭ 
    "\u20ae",  // ₮ 
    "\u20af",  // ₯ 
    "\u33c4",  // ㏄ 
    "\u33cd",  // ㏍ 
    "\u00b0",  // ° 
    "\u0025",  // % 
    "\u2030",  // ‰ 
    "\u2032",  // ′ 
    "\u2033",  // ″ 
    "\u212b",  // Å 
  };
  public static final String[] ARROW_VALUES = new String[]{
    "\u2192",  // → 
    "\u2190",  // ← 
    "\u2191",  // ↑ 
    "\u2193",  // ↓ 
    "\u21d2",  // ⇒ 
    "\u21d0",  // ⇐ 
    "\u21d1",  // ⇑ 
    "\u21d3",  // ⇓ 
    "\u21e8",  // ⇨ 
    "\u21e6",  // ⇦ 
    "\u21e7",  // ⇧ 
    "\u21e9",  // ⇩ 
    "\u21e2",  // ⇢ 
    "\u21e0",  // ⇠ 
    "\u21e1",  // ⇡ 
    "\u21e3",  // ⇣ 
    "\u2197",  // ↗ 
    "\u2198",  // ↘ 
    "\u2196",  // ↖ 
    "\u2199",  // ↙ 
    "\u21d7",  // ⇗ 
    "\u21d8",  // ⇘ 
    "\u21d6",  // ⇖ 
    "\u21d9",  // ⇙ 
    "\u21db",  // ⇛ 
    "\u21da",  // ⇚ 
    "\u261e",  // ☞ 
    "\u261c",  // ☜ 
    "\u2195",  // ↕ 
    "\u2194",  // ↔ 
    "\u21d5",  // ⇕ 
    "\u21d4",  // ⇔ 
    "\u21b7",  // ↷ 
    "\u21b6",  // ↶ 
    "\u21ba",  // ↺ 
    "\u21bb",  // ↻ 
    "\u21b1",  // ↱ 
    "\u21b0",  // ↰ 
    "\u21b3",  // ↳ 
    "\u21b2",  // ↲ 
    "\u21b4",  // ↴ 
    "\u21b5",  // ↵ 
    "\u21aa",  // ↪ 
    "\u21a9",  // ↩ 
    "\u21c7",  // ⇇ 
    "\u21c9",  // ⇉ 
    "\u21c8",  // ⇈ 
    "\u21ca",  // ⇊ 
    "\u21c4",  // ⇄ 
    "\u21c6",  // ⇆ 
    "\u21c5",  // ⇅ 
    "\u2935",  // ⤵ 
    "\u2160",  // Ⅰ 
    "\u2161",  // Ⅱ 
    "\u2162",  // Ⅲ 
    "\u2163",  // Ⅳ 
    "\u2164",  // Ⅴ 
    "\u2165",  // Ⅵ 
    "\u2166",  // Ⅶ 
    "\u2167",  // Ⅷ 
    "\u2168",  // Ⅸ 
    "\u2169",  // Ⅹ 
    "\u2170",  // ⅰ 
    "\u2171",  // ⅱ 
    "\u2172",  // ⅲ 
    "\u2173",  // ⅳ 
    "\u2174",  // ⅴ 
    "\u2175",  // ⅵ 
    "\u2176",  // ⅶ 
    "\u2177",  // ⅷ 
    "\u2178",  // ⅸ 
    "\u2179",  // ⅹ 
    "\u3220",  // ㈠ 
    "\u3221",  // ㈡ 
    "\u3222",  // ㈢ 
    "\u3223",  // ㈣ 
    "\u3224",  // ㈤ 
    "\u3225",  // ㈥ 
    "\u3226",  // ㈦ 
    "\u3227",  // ㈧ 
    "\u3228",  // ㈨ 
    "\u3229",  // ㈩ 
    "\u2460",  // ① 
    "\u2461",  // ② 
    "\u2462",  // ③ 
    "\u2463",  // ④ 
    "\u2464",  // ⑤ 
    "\u2465",  // ⑥ 
    "\u2466",  // ⑦ 
    "\u2467",  // ⑧ 
    "\u2468",  // ⑨ 
    "\u2469",  // ⑩ 
    "\u246a",  // ⑪ 
    "\u246b",  // ⑫ 
    "\u246c",  // ⑬ 
    "\u246d",  // ⑭ 
    "\u246e",  // ⑮ 
    "\u246f",  // ⑯ 
    "\u2470",  // ⑰ 
    "\u2471",  // ⑱ 
    "\u2472",  // ⑲ 
    "\u2473",  // ⑳ 
  };
  public static final String[] GENERAL_VALUES = new String[]{
    "\u2606",  // ☆ 
    "\u2605",  // ★ 
    "\u2025",  // ‥ 
    "\u2026",  // … 
    "\u266a",  // ♪ 
    "\u266c",  // ♬ 
    "\u266d",  // ♭ 
    "\u266f",  // ♯ 
    "\u2664",  // ♤ 
    "\u2661",  // ♡ 
    "\u2662",  // ♢ 
    "\u2667",  // ♧ 
    "\u2660",  // ♠ 
    "\u2665",  // ♥ 
    "\u2666",  // ♦ 
    "\u2663",  // ♣ 
    "\u3012",  // 〒 
    "\u2121",  // ℡ 
    "\u260e",  // ☎ 
    "\u260f",  // ☏ 
    "\u25a0",  // ■ 
    "\u25a1",  // □ 
    "\u25b2",  // ▲ 
    "\u25b3",  // △ 
    "\u25bc",  // ▼ 
    "\u25bd",  // ▽ 
    "\u25c6",  // ◆ 
    "\u25c7",  // ◇ 
    "\u25cb",  // ○ 
    "\u25ce",  // ◎ 
    "\u25cf",  // ● 
    "\u203b",  // ※ 
    "\u2713",  // ✓ 
    "\u2714",  // ✔ 
    "\u2717",  // ✗ 
    "\u2718",  // ✘ 
    "\u2654",  // ♔ 
    "\u2655",  // ♕ 
    "\u2656",  // ♖ 
    "\u2657",  // ♗ 
    "\u2658",  // ♘ 
    "\u2659",  // ♙ 
    "\u265a",  // ♚ 
    "\u265b",  // ♛ 
    "\u265c",  // ♜ 
    "\u265d",  // ♝ 
    "\u265e",  // ♞ 
    "\u265f",  // ♟ 
    "\u2680",  // ⚀ 
    "\u2681",  // ⚁ 
    "\u2682",  // ⚂ 
    "\u2683",  // ⚃ 
    "\u2684",  // ⚄ 
    "\u2685",  // ⚅ 
    "\u2640",  // ♀ 
    "\u2642",  // ♂ 
    "\u2025",  // ‥ 
    "\u2026",  // … 
    "\u4edd",  // 仝 
    "\u5f61",  // 彡 
    "\u3003",  // 〃 
    "\u3005",  // 々 
    "\u3006",  // 〆 
    "\u3013",  // 〓 
    "\u309b",  // ゛ 
    "\u309c",  // ゜ 
    "\u309d",  // ゝ 
    "\u309e",  // ゞ 
    "\u30fb",  // ・ 
    "\u30fc",  // ー 
    "\u30fd",  // ヽ 
    "\u30fe",  // ヾ 
  };
}
