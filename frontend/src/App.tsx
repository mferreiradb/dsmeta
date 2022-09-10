import Header from './components/Header'
import Card from './components/Card'

function App() {

  return (
    <div>
      <Header />
      <main>
        <section id="sales">
          <div className="dsmeta-container">
            <Card />
          </div>
        </section>
      </main>
    </div>
  )

}

export default App
