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
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.name)
  } catch (e) {
    return new ABDLVar("");
  }
}
const getOwner = (a) => {
  try {
    return new ABDLVar(context.board[a.getValue()[0]][a.getValue()[1]].piece.owner)
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
    let v2 = new ABDLVar(2);
    let v3 = new ABDLVar(3);
    let v1 = v2.pow(v3);
    let v4 = new ABDLVar(" a dividir por");
    let v5 = new ABDLVar(2);
    let v6 = new ABDLVar(" é igual a");
    let v7 = new ABDLVar(4);
    let v8 = new ABDLVar("  :)");
    let v0 = new ABDLVar([v1, v4, v5, v6, v7, v8]);
    let v9 = new ABDLVar(2);
    let v10 = new ABDLVar(2);
    v0.getValue()[0] = v10;
    let v11 = new ABDLVar(0);
    let v12 = new ABDLVar(5);
    for(let v13 of range(v11,v12)) {
      let v15 = new ABDLVar(v0.getValue()[v13.getValue()]);
      let v16 = new ABDLVar('\r');
      let v14 = v15.add(v16);
      console.log(v14.toString());
    }
  }
}
