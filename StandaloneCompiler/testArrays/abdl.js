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
    let v7 = new ABDLVar("cona");
    let v8 = new ABDLVar("gorda");
    let v9 = new ABDLVar("com");
    let v10 = new ABDLVar("puta");
    let v6 = new ABDLVar([v7, v8, v9, v10]);
    let v13 = new ABDLVar("");
    let v12 = new ABDLVar([v13]);
    let v15 = new ABDLVar("");
    let v14 = new ABDLVar([v15]);
    let v11 = new ABDLVar([v12, v14]);
    v11.setValue(0, v6);
    let v17 = new ABDLVar("god");
    let v18 = new ABDLVar("damn");
    let v16 = new ABDLVar([v17, v18]);
    v11.setValue(1, v16);
    console.log(v6.toString());
    let v20 = new ABDLVar(0);
    let v19 = new ABDLVar(v6.getValue()[v20.getValue()]);
    console.log(v19.toString());
    let v22 = new ABDLVar(3);
    let v23 = new ABDLVar(0);
    let v21 = new ABDLVar( await f0(v6, v22, v23));
    let v25 = new ABDLVar(1);
    let v26 = new ABDLVar(2);
    let v24 = new ABDLVar( await f0(v6, v25, v26));
    let v28 = new ABDLVar(2);
    let v29 = new ABDLVar(3);
    let v27 = new ABDLVar( await f0(v6, v28, v29));
    console.log(v6.toString());
    console.log(v11.toString());
    let v31 = new ABDLVar(0);
    let v33 = new ABDLVar(context.height);
    let v34 = new ABDLVar(2);
    let v32 = v33.sub(v34);
    let v30 = new ABDLVar([v31, v32]);
    let v36 = new ABDLVar(0);
    let v38 = new ABDLVar(context.height);
    let v39 = new ABDLVar(4);
    let v37 = v38.sub(v39);
    let v35 = new ABDLVar([v36, v37]);
    console.log((await can_move(v30, v35)).toString());
    let v41 = new ABDLVar(0);
    let v43 = new ABDLVar(context.height);
    let v44 = new ABDLVar(2);
    let v42 = v43.sub(v44);
    let v40 = new ABDLVar([v41, v42]);
    let v46 = new ABDLVar(0);
    let v48 = new ABDLVar(context.height);
    let v49 = new ABDLVar(4);
    let v47 = v48.sub(v49);
    let v45 = new ABDLVar([v46, v47]);
    await move(v40, v45);
  }
}
async function f0(v0, v1, v2){
  let v3 = new ABDLVar(v0.getValue()[v2.getValue()]);
  let v4 = v3;
  let v5 = new ABDLVar(v0.getValue()[v1.getValue()]);
  v0.setValue(v2, v5.value );
  v0.setValue(v1, v4.value );
}