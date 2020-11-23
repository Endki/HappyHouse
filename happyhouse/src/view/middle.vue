<template>
<div id="container" style="font-size: 12px;" >
	<div class="spot_wrap">
		<div class="spot">
			<div class="map">
				<div >
					<ul class="cate">
					</ul>
				</div>

				<div class="location">
					<div class="loc_view" >
						<div id="loc_view1" class="sel w">
							
						</div>
						<div id="loc_view2" class="sel w2">

						</div>
						<div id="loc_view3" class="sel w">

						</div>
					</div>

					<!--result: home_recent processed//-->
					<!-- [D] display:none/block toggle -->
					<div class="loc_list NE=a:lcl" id="loc_list" style="display: block;">
						<div id="cityList" class="list" style="width: 188px; display:flex; align-content:flex-start; flex-direction:column; flex-wrap:wrap;">
							<!-- <ul style="display:flex; align-content:flex-start; flex-direction:column; flex-wrap:wrap; overflow:auto; height:250px"> -->
							<ul style="width: 188px; display:flex; align-content:flex-start; flex-direction:column; flex-wrap:wrap; overflow:auto; padding:0px; margin:0px;">
							<li><a href="javascript:void(0);" cityno="1100000000" xcrdn="126.977872" ycrdn="37.566427" class=" _cityItm NPI=a:sido,r:1,i:1100000000">서울시</a></li>
							<li><a href="javascript:void(0);" cityno="4100000000" xcrdn="127.008689" ycrdn="37.274939" class="_cityItm NPI=a:sido,r:2,i:4100000000">경기도</a></li>
							<li><a href="javascript:void(0);" cityno="2800000000" xcrdn="126.705151" ycrdn="37.456054" class=" _cityItm NPI=a:sido,r:3,i:2800000000">인천시</a></li>
							<li><a href="javascript:void(0);" cityno="2600000000" xcrdn="129.075413" ycrdn="35.180143" class=" _cityItm NPI=a:sido,r:4,i:2600000000">부산시</a></li>
							<li><a href="javascript:void(0);" cityno="3000000000" xcrdn="127.384953" ycrdn="36.350465" class=" _cityItm NPI=a:sido,r:5,i:3000000000">대전시</a></li>
							<li><a href="javascript:void(0);" cityno="2700000000" xcrdn="128.601763" ycrdn="35.87139" class=" _cityItm NPI=a:sido,r:6,i:2700000000">대구시</a></li>
							<li><a href="javascript:void(0);" cityno="3100000000" xcrdn="129.311375" ycrdn="35.5386" class=" _cityItm NPI=a:sido,r:7,i:3100000000">울산시</a></li>
							<li><a href="javascript:void(0);" cityno="3600000000" xcrdn="127.292375" ycrdn="36.592907" class=" _cityItm NPI=a:sido,r:8,i:3600000000">세종시</a></li>
							<li><a href="javascript:void(0);" cityno="2900000000" xcrdn="126.851338" ycrdn="35.160032" class=" _cityItm NPI=a:sido,r:9,i:2900000000">광주시</a></li>
							<li><a href="javascript:void(0);" cityno="4200000000" xcrdn="127.72975" ycrdn="37.885399" class=" _cityItm NPI=a:sido,r:10,i:4200000000">강원도</a></li>
							<li><a href="javascript:void(0);" cityno="4300000000" xcrdn="127.491238" ycrdn="36.636149" class=" _cityItm NPI=a:sido,r:11,i:4300000000">충청북도</a></li>
							<li><a href="javascript:void(0);" cityno="4400000000" xcrdn="127.420963" ycrdn="36.326717" class=" _cityItm NPI=a:sido,r:12,i:4400000000">충청남도</a></li>
							<li><a href="javascript:void(0);" cityno="4700000000" xcrdn="128.60065" ycrdn="35.892474" class=" _cityItm NPI=a:sido,r:13,i:4700000000">경상북도</a></li>
							<li><a href="javascript:void(0);" cityno="4800000000" xcrdn="128.6924" ycrdn="35.238343" class=" _cityItm NPI=a:sido,r:14,i:4800000000">경상남도</a></li>
							<li><a href="javascript:void(0);" cityno="4500000000" xcrdn="127.108875" ycrdn="35.820433" class=" _cityItm NPI=a:sido,r:15,i:4500000000">전라북도</a></li>
							<li><a href="javascript:void(0);" cityno="4600000000" xcrdn="126.462443" ycrdn="34.816358" class=" _cityItm NPI=a:sido,r:16,i:4600000000">전라남도</a></li>
							<li><a href="javascript:void(0);" cityno="5000000000" xcrdn="126.498238" ycrdn="33.488976" class=" _cityItm NPI=a:sido,r:17,i:5000000000">제주도</a></li>
							</ul>
						</div>
						<!-- [D] 두줄 클래스 : multi -->
						<div id="dvsnList" class="list2"  style="width: 188px; display:flex; align-content:flex-start; flex-wrap:wrap;" >
							<ul id="ulid" style="width: 188px;  align-content:flex-start; flex-direction:column; flex-wrap:wrap; overflow:auto; padding:0px; margin:0px;">
							<li><a href="javascript:void(0);" dvsnno="4182000000" xcrdn="127.509625" ycrdn="37.831171" class=" _dvsnItm NPI=a:gu,r:1,i:">가평군</a></li>
							<li><a href="javascript:void(0);" dvsnno="4128100000" xcrdn="126.832359" ycrdn="37.637433" class="multi  _dvsnItm NPI=a:gu,r:2,i:">고양시<br>덕양구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4128500000" xcrdn="126.775025" ycrdn="37.65879" class="multi  _dvsnItm NPI=a:gu,r:3,i:">고양시<br>일산동구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4128700000" xcrdn="126.750578" ycrdn="37.675103" class="multi  _dvsnItm NPI=a:gu,r:4,i:">고양시<br>일산서구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4129000000" xcrdn="126.987638" ycrdn="37.429201" class=" _dvsnItm NPI=a:gu,r:5,i:">과천시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4121000000" xcrdn="126.864548" ycrdn="37.478587" class=" _dvsnItm NPI=a:gu,r:6,i:">광명시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4161000000" xcrdn="127.255924" ycrdn="37.417461" class=" _dvsnItm NPI=a:gu,r:7,i:">광주시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4131000000" xcrdn="127.129581" ycrdn="37.594409" class="_dvsnItm NPI=a:gu,r:8,i:">구리시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4141000000" xcrdn="126.935331" ycrdn="37.36161" class=" _dvsnItm NPI=a:gu,r:9,i:">군포시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4157000000" xcrdn="126.715621" ycrdn="37.615267" class=" _dvsnItm NPI=a:gu,r:10,i:">김포시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4136000000" xcrdn="127.216646" ycrdn="37.636032" class=" _dvsnItm NPI=a:gu,r:11,i:">남양주시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4125000000" xcrdn="127.060579" ycrdn="37.903722" class=" _dvsnItm NPI=a:gu,r:12,i:">동두천시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4119000000" xcrdn="126.766181" ycrdn="37.503548" class=" _dvsnItm NPI=a:gu,r:13,i:">부천시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4113500000" xcrdn="127.118926" ycrdn="37.38282" class="multi  _dvsnItm NPI=a:gu,r:14,i:">성남시<br>분당구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4113100000" xcrdn="127.145634" ycrdn="37.450396" class="multi  _dvsnItm NPI=a:gu,r:15,i:">성남시<br>수정구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4113300000" xcrdn="127.13721" ycrdn="37.430523" class="multi  _dvsnItm NPI=a:gu,r:16,i:">성남시<br>중원구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4111300000" xcrdn="126.971893" ycrdn="37.257607" class="multi  _dvsnItm NPI=a:gu,r:17,i:">수원시<br>권선구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4111700000" xcrdn="127.046336" ycrdn="37.259116" class="multi  _dvsnItm NPI=a:gu,r:18,i:">수원시<br>영통구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4111100000" xcrdn="127.010226" ycrdn="37.30416" class="multi  _dvsnItm NPI=a:gu,r:19,i:">수원시<br>장안구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4111500000" xcrdn="127.035711" ycrdn="37.286537" class="multi  _dvsnItm NPI=a:gu,r:20,i:">수원시<br>팔달구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4139000000" xcrdn="126.802938" ycrdn="37.380174" class=" _dvsnItm NPI=a:gu,r:21,i:">시흥시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4127300000" xcrdn="126.811832" ycrdn="37.319537" class="multi  _dvsnItm NPI=a:gu,r:22,i:">안산시<br>단원구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4127100000" xcrdn="126.845167" ycrdn="37.30114" class="multi  _dvsnItm NPI=a:gu,r:23,i:">안산시<br>상록구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4155000000" xcrdn="127.279695" ycrdn="37.008018" class=" _dvsnItm NPI=a:gu,r:24,i:">안성시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4117300000" xcrdn="126.951354" ycrdn="37.392574" class="multi  _dvsnItm NPI=a:gu,r:25,i:">안양시<br>동안구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4117100000" xcrdn="126.932325" ycrdn="37.386649" class="multi  _dvsnItm NPI=a:gu,r:26,i:">안양시<br>만안구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4163000000" xcrdn="127.045496" ycrdn="37.784952" class=" _dvsnItm NPI=a:gu,r:27,i:">양주시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4183000000" xcrdn="127.487563" ycrdn="37.491776" class=" _dvsnItm NPI=a:gu,r:28,i:">양평군</a></li>
							<li><a href="javascript:void(0);" dvsnno="4167000000" xcrdn="127.637088" ycrdn="37.298342" class=" _dvsnItm NPI=a:gu,r:29,i:">여주시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4180000000" xcrdn="127.075059" ycrdn="38.096872" class=" _dvsnItm NPI=a:gu,r:30,i:">연천군</a></li>
							<li><a href="javascript:void(0);" dvsnno="4137000000" xcrdn="127.077461" ycrdn="37.149889" class=" _dvsnItm NPI=a:gu,r:31,i:">오산시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4146300000" xcrdn="127.114666" ycrdn="37.280156" class="multi  _dvsnItm NPI=a:gu,r:32,i:">용인시<br>기흥구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4146500000" xcrdn="127.097962" ycrdn="37.322167" class="multi  _dvsnItm NPI=a:gu,r:33,i:">용인시<br>수지구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4146100000" xcrdn="127.201597" ycrdn="37.234398" class="multi  _dvsnItm NPI=a:gu,r:34,i:">용인시<br>처인구</a></li>
							<li><a href="javascript:void(0);" dvsnno="4143000000" xcrdn="126.968279" ycrdn="37.344887" class=" _dvsnItm NPI=a:gu,r:35,i:">의왕시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4115000000" xcrdn="127.033899" ycrdn="37.737933" class=" _dvsnItm NPI=a:gu,r:36,i:">의정부시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4150000000" xcrdn="127.440997" ycrdn="37.278246" class=" _dvsnItm NPI=a:gu,r:37,i:">이천시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4148000000" xcrdn="126.77976" ycrdn="37.7599" class=" _dvsnItm NPI=a:gu,r:38,i:">파주시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4122000000" xcrdn="127.112763" ycrdn="36.992368" class=" _dvsnItm NPI=a:gu,r:39,i:">평택시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4165000000" xcrdn="127.20024" ycrdn="37.894867" class=" _dvsnItm NPI=a:gu,r:40,i:">포천시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4145000000" xcrdn="127.214874" ycrdn="37.539301" class=" _dvsnItm NPI=a:gu,r:41,i:">하남시</a></li>
							<li><a href="javascript:void(0);" dvsnno="4159000000" xcrdn="126.831325" ycrdn="37.199568" class=" _dvsnItm NPI=a:gu,r:42,i:">화성시</a></li>
							</ul>
						</div>
						<div id="secList" class="list3" >
							<div>
							<ul  >
								<li><a href="javascript:void(0);" secno="4131010100" xcrdn="127.116225" ycrdn="37.635015" class="_secItm NPI=a:dong,r:1,i:4131010100">갈매동<span> (620)</span></a></li>
								<li><a href="javascript:void(0);" secno="4131010400" xcrdn="127.1255" ycrdn="37.5922" class=" _secItm NPI=a:dong,r:2,i:4131010400">교문동<span> (286)</span></a></li>
								<li><a href="javascript:void(0);" secno="4131010200" xcrdn="127.1391" ycrdn="37.6351" class=" _secItm NPI=a:dong,r:3,i:4131010200">사노동<span> (0)</span></a></li>
								<li><a href="javascript:void(0);" secno="4131010500" xcrdn="127.160938" ycrdn="37.59309" class=" _secItm NPI=a:dong,r:4,i:4131010500">수택동<span> (291)</span></a></li>
								<li><a href="javascript:void(0);" secno="4131010600" xcrdn="127.116463" ycrdn="37.569925" class=" _secItm NPI=a:dong,r:5,i:4131010600">아천동<span> (0)</span></a></li>
								<li><a href="javascript:void(0);" secno="4131010300" xcrdn="127.134813" ycrdn="37.604607" class=" _secItm NPI=a:dong,r:6,i:4131010300">인창동<span> (761)</span></a></li>
								<li><a href="javascript:void(0);" secno="4131010700" xcrdn="127.153" ycrdn="37.5805" class=" _secItm NPI=a:dong,r:7,i:4131010700">토평동<span> (154)</span></a></li>
								</ul>
							</div>
						</div>
						<div class="sel_view">
							<p class="txt">
								<strong><em>‘갈매동’</em> 매물건수</strong><br>
								매매 <small>501</small> <span class="bar">|</span> 전세 <small>102</small> <span class="bar">|</span> 월세 <small>17</small>
								</p>
							<!-- [D] 확인 매물 보기 활성화 클래스 : view -->
							<p class="btn"><a class="view NPI=a:view" href="javascript:void(0);">확인 매물 보기</a></p>
						</div>
					</div>
				</div>
			</div>
			<!--result: home_rbox processed//-->
			<div class="aside">
				<img id="f280240" src="..\assets\image\ssafy_5.png" width="275" height="305" marginheight="0" marginwidth="0" scrolling="no" frameborder="0" align="middle" title="광고">
			</div>
		</div>
	</div>
