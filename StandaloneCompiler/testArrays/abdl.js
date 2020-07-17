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
  main: async (arg_context, arg_table, arg_render) => {
    context = arg_context;
    table = arg_table;
    render = arg_render;
    let v13 = new ABDLVar("");
    let v14 = new ABDLVar("");
    let v12 = new ABDLVar([v13, v14]);
    let v16 = new ABDLVar("");
    let v17 = new ABDLVar("");
    let v15 = new ABDLVar([v16, v17]);
    let v19 = new ABDLVar("");
    let v20 = new ABDLVar("");
    let v18 = new ABDLVar([v19, v20]);
    let v22 = new ABDLVar("");
    let v23 = new ABDLVar("");
    let v21 = new ABDLVar([v22, v23]);
    let v25 = new ABDLVar("");
    let v26 = new ABDLVar("");
    let v24 = new ABDLVar([v25, v26]);
    let v28 = new ABDLVar("");
    let v29 = new ABDLVar("");
    let v27 = new ABDLVar([v28, v29]);
    let v31 = new ABDLVar("");
    let v32 = new ABDLVar("");
    let v30 = new ABDLVar([v31, v32]);
    let v34 = new ABDLVar("");
    let v35 = new ABDLVar("");
    let v33 = new ABDLVar([v34, v35]);
    let v11 = new ABDLVar([v12, v15, v18, v21, v24, v27, v30, v33]);
    let v38 = new ABDLVar("");
    let v39 = new ABDLVar("");
    let v37 = new ABDLVar([v38, v39]);
    let v41 = new ABDLVar("");
    let v42 = new ABDLVar("");
    let v40 = new ABDLVar([v41, v42]);
    let v44 = new ABDLVar("");
    let v45 = new ABDLVar("");
    let v43 = new ABDLVar([v44, v45]);
    let v47 = new ABDLVar("");
    let v48 = new ABDLVar("");
    let v46 = new ABDLVar([v47, v48]);
    let v50 = new ABDLVar("");
    let v51 = new ABDLVar("");
    let v49 = new ABDLVar([v50, v51]);
    let v53 = new ABDLVar("");
    let v54 = new ABDLVar("");
    let v52 = new ABDLVar([v53, v54]);
    let v56 = new ABDLVar("");
    let v57 = new ABDLVar("");
    let v55 = new ABDLVar([v56, v57]);
    let v59 = new ABDLVar("");
    let v60 = new ABDLVar("");
    let v58 = new ABDLVar([v59, v60]);
    let v36 = new ABDLVar([v37, v40, v43, v46, v49, v52, v55, v58]);
    let v63 = new ABDLVar("");
    let v64 = new ABDLVar("");
    let v62 = new ABDLVar([v63, v64]);
    let v66 = new ABDLVar("");
    let v67 = new ABDLVar("");
    let v65 = new ABDLVar([v66, v67]);
    let v69 = new ABDLVar("");
    let v70 = new ABDLVar("");
    let v68 = new ABDLVar([v69, v70]);
    let v72 = new ABDLVar("");
    let v73 = new ABDLVar("");
    let v71 = new ABDLVar([v72, v73]);
    let v75 = new ABDLVar("");
    let v76 = new ABDLVar("");
    let v74 = new ABDLVar([v75, v76]);
    let v78 = new ABDLVar("");
    let v79 = new ABDLVar("");
    let v77 = new ABDLVar([v78, v79]);
    let v81 = new ABDLVar("");
    let v82 = new ABDLVar("");
    let v80 = new ABDLVar([v81, v82]);
    let v84 = new ABDLVar("");
    let v85 = new ABDLVar("");
    let v83 = new ABDLVar([v84, v85]);
    let v61 = new ABDLVar([v62, v65, v68, v71, v74, v77, v80, v83]);
    let v88 = new ABDLVar("");
    let v89 = new ABDLVar("");
    let v87 = new ABDLVar([v88, v89]);
    let v91 = new ABDLVar("");
    let v92 = new ABDLVar("");
    let v90 = new ABDLVar([v91, v92]);
    let v94 = new ABDLVar("");
    let v95 = new ABDLVar("");
    let v93 = new ABDLVar([v94, v95]);
    let v97 = new ABDLVar("");
    let v98 = new ABDLVar("");
    let v96 = new ABDLVar([v97, v98]);
    let v100 = new ABDLVar("");
    let v101 = new ABDLVar("");
    let v99 = new ABDLVar([v100, v101]);
    let v103 = new ABDLVar("");
    let v104 = new ABDLVar("");
    let v102 = new ABDLVar([v103, v104]);
    let v106 = new ABDLVar("");
    let v107 = new ABDLVar("");
    let v105 = new ABDLVar([v106, v107]);
    let v109 = new ABDLVar("");
    let v110 = new ABDLVar("");
    let v108 = new ABDLVar([v109, v110]);
    let v86 = new ABDLVar([v87, v90, v93, v96, v99, v102, v105, v108]);
    let v113 = new ABDLVar("");
    let v114 = new ABDLVar("");
    let v112 = new ABDLVar([v113, v114]);
    let v116 = new ABDLVar("");
    let v117 = new ABDLVar("");
    let v115 = new ABDLVar([v116, v117]);
    let v119 = new ABDLVar("");
    let v120 = new ABDLVar("");
    let v118 = new ABDLVar([v119, v120]);
    let v122 = new ABDLVar("");
    let v123 = new ABDLVar("");
    let v121 = new ABDLVar([v122, v123]);
    let v125 = new ABDLVar("");
    let v126 = new ABDLVar("");
    let v124 = new ABDLVar([v125, v126]);
    let v128 = new ABDLVar("");
    let v129 = new ABDLVar("");
    let v127 = new ABDLVar([v128, v129]);
    let v131 = new ABDLVar("");
    let v132 = new ABDLVar("");
    let v130 = new ABDLVar([v131, v132]);
    let v134 = new ABDLVar("");
    let v135 = new ABDLVar("");
    let v133 = new ABDLVar([v134, v135]);
    let v111 = new ABDLVar([v112, v115, v118, v121, v124, v127, v130, v133]);
    let v138 = new ABDLVar("");
    let v139 = new ABDLVar("");
    let v137 = new ABDLVar([v138, v139]);
    let v141 = new ABDLVar("");
    let v142 = new ABDLVar("");
    let v140 = new ABDLVar([v141, v142]);
    let v144 = new ABDLVar("");
    let v145 = new ABDLVar("");
    let v143 = new ABDLVar([v144, v145]);
    let v147 = new ABDLVar("");
    let v148 = new ABDLVar("");
    let v146 = new ABDLVar([v147, v148]);
    let v150 = new ABDLVar("");
    let v151 = new ABDLVar("");
    let v149 = new ABDLVar([v150, v151]);
    let v153 = new ABDLVar("");
    let v154 = new ABDLVar("");
    let v152 = new ABDLVar([v153, v154]);
    let v156 = new ABDLVar("");
    let v157 = new ABDLVar("");
    let v155 = new ABDLVar([v156, v157]);
    let v159 = new ABDLVar("");
    let v160 = new ABDLVar("");
    let v158 = new ABDLVar([v159, v160]);
    let v136 = new ABDLVar([v137, v140, v143, v146, v149, v152, v155, v158]);
    let v163 = new ABDLVar("");
    let v164 = new ABDLVar("");
    let v162 = new ABDLVar([v163, v164]);
    let v166 = new ABDLVar("");
    let v167 = new ABDLVar("");
    let v165 = new ABDLVar([v166, v167]);
    let v169 = new ABDLVar("");
    let v170 = new ABDLVar("");
    let v168 = new ABDLVar([v169, v170]);
    let v172 = new ABDLVar("");
    let v173 = new ABDLVar("");
    let v171 = new ABDLVar([v172, v173]);
    let v175 = new ABDLVar("");
    let v176 = new ABDLVar("");
    let v174 = new ABDLVar([v175, v176]);
    let v178 = new ABDLVar("");
    let v179 = new ABDLVar("");
    let v177 = new ABDLVar([v178, v179]);
    let v181 = new ABDLVar("");
    let v182 = new ABDLVar("");
    let v180 = new ABDLVar([v181, v182]);
    let v184 = new ABDLVar("");
    let v185 = new ABDLVar("");
    let v183 = new ABDLVar([v184, v185]);
    let v161 = new ABDLVar([v162, v165, v168, v171, v174, v177, v180, v183]);
    let v188 = new ABDLVar("");
    let v189 = new ABDLVar("");
    let v187 = new ABDLVar([v188, v189]);
    let v191 = new ABDLVar("");
    let v192 = new ABDLVar("");
    let v190 = new ABDLVar([v191, v192]);
    let v194 = new ABDLVar("");
    let v195 = new ABDLVar("");
    let v193 = new ABDLVar([v194, v195]);
    let v197 = new ABDLVar("");
    let v198 = new ABDLVar("");
    let v196 = new ABDLVar([v197, v198]);
    let v200 = new ABDLVar("");
    let v201 = new ABDLVar("");
    let v199 = new ABDLVar([v200, v201]);
    let v203 = new ABDLVar("");
    let v204 = new ABDLVar("");
    let v202 = new ABDLVar([v203, v204]);
    let v206 = new ABDLVar("");
    let v207 = new ABDLVar("");
    let v205 = new ABDLVar([v206, v207]);
    let v209 = new ABDLVar("");
    let v210 = new ABDLVar("");
    let v208 = new ABDLVar([v209, v210]);
    let v186 = new ABDLVar([v187, v190, v193, v196, v199, v202, v205, v208]);
    let v10 = new ABDLVar([v11, v36, v61, v86, v111, v136, v161, v186]);
    let v214 = new ABDLVar("");
    let v213 = new ABDLVar([v214]);
    let v212 = new ABDLVar([v213]);
    let v211 = new ABDLVar([v212]);
    let v215 = new ABDLVar(0);
    let v217 = new ABDLVar(context.width);
    let v218 = new ABDLVar(1);
    let v216 = v217.sub(v218);
    for(let v219 of range(v215,v216)) {
      let v220 = new ABDLVar(0);
      let v222 = new ABDLVar(context.height);
      let v223 = new ABDLVar(1);
      let v221 = v222.sub(v223);
      for(let v224 of range(v220,v221)) {
        let v225 = new ABDLVar([v219, v224]);
        v10.getValue()[v219.getValue()].getValue()[v224.getValue()].setValue(0, (getOwner([v225.getValue()[0], v225.getValue()[1]])).value);
        let v226 = new ABDLVar([v219, v224]);
        v10.getValue()[v219.getValue()].getValue()[v224.getValue()].setValue(1, (getName([v226.getValue()[0], v226.getValue()[1]])).value);
      }
    }
    let v228 = new ABDLVar(0);
    let v229 = new ABDLVar(0);
    let v230 = new ABDLVar(0);
    let v231 = new ABDLVar(2);
    let v227 = new ABDLVar( await f0(v10, v228, v229, v230, v231));
    v211 = v10;
    let v232 = new ABDLVar(0);
    let v234 = new ABDLVar(context.width);
    let v235 = new ABDLVar(1);
    let v233 = v234.sub(v235);
    for(let v236 of range(v232,v233)) {
      let v237 = new ABDLVar(0);
      let v239 = new ABDLVar(context.height);
      let v240 = new ABDLVar(1);
      let v238 = v239.sub(v240);
      for(let v241 of range(v237,v238)) {
        let v243 = new ABDLVar(v211.getValue()[v236.getValue()]);
        let v242 = new ABDLVar(v243.getValue().value[v241.getValue()]);
        console.log(v242.toString());
      }
    }
  }
}
async function f0(v0, v1, v2, v3, v4){
  let v6 = new ABDLVar(v0.getValue()[v3.getValue()]);
  let v5 = new ABDLVar(v6.getValue().value[v4.getValue()]);
  let v7 = v5;
  let v9 = new ABDLVar(v0.getValue()[v1.getValue()]);
  let v8 = new ABDLVar(v9.getValue().value[v2.getValue()]);
  v0.getValue()[v3.getValue()].setValue(v4.value,v8.value);
  v0.getValue()[v1.getValue()].setValue(v2.value,v7.value);
}