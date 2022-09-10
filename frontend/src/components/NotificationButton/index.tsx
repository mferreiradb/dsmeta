import axios from "axios";
import Icon from '../../assets/img/Vector.svg'
import { BASE_URL } from '../../utils/request';
import './style.css'

type Props = {
    saleId: number;
}

function handleClick(id : number) {
    axios(`${BASE_URL}/sales/${id}/notification`).then(response => {
        window.alert(`Dados da venda ${id} enviados para o Seu telefone`)
    })
}

export default function NotificationButton( {saleId} : Props) {
    return (
        <div className="dsmeta-red-btn" onClick={() => handleClick(saleId)}>
            <img src={ Icon } alt="Notificar" />
        </div>
    )
}