<div id="content">
		<div class="section_group">
			<div class="section_l">
				<div class="news NE=a:tdn">
					<h2 tabindex="0">오늘의 뉴스</h2>
					<h3><a href="/news/newsRead.nhn?type=headline&amp;prsco_id=014&amp;arti_id=0004533336" class="NPI=a:title,i:0004533336" title="‘작년의 2배짜리‘ 종부세 고지서 오늘부터 발송합니다">‘작년의 2배짜리‘ 종부세 고지서 오늘..</a></h3>
								<p class="con"><a href="/news/newsRead.nhn?type=headline&amp;prsco_id=014&amp;arti_id=0004533336" class="NPI=a:contents,i:0004533336">오늘(23일)부터 서울 강남에 집 한 채만 가지고 있어도 지난해보다 갑절의 종합부동산세가 청구된 고지서를 받게 된다. 이에 따라 정부의 올해 종부세입은 3조5000억원을 넘어 사상 최대를..</a></p>
								<ul style="list-style:none; padding-left: 0px;     text-align: left;">
							<li><a href="/news/newsRead.nhn?type=headline&amp;prsco_id=005&amp;arti_id=0001383424" class="NPI=a:list,r:1,i:0001383424" title="‘집값 안정? 내년 더 힘들다’ 전문가 지적 4가지 포인트">‘집값 안정? 내년 더 힘들다’ 전문가 지적 4가.. </a> <span> 국민일보</span></li>
							<li><a href="/news/newsRead.nhn?type=headline&amp;prsco_id=020&amp;arti_id=0003321918" class="NPI=a:list,r:2,i:0003321918" title="빌라전세 찾은 김현미 “아파트 수준으로 품질 높이겠다”">빌라전세 찾은 김현미 “아파트 수준으로 품질 ..</a> <span>동아일보</span></li>
							<li><a href="/news/newsRead.nhn?type=headline&amp;prsco_id=005&amp;arti_id=0001383523" class="NPI=a:list,r:3,i:0001383523" title="지난해 5채 이상 다주택자 11만8000명 ‘역대 최대’">지난해 5채 이상 다주택자 11만8000명 ‘역대 최..</a> <span>국민일보</span></li>
							<li><a href="/news/newsRead.nhn?type=headline&amp;prsco_id=421&amp;arti_id=0005005414" class="NPI=a:list,r:4,i:0005005414" title="서울 아파트 거래량 4개월만에 반등…전세난, 집값 ‘불씨‘되나?">서울 아파트 거래량 4개월만에 반등…전세난, 집..</a> <span>뉴스1</span></li>
							</ul><p class="more NPI=a:more"><a href="/news/headline.nhn">더보기</a></p>
				</div>
				<!--result: home_tdynews processed//--><div class="special NE=a:ssp">
					<h2 tabindex="0">분양 특집</h2>
					<a href="https://isale.land.naver.com/iSale/Map/#SYDetail?build_dtl_cd=6023925&amp;supp_cd=9030422&amp;SYMap=37.6219096,127.1478017,17&amp;a=IA01" class="l_spot NPI=a:title">
						<span class="thmb"><img src="https://landthumb-phinf.pstatic.net/20201118_78/land_naver_1605680976612Gko3q_JPEG/photoinfra_1605680976139.jpg?type=m196" width="127" height="92" onerror="this.src='https://ssl.pstatic.net/static.land/static/service/20191007/noimage/noimage_120.gif'" alt="다산신도시참아름3단지"><span></span></span>
						<span class="tit"><strong>다산신도시참아름3단지</strong></span>
						<em class="info">경기도시공사</em>
						<span class="con">
						경기도 남양주시 다산동 <br>
						18-29층, 6개동, 총 1,257세대<br>
						청약접수1순위: 2020.12.07~12</span>
					</a>
					<ul style="    text-align: left; padding-left: 0px; ">
					<li><a href="https://land.naver.com/news/newsRead.nhn?type=breaking&amp;bss_ymd=20201120&amp;prsco_id=366&amp;arti_id=0000622462" class="NPI=a:list,r:1" title="집 모자라 아우성인데 빈 공공주택이 4만채...">집 모자라 아우성인데 빈 공공주택이 4만채...</a> <span>조선비즈 </span></li>
					<li><a href="https://land.naver.com/news/newsRead.nhn?type=breaking&amp;bss_ymd=20201120&amp;prsco_id=020&amp;arti_id=0003321523" class="NPI=a:list,r:2" title="임대 11만채 공급… 서울 아파트는 3500채뿐">임대 11만채 공급… 서울 아파트는 3500채뿐</a> <span>동아일보 </span></li>
					<li><a href="https://land.naver.com/news/newsRead.nhn?type=breaking&amp;bss_ymd=20201120&amp;prsco_id=421&amp;arti_id=0005002372" class="NPI=a:list,r:3" title="전세 품귀 현상에 전셋값 고공행진 지속…서울...">전세 품귀 현상에 전셋값 고공행진 지속…서울...</a> <span>뉴스1</span></li>
					</ul>
				</div>
				<!--result: home_saleissue processed//--></div>
			<div class="section_c">
				<div class="usefultip" id="usefultip">
        <div class="usefultip_header">
			공지사항 자리
        </div>
        <div class="usefultip_content is-sale" role="tabpanel">
			공지사항 정보
            <div class="usefultip_content_inner type_sale">
				공지사항
                <!-- <ul class="item_list">
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221172176139" class="item item_1" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">1</span><span class="text">가용자금 확인 및 대출 계획</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221172968369" class="item item_2" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">2</span><span class="text">집 종류 및 지역 선택</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221172975575" class="item item_3" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">3</span><span class="text">정보수집 &amp; 시세파악</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221173052981" class="item item_4" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">4</span><span class="text">부동산 방문 &amp; 집 구경</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221176290264" class="item item_5" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">5</span><span class="text">계약 및 잔금 치르기</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221176300611" class="item item_6" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">6</span><span class="text">소유권 이전등기</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221176306347" class="item item_7" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">7</span><span class="text">인테리어 공사</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221176998743" class="item item_8" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">8</span><span class="text">이사</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221177010341" class="item item_9" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">9</span><span class="text">거주하면서</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                    <li class="item_area">
                        <a href="http://blog.naver.com/land_admin/221177033918" class="item item_10" target="_blank">
                            <i class="icon"></i><div class="text_area"><span class="number">10</span><span class="text">매도하기</span><i class="icon_more"></i></div>
                        </a>
                    </li>
                </ul> -->
            </div>
        </div>
        </div>
