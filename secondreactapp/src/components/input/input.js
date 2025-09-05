function Input(props) {
    return(
            <input type={props.type} 
            value={props.value} 
            onChange={(e) => props.setValue(e.target.value)}
            />
    )
}

export default Input;