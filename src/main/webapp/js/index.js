/** banner **/
var banner = document.getElementById("banner");
var circleList = document.getElementById("circle-list");
var lis = banner.children[0].children;
var cirLis = circleList.children[0].children;
var bannerLeft = document.getElementById("banner-left");
var bannerRight = document.getElementById("banner-right");
//璁剧疆鍦嗙偣鎬荤殑瀹藉害
var cirLisWidth = (cirLis.length)*11+14;
circleList.style.width = cirLisWidth+"px";
//璁剧疆鍦嗙偣鐨勪釜鏁�
var index = 0;
//杞挱鍥捐嚜鍔ㄨ疆鎾�
var run;
autoRun();
function autoRun (){
    run = setInterval(function(){
        lis[index].removeAttribute("class");
        cirLis[index].removeAttribute("class");
        index++;
        if(index == lis.length){
            index = 0;
        }
        lis[index].setAttribute("class","active");
        cirLis[index].setAttribute("class","active-circle");
    },2000)
}
//榧犳爣绉诲叆banner
banner.onmouseenter = function(){
    clearInterval(run);
}
banner.onmouseleave = function(){
    autoRun();
}
//榧犳爣绉诲叆鍦嗙偣
for(var i=0; i<cirLis.length; i++){
    cirLis[i].onmouseover = (function(i){
        return function(){
            lis[index].removeAttribute("class");
            cirLis[index].removeAttribute("class");
            index = i;
            lis[i].setAttribute("class","active");
            cirLis[i].setAttribute("class","active-circle");
        }
    })(i)
}
//鍚戝乏鐐瑰嚮
bannerLeft.onclick = function(){
    lis[index].removeAttribute("class");
    cirLis[index].removeAttribute("class");
    index--;
    if(index < 0){
        index = lis.length-1;
    }
    lis[index].setAttribute("class","active");
    cirLis[index].setAttribute("class","active-circle");
}
//鍚戝彸鐐瑰嚮
bannerRight.onclick = function(){
    lis[index].removeAttribute("class");
    cirLis[index].removeAttribute("class");
    index++;
    if(index == lis.length){
        index = 0;
    }
    lis[index].setAttribute("class","active");
    cirLis[index].setAttribute("class","active-circle");
}
/** 鍥句功 **/
var tushu = document.getElementById("tushu");
var tushucircleList = document.getElementById("tushuCircle-list");
var tushulis = tushu.children[0].children;
var tushucirLis = tushucircleList.children[0].children;
var tushuLeft = document.getElementById("tushu1Left");
var tushuRight = document.getElementById("tushu1Right");
//璁剧疆鍦嗙偣鎬荤殑瀹藉害
var tushucirLisWidth = (tushucirLis.length)*11+14;
tushucircleList.style.width = tushucirLisWidth+"px";
//璁剧疆鍦嗙偣鐨勪釜鏁�
var index1 = 0;
//鑷姩杞挱
var run1;
autoRun1();
function autoRun1 (){
    run1 = setInterval(function(){
        tushulis[index1].removeAttribute("class");
        tushucirLis[index1].removeAttribute("class");
        index1++;
        if(index1 == tushulis.length){
            index1 = 0;
        }
        tushulis[index1].setAttribute("class","active");
        tushucirLis[index1].setAttribute("class","active-circle");
    },2000)
}
//榧犳爣绉诲叆鍥句功
tushu.onmouseenter = function(){
    clearInterval(run1);
}
tushu.onmouseleave = function(){
    autoRun1();
}
//榧犳爣绉诲叆鍦嗙偣
for(var i=0; i<tushucirLis.length; i++){
    tushucirLis[i].onmouseover = (function(i){
        return function(){
            tushulis[index1].removeAttribute("class");
            tushucirLis[index1].removeAttribute("class");
            index1 = i;
            tushulis[i].setAttribute("class","active");
            tushucirLis[i].setAttribute("class","active-circle");
        }
    })(i)
}
//鍚戝乏鐐瑰嚮
tushuLeft.onclick = function(){
    tushulis[index1].removeAttribute("class");
    tushucirLis[index1].removeAttribute("class");
    index1--;
    if(index1 < 0){
        index1 = tushulis.length-1;
    }
    tushulis[index1].setAttribute("class","active");
    tushucirLis[index1].setAttribute("class","active-circle");
}
//鍚戝彸鐐瑰嚮
tushuRight.onclick = function(){
    tushulis[index1].removeAttribute("class");
    tushucirLis[index1].removeAttribute("class");
    index1++;
    if(index1 == tushulis.length){
        index1 = 0;
    }
    tushulis[index1].setAttribute("class","active");
    tushucirLis[index1].setAttribute("class","active-circle");
}
/** 鍊掕鏃� **/
function countTime() {
    //鑾峰彇褰撳墠鏃堕棿
    var date = new Date();
    var now = date.getTime();
    //璁剧疆鎴鏃堕棿
    var str="2018/12/20 00:00:00";
    var endDate = new Date(str);
    var end = endDate.getTime();

    //鏃堕棿宸�
    var leftTime = end-now;
    //瀹氫箟鍙橀噺 h,m,s淇濆瓨鍊掕鏃剁殑鏃堕棿
    var h,m,s;
    if (leftTime>=0) {
        h = Math.floor(leftTime/1000/60/60%24);
        m = Math.floor(leftTime/1000/60%60);
        s = Math.floor(leftTime/1000%60);
    }
    (h<10) ? h = "0"+h : h;
    (m<10) ? m = "0"+m : m;
    (s<10) ? s = "0"+s : s;
    //灏嗗€掕鏃惰祴鍊煎埌div涓�
    //document.getElementById("_d").innerHTML = d+"澶�";
    document.getElementById("_h").innerHTML = h;
    document.getElementById("_m").innerHTML = m;
    document.getElementById("_s").innerHTML = s;
    //閫掑綊姣忕璋冪敤countTime鏂规硶锛屾樉绀哄姩鎬佹椂闂存晥鏋�
    setTimeout(countTime,1000);
}
countTime();
/** 闂喘 **/
var shangou = document.getElementById("shangou");//闂喘div
var shangouCon = document.querySelector(".flashover_item_con_div");	//鑾峰彇瑕佺Щ鍔ㄧ殑div
var goodlist = document.getElementsByClassName("flashover_goodlist");//鍗曚釜鍟嗗搧div
var gLen = goodlist.length;//鍟嗗搧涓暟
var showW = parseInt((234+14)*4);	//div鏄剧ず瀹藉害
var divW = parseInt((234+14)*gLen); //div鎬诲搴�
var runL,runR;
function flashover(val){
    switch (val) {
        case "R":
            clearInterval(runL);
            autoR();
            setTimeout("clearInterval(runR)",200);
            break;
        case "L":
            clearInterval(runR);
            autoL();
            setTimeout("clearInterval(runL)",200);
            break;
    }
}
function autoL(){
    var boxLeft = shangouCon.style.left;
    var boxLeftNum = parseInt(boxLeft.substr(0,boxLeft.length-2));	//鑾峰彇璺濈宸︿晶璺濈
    var a = boxLeftNum;
    runL = setInterval(function(){
        if(a > -992 && a<=0 ){
            a=a-248;
            shangouCon.style.left =  a+"px"; //姣忕偣鍑讳竴娆★紝鍚戝彸绉诲姩50px
            console.log(a);
        }
    },50);
}
function autoR(){
    var boxLeft = shangouCon.style.left;
    var boxLeftNum = parseInt(boxLeft.substr(0,boxLeft.length-2));	//鑾峰彇璺濈宸︿晶璺濈
    var a = boxLeftNum;
    runR = setInterval(function(){
        if(a >= -992 && a<0 ){
            a=a+248;
            shangouCon.style.left = a+"px"; //姣忕偣鍑讳竴娆★紝鍚戝彸绉诲姩50px
            console.log(a);
        }
    },50);
}
/** tab **/
var houseElectricalTitle = document.getElementById("houseElectricalTitle").getElementsByTagName("li");
var houseElectricalDiv = document.getElementById("houseElectricalDiv").getElementsByClassName("wiring_right_con");
var tabLen = houseElectricalTitle.length;
for(var i=0; i<tabLen; i++) {
    houseElectricalTitle[i].index = i;
    houseElectricalTitle[i].onmouseover = function(){
        var num = parseInt(this.index);
        for(var j=0; j<tabLen; j++) {
            houseElectricalTitle[j].className = "";
            houseElectricalDiv[j].className = "wiring_right_con hide";
        }
        houseElectricalTitle[num].className = "active";
        houseElectricalDiv[num].className = "wiring_right_con show";
    }
}