</div>
		</div>
		    <div class="usefultip_header">
				즐겨찾기 자리
        	</div>
		<div class="section_r">
			<div class="usefultip_content is-sale" role="tabpanel">
				즐겨찾기 정보
			</div>

			<!--result: home_expcol processed//-->

			<!--result: home_notice processed//--></div>		
	</div>
</div>
</template>

<script>
export default {

}
</script>

<style lang="scss">
	// @import "../assest/css/dd.css";
	.spot_wrap{
		overflow:hidden;
		position:relative;
		width:980px;
		height:309px;
		margin:0 0 14px;
		border-top:2px solid #52596b;
		border-bottom:1px solid #e5e8ec}
	#container33 {
  		clear: both;
  		position: relative;
  		z-index: 20;
	}

	.content {
  		position: relative;
		width: 980px;
  		padding: 0 0 28px;
		border-bottom: 1px solid #dedede;
	}


	// ul {
	// 	list-style: none;
	// 	display:flex; 
	// 	align-content:flex-start; 
	// 	flex-direction:column; 
	// 	flex-wrap:wrap; 
	// 	overflow:auto;
	// }
	.location .loc_list .list ul {
    overflow: hidden;
    overflow-x: hidden;
    overflow-y: hidden;
    position: relative;
    width: 188px;
}
ul {
    display: block;
    list-style-type: disc;
    margin-block-start: 1em;
    margin-block-end: 1em;
    margin-inline-start: 0px;
    margin-inline-end: 0px;
    padding-inline-start: 40px;
}

</style>