import ABDLVar from "./AbdlVar.js"
var context;
var table;
var render;
const sleep = (milliseconds) => {
  return new Promise(resolve => setTimeout(resolve, milliseconds))
}
const range = (a, b) => {
  const result = [];
  for (let i = a.getValue(); i <= b.getValue(); i++) result.push(new ABDLVar(i));
  return result;
}
const getName = (a) => {
  try {
    return new ABDLVar(context.board[a[0]][a[1]].piece.name)
  } catch (e) {
    return new ABDLVar("");
  }
}
const getOwner = (a) => {
  try {
    return new ABDLVar(context.board[a[0]][a[1]].piece.owner)
  } catch (e) {
    return new ABDLVar(-1);
  }
}
const move = async (origin, destination) => {
  try {
    table[origin.getValue()[0]][origin.getValue()[1]].onclick();
    render(context, table)
    await sleep(1000);
    table[destination.getValue()[0]][destination.getValue()[1]].onclick();
    render(context, table)
    return new ABDLVar(1);
  } catch (e) {
    return new ABDLVar(0);
  }
}
const can_move = async (origin, destination) => {
  let result
  try{
    if (!table[origin.getValue()[0]][origin.getValue()[1]].onclick) return new ABDLVar(0);
      table[origin.getValue()[0]][origin.getValue()[1]].onclick();
  } catch(e) { return new ABDLVar(0); }
  render(context, table)
  try {
    if (
      table[destination.getValue()[0]][destination.getValue()[1]].style.backgroundColor ==
      "rgb(100, 200, 100)"
    )//rgb(100, 200, 100)
      result = new ABDLVar(1);
    else
      result = new ABDLVar(0);
  } catch (e) { result = new ABDLVar(0); }
  context.focused.x = -1;
  context.focused.y = -1;
  render(context, table);
  return result
}
export default {
  on_move: async (arg_context, arg_table, arg_render) => {
      let v365 = new ABDLVar( await f0());
    },
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v364 = new ABDLVar( await f0());
  }
}
async function f0(){
  let v0 = new ABDLVar("");
  let v1 = new ABDLVar(context.current_player);
  let v2 = v1;
  let v4 = new ABDLVar(1);
  let v3 = v4.mul(new ABDLVar(-1));
  let v5 = v3;
  let v7 = new ABDLVar(0);
  let v8 = new ABDLVar(0);
  let v6 = new ABDLVar([v7, v8]);
  let v10 = new ABDLVar(0);
  let v11 = new ABDLVar(0);
  let v9 = new ABDLVar([v10, v11]);
  let v12 = new ABDLVar(0);
  let v14 = new ABDLVar(context.width);
  let v15 = new ABDLVar(1);
  let v13 = v14.sub(v15);
  for(let v16 of range(v12,v13)) {
    let v17 = new ABDLVar(0);
    let v19 = new ABDLVar(context.height);
    let v20 = new ABDLVar(1);
    let v18 = v19.sub(v20);
    for(let v21 of range(v17,v18)) {
      let v22 = new ABDLVar([v16, v21]);
      v0 = (getName([v22.getValue()[0], v22.getValue()[1]]));
      let v23 = new ABDLVar([v16, v21]);
      v2 = (getOwner([v23.getValue()[0], v23.getValue()[1]]));
      let v25 = new ABDLVar("");
      let v24 = v0.not_equal(v25);
      if (v24.getValue() != 0) {
         let v26 = new ABDLVar(0);
         let v28 = new ABDLVar(context.width);
         let v29 = new ABDLVar(1);
         let v27 = v28.sub(v29);
         for(let v30 of range(v26,v27)) {
           let v31 = new ABDLVar(0);
           let v33 = new ABDLVar(context.height);
           let v34 = new ABDLVar(1);
           let v32 = v33.sub(v34);
           for(let v35 of range(v31,v32)) {
             let v36 = new ABDLVar([v16, v21]);
             let v37 = new ABDLVar([v30, v35]);
             if ((await can_move(v36, v37)).getValue() != 0) {
                let v38 = new ABDLVar([v16, v21]);
                let v39 = new ABDLVar([v30, v35]);
                let v40 = (await f2(v38, v39));
                let v41 = new ABDLVar(0);
                let v42 = v41;
                let v46 = new ABDLVar("best: ");
                let v45 = v46.add(v5);
                let v47 = new ABDLVar("eval: ");
                let v44 = v45.add(v47);
                let v43 = v44.add(v40);
                console.log(v43.toString());
                let v49 = new ABDLVar(context.current_player);
                let v50 = new ABDLVar(1);
                let v48 = v49.equal(v50);
                if (v48.getValue() != 0) {
                   let v51 = v40.greater_than(v5);
                   v42 = v51;
                }
                else {
                   let v52 = v40.greater_than(v5);
                   v42 = v52;
                }
                if (v42.getValue() != 0) {
                   v5 = v40;
                   let v53 = new ABDLVar([v16, v21]);
                   v6 = v53;
                   let v54 = new ABDLVar([v30, v35]);
                   v9 = v54;
                   let v59 = new ABDLVar(" -> ");
                   let v58 = v6.add(v59);
                   let v57 = v58.add(v9);
                   let v60 = new ABDLVar(": ");
                   let v56 = v57.add(v60);
                   let v55 = v56.add(v5);
                   console.log(v55.toString());
                }
             }
           }
         }
      }
    }
  }
  let v64 = new ABDLVar("Gonna move now: ");
  let v63 = v64.add(v6);
  let v65 = new ABDLVar(" -> ");
  let v62 = v63.add(v65);
  let v61 = v62.add(v9);
  console.log(v61.toString());
  await move(v6, v9);
  let v66 = new ABDLVar("Done moving!");
  console.log(v66.toString());
}
async function f1(v67){
  let v69 = new ABDLVar("pawn");
  let v68 = v67.equal(v69);
  let v72 = new ABDLVar("king");
  let v71 = v67.equal(v72);
  let v76 = new ABDLVar("queen");
  let v75 = v67.equal(v76);
  let v79 = new ABDLVar("bishop");
  let v78 = v67.equal(v79);
  let v82 = new ABDLVar("horse");
  let v81 = v67.equal(v82);
  let v85 = new ABDLVar("tower");
  let v84 = v67.equal(v85);
  if (v68.getValue() != 0) {
     let v70 = new ABDLVar(10);
     return v70;
  }
  else {
     if (v84.getValue() != 0) {
        let v86 = new ABDLVar(50);
        return v86;
     }
     else {
        if (v81.getValue() != 0) {
           let v83 = new ABDLVar(30);
           return v83;
        }
        else {
           if (v78.getValue() != 0) {
              let v80 = new ABDLVar(30);
              return v80;
           }
           else {
              if (v75.getValue() != 0) {
                 let v77 = new ABDLVar(90);
                 return v77;
              }
              else {
                 if (v71.getValue() != 0) {
                    let v73 = new ABDLVar(900);
                    return v73;
                 }
                 else {
                    let v74 = new ABDLVar(0);
                    return v74;
                 }
              }
           }
        }
     }
  }
}
async function f2(v87, v88){
  let v89 = new ABDLVar(0);
  let v90 = v89;
  let v91 = new ABDLVar("");
  let v95 = new ABDLVar("");
  let v96 = new ABDLVar("");
  let v94 = new ABDLVar([v95, v96]);
  let v98 = new ABDLVar("");
  let v99 = new ABDLVar("");
  let v97 = new ABDLVar([v98, v99]);
  let v101 = new ABDLVar("");
  let v102 = new ABDLVar("");
  let v100 = new ABDLVar([v101, v102]);
  let v104 = new ABDLVar("");
  let v105 = new ABDLVar("");
  let v103 = new ABDLVar([v104, v105]);
  let v107 = new ABDLVar("");
  let v108 = new ABDLVar("");
  let v106 = new ABDLVar([v107, v108]);
  let v110 = new ABDLVar("");
  let v111 = new ABDLVar("");
  let v109 = new ABDLVar([v110, v111]);
  let v113 = new ABDLVar("");
  let v114 = new ABDLVar("");
  let v112 = new ABDLVar([v113, v114]);
  let v116 = new ABDLVar("");
  let v117 = new ABDLVar("");
  let v115 = new ABDLVar([v116, v117]);
  let v93 = new ABDLVar([v94, v97, v100, v103, v106, v109, v112, v115]);
  let v120 = new ABDLVar("");
  let v121 = new ABDLVar("");
  let v119 = new ABDLVar([v120, v121]);
  let v123 = new ABDLVar("");
  let v124 = new ABDLVar("");
  let v122 = new ABDLVar([v123, v124]);
  let v126 = new ABDLVar("");
  let v127 = new ABDLVar("");
  let v125 = new ABDLVar([v126, v127]);
  let v129 = new ABDLVar("");
  let v130 = new ABDLVar("");
  let v128 = new ABDLVar([v129, v130]);
  let v132 = new ABDLVar("");
  let v133 = new ABDLVar("");
  let v131 = new ABDLVar([v132, v133]);
  let v135 = new ABDLVar("");
  let v136 = new ABDLVar("");
  let v134 = new ABDLVar([v135, v136]);
  let v138 = new ABDLVar("");
  let v139 = new ABDLVar("");
  let v137 = new ABDLVar([v138, v139]);
  let v141 = new ABDLVar("");
  let v142 = new ABDLVar("");
  let v140 = new ABDLVar([v141, v142]);
  let v118 = new ABDLVar([v119, v122, v125, v128, v131, v134, v137, v140]);
  let v145 = new ABDLVar("");
  let v146 = new ABDLVar("");
  let v144 = new ABDLVar([v145, v146]);
  let v148 = new ABDLVar("");
  let v149 = new ABDLVar("");
  let v147 = new ABDLVar([v148, v149]);
  let v151 = new ABDLVar("");
  let v152 = new ABDLVar("");
  let v150 = new ABDLVar([v151, v152]);
  let v154 = new ABDLVar("");
  let v155 = new ABDLVar("");
  let v153 = new ABDLVar([v154, v155]);
  let v157 = new ABDLVar("");
  let v158 = new ABDLVar("");
  let v156 = new ABDLVar([v157, v158]);
  let v160 = new ABDLVar("");
  let v161 = new ABDLVar("");
  let v159 = new ABDLVar([v160, v161]);
  let v163 = new ABDLVar("");
  let v164 = new ABDLVar("");
  let v162 = new ABDLVar([v163, v164]);
  let v166 = new ABDLVar("");
  let v167 = new ABDLVar("");
  let v165 = new ABDLVar([v166, v167]);
  let v143 = new ABDLVar([v144, v147, v150, v153, v156, v159, v162, v165]);
  let v170 = new ABDLVar("");
  let v171 = new ABDLVar("");
  let v169 = new ABDLVar([v170, v171]);
  let v173 = new ABDLVar("");
  let v174 = new ABDLVar("");
  let v172 = new ABDLVar([v173, v174]);
  let v176 = new ABDLVar("");
  let v177 = new ABDLVar("");
  let v175 = new ABDLVar([v176, v177]);
  let v179 = new ABDLVar("");
  let v180 = new ABDLVar("");
  let v178 = new ABDLVar([v179, v180]);
  let v182 = new ABDLVar("");
  let v183 = new ABDLVar("");
  let v181 = new ABDLVar([v182, v183]);
  let v185 = new ABDLVar("");
  let v186 = new ABDLVar("");
  let v184 = new ABDLVar([v185, v186]);
  let v188 = new ABDLVar("");
  let v189 = new ABDLVar("");
  let v187 = new ABDLVar([v188, v189]);
  let v191 = new ABDLVar("");
  let v192 = new ABDLVar("");
  let v190 = new ABDLVar([v191, v192]);
  let v168 = new ABDLVar([v169, v172, v175, v178, v181, v184, v187, v190]);
  let v195 = new ABDLVar("");
  let v196 = new ABDLVar("");
  let v194 = new ABDLVar([v195, v196]);
  let v198 = new ABDLVar("");
  let v199 = new ABDLVar("");
  let v197 = new ABDLVar([v198, v199]);
  let v201 = new ABDLVar("");
  let v202 = new ABDLVar("");
  let v200 = new ABDLVar([v201, v202]);
  let v204 = new ABDLVar("");
  let v205 = new ABDLVar("");
  let v203 = new ABDLVar([v204, v205]);
  let v207 = new ABDLVar("");
  let v208 = new ABDLVar("");
  let v206 = new ABDLVar([v207, v208]);
  let v210 = new ABDLVar("");
  let v211 = new ABDLVar("");
  let v209 = new ABDLVar([v210, v211]);
  let v213 = new ABDLVar("");
  let v214 = new ABDLVar("");
  let v212 = new ABDLVar([v213, v214]);
  let v216 = new ABDLVar("");
  let v217 = new ABDLVar("");
  let v215 = new ABDLVar([v216, v217]);
  let v193 = new ABDLVar([v194, v197, v200, v203, v206, v209, v212, v215]);
  let v220 = new ABDLVar("");
  let v221 = new ABDLVar("");
  let v219 = new ABDLVar([v220, v221]);
  let v223 = new ABDLVar("");
  let v224 = new ABDLVar("");
  let v222 = new ABDLVar([v223, v224]);
  let v226 = new ABDLVar("");
  let v227 = new ABDLVar("");
  let v225 = new ABDLVar([v226, v227]);
  let v229 = new ABDLVar("");
  let v230 = new ABDLVar("");
  let v228 = new ABDLVar([v229, v230]);
  let v232 = new ABDLVar("");
  let v233 = new ABDLVar("");
  let v231 = new ABDLVar([v232, v233]);
  let v235 = new ABDLVar("");
  let v236 = new ABDLVar("");
  let v234 = new ABDLVar([v235, v236]);
  let v238 = new ABDLVar("");
  let v239 = new ABDLVar("");
  let v237 = new ABDLVar([v238, v239]);
  let v241 = new ABDLVar("");
  let v242 = new ABDLVar("");
  let v240 = new ABDLVar([v241, v242]);
  let v218 = new ABDLVar([v219, v222, v225, v228, v231, v234, v237, v240]);
  let v245 = new ABDLVar("");
  let v246 = new ABDLVar("");
  let v244 = new ABDLVar([v245, v246]);
  let v248 = new ABDLVar("");
  let v249 = new ABDLVar("");
  let v247 = new ABDLVar([v248, v249]);
  let v251 = new ABDLVar("");
  let v252 = new ABDLVar("");
  let v250 = new ABDLVar([v251, v252]);
  let v254 = new ABDLVar("");
  let v255 = new ABDLVar("");
  let v253 = new ABDLVar([v254, v255]);
  let v257 = new ABDLVar("");
  let v258 = new ABDLVar("");
  let v256 = new ABDLVar([v257, v258]);
  let v260 = new ABDLVar("");
  let v261 = new ABDLVar("");
  let v259 = new ABDLVar([v260, v261]);
  let v263 = new ABDLVar("");
  let v264 = new ABDLVar("");
  let v262 = new ABDLVar([v263, v264]);
  let v266 = new ABDLVar("");
  let v267 = new ABDLVar("");
  let v265 = new ABDLVar([v266, v267]);
  let v243 = new ABDLVar([v244, v247, v250, v253, v256, v259, v262, v265]);
  let v270 = new ABDLVar("");
  let v271 = new ABDLVar("");
  let v269 = new ABDLVar([v270, v271]);
  let v273 = new ABDLVar("");
  let v274 = new ABDLVar("");
  let v272 = new ABDLVar([v273, v274]);
  let v276 = new ABDLVar("");
  let v277 = new ABDLVar("");
  let v275 = new ABDLVar([v276, v277]);
  let v279 = new ABDLVar("");
  let v280 = new ABDLVar("");
  let v278 = new ABDLVar([v279, v280]);
  let v282 = new ABDLVar("");
  let v283 = new ABDLVar("");
  let v281 = new ABDLVar([v282, v283]);
  let v285 = new ABDLVar("");
  let v286 = new ABDLVar("");
  let v284 = new ABDLVar([v285, v286]);
  let v288 = new ABDLVar("");
  let v289 = new ABDLVar("");
  let v287 = new ABDLVar([v288, v289]);
  let v291 = new ABDLVar("");
  let v292 = new ABDLVar("");
  let v290 = new ABDLVar([v291, v292]);
  let v268 = new ABDLVar([v269, v272, v275, v278, v281, v284, v287, v290]);
  let v92 = new ABDLVar([v93, v118, v143, v168, v193, v218, v243, v268]);
  let v293 = new ABDLVar(0);
  let v295 = new ABDLVar(context.width);
  let v296 = new ABDLVar(1);
  let v294 = v295.sub(v296);
  for(let v297 of range(v293,v294)) {
    let v298 = new ABDLVar(0);
    let v300 = new ABDLVar(context.height);
    let v301 = new ABDLVar(1);
    let v299 = v300.sub(v301);
    for(let v302 of range(v298,v299)) {
      let v303 = new ABDLVar([v297, v302]);
      v92.getValue()[v297.getValue()].getValue()[v302.getValue()].setValue(0, (getOwner([v303.getValue()[0], v303.getValue()[1]])).value);
      let v304 = new ABDLVar([v297, v302]);
      v92.getValue()[v297.getValue()].getValue()[v302.getValue()].setValue(1, (getName([v304.getValue()[0], v304.getValue()[1]])).value);
    }
  }
  let v307 = new ABDLVar(0);
  let v306 = new ABDLVar(v87.getValue()[v307.getValue()]);
  let v309 = new ABDLVar(1);
  let v308 = new ABDLVar(v87.getValue()[v309.getValue()]);
  let v311 = new ABDLVar(0);
  let v310 = new ABDLVar(v88.getValue()[v311.getValue()]);
  let v313 = new ABDLVar(1);
  let v312 = new ABDLVar(v88.getValue()[v313.getValue()]);
  let v305 = new ABDLVar( await f3(v92, v306, v308, v310, v312));
  let v314 = new ABDLVar(0);
  let v316 = new ABDLVar(context.width);
  let v317 = new ABDLVar(1);
  let v315 = v316.sub(v317);
  for(let v318 of range(v314,v315)) {
    let v319 = new ABDLVar(0);
    let v321 = new ABDLVar(context.height);
    let v322 = new ABDLVar(1);
    let v320 = v321.sub(v322);
    for(let v323 of range(v319,v320)) {
      let v325 = new ABDLVar([v318, v323]);
      let v326 = new ABDLVar(context.current_player);
      let v324 = (getOwner([v325.getValue()[0], v325.getValue()[1]])).equal(v326);
      if (v324.getValue() != 0) {
         let v330 = new ABDLVar(v92.getValue()[v318.getValue()]);
         let v329 = new ABDLVar(v330.getValue().value[v323.getValue()]);
         let v331 = new ABDLVar(1);
         let v328 = new ABDLVar(v329.getValue().value[v331.getValue()]);
         let v327 = v90.sub((await f1(v328)));
         v90 = v327;
      }
      else {
         let v335 = new ABDLVar(v92.getValue()[v318.getValue()]);
         let v334 = new ABDLVar(v335.getValue().value[v323.getValue()]);
         let v336 = new ABDLVar(1);
         let v333 = new ABDLVar(v334.getValue().value[v336.getValue()]);
         let v332 = v90.add((await f1(v333)));
         v90 = v332;
      }
    }
  }
  let v337 = new ABDLVar(0);
  let v339 = new ABDLVar(context.width);
  let v340 = new ABDLVar(1);
  let v338 = v339.sub(v340);
  for(let v341 of range(v337,v338)) {
    let v342 = new ABDLVar(0);
    let v344 = new ABDLVar(context.height);
    let v345 = new ABDLVar(1);
    let v343 = v344.sub(v345);
    for(let v346 of range(v342,v343)) {
      let v348 = new ABDLVar([v341, v346]);
      let v349 = new ABDLVar(context.current_player);
      let v347 = (getOwner([v348.getValue()[0], v348.getValue()[1]])).equal(v349);
      if (v347.getValue() != 0) {
         let v351 = new ABDLVar([v341, v346]);
         let v350 = v90.sub((await f1((getName([v351.getValue()[0], v351.getValue()[1]])))));
         v90 = v350;
      }
      else {
         let v353 = new ABDLVar([v341, v346]);
         let v352 = v90.add((await f1((getName([v353.getValue()[0], v353.getValue()[1]])))));
         v90 = v352;
      }
    }
  }
  return v90;
}
async function f3(v354, v355, v356, v357, v358){
  let v360 = new ABDLVar(v354.getValue()[v357.getValue()]);
  let v359 = new ABDLVar(v360.getValue().value[v358.getValue()]);
  let v361 = v359;
  let v363 = new ABDLVar(v354.getValue()[v355.getValue()]);
  let v362 = new ABDLVar(v363.getValue().value[v356.getValue()]);
  v354.getValue()[v357.getValue()].setValue(v358.value,v362.value);
  v354.getValue()[v355.getValue()].setValue(v356.value,v361.value);
}