import './style.css'

import ImgHeader from '../../assets/img/Header.svg'

export default function Header() {
    return (
        <header>
            <div className="dsmeta-logo-container">
                <img src={ ImgHeader } alt="DSMeta" />
                <h1>DSMeta</h1>
                <p>
                    Desenvolvido por
                    <a href="https://www.instagram.com/devsuperior.ig">@devsuperior.ig</a>
                </p>
            </div>
        </header>
    )
}